import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(3, 7);
        assertEquals(rectangle.computeArea(), 21);
    }
}