package questionmvc.repository.imp;

import java.util.ArrayList;

import questionmvc.model.Question;
import questionmvc.repository.IQuestionDb;

public class QuestionDb implements IQuestionDb {
    private static ArrayList<Question> questions = new ArrayList<>();
    static {
        questions.add(new Question("What is the capital of Australia ?",
                new String[] { "Sydney", "Melbourne", "Canberra", "Peth" }, 1));
        questions.add(new Question("Who painted the Mona Lisa?",
                new String[] { "Leonardo da Vinci", "Vincent van Gog", "Pablo Picasso", "Michelangelo" }, 1));
        questions.add(new Question("Which planet is known as the \"Red Planet\"?",
                new String[] { "Mars", "Venus", "Saturn", "Jupiter" }, 2));
    }

    @Override
    public ArrayList<Question> getAll() {
        return questions;
    }

    @Override
    public Question getQuestion(int index) {
        return questions.get(index);
    }

    @Override
    public void add(Question question) {
        questions.add(question);
    }
    @Override
    public void remove(int index) {
        questions.remove(index);
    }
    

}
