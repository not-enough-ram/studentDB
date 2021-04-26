package de.neuefische.objects.models;

import java.util.Arrays;

public class StudentDB {
    private Student[] studentArray;

    public StudentDB(Student[] studentArray){
        this.studentArray = studentArray;
    }

    public Student[] getList() {
        return studentArray;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }

    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public String randomStudent(){
        int range = studentArray.length;
        int rand = (int)(Math.random()*range);
        return studentArray[rand].toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(studentArray, studentDB.studentArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(studentArray);
    }

    public void addStudent(Student newStudent){
        Student[] extStudentArray = new Student[(studentArray.length+1)];
        for (int i = 0; i < studentArray.length; i++){
            extStudentArray[i] = studentArray[i];
        }
        extStudentArray[extStudentArray.length-1]= newStudent;
        this.studentArray = extStudentArray;
    }

    public void removeStudent(Student remStudent){
        Student[] remStudentArray = new Student[(studentArray.length-1)];
        for (int i = 0; i < studentArray.length; i++){
            if (!studentArray[i].equals(remStudent)){
                remStudentArray[i] = studentArray[i];
            }
        studentArray = remStudentArray;
        }
    }
}
