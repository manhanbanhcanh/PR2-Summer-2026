<sub> Note: For optimal viewing, please read this document in Markdown format. </sub>

#### Task 1

```java
public class Activity1 {  
    // method (task 1)  
    public static int findMax(int[] arr, int n){  
        int max = arr[0];  
        for (int i = 1; i < n; i++){  
            if (arr[i] > max){  
                max = arr[i];  
            }
	    }     
        return max;  
    }  
    // example main method to execute the method above  
    public static void main(String[] args){  
        int[] arr = {1, 36, 18, 120, 67};  
        int n = arr.length;  
        System.out.println("Max: " + Integer.toString(findMax(arr, n)));  
    }
}
```

#### Task 2
1. Function purpose
2. Initialization of maximum value
3. Iterative loop
4. Conditional check
5. Return statement

#### Task 3
1. Syntax differences
2. Array declaration
3. Loop structure

#### Task 4
- The statement can be attributed to several key reasons: share fundamental programming concepts, syntax familiarity, problem-solving approach, and transferable knowledge 