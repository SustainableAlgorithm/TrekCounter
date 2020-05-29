// Kathleen Kagan
// ACO 102 - Spring 2020

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class TrekCounter
{
   public static void main(String[] args) throws FileNotFoundException
   {
     try
      {
      // read a file
         Scanner trekFile = new Scanner(new FileReader("input.txt"));
         PrintWriter output = new PrintWriter(new FileOutputStream("output.txt"));
         trekFile.useDelimiter("[^A-Za-z]+");
         
         // declare the variables
         int words = 1;
         int lines = 0;
         int charCount = 0;
         
         // count
         while (trekFile.hasNextLine())
         {
           // count the lines
            String line;
            line = trekFile.nextLine();
            lines++;
            
            // count the words
            String kirk [] = line.split((" "));
            for (int i = 0; i < kirk.length; i++)
            {
               if (kirk [i].length() > 0)
               {
                  words++;
               }
            }
            
            // count the characters
            charCount += (line.length());

         }
         
      // System out print.
      System.out.printf("%d lines, %d words, %d characters", lines, words, charCount);
      trekFile.close();
      
      } // end of try
      
      // catch the exception
      catch (FileNotFoundException exception)
      { System.out.println("File Not Found"); }
      
   } // end of method
   
} // end of class