public class Num14 {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for (int i = 0; i < list.length; i++) list[i].redraw();
        for (int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    int r;
    Circle(int r) {
        this.r = r;
    }
    public void draw() {
        System.out.println("반지름이 " + r + "인 원입니다.");
    }
    public double getArea() {
        return PI * r * r;
    }
}

class Oval implements Shape {
    int a, b;
    Oval (int width, int height) {
        this.a = width / 2;
        this.b = height / 2;
    }

    public void draw() {
        System.out.println((2 * a) + "x" + (2 * b) + "에 내접하는 타원 입니다.");
    }
    public double getArea() {
        return PI * a * b;
    }
}

class Rect implements Shape {
    int width, height;
    Rect (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println(width + "x" + height + "크기의 사각형 입니다.");
    }
    public double getArea() {
        return width * height;
    }
}