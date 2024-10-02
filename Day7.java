import java.util.*;
public class Day7 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int n1 = sc.nextInt();

        System.out.println("Enter no 2:");
        int n2 = sc.nextInt();

        System.out.println("Numbers are:"+n1+","+n2);

        if(n1>n2){
            System.out.println("Greatest no is:"+n1);

        }
        else{
            System.out.println("Greatest no is:"+n2);
        }


    }
}

