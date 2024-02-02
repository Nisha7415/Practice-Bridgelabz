import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class K
{
    public static void main(String arg[]) {
        String str = "ab";
        List<Integer> asciiArray = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
            System.out.println(str.charAt(i) + "=" + asciiValue);
            asciiArray.add(asciiValue);
        }

        System.out.println("My Asci Value array ====   "+ asciiArray);
    }
}