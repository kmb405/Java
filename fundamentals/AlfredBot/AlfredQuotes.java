import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guest = String.format("Hello %s. Lovely to see you.", name);
        return guest;
    }

    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        String guest = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return guest;
    }

    public String guestGreeting() {
        // YOUR CODE HERE
        Date date = new Date();
        DateFormat outputFormatter = new SimpleDateFormat("a");
        String output = outputFormatter.format(date);

        if (output == "AM") {
            String guest = "Good Morning. Lovely to see you.";
            return guest;
        }
        else {
            String guest = "Good Afternoon. Lovely to see you.";
            return guest;
        }
        
        
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        String dateAnnouncement = String.format("It is currently " + date);
        return dateAnnouncement;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") >= 0) {
            String response = "Right away, sir. She certainly isn't sophisticated enough for that.";
            return response;
        } else if (conversation.indexOf("Alfred") >= 0) {
            String response = "At your service. As you wish, naturally.";
            return response;
        } else {
            String response = "Right. And with that I shall retire.";
            return response;
        }
    }
    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
