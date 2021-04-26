package de.neuefische.objects.models;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String id;

    public Student(){

    }

    public Student(String firstName, String lastName, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
}
