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

    public UnitTest(String[] studentInput) throws IOException{
        for(int i = 0; i < studentInput.length; i++){
            this.studentAns[i] = studentInput[i].toUpperCase();
        }

        File key = new File("answerKey.txt");
        Scanner reader = new Scanner(key);
        int i = 0;
        while(reader.hasNextLine()) {
            this.answerKey[i] = reader.nextLine();
            i++;
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

    public String toString() {
        String result = "";
        for(int i = 0; i < answerKey.length; i++){
            result += (i + 1) + ") " + answerKey[i] + "\t\t\t" + (i + 1) + ") " + studentAns[i] + "\n";
        }
        return
                "ANSWER KEY\tSTUDENT'S ANSWERS \n" + result;
    }
}
