import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        String phoneNumber = createPhoneNumber(numbers);
        System.out.println(phoneNumber);
    }

    public static String createPhoneNumber(int[] numbers) {
        String mergedArray = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());
        return mergedArray.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
}
}
