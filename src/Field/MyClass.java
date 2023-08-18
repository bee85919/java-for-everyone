package Field;

public class MyClass {
    // public 리턴형 메서드명 (매개변수들){ 필요한 기능 구현 }

    // (1) 매개변수도 없고, 돌려줄 값도 없는 메서드
    public void method1() {
        System.out.println("m1이 실행됨..");
    }

    // (2) 정수를 입력 받아 뭔가를 수행하고, 리턴은 하지 않는 메서드
    public void method2(int x) {
        System.out.println(x + "을 이용한 m2 실행");
    }

    // (3) 아무것도 입력되지 않았지만, 뭔가를 수행해서 값을 리턴하는 메서드
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }

    // (4) 정수값을 두개 입력받고, 리턴은 하지 않는 메서드
    public void method4(int x, int y) {
        System.out.println(x + y + "m4 실행");
    }

    // (5) 정수를 하나 입력받고, 정수를 리턴하는 메서드
    public int method5(int y) {
        System.out.println(y + "이용한 m5 실행");
        return y * 2;
    }
}
