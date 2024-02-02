import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commonarray {
    public static void main(String[] args) {

//
//        System.out.println("Enter the element in array1 :- ");
////        int[] array1=new int[5];
//        Scanner sc = new Scanner(System.in);
//        Integer myVar = sc.nextInt();
//
//        int[] array = new int[myVar];
//        System.out.println("My Array === "+ array);
//
//        for (int i = 0; i<myVar; i++){
//            System.out.print("Element " + (i + 1) + ": ");
//            array[i] = sc.nextInt();
//        }



        String[] array1={"nisha", "mamata"," pooja"};
        String[] array2={ "pooja","namu","nisha"};
        List<String > commonArray =new ArrayList<String>();
        for(int i=0;i< array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if (array1[i] == array2[j]) {
                    commonArray.add(array1[i]);
                }
            }
        }
        System.out.println(commonArray);
    }
}
