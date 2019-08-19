import java.util.Scanner;

public class Main {

    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int LOWER = 1;
    public static final int UPER = 100;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1个数字：");
        int firstNum = scanner.nextInt();
        System.out.print("请再输入1个数字：");
        int secontNum = scanner.nextInt();
        main.fizzBuzz(firstNum, secontNum);
    }

    public void fizzBuzz(int firstNum, int secondNum) {
        for (int i = LOWER; i < UPER; i++) {
            if (isFizzBuzz(i, firstNum, secondNum)) {
                System.out.println(FIZZBUZZ);
            } else if (isFizzOrBuzz(i, firstNum)) {
                System.out.println(FIZZ);
            } else if (isFizzOrBuzz(i, secondNum)) {
                System.out.println(BUZZ);
            } else {
                System.out.println(i + "");

            }
        }
    }

    public boolean isFizzBuzz(int num, int first, int second) {
        if (first == 0 || second == 0) {
            return false;
        }
        if (num % first == 0 && num % second == 0) {
            return true;
        }
        return false;
    }

    public boolean isFizzOrBuzz(int num, int index) {
        if (index == 0) {
            if (num % 10 == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (num % index == 0) {
            return true;
        }

        if (num % 10 == index) {
            return true;
        }

        if (num / 10 == index) {
            return true;
        }
        return false;
    }


}
