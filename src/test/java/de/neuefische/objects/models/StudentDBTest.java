package de.neuefische.objects.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDBTest {

    @Test
    void getListTest() {
        // GIVEN
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        StudentDB given = new StudentDB(studentArray);
        // WHEN
        Student[] actual = given.getList();

        // THEN
        assertEquals(studentArray, actual);
    }

    @Test
    void testToString() {
        // GIVEN
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        StudentDB given = new StudentDB(studentArray);
        String expected = "StudentDB{studentArray=[Student{firstName='Peter', lastName='Pan', id=42}, Student{firstName='Heiner', lastName='Lauterbach', id=100}, Student{firstName='111', lastName='222', id=333}]}";

        //WHEN
        String actual = given.toString();

        //THEN
        assertEquals(expected, actual);
    }
}