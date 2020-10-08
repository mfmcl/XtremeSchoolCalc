import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * XtremeSchoolCalc by mfmcl && DominikK07
 * 
 * github: https://github.com/mfmcl/XtremeSchoolCalc
 * 
 * Presentation date: Oct 8 2020
 * 
 * Includes varius functions that could be useful for LEAF students
 * 
 * 1. Sleep calculator
 *      Calculate when to go to bed, or when to wake up for optimal sleep
 * 2. Study hours
 *      Find out what you can do during study hours
 * 3. Hex-dec-bin converter
 *      Convert numbers between base 2, 10 and 16!
 * 4. BMR calorie calculator
 *      Calculate daily recommended calorie intake based on your height, age, weight and amount of exercise
 * 5. 
 *      Returns a sequence of numbers lower than 100 which are the 
 */
public class XtremeSchoolCalc {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() { // main menu, user selects what they want to calculate
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("| Xtreme School Calculator |");
        System.out.println("|--------------------------|");
        System.out.println("| What do you need help    |");
        System.out.println("| with today?              |");
        System.out.println("|   1. " + ANSI_GREEN  + "Sleep calculator " + ANSI_RESET + "   |");
        System.out.println("|   2. " + ANSI_YELLOW + "Study hours      " + ANSI_RESET + "   |");
        System.out.println("|   3. " + ANSI_RED    + "Hex-Dec-Bin      " + ANSI_RESET + "   |");
        System.out.println("|   4. " + ANSI_PURPLE + "Calorie calc     " + ANSI_RESET + "   |");
        System.out.println("|   5. " + ANSI_CYAN   + "Something        " + ANSI_RESET + "   |");
        System.out.println("|   0. " + ANSI_BLUE   + "Exit             " + ANSI_RESET + "   |");
        System.out.println("============================");

        System.out.print("| Select option: ");
        int selectedOption = sc.nextInt();

        switch (selectedOption) { // menu options
            case 1:
                sleepCalc();
                break;
            case 2:
                studyHours();
                break;
            case 3:
                hexDecBinConverterMenu();
                break;
            case 4:
                nutritionCalculator();
                break;
            case 5:
                powerOfTwo();
                break;
            case 0: // ends program
                System.out.println("| Cya! (or" + ANSI_RED + " Java " + ANSI_RESET + "ya) |");
                System.exit(0);
                break;

            default:
                System.out.println("*********************************");
                System.out.println("   Please enter a valid number   ");
                System.out.println("*********************************");
                mainMenu();
                break;
        }
        sc.close();
    }

