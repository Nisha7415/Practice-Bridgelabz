import java.util.Scanner;

public class primeNoRange {
    public static void main(String[] args) {
        System.out.println(" Enter  the range :- ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=0;
        for(int i=num1;i<num2;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==0){
                System.out.println(i);
            }
        }

    }
}
