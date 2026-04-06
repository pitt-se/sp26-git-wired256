public class CommitCafe {

    private static String barista = "CoffeeBot";
    private static String title = "[Lead Barista]";

    private static int cups = 0;
    private static int sugar = 0;

    public static void brew(String drink) {
        cups++;

        if (drink.equals("Latte"))
            sugar++;
        System.out.println("CoffeeBot brewed " + drink +
                           ". It's not a bug, it's a feature - until the coffee wears off.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());

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
