package lab2_java;

public class Line {
    public Point start;
    public Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        Point start = new Point(x1, y1);
        Point end = new Point(x2, y2);
        this.start = start;
        this.end = end;
    }

    public int getLength() {
        int lx = end.x - start.x;
        int ly = end.y - start.y;
        return (int) Math.sqrt(lx * lx + ly * ly);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
