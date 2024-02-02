public class insertionSort {
    public static void main(String[] args) {
        int[] array={5,1,6,2,4,3};
        for(int i=1;i<array.length;i++){
             int temp=array[i];
            int  j = i;
            while(j>0 && array[j-1]>temp){
                array[j]=array[j-1];
                j=j-1;

            }
            array[j]=temp;

        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
