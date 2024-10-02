import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    public void testStrictlyIncreasing() {
        // Arrange - підготовка к тесту
        int[] a = {1, 4, 7, 17, 25};

        // Act - тестування функціоналу
        String result = Task12.checkSequence(a);

        // Assert - перевірка результату
        assertEquals("The array is strictly increasing.", result);
    }

    @Test
    public void testStrictlyDecreasing() {
        int[] a = {55, 26, 11, 5, 4, 0};
        String result = Task12.checkSequence(a);
        assertEquals("The array is strictly decreasing.", result);
    }

    @Test
    public void testNotInSequence() {
        int[] a = {11, 3, 33, 0, 22, 7};
        String result = Task12.checkSequence(a);
        assertEquals("The elements of the array are not in sequence.", result);
    }

    @Test
    public void testEqualElements() {
        int[] a = {2, 2, 2, 2};
        String result = Task12.checkSequence(a);
        assertEquals("The elements of the array are not in sequence.", result);
    }
}
