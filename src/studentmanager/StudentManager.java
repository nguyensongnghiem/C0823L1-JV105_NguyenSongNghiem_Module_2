package studentmanager;

import java.util.Scanner;

public class StudentManager {

    static Student[] students = new Student[10];

    public static void displayList() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Enter new id :");
            id = Integer.parseInt(scanner.nextLine());
            if (isIdExist(id))
                System.out.println("Id already existed !");
        } while (isIdExist(id));
        System.out.println("Enter name :");
        String name = scanner.nextLine();
        System.out.print("Enter address : ");
        String address = scanner.nextLine();
        System.out.print("Enter classes : ");
        String classes = scanner.nextLine();
        Student newStudent = new Student(id, name, classes, address);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                StudentManager.students[i] = newStudent;
                break;
            }
        }
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Enter id to delete:");
            id = Integer.parseInt(scanner.nextLine());
            if (!isIdExist(id))
                System.out.println("Id doesn't existed !");
        } while (!isIdExist(id));
        if (isIdExist(id)) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    for (int j = i; j < students.length - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[students.length - 1] = null;
                    break;
                }
            }
        } else
            System.out.println("ID doesn't exist ! ");
    }

    public static void editStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Enter id to edit:");
            id = Integer.parseInt(scanner.nextLine());
            if (!isIdExist(id))
                System.out.println("Id doesn't existed !");
        } while (!isIdExist(id));
        if (isIdExist(id)) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    System.out.println("Enter name :");
                    String name = scanner.nextLine();
                    System.out.print("Enter address : ");
                    String address = scanner.nextLine();
                    System.out.print("Enter classes : ");
                    String classes = scanner.nextLine();
                    students[i].setName(name);
                    students[i].setAddress(address);
                    students[i].setClasses(classes);
                    break;
                }
            }
        } else
            System.out.println("ID doesn't exist ! ");
    }

    public static boolean isIdExist(int id) {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class TestStudentManager {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nghiem", "C08", "Đà Nẵng");
        Student s2 = new Student(2, "Cuong", "C09", "Quảng Nam");
        Student s3 = new Student(3, "Quang", "C10", "Sai Gon");
        StudentManager.students[0] = s1;
        StudentManager.students[1] = s2;
        StudentManager.students[2] = s3;
        boolean exitFlag = false;
        do {
            System.out.println("STUDENTS MANAGER ");
            System.out.println("1. Display list ");
            System.out.println("2. Add student ");
            System.out.println("3. Edit student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select a task: ");
            int selected = scanner.nextInt();
            switch (selected) {
            case 1:
                System.out.println("Display list");
                StudentManager.displayList();
                break;
            case 2:
                System.out.println("Add student");
                StudentManager.addStudent();
                break;
            case 3:
                System.out.println("Edit student");
                StudentManager.editStudent();
                break;
            case 4:
                System.out.println("Delete student");
                StudentManager.deleteStudent();
                break;
            case 5:
                System.out.println("Exit !");
                exitFlag = true;
                break;
            }
        } while (!exitFlag);
    }
}
