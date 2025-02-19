package sn.fbd.qa.junit;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

public class StudentGradesTest {
    @Test
    public void testStudentGrades() {
        Map<String, Integer> grades = StudentGrades.getGrades();
        // Verifier que la map contient 3 elements
        assertThat(grades).hasSize(3);
        // Alice a une note de 18
        assertThat(grades.get("Alice")).isEqualTo(18);
        // Note de Bob superieure a 10
        assertThat(grades.get("Bob")).isGreaterThan(10);
    }
}
