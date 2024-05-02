package by.itstep.lomachenkov.exam.task2.util;

import java.util.Scanner;

public class Input {
    private static final Scanner SCN;

    static {
        SCN = new Scanner(System.in);
    }
    public static int input() {
        return SCN.nextInt();
    }

    public static String inputString() {
        return SCN.next();
    }
}
