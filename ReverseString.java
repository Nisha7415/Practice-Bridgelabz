import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class
ReverseString {
    public static void main(String[] args) {
        System.out.print(" Enter the String :- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] temp = str.split(",");
        String finalString;
        String rev = " ";
        System.out.println("temp length ===" + temp.length);
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) { // 2 == 2

                rev = temp[i] + rev;  // pooja mamta nisha
//                System.out.println("----"+rev+ "i value ---"+i);
            } else {
                rev = " " + temp[i] + rev; // nisha// mamta nisha
//                System.out.println("++++"+rev+ "i value ---"+i);
            }
        }
        System.out.println(" Reversed String  is:- " + "Hii " + rev);

    }
}

