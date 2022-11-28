import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void computeArea() {
        Square square = new Square(4);
        assertEquals(square.computeArea(), 16);
    }
}