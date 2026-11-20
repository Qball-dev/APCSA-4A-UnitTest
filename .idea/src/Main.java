import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    }
}

// write your UnitTest class here (omit the word public on the class line)
class UnitTest {
    public String[] studentAns;
    public String[] answerKey;

    public UnitTest(String[] studentInput){
        for(int i = 0; i < studentInput.length; i++){
            this.studentAns[i] = studentInput[i].toUpperCase();
        }


    }

    public String[] getStudentAnswers(){
        return this.studentAns;
    }

    public int totalCorrect(){
        int count = 0;
        for(int i = 0; i < answerKey.length; i++){
            if(studentAns[i].equals(answerKey[i])){
                count++;
            }
        }
        return count;
    }

    public int totalMistakes(){
        return 20 - totalCorrect();
    }

    public boolean isPassing(){
        return totalCorrect() >= 14;
    }

}
