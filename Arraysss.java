public class Arraysss {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int[] myNum = { 10, 20, 30, 40 };
        System.out.println(cars[0]);
        cars[0] = "Opel";
        for (int i : myNum) {
            System.out.println(i);
        }
        System.out.println(cars[0]);
        System.out.println(cars.length);

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][2];
        System.out.println(x);
    }
}
