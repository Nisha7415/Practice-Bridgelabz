import  java .util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array :-");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1 ;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
