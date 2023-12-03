/*public class SiblingFamily {
    public static void main(String[] args) {
        int number = 513;
        System.out.println("Permutations of " + number + ":");
        permute(number);
    }

    public static void permute(int number) {
        String numberStr = Integer.toString(number);
        char[] digits = numberStr.toCharArray();

        permuteHelper(digits, 0);
    }

    private static void permuteHelper(char[] digits, int index) {
        if (index == digits.length - 1) {

            System.out.println(new String(digits));
        } else {
            for (int i = index; i < digits.length; i++) {

                char temp = digits[index];
                digits[index] = digits[i];
                digits[i] = temp;


                permuteHelper(digits, index + 1);


                temp = digits[index];
                digits[index] = digits[i];
                digits[i] = temp;
            }
        }
    }
}
*/