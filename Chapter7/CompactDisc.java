import java.io.*;
import java.util.Scanner;

/**
   This program creates a list of songs for a CD
   by reading from a file.
*/

public class CompactDisc
{
   public static void main(String[] args)throws IOException
   {
      Scanner input = new Scanner(new File("C:\\Users\\awdre\\Desktop\\SWE\\CICS190\\Chapter7\\Classics.txt"));
      String title;
      String artist;

      Song [] cd = new Song[6];

      for (int i = 0; i < cd.length; i++)
      {
         title = input.nextLine();
         artist = input.nextLine();

         cd[i] = new Song(title, artist);
      }

      System.out.println("\nContents of Classics:\n");
       for (Song cdSong : cd) {
           System.out.println(cdSong.toString());
       }

       

   }
   
}