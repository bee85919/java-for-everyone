package String;

public class StringTest {

    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str);
        System.out.println(str.length());

        System.out.println();
        System.out.println(str.concat(" World!"));
        System.out.println(str.concat(" World!").length());

        System.out.println();
        System.out.println(str);
        str = str.concat(" World!");
        System.out.println(str);

        System.out.println();
        System.out.println(str.substring(6));
        System.out.println(str.substring(6, 7));
    }
}
