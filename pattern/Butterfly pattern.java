import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("Your pattern is that .......");
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print("*");
            }
            
            int space=2*(n-i);
            
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
              System.out.print("*");
            }
            
            int space=2*(n-i);
            
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}