public class binarySearch {
    public static void main(String[] args) {
        int[] array={2,6,7,9,12,15,28,38,56,89};
        int search=28;
        int lower=0;
        int higher=array.length-1;
        int mid=(lower+higher)/2;
        while(lower<=higher){
            if(array[mid]==search){
                System.out.println("element is at"+mid+"index position.");
                break;
            } else if (array[mid]<search) {
                lower=mid+1;
            }
            else{
                higher=mid-1;
            }
            mid=(lower+higher)/2;
        }
        if(lower>higher){
            System.out.println("element not found");
        }
    }
}
