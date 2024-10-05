import java.util.*;
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
         sum += i;
        }
        System.out.println("Sum="+sum);

        int Esum=0;
       
        for(int i=0;i<=n;i++){
            if (i % 2 != 0) {
                continue;
            }
         Esum += i;
        }
        System.out.println("Even Sum="+Esum);

        
    
}
    
}
