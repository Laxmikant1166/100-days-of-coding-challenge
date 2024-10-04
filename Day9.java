import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();
        
        int grade = percentage / 10;

        switch (grade) {
            
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }

        sc.close();
    }
}
