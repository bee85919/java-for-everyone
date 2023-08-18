package Method;

public class MyClassExam {

    public static void main(String[] args) {

        MyClass myclass = new MyClass();

        myclass.method1();
        System.out.println("> return: ");
        System.out.println();

        myclass.method2(10);
        System.out.println("> return: ");
        System.out.println();

        int value3 = myclass.method3();
        System.out.println("> return: " + value3);
        System.out.println();

        myclass.method4(5, 10);
        System.out.println("> return: ");
        System.out.println();

        int value5 = myclass.method5(55);
        System.out.println("> return: " + value5/2 + " * 2 = " + value5);
        System.out.println();
    }
}