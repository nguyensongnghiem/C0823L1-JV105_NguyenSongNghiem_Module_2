package questionmvc.view.imp;

import java.util.ArrayList;
import java.util.Scanner;

import questionmvc.model.Question;
import questionmvc.view.IQuestionView;


public class QuestionView implements IQuestionView {
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public ArrayList<Integer> getAnswers(ArrayList<Question> questions) {
        ArrayList<Integer> answers = new ArrayList<Integer>();
        int answer;
        for (int i = 0; i < questions.size(); i++) {
            answer = displayQuesGetAns(questions.get(i));
            answers.add(answer);
        } 
        return answers;       
    }
    @Override
    public int displayQuesGetAns(Question question) {
        System.out.println(question.getQuestion());
        for (int i = 0; i < question.getOptions().length; i++) {
            System.out.println( i+1 + "." + question.getOptions()[i]);            
        }
        System.out.print("Nhập đáp án của bạn :");
        int ans = Integer.parseInt(scanner.nextLine());        
        System.out.println("----------------- ");
        return ans;
    }
    @Override
    public void showResult(int score) {
        System.out.println("Bạn đạt được " + score + " điểm.");
    }
    

}
