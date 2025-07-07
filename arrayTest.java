public class arrayTest {

    public static void main(String[] args) {
        int arr [] = {12, 4, 18, 9, 10};
        int c=0;
       
        for( int i=0;i<arr.length;i++){
            if (arr[i]>10) {
               c++;
            }
        }
        System.out.println(c);
    }
}