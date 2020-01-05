package polymorphism;

interface IShape {
    void draw();
}

public class Shape implements IShape {

    @Override
    public void draw() {
        System.out.println("Drawing shape");
    }

    public static void main(String[] args) {
        Shape sh1 = new Shape();
        Shape sh2 = new Circle();
        Circle c1 = new Circle();
        Quadrant q1 = new Quadrant();
        IShape sh3 = new IShape() {
            @Override
            public void draw() {
                System.out.println("Drawing anonymous");
            }
        };

        IShape[] shapes = new IShape[]{sh1, sh2, c1, q1, sh3};
        drawShapes(shapes);

//        drawOneShape(c1);
//        drawOneShape(new Rectangle(42));
//        drawOneShape(q1);
    }

    private static void drawShapes(IShape[] shapes) {
        for (IShape shape : shapes) {
            shape.draw();
        }
    }

    private static void drawOneShape(Shape sh) {
        System.out.println("Shape");
        sh.draw();
    }

    private static void drawOneShape(Circle c) {
        System.out.println("Circle");
        c.draw();
    }

    private static void drawOneShape(Rectangle r) {
        System.out.println("Rectangle");
        r.draw();
    }

    private static void drawOneShape(Triangle t) {
        System.out.println("Triangle");
        t.draw();
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    private final int val;

    public Rectangle(int val) {
        this.val = val;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void unique() {
        System.out.println("I am RECTANGLE!!! " + val);
    }
}

class Quadrant extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Quadrant");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
