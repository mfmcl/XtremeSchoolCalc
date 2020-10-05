import java.util.Scanner;

/**
 * XtremeSchoolCalc
 * 
 */
public class XtremeSchoolCalc {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("| Xtreme School Calculator |");
        System.out.println("============================");
        System.out.println("| What do you need help    |");
        System.out.println("| with today?              |");
        System.out.println("|   1. Sleep calculator    |");
        System.out.println("|   2. Option 2            |");
        System.out.println("|   3. Option 3            |");
        System.out.println("|   4. Option 4            |");
        System.out.println("|   5. Option 5            |");
        System.out.println("|   6. Exit                |");
        System.out.println("============================");
        
        System.out.println("Select option");
        int selectedOption = sc.nextInt();

        switch (selectedOption) {
            case 1:
                System.out.println("case 1");
                sleepCalc();
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                hexDecBinConverterMenu();
                break;
            case 4:
                System.out.println("case 4");
                break;
            case 5:
                System.out.println("case 5");
                break;
            case 6:
                System.out.println("case 6");
                break;

            default:
                System.out.println("---------------------------------");
                System.out.println("-!-Please enter a valid number-!-");
                System.out.println("---------------------------------");
                mainMenu();
                break;
        }
        sc.close();
    }

    public static void sleepCalc() {
        System.out.println("============================");
        System.out.println("|     Sleep Calculator     |");
        System.out.println("============================");

    }

    public static void hexDecBinConverterMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("|  Hex-Dec-Bin Converter   |");
        System.out.println("============================");
        System.out.println("|   1. Hex to Dec & Bin    |");
        System.out.println("|   2. Dec to Hex & Bin    |");
        System.out.println("|   3. Bin to Hex & Dec    |");
        System.out.println("|   4. Main Menu           |");
        System.out.println("============================");
        
        System.out.println("Select option");
        int selection = sc.nextInt();

        switch (selection) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                mainMenu();
                break;

            default:
                System.out.println("---------------------------------");
                System.out.println("-!-Please enter a valid number-!-");
                System.out.println("---------------------------------");
                hexDecBinConverterMenu();
                break;

        sc.close();
    }
}