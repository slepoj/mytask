package task1.myTask1;

import java.util.Scanner;

public class Input {
    public static int setNumber() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                if (num >= 0) {
                    return num;
                }
                System.out.println("incorrect data");
                continue;
            }
            System.out.println("incorrect data");
            in.next();
        }
    }


}
