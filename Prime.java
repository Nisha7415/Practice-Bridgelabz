import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
//        Boolean flag = false;
        int j;
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter the lower limit :");
        int lower = s.nextInt();
        System.out.println ("Enter the upper limit :");
        int upper = s.nextInt();

        for(int i=lower;i<=upper;i++){
            for( j=2;j<i;j++){
                if(i%j==0){
//                    flag =false;
                    break;
                }
//                lse{
//                    flag=true;
//                } e
            }
            if(i==j){
                System.out.print(j+ " ");
            }
        }

    }
}
