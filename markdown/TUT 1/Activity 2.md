<sub> Note: For optimal viewing, please read this document in Markdown format. </sub>
#### a).
```java
public class Activity2a {  
    public static void bubbleSort(int[] arr, int n) {  
        for (int i = 0; i < n - 1; i++) {  
            for (int j = 0; j < n - i - 1; j++) {  
                if (arr[j] > arr[j + 1]) {  
                    int temp = arr[j];  
                    arr[j] = arr[j + 1];  
                    arr[j + 1] = temp;  
                }
            }        
        }    
    }  
    
    public static void printArray(int[] arr, int n) {  
        for (int i = 0; i < n; i++) {  
            System.out.print(arr[i] + " ");  
        }        
	    System.out.println();  
    }  
    
    public static void main(String[] args) {  
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  
        int n = arr.length;  
        bubbleSort(arr, n);  
        printArray(arr, n);  
    }
}
```

#### b).
```java
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
        }        float sum = 0;  
        for (int i : students.values()) {  
            sum += i;  
        }        
        return sum / students.size();  
    }  
    
    public String getTopStudent() {  
        if (students.isEmpty()) {  
            return null;  
        }        String topStudent = null;  
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
```

#### c).
```java  
public class Activity2c {  
    private double result;  
  
    public Activity2c() {  
        this.result = 0;  
    }  
    public double add(double a, double b) {  
        this.result = a + b;  
        return this.result;  
    }  
    public double subtract(double a, double b) {  
        this.result = a - b;  
        return this.result;  
    }  
    public double multiply(double a, double b) {  
        this.result = a * b;  
        return this.result;  
    }  
    public Double divide(double a, double b) {  
        if (b == 0) {  
            System.out.println("Cannot divide by zero");  
            return null;  
        }        this.result = a / b;  
        return this.result;  
    }  
    public static void main(String[] args) {  
        Activity2c calc = new Activity2c();  
        System.out.println(calc.add(5, 3));  
        System.out.println(calc.multiply(4, 2));  
        System.out.println(calc.divide(10, 0));  
    }}
```