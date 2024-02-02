import java.sql.SQLOutput;
import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double result=0.0;
        if(n!=0){
            for(int i=1;i<=n;i++){
                result=result+1.0/i;
            }
            System.out.println("The " + n + "th Harmonic Number is: " + result) ;
        }
        else {
            System.out.println("Invalid input. Please enter a positive integer for N.");
        }


    }
}
