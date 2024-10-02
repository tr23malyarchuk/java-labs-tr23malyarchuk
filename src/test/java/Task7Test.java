import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    private ArrayList<Integer> testValues;

    @BeforeEach
    public void testPreparation() {
        // Arrange - підготовка к тесту
        testValues = new ArrayList<>();
    }

    @Test
    public void testFindLowestDifference1() {
        // Act - тестування функціоналу
        testValues.add(1);
        testValues.add(5);
        testValues.add(3);

        // Assert - перевірка результату
        assertEquals(2, Task7.findLowestDifference(testValues));
    }

    @Test
    public void testFindLowestDifference2() {
        testValues.add(10);
        testValues.add(-5);
        testValues.add(0);
        assertEquals(5, Task7.findLowestDifference(testValues));
    }

    @Test
    public void testFindLowestDifference3() {
        testValues.add(-11);
        testValues.add(-7);
        testValues.add(5);
        testValues.add(-9);
        assertEquals(2, Task7.findLowestDifference(testValues));
    }
}
