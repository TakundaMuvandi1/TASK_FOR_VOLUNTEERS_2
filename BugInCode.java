public class BugInCode {
    public static void main(String[] args){
        System.out.println("The sum of the number in the array is:0"
         + calcSumArray(new int[]{0, 1, 2, 3, 4}));
    }
    public static int calcSumArray(int[] arr) {
        int result = 0;
        //the code works perfectly after changing i = 1 to i = 0, please note that element in an array start from 0
        for (int i = 0; i < arr.length; i++) {
          result += arr[i];
        }
        return  result;
    }
}

