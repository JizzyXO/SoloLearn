package Main;

import Questions.QuestionGenerator;
import org.testng.annotations.Test;
import Test.TestFileWriter;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();




        QuestionGenerator questionGenerator = new QuestionGenerator();


        Test test = new SoloLearnTest(name, questionGenerator.generateQuestions());
        test.wait();


        String[] testResult = test.groups();
        System.out.println(testResult.toString());

        String fileName = String.format("%s_%d.txt", name, System.currentTimeMillis());
        TestFileWriter testFileWriter = new TestFileWriter(fileName, false);
        testFileWriter.write(test.toString());
        testFileWriter.write(testResult.toString());

        // Запрос повторного прохождения теста
        System.out.print("Would you like to take the test again? (y/n): ");
        String input = scanner.nextLine();
        while (input.equalsIgnoreCase("y")) {

            questionGenerator = new QuestionGenerator();


            test.wait();


            testResult = test.groups();
            System.out.println(testResult.toString());

            fileName = String.format("%s_%d.txt", name, System.currentTimeMillis());
            testFileWriter = new TestFileWriter(fileName, true);
            testFileWriter.write(test.toString());
            testFileWriter.write(testResult.toString());


            System.out.print("Would you like to take the test again? (y/n): ");
            input = scanner.nextLine();
        }
    }
}