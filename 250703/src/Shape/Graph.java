package Shape;

public class Graph {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(10, 10, 100, 50);
        shapes[1] = new Rectangle(30, 30, 200, 300);
        shapes[2] = new Circle(20, 20, 5);

        for(Shape s:shapes){
            System.out.println(s);
            System.out.println("넓이: "+s.getArea()+"    둘레: "+s.getPerimeter());
        }
    }
}
