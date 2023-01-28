import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n that is the row :");
        int n=sc.nextInt();
        System.out.println("Enter the m that is the column :");
        int m=sc.nextInt();
        System.out.println("Here is your pattern :");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1|| j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
}