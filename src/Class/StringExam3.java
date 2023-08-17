package Class;

public class StringExam3 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        if (str1.equals(str2)) {
            System.out.println("str1과 str2는 같은 값을 가진다.");
        }

        if (str3.equals(str4)) {
            System.out.println("str3과 str4는 같은 값을 가진다.");
        }
    }
}
