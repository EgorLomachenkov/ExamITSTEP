package by.itstep.lomachenkov.exam.task1.model;

public class RatingManager {
    public static int calculateTotalFives(int[] marks) {
        int greatestAmount = 0;
        int currentAmount = 0;
        int index = -1;

        for (int i = 0, k = 0; i < marks.length; i++) {
            for (int j = i; j < i + 7 && j < marks.length; j++) {
                if (marks[j] > 3) {
                    k++;
                    index = k == 7 ? j + 1 - 7 : index;
                } else {
                    k = 0;
                }
            }

            if (index > -1) {
                for (int j = index; j < index + 7; j++) {
                    if (marks[j] == 5) {
                        currentAmount++;
                    }
                }
            }
            greatestAmount = currentAmount < greatestAmount ? greatestAmount : currentAmount;
            currentAmount = 0;
            k = 0;
        }

        return greatestAmount == 0 ? -1 : greatestAmount;
    }
}
