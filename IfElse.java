public class IfElse {
    public static void main(String[] args) {
        int time = 20;
        int check = 1;
        if (time > 18 && check == 1) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        String season = time < 12 ? "Winter" : "Summer";
        System.out.println(season);
    }
}
