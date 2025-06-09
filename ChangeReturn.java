public class ChangeReturn {
    public static void main(String[] args) {
        int[] bills = {50, 20, 10, 5, 1};
        int S = 73;
        int count = 0;

        for (int i = 0; i < bills.length; i++) {
            while (S >= bills[i]) {
                S -= bills[i];
                count++;
            }
        }
        System.out.println("Купюр видано: " + count);
    }
}
