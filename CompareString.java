public class CompareString {
    public static void main(String[] args) {
       int test = compareString();
       if(test == 0){
           System.out.println("Matches===  "+ test);
       } else if (test == -1) {
           System.out.println("Not matches ==="+ test);
       } else if (test != 0 && test != -1) {
           System.out.println(" diffrence at the position is === "+test);
       }
    }public static int compareString() {
        String first = "Nisha";
        String second = "Nisha";

        if (first.length() != second.length()) {
            return -1;
        }
        for(int i =0; i<first.length(); i++){
            char char1 = first.charAt(i);
            char char2 = second.charAt(i);

            if(char1 != char2) {
                return  i;
            }
        }return  0;
    }

//    public static boolean compareString() {
//        String first = "Nisha";
//        String second = "Nisha2";
//
//        if (first.length() != second.length()) {
//            return false;
//        }
//        for(int i =0; i<first.length(); i++){
//            char char1 = first.charAt(i);
//            char char2 = second.charAt(i);
//
//            if(char1 != char2) {
//               return  false;
//            }
//
//
//
//        }
//        return  true;
//    }

}

