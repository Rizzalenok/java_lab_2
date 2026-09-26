package lab2_java;

import java.util.Arrays;

public class Student {
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