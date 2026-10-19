public class StudentMarkTracker {

    private static final int PASS_MARK = 60;
    private static final int EXCELENT_MARK = 90;

    private static final int[][] STUDENT_MARKS = {
            {85, 90, 78},
            {47,56,60, 67},
            {98,94,93},
            {66,72,69, 73, 71}
    };

    public static void main(String[] args) {
        printResults();
    }

    private static void printResults() {
        for (int i = 0; i < STUDENT_MARKS.length; i++) {
            int[] marks = STUDENT_MARKS[i];
            double average = calculateAverage(marks);
            String result = classifyResult(average);

            System.out.println("Student " + (i+1));
            System.out.println("Marks: " + formatMarks(marks));
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Result: " + result);
            System.out.println("--------------------");
        }
    }

    private static double calculateAverage(int[] marks) {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    private static String classifyResult(double average) {
        int roundedAverage = (int) average;

        if (roundedAverage >= EXCELENT_MARK) {
            return "Excellent";
        } else if (roundedAverage >= PASS_MARK) {
            return "Pass";
        } else {
            return "Needs Improvement";
        }
    }

    private static String formatMarks(int[] marks) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < marks.length; i++) {
            if (i > 0) {
                result.append(", ");
            }

            result.append(marks[i]);
        }

        return result.toString();
    }
}