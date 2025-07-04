package Shape;

public abstract class Shape {
    protected int x;
    protected int y;
    public Shape(){}
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
