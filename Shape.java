abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @java.lang.Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    @java.lang.Override
    void draw() {
        System.out.println("Drawing circle! ");
    }
}
class test {
    public static void main(String[] args) {
        Shape s =new Rectangle();
        s.draw();
        Shape s1 = new Circle();
        s1.draw();
    }
}