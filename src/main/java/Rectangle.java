public class Rectangle {
    int width, height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int computeArea(){
        return this.width * this.height;
    }
}
