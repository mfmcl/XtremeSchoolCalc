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
            case 6:
                System.out.println("C Ya!");
s                break;

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
        int week = 0;
        Scanner scany = new Scanner(System.in);
        System.out.println("Year: ");
        int year = scany.nextInt();
        System.out.println("Term: ");
        int term = scany.nextInt();
        if (term == 1) {
            System.out.println("Week of term 1: ");
            week = scany.nextInt();  
        } else {
        }
        switch (year) {
            case 1:
                System.out.println("Year 1 study hours: ");
                    if (term == 1) {
                        System.out.println("Term 1");
                        switch (week) {
                            case 1:
                            case 2:
                                System.out.println("You must stay in your room during the study hours.");
                                break;
                            case 3:
                            case 4:
                                System.out.println("You must stay in your own hall during the study hours. You may visit rooms on your hall.");
                                break;
                            case 5:
                            case 6:
                                System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                                break;
                            case 7:
                            case 8:
                                System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                                break;
                            default:
                                System.out.println("Invalid week number!");
                                break;
                        }
                    } else {
                        System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                    }
                break;
            case 2:
                System.out.println("Year 2 study hours: ");
                if (term == 1) {
                    System.out.println("Term 1");
                    switch (week) {
                        case 1:
                        case 2:
                            System.out.println("You must stay in your room during the study hours.");
                            break;
                        case 3:
                        case 4:
                            System.out.println("You must stay in your own hall during the study hours. You may visit rooms on your hall.");
                            break;
                        case 5:
                        case 6:
                            System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        case 7:
                        case 8:
                            System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        default:
                            System.out.println("Invalid week number!");
                            break;
                    }
                } else {
                    System.out.println("You have only quiet hours.");
                }
                break;
            case 3:
                System.out.println("Year 3 study hours: ");
                if (term == 1) {
                    System.out.println("Term 1");
                    switch (week) {
                        case 1:
                        case 2:
                            System.out.println("You must stay in your room during the study hours.");
                            break;
                        case 3:
                        case 4:
                            System.out.println("You must stay in your own hall during the study hours. You may visit rooms on your hall.");
                            break;
                        case 5:
                        case 6:
                            System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        case 7:
                        case 8:
                            System.out.println("You must stay at Astra during the study hours. You may visit other halls.");
                            break;
                        default:
                            System.out.println("Invalid week number!");
                            break;
                    }
                } else {
                    System.out.println("You have only quiet hours.");
                }
                break;
            case 4:
                System.out.println("Year 4 study hours: ");
                System.out.println("You have only quiet hours.");
                break;
        
            default:
                System.out.println("Invalid year number!");
                break;
        }
        scany.close();
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
        }
        sc.close();
    }
}
