package fresher.math.easy;

public class PalindromeNumber {

    public boolean isPalindromeNumber(int number) {
        if(number < 0) return false;
        else if (number < 10) return true;

        int tempTotal = 0;
        int original = number;

        while(number > 0) {
            int temp = number % 10;
            tempTotal = tempTotal * 10 + temp;

            System.out.println("temp total in while loop: " + tempTotal);

            number /= 10;
        }
        return tempTotal == original;
    }

    public static void main(String[] args) {
        PalindromeNumber palindrome = new PalindromeNumber();
        System.out.println("is Palindrome Number: " + palindrome.isPalindromeNumber(121121));

    }
}
