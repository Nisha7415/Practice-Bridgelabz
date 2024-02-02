import java.util.Scanner;public class SmallestNumber {
    public static void main(String args[]){
        int temp, size;
        System.out.println("Enter the first array size :- ");
        Scanner s = new Scanner(System.in);
        int size1=s.nextInt();
        System.out.print("Enter the element in array: ");
        int[] array = new int[size1];
        for ( int i = 0; i < size1; i++)
            array[i] = s.nextInt();
        for(int i = 0; i<array.length; i++ ){
            for(int j = i+1; j<array.length; j++){
                if(array[i]>array[j]){ //i = 1 , j = 2

                    temp = array[i]; // 30
                    array[i] = array[j]; // 25
                    array[j] = temp;
                }
            }
        }
        System.out.print("elements in array in asecending order ");
        for ( int i = 0; i < size1; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n2nd Smallest element of the array is:: "+array[1]);
    }
}