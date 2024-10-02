import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @Test
    public void testFindEqualElements1() {
        // Arrange - підготовка к тесту
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act - тестування функціоналу
        Task27.findEqualElements(a, b);

        String expectedOutput = "Number of equal elements: 3\n" +
                "Equal element found at a[2] and b[0]\n" +
                "Equal element found at a[3] and b[1]\n" +
                "Equal element found at a[4] and b[2]\n";

        // Assert - перевірка результату
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void testFindEqualElements2() {
        int[] a = {7, 11, -18, 2, 0, 4};
        int[] b = {4, 11, -2, 2, -18, 0};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Task27.findEqualElements(a, b);

        String expectedOutput = "Number of equal elements: 5\n" +
                "Equal element found at a[1] and b[1]\n" +
                "Equal element found at a[2] and b[4]\n" +
                "Equal element found at a[3] and b[3]\n" +
                "Equal element found at a[4] and b[5]\n" +
                "Equal element found at a[5] and b[0]\n";

        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}
