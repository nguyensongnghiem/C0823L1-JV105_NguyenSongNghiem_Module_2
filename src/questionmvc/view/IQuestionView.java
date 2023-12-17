package questionmvc.view;

import java.util.ArrayList;

import questionmvc.model.Question;

public interface IQuestionView {

    ArrayList<Integer> getAnswers(ArrayList<Question> questions);

    int displayQuesGetAns(Question question);
    void showResult(int score);
}