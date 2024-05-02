package by.itstep.lomachenkov.exam.task2.controller;

import by.itstep.lomachenkov.exam.task2.model.MatrixRotateLogic;
import by.itstep.lomachenkov.exam.task2.util.Input;
import by.itstep.lomachenkov.exam.task2.util.MatrixGenerator;
import by.itstep.lomachenkov.exam.task2.util.MatrixUI;
import by.itstep.lomachenkov.exam.task2.view.Printer;

public class Main {
    public static void main(String[] args) {
        int rows;
        int columns;
        String rotateSide;

        do {
            Printer.print("Enter the matrix size(n, m) and rotate side(L, R): ");
            rows = Input.input();
            columns = Input.input();
            rotateSide = Input.inputString();
        } while (rows < 1 || columns < 1
                || !(rotateSide.equalsIgnoreCase("l")
                || rotateSide.equalsIgnoreCase("r")));

        int[][] matrix = MatrixGenerator.createMatrix(rows, columns);
        MatrixGenerator.initMatrixByUser(matrix);

        int[][] rotatedMatrix = MatrixRotateLogic.rotateMatrix(matrix,rotateSide);

        Printer.print(MatrixUI.toString(rotatedMatrix));
    }
}
