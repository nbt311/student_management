package src;

import java.util.Arrays;

public class StudentList {
    private Student[] List;


    public StudentList(){

        this.List = new Student[0];
    }

    public Student[] getList() {
        return this.List;
    }

    public void addStudent(Student data){
       int totalStudent = this.List.length;
       Student[] newStudent = new Student[totalStudent + 1];
        for (int i = 0; i < totalStudent; i++) {
            newStudent[i] = List[i];
        }
        newStudent[totalStudent] = data;
        this.List = newStudent;
    }

    public void getStudentInfo() {
        for (int i = 0; i < this.List.length; i++) {
            System.out.println(this.List[i].getinfo());
        }
    }

    public void RemoveStudent(String name){
        Student[] newData = new Student[this.List.length - 1];
        int m = 0;
        for (int i = 0; i < this.List.length; i++){
            if (this.List[i].getName().equals(name)){
                continue;
            }
            newData[m] = this.List[i];
            m++;
        }
        this.List = newData;
    }

    public Student[] searchStudent(String keyword){
        Student[] data = new Student[this.List.length];
        int i = 0;
        for (Student student : this.List){
            if (student.getName().equals(keyword) || student.getCode().equals(keyword)){
                data[i] = student;
                i++;
            }
        }
        return data;
    }
}