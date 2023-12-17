package questionmvc.controller;

import java.util.ArrayList;

import questionmvc.model.Question;
import questionmvc.service.IQuestionService;
import questionmvc.service.imp.QuestionService;
import questionmvc.view.IQuestionView;
import questionmvc.view.imp.QuestionView;
 
public class QuestionController {
    private IQuestionService model = new QuestionService();
    private IQuestionView view = new QuestionView();

    public QuestionController(IQuestionService model, IQuestionView view) {
        this.model = model;
        this.view = view;
    }

    public ArrayList<Integer> runAndGetAns() {
        ArrayList<Question> questions = model.getAll();
        ArrayList<Integer> answers = view.getAnswers(questions);
        for (Integer ans : answers) {
            System.out.println(ans);
        }
        return answers;
    }

    public int showResult(ArrayList<Integer> answers) {
        int score = model.getScore(answers);
        view.showResult(score);
        return score;
    }

}
