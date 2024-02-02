import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        System.out.println("Enter the month no :- ");
        Scanner sc=new Scanner(System.in);
         int num = sc.nextInt();
//         if(num > 12) {
//             System.out.println("Inavlid month");
//         }
//         do {

//        while (num <=12 ) {
             switch (num) {
                 case 2:
                 case 3:
                     System.out.println("Vasanta");
                     break;
                 case 4:
                 case 5:
                     System.out.println("Garishma/Summer");
                     break;
                 case 6:
                 case 7:
                     System.out.println("Monsoon/Rainy");
                     break;
                 case 8:
                 case 9:
                     System.out.println("Sharada");
                     break;
                 case 10:
                 case 11:
                     System.out.println("Hemanta");
                     break;
                 case 12:
                 case 1:
                     System.out.println("Shishira/Winter");
                     break;
             default:
                 System.out.println(" You entered wrong month number");
             }
//         }
//         while(num <=12);

    }
}
