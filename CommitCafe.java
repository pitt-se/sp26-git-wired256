public class CommitCafe {

    private static String barista = "Alice";
    private static String nickname = "Barista";

    private static int cups = 0;
    private static int sugar = 0;

    public static void brew(String drink) {
        cups++;
        if (drink.equals("Latte"))
            sugar++;
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
