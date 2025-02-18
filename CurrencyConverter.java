import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("1. Rupee");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");
        System.out.println("4. Pound");
        System.out.println("5. Yen");
        System.out.println("6. Australian Dollar");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Currency");

        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                Rupee_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            case 4:
                Pound_to_other(amount);
                break;
            case 5:
                Yen_to_other(amount);
                break;
            case 6:
                AUD_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void Rupee_to_other(double amt) {
        System.out.println("1 Rupee = " + 0.013 + " Dollar");
        System.out.println(amt + " Rupee = " + (amt * 0.013) + " Dollar");
        System.out.println();

        System.out.println("1 Rupee = " + 0.012 + " Euro");
        System.out.println(amt + " Rupee = " + (amt * 0.012) + " Euro");
        System.out.println();

        System.out.println("1 Rupee = " + 0.010 + " Pound");
        System.out.println(amt + " Rupee = " + (amt * 0.010) + " Pound");
        System.out.println();

        System.out.println("1 Rupee = " + 1.72 + " Yen");
        System.out.println(amt + " Rupee = " + (amt * 1.72) + " Yen");
        System.out.println();

        System.out.println("1 Rupee = " + 0.019 + " Australian Dollar");
        System.out.println(amt + " Rupee = " + (amt * 0.019) + " Australian Dollar");
        System.out.println();
    }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Rupee");
        System.out.println(amt + " Dollar = " + (amt * 79.37) + " Rupee");
        System.out.println();

        System.out.println("1 Dollar = " + 0.98 + " Euro");
        System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
        System.out.println();

        System.out.println("1 Dollar = " + 0.81 + " Pound");
        System.out.println(amt + " Dollar = " + (amt * 0.81) + " Pound");
        System.out.println();

        System.out.println("1 Dollar = " + 130.88 + " Yen");
        System.out.println(amt + " Dollar = " + (amt * 130.88) + " Yen");
        System.out.println();

        System.out.println("1 Dollar = " + 1.39 + " Australian Dollar");
        System.out.println(amt + " Dollar = " + (amt * 1.39) + " Australian Dollar");
        System.out.println();
    }

    public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " + 80.85 + " Rupee");
        System.out.println(amt + " Euro = " + (amt * 80.85) + " Rupee");
        System.out.println();

        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
        System.out.println();

        System.out.println("1 Euro = " + 0.86 + " Pound");
        System.out.println(amt + " Euro = " + (amt * 0.86) + " Pound");
        System.out.println();

        System.out.println("1 Euro = " + 128.90 + " Yen");
        System.out.println(amt + " Euro = " + (amt * 128.90) + " Yen");
        System.out.println();

        System.out.println("1 Euro = " + 1.42 + " Australian Dollar");
        System.out.println(amt + " Euro = " + (amt * 1.42) + " Australian Dollar");
        System.out.println();
    }

    public static void Pound_to_other(double amt) {
        System.out.println("1 Pound = " + 99.64 + " Rupee");
        System.out.println(amt + " Pound = " + (amt * 99.64) + " Rupee");
        System.out.println();

        System.out.println("1 Pound = " + 1.23 + " Dollar");
        System.out.println(amt + " Pound = " + (amt * 1.23) + " Dollar");
        System.out.println();

        System.out.println("1 Pound = " + 1.16 + " Euro");
        System.out.println(amt + " Pound = " + (amt * 1.16) + " Euro");
        System.out.println();

        System.out.println("1 Pound = " + 159.74 + " Yen");
        System.out.println(amt + " Pound = " + (amt * 159.74) + " Yen");
        System.out.println();

        System.out.println("1 Pound = " + 1.65 + " Australian Dollar");
        System.out.println(amt + " Pound = " + (amt * 1.65) + " Australian Dollar");
        System.out.println();
    }

    public static void Yen_to_other(double amt) {
        System.out.println("1 Yen = " + 0.58 + " Rupee");
        System.out.println(amt + " Yen = " + (amt * 0.58) + " Rupee");
        System.out.println();

        System.out.println("1 Yen = " + 0.0076 + " Dollar");
        System.out.println(amt + " Yen = " + (amt * 0.0076) + " Dollar");
        System.out.println();

        System.out.println("1 Yen = " + 0.0063 + " Euro");
        System.out.println(amt + " Yen = " + (amt * 0.0063) + " Euro");
        System.out.println();

        System.out.println("1 Yen = " + 0.0063 + " Pound");
        System.out.println(amt + " Yen = " + (amt * 0.0063) + " Pound");
        System.out.println();

        System.out.println("1 Yen = " + 0.012 + " Australian Dollar");
        System.out.println(amt + " Yen = " + (amt * 0.012) + " Australian Dollar");
        System.out.println();
    }

    public static void AUD_to_other(double amt) {
        System.out.println("1 Australian Dollar = " + 54.75 + " Rupee");
        System.out.println(amt + " Australian Dollar = " + (amt * 54.75) + " Rupee");
        System.out.println();

        System.out.println("1 Australian Dollar = " + 0.72 + " Dollar");
        System.out.println(amt + " Australian Dollar = " + (amt * 0.72) + " Dollar");
        System.out.println();

        System.out.println("1 Australian Dollar = " + 0.70 + " Euro");
        System.out.println(amt + " Australian Dollar = " + (amt * 0.70) + " Euro");
        System.out.println();

        System.out.println("1 Australian Dollar = " + 0.61 + " Pound");
        System.out.println(amt + " Australian Dollar = " + (amt * 0.61) + " Pound");
        System.out.println();

        System.out.println("1 Australian Dollar = " + 83.45 + " Yen");
        System.out.println(amt + " Australian Dollar = " + (amt * 83.45) + " Yen");
        System.out.println();
    }
}
