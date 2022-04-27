import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestAverage {

   @Test
   public void testHelloWorld()
   {
       InputStream originalIn = System.in; // backup System.in to restore it later
       ByteArrayInputStream in = new ByteArrayInputStream(("1" + System.lineSeparator() + "2" + System.lineSeparator() + "3").getBytes());
       System.setIn(in);

     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Average.main(null);

     // assertion
     assertEquals("Enter the first number and hit enter: \nEnter the second number and hit enter: \nEnter the third number and hit enter: \nThe numbers entered are: 1, 2, and 3\nThe sum of the numbers is: 6\nThe average of the numbers is: 2.0\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   System.setIn(originalIn);
   }
}