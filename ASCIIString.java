import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASCIIString {
    public static void main(String[] args) {
        System.out.print(" Enter the String :- ");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        List<Integer> asciiArray = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++)
        {
            int asciiValue = str.charAt(i);
            asciiArray.add(asciiValue);
        }
        System.out.println("My Ascii Value array ====   "+ asciiArray);

    }
}

