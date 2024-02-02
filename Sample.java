import java.util.regex.Pattern;
public class Sample {

    public static void main(String[] args) {



                // read in one command-line argument
                int n = 5;

                int i = 0;                // count from 0 to N
                int powerOfTwo = 1;       // the ith power of two

                // repeat until i equals n
                while (i <= n) {
                    System.out.println(i + " " + powerOfTwo);   // print out the power of two
                    powerOfTwo = 2 * powerOfTwo;                // double to get the next one
                    i = i + 1;
                }

            }
        }



