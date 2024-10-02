import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    public void testCalculateDifferences1() {
        // Arrange - підготовка к тесту
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 3, 2, 1, 0};

        // Act - тестування функціоналу
        int[] result = Task17.calculateDifferences(a);

        // Assert - перевірка результату
        assertArrayEquals(b, result);
    }

    @Test
    public void testCalculateDifferences2() {
        int[] a = {-1, -2, -3, -4, -5};
        int[] b = {0, 1, 2, 3, 4};

        int[] result = Task17.calculateDifferences(a);

        assertArrayEquals(b, result);
    }

    @Test
    public void testCalculateDifferences3() {
        int[] a = {-9};
        int[] b = {0};

        int[] result = Task17.calculateDifferences(a);

        assertArrayEquals(b, result);
    }

    @Test
    public void testCalculateDifferences4() {
        int[] a = {};
        int[] b = {};

        int[] result = Task17.calculateDifferences(a);

        assertArrayEquals(b, result);
    }
}
