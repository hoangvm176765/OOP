public class Forrr {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String j : cars) {
            System.out.println(j);
        }
    }
}
