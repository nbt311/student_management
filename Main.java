import src.Student;
import src.StudentList;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("CH","Trung Ba","1994-11-11","HaNoi","0123455");
        Student student1 = new Student("CH1","Hung Tran","1997-12-11","HaNoi","0124455");
        Student student2 = new Student("CH2","Trung Nguyen","1996-01-11","HaNoi","0123655");
        StudentList newList = new StudentList();
        newList.addStudent(student);
        newList.addStudent(student1);
        newList.addStudent(student2);
        //showListStudent(newList.getList());


    }

    public static void  showListStudent(Student[] data) {
        for (Student student : data) {
            if (student != null) {
                System.out.println(student.getinfo());
            }
        }
    }
}
