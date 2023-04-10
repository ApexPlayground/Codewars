public class maxAndMin {
    public static void main(String[] args) {
        System.out.println(findMaxAndMin("1 2 3 4 5 -6"));
    }

    public static String findMaxAndMin(String numbers) {

        String[] nums = numbers.split(" "); // Split the string into an array of strings, using " " as the delimiter
        int max = Integer.parseInt(nums[0]); // Convert the first element of the array to an integer and set it as the
                                             // max
        int min = Integer.parseInt(nums[0]); // Convert the first element of the array to an integer and set it as the
                                             // min
        for (int i = 1; i < nums.length; i++) { // Loop through the array starting from the second element
            int num = Integer.parseInt(nums[i]); // Convert the current element to an integer
            if (num > max) { // If the current element is greater than the current max, set it as the new max
                max = num;
            }
            if (num < min) { // If the current element is less than the current min, set it as the new min
                min = num;
            }
        }
        return max + " " + min; // Concatenate the max and min integers as a string and return it
    }
}
