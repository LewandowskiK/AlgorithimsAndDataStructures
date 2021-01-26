//comments here...
package week1.exercise3;

public class TestWordCounter {
    public static void main(String[] args) {
        System.out.println("Getting the word count of following sentences:\n");
        System.out.println("A Star Is Born -> " + WordCounter.countWords("A Star Is Born"));//expected 4
        System.out.println("Munster Technological University -> " + WordCounter.countWords("Munster Technological University"));//expected 3
        System.out.println("I Wandered Lonely as a Cloud by William Wordsworth -> " + WordCounter.countWords("I Wandered Lonely as a Cloud by William Wordsworth"));//expected 9

        System.exit(0);
    }
}
