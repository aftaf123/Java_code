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
                int sum=(i+j);
                if(sum%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}