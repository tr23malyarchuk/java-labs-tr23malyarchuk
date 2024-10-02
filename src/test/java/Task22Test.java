import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    public void testFormIndexArray1() {
        // Arrange - підготовка к тесту
        int[] a = {3, 1, 4, 1, 5};
        int[] b = {4, 2, 0, 1, 3};

        // Act - тестування функціоналу
        int[] result = Task22.formIndexArray(a);

        // Assert - перевірка результату
        assertArrayEquals(b, result);
    }

    @Test
    public void testFormIndexArray2() {
        int[] a = {55, 6, -14, 0, 2, 18};
        int[] b = {0, 5, 1, 4, 3, 2};

        int[] result = Task22.formIndexArray(a);

        assertArrayEquals(b, result);
    }

    @Test
    public void testFormIndexArray3() {
        int[] a = {-1, 2, -3, 4, -5};
        int[] b = {3, 1, 0, 2, 4};

        int[] result = Task22.formIndexArray(a);

        assertArrayEquals(b, result);
    }
}
