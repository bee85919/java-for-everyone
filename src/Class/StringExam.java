package Class;

public class StringExam {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");


        if(str1 == str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");

        if(str3 == str4)
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");

        if(str1 == str3)
            System.out.println("str1과 str3은 같은 레퍼런스입니다.");
    }
}