    public static void studyHours() {
        // Defining all needed variables
        int year;
        int term;
        int week = 0;
        // Study hours calulator method
        System.out.println("==================================");
        System.out.println("|     " + ANSI_YELLOW + "Study Hours calculator" + ANSI_RESET + "     |");
        System.out.println("==================================");
        Scanner scany = new Scanner(System.in);
        // Ask for the students's year of study
        System.out.print("Year (1-4): ");
        year = scany.nextInt();
        // Ask for the current school year term
        System.out.print("Term: ");
        term = scany.nextInt();
        // If its the first term ask for the number of the week
        if (term == 1) {
            System.out.print("Week of first term (1-8): ");
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
        mainMenu();
        scany.close();

        // End of studyHours method
    }

    // TODO: exception handling
    public static void hexDecBinConverterMenu() { // Converts numbers to/from base 2, 10, 16
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("|   " + ANSI_RED + "Hex-Dec-Bin Converter" + ANSI_RESET + "  |");
        System.out.println("|--------------------------|");
        System.out.println("|   1. Enter hexadecimal   |");
        System.out.println("|   2. Enter decimal       |");
        System.out.println("|   3. Enter binary        |");
        System.out.println("|   0. Main Menu           |");
        System.out.println("============================");

        System.out.println("Select option");
        int selection = sc.nextInt();

        switch (selection) { // selects input format
            case 1:
                hexToDecBin();
                break;
            case 2:
                decToHexBin();
                break;
            case 3:
                binToDecHex();
                break;
            case 0: // back to main menu
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

    // TODO: exception handling
    public static void hexToDecBin() { // converts hexadecimal to decimal and binary
        Scanner sc = new Scanner(System.in);
        System.out.print("| Enter hexadecimal number (ex. 2F): ");

        // get hex input, convert to decimal and binary
        String hex = sc.next();
        int dec = Integer.parseInt(hex, 16);
        String bin = Integer.toBinaryString(dec);

        // result
        System.out.println("| Hexadecimal: " + hex);
        System.out.println("| Decimal:     " + dec);
        System.out.println("| Binary:      " + bin);

        // back to converter menu
        hexDecBinConverterMenu();
        sc.close();
    }

    // TODO: exception handling
    public static void decToHexBin() { // converts decimal to hexadecimal and binary
        Scanner sc = new Scanner(System.in);
        System.out.print("| Enter decimal number (ex. 2F): ");

        // get decimal input, convert to hex and binary
        int dec = sc.nextInt();
        String hex = Integer.toHexString(dec);
        String bin = Integer.toBinaryString(dec);

        // print result
        System.out.println("| Decimal:     " + dec);
        System.out.println("| Hexadecimal: " + hex);
        System.out.println("| Binary:      " + bin);

        // back to converter menu
        hexDecBinConverterMenu();
        sc.close();
    }

    // TODO: exception handling
    public static void binToDecHex() { // converts binary to decimal and hexadecimal
        Scanner sc = new Scanner(System.in);
        System.out.print("| Enter binary number (ex. 2F): ");

        // get binary input, convert to decimal and hex
        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2);
        String hex = Integer.toHexString(dec);

        // print result
        System.out.println("| Binary:      " + bin);
        System.out.println("| Decimal:     " + dec);
        System.out.println("| Hexadecimal: " + hex);

        // back to converter menu
        hexDecBinConverterMenu();
        sc.close();
    }

    public static void nutritionCalculator() {
        // TODO: Have to fix this shit

        // Defining all needed variables
        int height;
        int weight;
        int age;
        String gender;
        double BMR1 = 0.0;
        double BMRf = 0.0;
        int exercise;
        boolean male;
        Scanner scany = new Scanner(System.in);
        // Daily calorie intake calculator based on the BMR formula
        System.out.println("==================================");
        System.out.println("|     " + ANSI_PURPLE + "BMR calorie calculator" + ANSI_RESET + "     |");
        System.out.println("==================================");
        // Asking for the person's height
        System.out.print("Enter your height (cm): ");
        height = scany.nextInt();
        // Asking for the person's weight
        System.out.print("Enter your weight (kg): ");
        weight = scany.nextInt();
        // Asking for the person's age
        System.out.print("Enter your age: ");
        age = scany.nextInt();
        // Asking for the person's gender
        System.out.print("Enter your gender (M or F): ");
        gender = scany.next();

        male = (gender == "M");
        scany.close();

        /*
         * BMR formula -> The Harris–Benedict equations revised by Mifflin and St Jeor
         * in 1990 (newest revision of BMR formula) Dividing the male and female
         * formulas
         */
        if (gender.equals("M") || gender.equals("F")) {
            if (male) {
                BMR1 = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            } else {
                BMR1 = (10 * weight) + (6.25 * height) - (5 * age) - 161;
            }
        } else {
            throw new Error("Enter M or F");
        }

        // Asking for level of exercise

        System.out.println("=========================================");
        System.out.println("|          Level of exercise            |");
        System.out.println("|---------------------------------------|");
        System.out.println("|  1. Sedentary or light activity       |");
        System.out.println("|       (i.e. little or no exercise)    |");
        System.out.println("|  2. Active or moderately active       |");
        System.out.println("|       (i.e. running one hour daily)   |");
        System.out.println("|  3. Vigorously active                 |");
        System.out.println("|       (i.e. swimming two hours daily) |");
        System.out.println("=========================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("How much exercise do you get?");
        exercise = sc.nextInt();
        // Finding the final BMR value (BMRf) based on the BMR expenditure formulas
        switch (exercise) {
            case 1:
                BMRf = BMR1 * 1.53;
                break;
            case 2:
                BMRf = BMR1 * 1.76;
                break;
            case 3:
                BMRf = BMR1 * 2.25;
                break;
            default:
                System.out.println("*********************************");
                System.out.println("    Invalid exercise number!     ");
                System.out.println("*********************************");
                break;
        }
        // Printing out BMR value
        System.out.println("Your recommended minimum daily calorie intake is: " + BMRf);
        mainMenu();
        sc.close();
        // End of nutritionCalculator method
    }

    public static void powerOfTwo() {
        double input;
        double output;
        double repeat;
        System.out.println("");
        Scanner scany = new Scanner(System.in);
        input = scany.nextDouble();
        repeat = Math.pow(input, 2);
        for(output = repeat; output <= 100; output*=2 ) {
            System.out.println("The number " + input + " squared is equal to: /n" + output);
        }

        scany.close();
    }

    public static void sleepCalc() { // calculates when to wake up based on current time and when to go to sleep based on enetered wake up time
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("|         " + ANSI_GREEN + "Sleep Calculator" + ANSI_RESET + "          |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   1. When should I wake up?       |");
     // System.out.println("|   2. When should I go to sleep?   |");
        System.out.println("|   0. Back to Main Menu            |");
        System.out.println("=====================================");

        System.out.println("| Select option");
        int selectedOption = sc.nextInt();

        switch (selectedOption) { // menu options
            case 1:
                whenToWake();
                break;
     /*     case 2:
                whenToSleep();
                break;
     */     case 0:
                mainMenu();
                break;
            default:
                System.out.println("*********************************");
                System.out.println("   Please enter a valid number   ");
                System.out.println("*********************************");
                sleepCalc();
                break;
        }
        sc.close();
    }
    
    public static void whenToSleep() { // user inputs wake up time; calculates sleep time in 90 min intervals
        //TODO: make this work
        Scanner sc = new Scanner(System.in);
        System.out.println("When do you want to wake up? (hh:mm)");
        String wakeUpTime = sc.next();
        sc.close();
    }

    public static void whenToWake() { // calculates wake up time in 90 min intervals from current time
                
        // variables for current time and wake up times
        // 1 sleep cycle = 90 min = 5400 s
        Date currentTime = new Date(System.currentTimeMillis());
        Date timeIn3cycles = new Date(System.currentTimeMillis() + (5400 * 3) * 1000);
        Date timeIn4cycles = new Date(System.currentTimeMillis() + (5400 * 4) * 1000);
        Date timeIn5cycles = new Date(System.currentTimeMillis() + (5400 * 5) * 1000);
        Date timeIn6cycles = new Date(System.currentTimeMillis() + (5400 * 6) * 1000);
        
        // create time format HH:mm
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        // print results in correct time format
        System.out.println("============================================");
        System.out.println("|          Current time is: " + ANSI_CYAN + timeFormat.format(currentTime) + ANSI_RESET + "          |");
        System.out.println("|------------------------------------------|");
        System.out.println("| For 4.5 hours of sleep wake up at: " + ANSI_RED + timeFormat.format(timeIn3cycles) + ANSI_RESET + " |");
        System.out.println("| For 6 hours of sleep wake up at:   " + ANSI_YELLOW + timeFormat.format(timeIn4cycles) + ANSI_RESET + " |");
        System.out.println("| For 7.5 hours of sleep wake up at: " + ANSI_GREEN + timeFormat.format(timeIn5cycles) + ANSI_RESET + " |");
        System.out.println("| For 9 hours of sleep wake up at:   " + ANSI_GREEN + timeFormat.format(timeIn6cycles) + ANSI_RESET + " |");
        System.out.println("============================================");
        mainMenu();
    }

    // ANSI escape codes - set colors in console output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}