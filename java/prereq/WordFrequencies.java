package prereq;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WordFrequencies {
   public static void main(String[] args) {      
      // STEP 1: Read the number of words into an integer
       
        Scanner scnr = new Scanner(System.in);

        int num = scnr.nextInt();

      // STEP 2: Read the words, one-at-a-time into an ArrayList

       List<String> list = new ArrayList<>();

       for (int i = 0; i < num; i++) {
           String word = scnr.next();
           list.add(word);
       }

      // STEP 3: Find the number of times the *first* word appears in the ArrayList.
      //         Print out this number in the required format.
        
      for (int i = 0; i < list.size(); i++) {
           String word = list.get(i);
           int freq = 1;
           for (int j = i + 1; j < list.size(); j++) {
               if (word.equals(list.get(j))) {
                  freq++;
               }
           }
      
          System.out.println(word + " - " + freq);
      }
      // STEP 4: Question - What do you need to change in your Step 3 code
      //                    to find the number of times the *second* word
      //                    appears in the ArrayList?


      for (int i = 1; i < list.size(); i++) {
        String word = list.get(i);
        int freq = 1;
        for (int j = i + 1; j < list.size(); j++) {
            if (word.equals(list.get(j))) {
               freq++;
            }
        }
   
       System.out.println(word + " - " + freq);
     }
      //         Question - What about the *third* word?

      for (int i = 2; i < list.size(); i++) {
        String word = list.get(i);
        int freq = 1;
        for (int j = i + 1; j < list.size(); j++) {
            if (word.equals(list.get(j))) {
               freq++;
            }
        }
   
       System.out.println(word + " - " + freq);
   }

      //         Question - Do you see a pattern emerging?

      // STEP 5: Turn your code in Step 3 into a loop that checks every word in the ArrayList


      for (int i = 0; i < list.size(); i++) {
          String word = list.get(i);
          int freq = 1;
          for (int j = 0; j < list.size(); j++) {
             if (i != j && word.equals(list.get(j))) {
                freq++;
              }
          }
    
        System.out.println(word + " - " + freq);
      }

    scnr.close();

   }
}