//comments here...
package week1.exercise3;

public class WordCounter {

    public static int countWords(String a){
        int wordCount = 1;

        if(!a.equals("")){
            for(int i = 0; i < a.length(); i++){

                if(a.charAt(i)==' '){
                    wordCount++;
                }
            }
            return wordCount;
        }
        return 0;
    }
}
