package questionmvc;

import java.util.ArrayList;

import questionmvc.controller.QuestionController;
import questionmvc.service.imp.QuestionService;
import questionmvc.view.imp.QuestionView;

public class Main {
    
    public static void main(String[] args) {
        QuestionService model = new  QuestionService();
        QuestionView view = new QuestionView();
        QuestionController controller = new QuestionController(model,view);
        ArrayList<Integer> answers = controller.runAndGetAns();
        controller.showResult(answers);
    }
}
