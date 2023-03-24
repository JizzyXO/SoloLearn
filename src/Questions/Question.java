package Questions;

import java.util.List;

public class Question {
    private String questionText;
    private Answer correctAnswer;
    private List<Answer> answerOptions;

    public Question(String questionText, Answer correctAnswer, List<Answer> answerOptions) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.answerOptions = answerOptions;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public List<Answer> getAnswerOptions() {
        return answerOptions;
    }
}

