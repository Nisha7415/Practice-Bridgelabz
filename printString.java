import java.util.Scanner;

public class printString {
    public static void main(String[] args) {
        System.out.print("Enter the String :- ");
        Scanner sc=new Scanner(System.in);
        String username =sc.nextLine();
        String str2 = "Hello <username>, How are you?";
        System.out.println(str2.replace("<username>",username));
        //Searches a string for specified character,and returns a new string where the specified character are replaced.

    }
}
