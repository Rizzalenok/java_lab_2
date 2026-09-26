package lab2_java;

public class lab2 {
    public static void main(String[] args) {
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

        Point poiint1 = new Point(3, 5);
        Point poiint2 = new Point(25, 6);
        Point poiint3 = new Point(7, 8);
        System.out.println(poiint1);
        System.out.println(poiint2);
        System.out.println(poiint3);

        Line newline1 = new Line(1, 3, 23, 8);
        System.out.println(newline1);
        Line newline2 = new Line(5, 10, 25, 10);
        System.out.println(newline2);
        Line newline3 = new Line(newline1.start, newline2.end);
        System.out.println(newline3);

        Line fivethEx = new Line(1, 1, 10, 15);
        System.out.println(fivethEx.getLength());
    }
}
