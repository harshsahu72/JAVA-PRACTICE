
package DSA;

public class palindromenumber {

    public static void main(String[] args) {

        int number = 121;
        int originalNumber = number;
        int reversedNumber = 0;

        if (number < 0) {
            System.out.println(false);
            return;
        }

        while (number > 0) {
            int lastDigit = number % 10;

            reversedNumber = reversedNumber * 10 + lastDigit;

            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
