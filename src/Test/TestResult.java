package Test;

public class TestResult {
    private int correctCount;
    private int questionCount;

    public TestResult() {
        this.correctCount = correctCount;
        this.questionCount = questionCount;
    }

    public double getPercentage() {
        return (double) correctCount / questionCount * 100;
    }

    public String toString() {
        return String.format("Your result: %.2f%% (%d out of %d)", getPercentage(), correctCount, questionCount);
    }
}
