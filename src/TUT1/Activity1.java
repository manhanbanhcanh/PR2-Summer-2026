package TUT1;

/*
Given these three implementations of the same algorithm (finding the maximum element), identify the common patterns:
C version:
    int findMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
Python version:
    def find_max(arr):
        max_val = arr[0]
        for num in arr[1:]:
            if num > max_val:
                max_val = num
        return max_val

TODO Tasks:
    1. Write the Java version
    2. List 5 similarities across all three versions
    3. List 3 key differences
    4. Explain why the lecture says "once you master one imperative language, it's easy to learn another"
*/

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
        System.out.println("Max: " + findMax(arr, n));
    }
}
