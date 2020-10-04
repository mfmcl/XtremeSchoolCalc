import java.util.Scanner;

/**
 * XtremeSchoolCalc
 * 
 */
public class XtremeSchoolCalc {

    public static void main(String[] args) {
        
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
                
                break;
        
            default:
                break;
        }
        sc.close();
        //"Coomment"
    }
}