package questionmvc.service.imp;

import java.util.ArrayList;

import questionmvc.model.Question;
import questionmvc.repository.imp.QuestionDb;
import questionmvc.service.IQuestionService;

public class QuestionService implements IQuestionService {
    private QuestionDb questionDb = new QuestionDb();

    @Override
    public ArrayList<Question> getAll() {
        return questionDb.getAll();
    }

    @Override
    public Question getQuestion(int index) {
        return questionDb.getQuestion(index);
    }

    @Override
    public void add(Question question) {
        questionDb.add(question);
    }

    @Override
    public void remove(int index) {
        questionDb.remove(index);
    }
    @Override
    public int getScore(ArrayList<Integer> answers) {
        int score = 0 ;
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == questionDb.getQuestion(i).getCorrectOption()) {
                score+=10;
            }
        }
        return score;
    }
    
}
