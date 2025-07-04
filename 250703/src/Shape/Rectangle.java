package Shape;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
