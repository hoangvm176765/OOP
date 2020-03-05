public class Methodsss {
    static int myMethod() {
        System.out.println("I just got executed!");
        return 1;
    }

    static void myMethod2(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod());
        myMethod2("Liam");
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

}
