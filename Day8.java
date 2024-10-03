import java.util.*;
public class Day8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("**WE ARE CHECKING NO IS EVEN OR ODD**");
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        if(no%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("No is odd");
        }
        System.out.println("**WE ARE CHECKING LARGEST OF THREE NO**");

        System.out.println("Enter no 1:");
        int a = sc.nextInt();
        System.out.println("Enter no 2:");
        int b = sc.nextInt();
        System.out.println("Enter no 3:");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest no is:"+a);
        }
        else if (b>c) {
            System.out.println("Larges no is:"+b);
            
        }
        else{
            System.out.println("Largest no is:"+c);
        }
        System.out.println("**WE ARE CHECKING FOR LEAP YEAR**");

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if((year%400==0 || year%4==0) && year%100!=0){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Year is not leap year");
        }
    }

    
}
