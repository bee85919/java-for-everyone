package Method;

public class MyClass {
    // public 리턴형 메서드명 (매개변수들){ 필요한 기능 구현 }

    // (1) 매개변수도 없고, return 값도 없는 메서드
    public void method1() {
        System.out.println("m1 실행");
    }

    // (2) 정수를 입력 받아 뭔가를 수행하고, return은 하지 않는 메서드
    public void method2(int x) {
        System.out.println("m2 실행");
        System.out.println("> " + x + "를 인수로 받음");
    }

    // (3) 아무것도 입력되지 않았지만, 뭔가를 수행해서 값을 return하는 메서드
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }

    // (4) 정수를 두개 입력받고, return은 하지 않는 메서드
    public void method4(int x, int y) {
        System.out.println("m4 실행");
        System.out.println("> " + x + ", " + y + "를 인수로 받음");
        System.out.println("> " + (x + y));
    }

    // (5) 정수를 하나 입력받고, 정수를 return하는 메서드
    public int method5(int y) {
        System.out.println("m5 실행");
        System.out.println("> " + y + "를 인수로 받음");
        return y * 2;
    }
}
