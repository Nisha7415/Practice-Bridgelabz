import java.util.Scanner;public class flipCoin {
    public static void main(String[] args) {
            int head=0;
            int tail=0;
            double random=0.0;
        System.out.print("Enter the number :- ");
        Scanner sc=new Scanner(System.in);
        int flip=sc.nextInt();
        for(int i=1;i<=flip;i++){
            random=Math.random();//use of this function?...
            if(random<0.5){
                head++;
                System.out.println("head");
            }
            else {
                tail++;
                System.out.println("tail");
            }
        }
        System.out.println("numner of heads:- "+ head);
        System.out.println("number of tail :-"+tail);
        double headpercent=(double)head/flip*100;
        double tailpercent=(double)tail/flip*100;
        System.out.println("Percentage of head :-" +headpercent);
        System.out.println("Percentage of tail :-" +tailpercent);
    }
}
