import java.util.Scanner;

public class bubbleStringSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str[]=new String[5];
        System.out.println("Enter the 5 string :- ");
        String str[]=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-1;j++){
                if(str[j].compareTo(str[j+1])>0){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted string array is :-");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
