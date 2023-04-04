package v1.src.test.java.oop;

import v1.src.main.java.oop.Grader;

import org.junit.Test;
import static org.junit.Assert.*;


public class GraderTest {
    @Test
    public void testGrade() {
        var grader = new Grader();
        String result = grader.grade(90);
        assertNotNull(result);
        assertEquals("A", result);

        assertTrue(grader.grade(82) == "B");
        assertTrue(grader.grade(10) == "F");
    }

    @Test
    public void testGradeWithInvalidScore() {
        var grader = new Grader();
        try {
            grader.grade(-1);
            fail("Should have thrown an exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Score must be between 0 and 100", e.getMessage());
        }
    }

    @Test
    public void testThrowsExceptionWithInvalidScore() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.grade(-1);
        });
    }
}
