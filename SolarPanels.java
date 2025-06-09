/*
Задача про сонячні панелі
Умова: Встановити якнайбільше панелей, які вміщуються на даху довжиною L.
 */
public class SolarPanels {
    public static void main(String[] args) {
        int[] panels = {3, 2, 5, 1};
        int L = 7;

        for (int i = 0; i < panels.length - 1; i++) {
            for (int j = 0; j < panels.length - i - 1; j++) {
                if (panels[j] > panels[j + 1]) {
                    int temp = panels[j];
                    panels[j] = panels[j + 1];
                    panels[j + 1] = temp;
                }
            }
        }

        int total = 0;
        int count = 0;
        for (int i = 0; i < panels.length; i++) {
            if (total + panels[i] <= L) {
                total += panels[i];
                count++;
            }
        }

        System.out.println("Установлено панелей: " + count);
    }
}
