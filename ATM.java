public class ATM {
    public static void main(String[] args) {
        System.out.println(validatePin("152322"));
    }

    public static boolean validatePin(String pin) {
        boolean result = false;
        String regex = "\\d{4}(\\d{2})?"; // The regular expression pattern

        if (pin.matches(regex)) {
            result = true;
        }
        return result;
    }

}
