import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        
        String[] quotes = {
            "The key to success is to focus on goals, not obstacles.",
            "The only way to do great work is to love what you do.",
            "Your only limit is the one you set in your mind",
            "Do what you can, with what you have, where you are.",
            "Life is what happens when you're busy making other plans.",
            "The purpose of our lives is to be happy."
        };

        // Creating a Random object
        Random random = new Random();

        // Generating a random index
        int randomIndex = random.nextInt(quotes.length);

        // Displays the random quote
        System.out.println(" Random Quote: " + quotes[randomIndex]);
    }
}


