public class MethodTypes {
    public void disp() {
        System.out.println("without parameter without return");
    }

    public void add(int a, int b) {
        System.out.println("with parameter without return");
        System.out.println("a + b " + (a + b));
    }

    public Integer sub() {
        System.out.println("without paremeter with return");
        return 10 - 2;
    }

    public int mul(int a, int b) {
        System.out.println("with parameter with return");
        return a + b;
    }

    public int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        else if (n < 0)
            return -1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        MethodTypes methodTypes = new MethodTypes();

        System.out.println("----------------------------------------------------------------");
        methodTypes.disp();
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        methodTypes.add(10, 20);
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println(methodTypes.sub());
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println(methodTypes.mul(10, 20));
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Recursive Function");
        System.out.println(methodTypes.fact(5));
        System.out.println("----------------------------------------------------------------");

    }

}
