# 1. Calculate the average of 3 numbers
In this assignment you will need to create a program that prompts the user to input `3` numbers in the console.
The program then calculates the sum and the average of the input numbers.

An example run of your program should look like the following:

```bash
Enter the first number and hit enter: 
1
Enter the second number and hit enter:
2
Enter the third number and hit enter: 
3
The numbers entered are: 1, 2, and 3
The sum of the numbers is: 6
The average of the numbers is: 2.0
```

Make sure your program prints the exact message from the example above when prompting the user for input.

Hints:
1. To obtain the input from the keyboard you will need to import and use the `Scanner` into your program.
2. Pay attention to the types of the variables being calculated (`sum`is an integer while `average` must be a double)
3. A boilerplate program is given in the `Average.java` file:

    ```java
    import java.util.Scanner;
    public class Average {
    public static void main(final String[] args) {
    Scanner input = new Scanner(System.in);
    
            // YOUR CODE HERE
    
            // Edit the following lines to include the numbers
            System.out.println("The numbers entered are: , , and ");
            System.out.println("The sum of the numbers is: ");
            System.out.println("The average of the numbers is: ");
    
            input.close();
        }
    }
    ```

Note: you should ***NOT*** change any files other than `Average.java`.

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository (using IntelliJ)
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
