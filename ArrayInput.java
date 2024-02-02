import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        System.out.println("Enter the element in array1 :- ");
        Scanner sc = new Scanner(System.in);
        String myVar = sc.nextLine();
        String[] stringArray = myVar.split(" ");

        List<String> arrayList = new ArrayList<String>();

        for(int i = 0; i<stringArray.length; i++){
            System.out.println(stringArray[i]);
            arrayList.add(stringArray[i]);
        }
        System.out.println("My Final Array List === "+ arrayList);
    }
}