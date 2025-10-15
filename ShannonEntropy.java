public class ShannonEntropy {
    public static void main(String[] args) {
        int[] freq = new int[100];
        int total = 0;

        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            freq[value]++;
            total++;
        }

        double entropy = 0.0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                double p = (double) freq[i] / total;
                entropy -= p * (Math.log(p) / Math.log(2));
            }
        }

        System.out.printf("%.4f\n", entropy);
    }
}
