package by.itstep.lomachenkov.exam.task1.util;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int inputNumber() {
        return SCANNER.nextInt();
    }

    public static int inputMark() throws Exception {
        int mark = SCANNER.nextInt();
        if (mark < 6 && mark > 1) {
            return mark;
        }

        throw new Exception("Incorrect mark value: " + mark);
    }


    public static void inputMarks(int[] marks) throws Exception {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = Input.inputMark();
        }
    }
}
