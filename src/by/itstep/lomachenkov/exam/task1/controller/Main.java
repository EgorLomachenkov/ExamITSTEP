package by.itstep.lomachenkov.exam.task1.controller;

import by.itstep.lomachenkov.exam.task1.model.RatingManager;
import by.itstep.lomachenkov.exam.task1.util.Input;
import by.itstep.lomachenkov.exam.task1.util.MarksUI;
import by.itstep.lomachenkov.exam.task1.util.PeriodCreater;
import by.itstep.lomachenkov.exam.task1.view.Printer;

public class Main {
    public static void main(String[] args) throws Exception {
        int marksAmount;
        do {
            Printer.print("Enter the amount of marks and marks: ");
            marksAmount = Input.inputNumber();
        } while (marksAmount < 7);

        int[] marks = PeriodCreater.createMarksPeriod(marksAmount);
        Input.inputMarks(marks);

        String result = MarksUI.format(RatingManager.calculateTotalFives(marks));
        Printer.print(result);
    }
}
