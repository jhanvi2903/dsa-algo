//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class DigitCount {
    public DigitCount() {
    }

    public static int digitCount(int n) {
        int count;
        for(count = 0; n != 0; ++count) {
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(digitCount(number));
    }
}
