public class phoneNo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        String phoneNumber = createPhoneNumber(numbers);
        System.out.println(phoneNumber);
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String phoneNo = "";
        // iterates through the numbers
        for (int i = 0; i < numbers.length; i++) {
            // when at index 0 add "(" to the phoneNo string
            if (i == 0) {
                phoneNo += "(" + numbers[i];
                // when at index 2 add ") " to the phoneNo string
            } else if (i == 2) {
                phoneNo += numbers[i] + ") ";
                // when at index 5 add "-" to the phoneNo string
            } else if (i == 5) {
                phoneNo += numbers[i] + "-";
            } else {
                // add the rest of the number to the string
                phoneNo += numbers[i];
            }

        }
        // return the new string
        return phoneNo;
    }
}