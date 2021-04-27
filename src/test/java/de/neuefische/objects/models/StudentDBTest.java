package de.neuefische.objects.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;


class StudentDBTest {

    @Test
    @DisplayName("getList returns an array which contains all students")
    void getListTest() {
        // GIVEN
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        StudentDB given = new StudentDB(studentArray);

        Student[] expectedArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        Student[] expected = new StudentDB(expectedArray).getList();

        // WHEN
        Student[] actual = given.getList();

        // THEN
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("toString returns a formatted list of all students as String")
    void testToString() {
        // GIVEN
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        StudentDB given = new StudentDB(studentArray);
        String expected = "StudentDB{studentArray=[Student{firstName='Peter', lastName='Pan', id=42}, Student{firstName='Heiner', lastName='Lauterbach', id=100}, Student{firstName='111', lastName='222', id=333}]}";

        //WHEN
        String actual = given.toString();

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("addStudent adds an additional given student to the array of students")
    void addStudent() {
        // GIVEN
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        Student wayne = new Student("Boris","Palmer","42");
        Student[] expectedArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333"), new Student("Boris","Palmer","42")};
        StudentDB given = new StudentDB(studentArray);

        // WHEN
        given.addStudent(wayne);
        Student[] actualArray = given.getList();

        // THEN
        Assertions.assertEquals(Arrays.stream(expectedArray).toList(), Arrays.stream(actualArray).toList());
    }

    @Test
    @DisplayName("removeStudent removes a given student from the array")
    void removeStudent() {
        // GIVEN
        Student[] expectedArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        Student wayne = new Student("Boris","Palmer","42");
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333"), new Student("Boris","Palmer","42")};
        StudentDB given = new StudentDB(studentArray);

        // WHEN
        given.removeStudent(wayne);
        Student[] actualArray = given.getList();

        // THEN
        Assertions.assertEquals(Arrays.stream(expectedArray).toList(), Arrays.stream(actualArray).toList());
    }
}