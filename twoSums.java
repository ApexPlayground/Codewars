public class twoSums {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] numbers, int target) {
        // create an empty array with a size of 2
        int[] result = new int[2];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        return result; // Do your magic!
    }

}
