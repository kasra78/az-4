public class Square {
    int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int computeArea() {
        return this.length * this.length;
    }
}
