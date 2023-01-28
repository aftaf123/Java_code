import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Your parttern is :");
        for(int i=1;i<=n;i++){
            //For space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //For 1st half
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //For second half
        for(int i=n;i>=1;i--){
            //For space
             for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}