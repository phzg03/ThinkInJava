//: CADSystem.java
// Ensuring proper cleanup
import java.util.*;

class Shape {
    Shape(int i){
        System.out.print("Shape constructor");
    }
    void Cleanup(){
        System.out.print("Shape Shape");
    }
}

class Circle extends Shape {
    Circle(int i){
        super(i);
        System.out.println("Drawing a Circle");
    }

    void Cleanup() {
        System.out.println("Erasing a Circle");
        super.Cleanup();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing a Triangle");
    }
    void Cleanup() {
        System.out.println("Erasing a Triangle");
        super.Cleanup();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing a Line: " +
                start + ", " + end);
    }
    void Cleanup() {
        System.out.println("Erasing a Line: " +
                start + ", " + end);
        super.Cleanup();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[10];

    CADSystem(int i) {
        super(i + 1);
        for(int j = 0; j < 10; j++)
            lines[j] = new Line(j, j*j);
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }

    void Cleanup() {
        System.out.println("CADSystem.cleanup()");
        t.Cleanup();
        c.Cleanup();
        for(int i = 0; i < lines.length; i++)
            lines[i].Cleanup();
        super.Cleanup();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
// Code and exception handling...
        } finally {
            x.Cleanup();
        }
    }
}
