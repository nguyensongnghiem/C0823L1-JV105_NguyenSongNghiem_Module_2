package questionmvc.repository;

import java.util.ArrayList;

import questionmvc.model.Question;

public interface IQuestionDb {

    ArrayList<Question> getAll();

    Question getQuestion(int index);

    void add(Question question);

    void remove(int index);

}