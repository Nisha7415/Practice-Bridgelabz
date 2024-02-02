import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("Enter the first array size :- ");
        Scanner s = new Scanner(System.in);
        int length=s.nextInt();
        String[] array = new String[length];
        System.out.print("Enter the element in array: ");
        for ( int i = 0; i <array.length; i++){
            array[i] = s.nextLine();}
        for ( int i = 0; i <array.length; i++){
            System.out.println(array[i]);

        }



    }
}

