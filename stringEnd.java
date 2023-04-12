public class stringEnd {
    public static void main(String[] args) {
        System.out.print(hello(15));
    }

    public static String hello(int age) {
        String result;
        if (age < 18) {
            result = "cant view content";
        } else {
            result = " hello world";

        }
        return result;
    }

}
