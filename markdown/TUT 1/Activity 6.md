<sub> Note: For optimal viewing, please read this document in Markdown format. </sub>

```java
/**
* This class implements a simple program that
* will compute the amount of interest that is
* earned on 17,000 invested at an interest
* rate of 0.07 for one year. The interest and
* the value of the investment after one year are
* printed to standard output.
*/

public class Interest {
    public static void main(String[] args) {
        /* Declare the variables. */
        double principal;
        double rate;
        double interest;
        
        /* Do the computations. */
        principal = 17000;
        rate = 0.07;
        interest = principal * rate;
        principal = principal + interest;
  
        /* Output the results. */
        System.out.print("The interest earned is ");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is ");
        System.out.println(principal);
    } // end of main()
} // end of class Interest
```

#### a).
- Yes it works, because the variable `principal` are declared as `double` on the 12th line
- Changing `17000` to `17000.0` only provide a double literal directly, hence the program runs without issues

#### b).
- No, it will not compile, because of type mismatch on line 14 (`interest` is still a `double`)
- When trying to add `int` and `double` variables together, Java will keep the result as `double` to remain precision and try to assign `int` variable `principal` a `double` value (which is an illegal assignment)
- It is possible to keep `principal` as `int` by changing the 19th line to be:

```java
principal = (int)(principal + interest) 
// note that int cannot store decimal point
```
