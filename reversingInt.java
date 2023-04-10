
public class reversingInt {
    public static void main(String[] args) {
        System.out.println(reverseInt(19879645));
    }

    public static int reverseInt(int num) {
        // covert to string first
        String s = Integer.toString(num);
        // convert to char
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length / 2; i++) {
            /*
             * getting the last value of an array, e.g an arry with a length of 5
             * values.length = 5, i = 0; = 5 - 0 - 1 = 4
             * therefore the last element is at index 4
             */
            char temp = values[values.length - i - 1];
            values[values.length - i - 1] = values[i];
            values[i] = temp;
        }
        return Integer.parseInt(new String(values));
    }
}
