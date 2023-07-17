public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int number = 0;
        int index = digits.length - 1;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0 && digits[i] < 10) {
                number = digits[i];
            } else {
                number = number * 10 + digits[i];
            }
        }
        number++;
        if (number == 0) {
            digits[index] = 0;
        } else {
            while(number > 0 && index > 0) {
                digits[index] = number % 10;
                number /= 10;
                index--;
            }
        }
        return digits;
    }
}
