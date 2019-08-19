public class Solution {
    public static void main(String[] args) {
        String fizzBuzz = new Solution().getFizzBuzz(1, 100);
        System.out.println(fizzBuzz);
    }

    public String getFizzBuzz(int start, int end) {
        StringBuilder builder = new StringBuilder();
        if (start < 0) {
            return String.valueOf(builder);
        }
        for (int i = start; i <= end; i++) {
            boolean containThree = containDigitOrMultiple(i, 3);
            boolean containFive = containDigitOrMultiple(i, 5);
            if (containThree) {
                builder.append("Fizz");
            }
            if (containFive) {
                builder.append("Buzz");
            }
            if ((!containFive) && (!containThree)) {
                builder.append(i);
            }
            builder.append("\n");
        }
        return String.valueOf(builder);
    }

    private boolean containDigitOrMultiple(int source, int target) {
        if (target < 0 || target > 9) {
            return false;
        }
        if (source < 0) {
            return false;
        }
        if (source == 0) {
            return target == 0;
        }
        if (source % target == 0) {
            return true;
        }
        while (source != 0) {
            int dig = source % 10;
            if (dig == target) {
                return true;
            }
            source /= 10;
        }
        return false;
    }
}
