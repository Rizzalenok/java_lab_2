package lab2_java;

import java.util.Arrays;

public class lab2 {
    static void main() {
        Point firstP = new Point(23, 8);
        Point secondP = new Point(1, 3);
        Point thirdP = new Point(5, 10);
        Point fourthP = new Point(25, 10);
        System.out.println(firstP);
        System.out.println(secondP);
        System.out.println(thirdP);

        Line firstL = new Line(secondP, firstP);
        System.out.println(firstL);
        Line secondL = new Line(thirdP, fourthP);
        System.out.println(secondL);
        Line thirdL = new Line(firstL.start, secondL.end);
        System.out.println(thirdL);

        int[] grades_V = {3, 4, 5};
        int[] grades_A = grades_V.clone();
        Student Vasya = new Student("Вася", grades_V);
        int[] grades_P = grades_V;
        Student Petya = new Student("Петя", grades_P);
        System.out.println(Vasya);
        System.out.println(Petya);
        grades_P[0] = 5;
        System.out.println(Vasya);
        System.out.println(Petya);
        Student Andrey = new Student("Андрей", grades_A);
        System.out.println(Andrey);

        Point lolk = new Point(3, 5);
        Point lolk1 = new Point(25, 6);
        Point lolk2 = new Point(7, 8);
        System.out.println(lolk);
        System.out.println(lolk1);
        System.out.println(lolk2);

        Line lolline1 = new Line(1, 3, 23, 8);
        System.out.println(lolline1);
        Line lolline2 = new Line(5, 10, 25, 10);
        System.out.println(lolline2);
        Line lolline3 = new Line(lolline1.start, lolline2.end);
        System.out.println(lolline3);

        Line fivethEx = new Line(1, 1, 10, 15);
        System.out.println(fivethEx.getLength());
    }
}


class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class Line {
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

class Student {
    public String name;
    public int[] grade;

    public Student(String name, int[] grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        String grade = Arrays.toString(this.grade);
        return name + ": " + grade;
    }
}