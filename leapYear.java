import java.util.Scanner;

public class leapYear {
      static boolean isValidYear(int year) {


        return year >= 1000 && year <= 9999;
    }
    public static void main(String[] args) {
        System.out.print("Enter the year it is 4 digit number :- ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if (isValidYear(year)) {
            // Check if it's a leap year
            if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Invalid input. Please enter a 4-digit year.");
        }

    }
}
