import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {

  @Test
  public void testValidTriangle() {

    // Arrange
    float a = 2;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.NORMAL, type);

  }

  @Test
  public void testEquilateralTriangle() {

    // Arrange
    float a = 2;
    float b = 2;
    float c = 2;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is eqilateral", TriangleChecker.TriangleType.EQUILATERAL, type);
    /*
     * b = 3;
     * 
     * type = TriangleChecker.checkTriangle(a, b, c);
     * 
     * assertNotEquals("Test-Case:Is not eqilateral",TriangleChecker.TriangleType.
     * EQUILATERAL, type);
     */
  }

  @Test
  public void testInvalidTriangle() {

    // 1. Arrange (a is negative)
    float a = -2;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is invalid ( a = negative number)", TriangleChecker.TriangleType.NONE, type);

    // 2. Arrange (b is negative)
    a = 2;
    b = -3;
    c = 4;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is invalid (b = negative number)", TriangleChecker.TriangleType.NONE, type);

    // 3. Arrange (c is negative)
    a = 2;
    b = 3;
    c = -4;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is invalid (negative Number)", TriangleChecker.TriangleType.NONE, type);

    // 4. Arrange (c >= sum of a & b)
    a = 2;
    b = 3;
    c = 40;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is invalid (c >=  sum of a & b)", TriangleChecker.TriangleType.NONE, type);

    // 5. Arrange (b >= sum of a & c)
    a = 2;
    b = 30;
    c = 4;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is invalid (b >=  sum of a & c)", TriangleChecker.TriangleType.NONE, type);

    // 6. Arrange (a >= sum of b & c)
    a = 20;
    b = 3;
    c = 4;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals("Test-Case:Is invalid (a >=  sum of b & c)", TriangleChecker.TriangleType.NONE, type);
  }

  @Test
  public void testIsoscelesTriangle() {

    // Arrange
    float a = 3;
    float b = 3;
    float c = 4;

    // Act
    TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    a = 2;
    b = 2;
    c = 3;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals( TriangleChecker.TriangleType.ISOSCELES, type);

    a = 2;
    b = 3;
    c = 2;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals( TriangleChecker.TriangleType.ISOSCELES, type);

    a = 3;
    b = 2;
    c = 2;
    type = TriangleChecker.checkTriangle(a, b, c);

    // Assert
    assertEquals( TriangleChecker.TriangleType.ISOSCELES, type);

  }

}
