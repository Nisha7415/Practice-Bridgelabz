import java.util.Scanner;

public class Power2 {
//    public static void main(String[] args) {
//        System.out.print(" Enter the index number :- ");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int num2=1;
//        int i=0;
//        while(i<=num){
//            System.out.println(num2);
//            num2=2*num2;
//            i++;
//        }
//
//
//    }
public static void main(String[] args) {
    System.out.print(" Enter the index number :- ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=1;
    int i=0;
    while(i<=n){
        System.out.println(num);
        num=2*num;
        i++;
    }
}
}
