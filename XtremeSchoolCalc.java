import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * XtremeSchoolCalc
 * 
 */
public class XtremeSchoolCalc {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() { // main menu, user selects what they want to calculate
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("| Xtreme School Calculator |");
        System.out.println("============================");
        System.out.println("| What do you need help    |");
        System.out.println("| with today?              |");
        System.out.println("|   1. Sleep calculator    |");
        System.out.println("|   2. Study hours         |");
        System.out.println("|   3. Hex-dec-bin         |");
        System.out.println("|   4. Calorie calc        |");
        System.out.println("|   5. Option 5            |");
        System.out.println("|   6. Time format test    |");
        System.out.println("|   0. Exit                |");
        System.out.println("============================");

        System.out.println("Select option");
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
            case 6:
                try {
                    testMethod();
                } catch (ParseException e) {
                    //TODO: handle exception
                    System.out.println("enter correct value");
                }
                break;
            case 0: // ends program
                System.out.println("Cya! (or Java ya)");
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
        System.out.println("|     Study Hours calculator     |");
        System.out.println("==================================");
        Scanner scany = new Scanner(System.in);
        // Ask for the students's year of study
        System.out.print("Year (1-4): ");
        year = scany.nextInt();
        // Ask for the current school year term
        // FIXME: how many terms are there?
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
        System.out.println("|  Hex-Dec-Bin Converter   |");
        System.out.println("============================");
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

        // result
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

        // result
        System.out.println("| Binary:      " + bin);
        System.out.println("| Decimal:     " + dec);
        System.out.println("| Hexadecimal: " + hex);

        // back to converter menu
        hexDecBinConverterMenu();
        sc.close();
    }

    public static void nutritionCalculator() {
        // Defining all needed variables
        int height;
        int weight;
        int age;
        String gender;
        double BMR1 = 0.0;
        double BMRf = 0.0;
        int exercise;
        Scanner scany = new Scanner(System.in);
        // Daily calorie intake calculator based on the BMR formula
        System.out.println("==================================");
        System.out.println("|     BMR calorie calculator     |");
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

        boolean male = (gender == "M");
        scany.close();
        try {
            if ((gender != "M") || (gender != "F")) {
                throw new Error("Enter 'M' for male or 'F' for female");
                
            } else {
                /*
         * BMR formula -> The Harris–Benedict equations revised by Mifflin and St Jeor
         * in 1990 (newest revision of BMR formula) Dividing the male and female
         * formulas
         */
                if (male) {
                     BMR1 = (10 * weight) + (6.25 * height) - (5 * age) + 5;
                } else {
                    BMR1 = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        
        // Asking for level of exercise

        System.out.println("=========================================");
        System.out.println("|          Level of exercise            |");
        System.out.println("=========================================");
        System.out.println("|  1. Sedentary or light activity       |");
        System.out.println("|       (i.e. little or no exercise)    |");
        System.out.println("|  2. Active or moderately active       |");
        System.out.println("|       (i.e. running one hour daily)   |");
        System.out.println("|  3. Vigorously active                 |");
        System.out.println("|       (i.e. swimming two hours daily) |");
        System.out.println("=========================================");

        System.out.println("How much exercise do you get?");
        exercise = scany.nextInt();
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
        scany.close();
        // End of nutritionCalculator method
    }

    public static void powerOfTwo() {
        double input;
        double output;
        System.out.println("");
        Scanner scany = new Scanner(System.in);
        input = scany.nextDouble();
        output = Math.pow(input, 2);
        System.out.println("The number " + input + " squared is equal to: " + output);

        scany.close();
    }

    public static void testMethod() throws ParseException {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter first time (hh:mm): ");
            String time = input.nextLine();
            System.out.println();
            System.out.print("Enter second time (hh:mm): ");
            String time2 = input.nextLine();
            System.out.println();
            DateFormat sdf = new SimpleDateFormat("hh:mm");
            Date d1 = sdf.parse(time);
            Date d2 = sdf.parse(time2);
        
            System.out.println("Time: " + sdf.format(d1));
            System.out.println("Time: " + sdf.format(d2));
            if(d1.after(d2)){
                long diffMs = d1.getTime() - d2.getTime();
                long diffSec = diffMs / 1000;
                long min = diffSec / 60;
                long sec = diffSec % 60;
                System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
            }
        
            if(d1.before(d2)){
                long diffMs = d2.getTime() - d1.getTime();
                long diffSec = diffMs / 1000;
                long min = diffSec / 60;
                long sec = diffSec % 60;
                System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
            }
        
            if(d1.equals(d2)){
                System.out.println("The difference is 0 minutes and 0 seconds.");
            }
            input.close();
    
    }

    public static void sleepCalc() {
        System.out.println("============================");
        System.out.println("|     Sleep Calculator     |");
        System.out.println("============================");

    }


}
