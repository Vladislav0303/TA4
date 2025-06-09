public class WeightBalance {
    public static void main(String[] args) {
        int[] weights = {9, 5, 3, 3, 1};
        int W = 22;
        int count = 0;

        for (int i = 0; i < weights.length; i++) {
            while (W >= weights[i]) {
                W -= weights[i];
                count++;
                weights[i] = 0;
                break;
            }
        }

        System.out.println("Гир використано: " + count);
    }
}
