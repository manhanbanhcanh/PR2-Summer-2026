<sub> Note: For optimal viewing, please read this document in Markdown format. </sub>

```java
import java.util.Scanner;  
  
public class Activity4 {  
    public static void main(String[] args){  
        Scanner input = new Scanner(System.in);  
  
        System.out.println("Enter your name: ");  
        String name = input.nextLine();  
  
        System.out.println("Hello, "+ name.toUpperCase() +", nice to meet you!");  
    }
}
```