// Kinsey Clyne
// 9Nitrogen
import java.io.*;
import java.net.*;
import java.util.*;
 
public class WordCount {
    public static void main(String[] args) throws IOException, MalformedURLException {
        URL url = new URL("http://basisphoenix.azurewebsites.net/wp-content/uploads/2014/11/battleship.txt");
        Scanner input = new Scanner(url.openStream());
        String txt = "";
        
        // create an ArrayList of type String to store the unique words
        int c = txt.length;
        for(int a = 0; a < c; a++) {
         String[] ArrayListS = new String[null];
          String b = txt.substring(0, txt.indexOf(" "));
          txt = txt.substring(txt.indexOf(" " + 1), txt.length));
          ArrayListS.add(b);
        }
        
        //create an ArrayList of type Integer to store the count of each time the unique word appears
        Integer[] ArrayListI = new Integer[0];
        String[] ArrayListS2 = new String[null];
        for(int counter = 0; counter < ArrayListS.length(); counter++) {
         ArrayListS2.add(ArrayListS[counter]);
        }
        for(int counter = 0; counter < ArrayListS.length(); counter++) {
         
        }

    public static int EachTime(ArrayListS,)
        String[] ArrayListI = 

        while(input.hasNextLine()) {
            // get the next line from the input file
            txt = input.nextLine();
            
            // print the original input
            System.out.println(txt);
            System.out.println();
            
            // call your method countUniqueWords
//-----> YOUR CODE HERE
            
            // print out number of unique words found, like: "Number of unique words: 23"
//-----> YOUR CODE HERE

            System.out.println();

            System.out.println("Count\tWord ");
            // for each word in your ArrayList of unique words, print the count followed by a tab and the word
//-----> YOUR CODE HERE

        }
        input.close();
    }
 
    // COMPLETE method countUniqueWords - use wordList to store the unique words in String input with a length > 3 and
    // wordCount to count the number of occurances of each unique word.
    //
    // Parameters:
    //    wordList - an ArrayList of type String to store a sorted list of unique words in the String input
    //    wordCount - an ArraltList of type Integer to store a list of the for each unique word in the String input
    //    input - String of text to be processed
    // Return Type: void
    public static void countUniqueWords(ArrayList<String> wordList, ArrayList<Integer> wordCount, String input) {
        Scanner getWords = new Scanner(input).useDelimiter("[\\W]");
        int index = 0;
        String word = "";
        
        // while getWords has more text
        //    get next word as lower case
        //        if length of word > 3 characters
        //            if wordList contains the word
        //                get index of the word in the ArrayList
        //                increment the word count at the same index in ArrayList wordCount
        //             else
        //                add word and count of 1 to wordList and wordCount, respectively
        //
//-----> YOUR CODE HERE
        
        getWords.close();
        
        // sort wordList alphabetically, don't forget you will need to swap the values of wordCount
        // anytime you swap values in wordList
//-----> YOUR CODE HERE
        
    }
}
