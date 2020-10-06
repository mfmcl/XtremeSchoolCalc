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
        System.out.println("|   2. Study hours         |");
        System.out.println("|   3. Hex-Dec-Bin Convert |");
        System.out.println("|   4. Option 4            |");
        System.out.println("|   5. Option 5            |");
        System.out.println("|   0. Exit                |");
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
                studyHours();
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
            case 0:
                System.out.println("C Ya! (or Java Ya ;))");
                System.exit(0);
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

    public static void studyHours() {
        // Study hours calulator method
        System.out.println("==================================");
        System.out.println("|     Study Hours calculator     |");
        System.out.println("==================================");
        int week = 0;
        Scanner scany = new Scanner(System.in);
        // Ask for the students's year of study
        System.out.println("Year: ");
        int year = scany.nextInt();
        // Ask for the current school year term
        System.out.println("Term: ");
        int term = scany.nextInt();
        // If its the first term ask for the number of the week
        if (term == 1) {
            System.out.println("Week of first term (1-8): ");
            week = scany.nextInt();
        } else {
        }
        switch (year) {
            // Study hours for year 1 students
            case 1:
                System.out.println("Year 1 study hours: ");
                // Study hours for year 1 during term 1
                if (term == 1) {
                    System.out.println("Term 1");
                    switch (week) {
                        case 1:
                        case 2:
                            System.out.println("You must stay in your room during the study hours.");
                            break;
                        case 3:
                        case 4:
                            System.out.println(
                                    "You must stay in your own hall during the study hours. You may visit rooms on your hall.");
                            break;
                        case 5:
                        case 6:
                            System.out.println(
                                    "You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        case 7:
                        case 8:
                            System.out.println(
                                    "You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        default:
                            System.out.println("*****************************");
                            System.out.println("    Invalid week number!     ");
                            System.out.println("*****************************");
                            break;
                    }
                    // Study hours for year 1 during the rest of the year
                } else {
                    System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                }
                break;
            // Study hours for year 2 students
            case 2:
                System.out.println("Year 2 study hours: ");
                // Study hours for year 2 during term 1
                if (term == 1) {
                    System.out.println("Term 1");
                    switch (week) {
                        case 1:
                        case 2:
                            System.out.println("You must stay in your room during the study hours.");
                            break;
                        case 3:
                        case 4:
                            System.out.println(
                                    "You must stay in your own hall during the study hours. You may visit rooms on your hall.");
                            break;
                        case 5:
                        case 6:
                            System.out.println(
                                    "You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        case 7:
                        case 8:
                            System.out.println(
                                    "You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        default:
                            System.out.println("*****************************");
                            System.out.println("    Invalid week number!     ");
                            System.out.println("*****************************");
                            break;
                    }
                    // Study hours for year 2 during the rest of the year
                } else {
                    System.out.println("You have only quiet hours.");
                }
                break;
            // Study hours for year 3 students
            case 3:
                System.out.println("Year 3 study hours: ");
                // Study hours for year 3 during term 1
                if (term == 1) {
                    System.out.println("Term 1");
                    switch (week) {
                        case 1:
                        case 2:
                            System.out.println("You must stay in your room during the study hours.");
                            break;
                        case 3:
                        case 4:
                            System.out.println(
                                    "You must stay in your own hall during the study hours. You may visit rooms on your hall.");
                            break;
                        case 5:
                        case 6:
                            System.out.println(
                                    "You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        case 7:
                        case 8:
                            System.out.println(
                                    "You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        default:
                            System.out.println("*****************************");
                            System.out.println("    Invalid week number!     ");
                            System.out.println("*****************************");
                            break;
                    }
                    // Study hours for year 3 during the rest of the year
                } else {
                    System.out.println("You have only quiet hours.");
                }
                break;
            // Study hours for year 4 students
            case 4:
                System.out.println("Year 4 study hours: ");
                System.out.println("You have only quiet hours.");
                break;
            // Default message -> works as an error message
            default:
                System.out.println("*****************************");
                System.out.println("    Invalid year number!     ");
                System.out.println("*****************************");
                break;
        }
        scany.close();
        // End of studyHours method
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
        System.out.println("|   1. Enter hexadecimal   |");
        System.out.println("|   2. Enter decimal       |");
        System.out.println("|   3. Enter binary        |");
        System.out.println("|   0. Main Menu           |");
        System.out.println("============================");

        System.out.println("Select option");
        int selection = sc.nextInt();

        switch (selection) {
            case 1:
                hexToDecBin();
                break;
            case 2:
                decToHexBin();
                break;
            case 3:
                binToDecHex();
                break;
            case 0:
                mainMenu();
                break;

            default:
                System.out.println("---------------------------------");
                System.out.println("-!-Please enter a valid number-!-");
                System.out.println("---------------------------------");
                hexDecBinConverterMenu();
                break;
        }
        sc.close();
    }

    public static void hexToDecBin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("| Enter hexadecimal number (ex. 2F): ");

        String hex = sc.next();
        int dec = Integer.parseInt(hex, 16);
        String bin = Integer.toBinaryString(dec);

        System.out.println("| Hexadecimal: " + hex);
        System.out.println("| Decimal:     " + dec);
        System.out.println("| Binary:      " + bin);

        hexDecBinConverterMenu();
        sc.close();
    }

    public static void decToHexBin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("| Enter decimal number (ex. 2F): ");

        int dec = sc.nextInt();
        String hex = Integer.toHexString(dec);
        String bin = Integer.toBinaryString(dec);

        System.out.println("| Decimal:     " + dec);
        System.out.println("| Hexadecimal: " + hex);
        System.out.println("| Binary:      " + bin);

        hexDecBinConverterMenu();
        sc.close();
    }

    public static void binToDecHex() {
        Scanner sc = new Scanner(System.in);

        System.out.print("| Enter binary number (ex. 2F): ");

        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2);
        String hex = Integer.toHexString(dec);

        System.out.println("| Binary:      " + bin);
        System.out.println("| Decimal:     " + dec);
        System.out.println("| Hexadecimal: " + hex);

        hexDecBinConverterMenu();
        sc.close();
    }

    public static void nutritionCalculator() {
        int height;
        int weight;
        int age;
        String gender;

    }
 
}
