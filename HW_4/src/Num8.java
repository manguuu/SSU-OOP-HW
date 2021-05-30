public class Num8 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, -5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}

class Point {
    protected int x, y;
    public Point(int x, int y) {this.x = x; this.y = y; }
    public Point() {}
    public int getX() { return x; }
    public int getY() { return y; }
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PositivePoint extends Point {
    PositivePoint() {}
    PositivePoint(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        } else {
            this.x = 0;
            this.y = 0;
        }
    }

    public String toString() {
        String ret = "(" + x + "," + y + ")의 점";
        return ret;
    }

    @Override
    public void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        }
    }
}
