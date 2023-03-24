package Test;

import Questions.Answer;
import Questions.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestRunner {
    private List<Question> questions;
    private TestResult testResult = new TestResult();

    public TestRunner(List<Question> questions) {
        this.questions = questions;
    }

    public void runTest() {
        Collections.shuffle(questions);
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<Answer> answerOptions = new ArrayList<>(question.getAnswerOptions());
            Collections.shuffle(answerOptions);
            for (int i = 0; i < answerOptions.size(); i++) {
                System.out.println((char) ('A' + i) + ": " + answerOptions.get(i));
            }

            Answer selectedAnswer = null;
            boolean validAnswer = false;
            while (!validAnswer) {
                String input = scanner.nextLine().toUpperCase();
            }
        }
    }
}