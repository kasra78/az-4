public class Rectangle {
    int width, height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int computeArea(){
        return this.width * this.height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
