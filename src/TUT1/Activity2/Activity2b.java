package TUT1.Activity2;

/*
b) Python to Java - Student Grade Manager
Handle Python's dynamic typing and data structures in Java
# Python Code
    students = {}
    def add_student(name, grade):
        students[name] = grade
    def get_average():
        if len(students) == 0:
        return 0
        return sum(students.values()) / len(students)
    def get_top_student():
        if not students:
            return None
        return max(students, key=students.get)
    # Usage
    add_student("Alice", 85)
    add_student("Bob", 92)
    add_student("Charlie", 78)
    print(f"Average grade: {get_average()}")
    print(f"Top student: {get_top_student()}")
TODO Task: Convert to Java considering:
    Static typing (int, String, double)
    HashMap usage
    Method return types
    Null handling
*/

import java.util.HashMap;
import java.util.Map;

public class Activity2b {
    private HashMap<String, Integer> students;

    public Activity2b() {
        students = new HashMap<>();
    }

    public void addStudent(String name, Integer grade) {
        students.put(name, grade);
    }

    public float getAverage() {
        if (students.isEmpty()) {
            return 0;
        }
        float sum = 0;
        for (int i : students.values()) {
            sum += i;
        }
        return sum / students.size();
    }

    public String getTopStudent() {
        if (students.isEmpty()) {
            return null;
        }
        String topStudent = null;
        int maxGrade = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }

    // Usage
    public static void main(String[] args) {
        Activity2b gradeManager = new Activity2b();
        gradeManager.addStudent("Alice", 85);
        gradeManager.addStudent("Bob", 92);
        gradeManager.addStudent("Charlie", 78);

        System.out.printf("Average grade: %.2f\n", gradeManager.getAverage());
        System.out.printf("Top student: %s\n", gradeManager.getTopStudent());
    }
}