public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(3600));
    }

    public static String makeReadable(int seconds) {
        if (seconds > 359999) {
            throw new IllegalArgumentException("Exceeded the max");
        }

        int hours = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int remainingSec = seconds % 60;

        String timeFormat = String.format("%02d:%02d:%02d", hours, min, remainingSec);
        return timeFormat;
    }

}
