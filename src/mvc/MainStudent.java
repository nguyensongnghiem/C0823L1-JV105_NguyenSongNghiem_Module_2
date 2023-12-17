package mvc;

import mvc.controller.StudentController;
import mvc.service.IStudentModel;
import mvc.service.imp.StudentModel;
import mvc.view.imp.StudentView;

public class MainStudent {   
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        IStudentModel studentModel = new StudentModel();
        StudentController studentController = new StudentController(studentView, studentModel);       
        // int  selected = studentView.selectMenu();
        studentController.selectMenu();
        
        
    }
}
