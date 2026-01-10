<sub> Note: For optimal viewing, please read this document in Markdown format. </sub>

```java
import java.util.Scanner;  
  
public class Activity5 {  
    public static void main(String[] args) {  
  
        try (Scanner scanner = new Scanner(System.in)) {  
            System.out.print("How many eggs do you have: ");  
            int totalEggs = scanner.nextInt();  
  
            int gross = totalEggs / 144;  
            int remainingAfterGross = totalEggs % 144;  
            int dozens = remainingAfterGross / 12;  
            int leftOver = remainingAfterGross % 12;  
  
            System.out.print("Your number of eggs is " + gross + " gross, ");  
            System.out.print(dozens + " dozen, and " + leftOver + ".");  
  
        } catch (Exception e) {  
            System.out.println("Please enter a valid whole number.");  
        }    
    }
}
```
