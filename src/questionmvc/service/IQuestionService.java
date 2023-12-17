package questionmvc.service;

import java.util.ArrayList;

import questionmvc.model.Question;

public interface IQuestionService {

    ArrayList<Question> getAll();

    Question getQuestion(int index);

    void add(Question question);

    void remove(int index);
    int getScore(ArrayList<Integer> answers);

}