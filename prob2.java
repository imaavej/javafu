public class prob2 {

// Find the Sum of All Elements
    public static void main(String[] args) {
        int nums[]={3, 7, 1, 9};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=nums[i]+sum;
        }
        System.out.println("Sum of all values is " + sum);
    }
}