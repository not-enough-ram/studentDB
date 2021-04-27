package de.neuefische.objects.models;

import de.neuefische.objects.models.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @ParameterizedTest
    @CsvSource({"Paul,Paul","Rick,Rick","Roll,Roll"})
    public void StudentFirstNameTest(String given, String expected){
        // GIVEN
        Student bestStudent = new Student();
        bestStudent.setFirstName(given);
        // WHEN
        String actual = bestStudent.getFirstName();
        // THEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"Really,Really","Astley,Astley","okay,okay"})
    public void StudentLastNameTest(String given, String expected) {
        // GIVEN
        Student bestStudent = new Student();
        bestStudent.setLastName(given);
        // WHEN
        String actual = bestStudent.getLastName();
        // THEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1,1","42,42","666,666"})
    public void StudentIdTest(String given, String expected){
        // GIVEN
        Student bestStudent = new Student();
        bestStudent.setId(given);
        // WHEN
        String actual = bestStudent.getId();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        // GIVEN
        Student bestStudent = new Student("Boris", "Johnson", "4");
        String expected = "Student{firstName='Boris', lastName='Johnson', id=4}";

        // WHEN
        String actual = bestStudent.toString();

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void equalsTest(){
        // GIVEN
        Student givenStudent = new Student("Big", "Lebowski", "42");
        Student expected = new Student("Big", "Lebowski", "42");

        // THEN
        assertEquals(givenStudent, expected);
    }
}
