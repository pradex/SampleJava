import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pradeep on 16/10/15.
 */
public class Sample {
    public static void main(String[] args) {
        InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader bufRead = new BufferedReader(istream) ;

        System.out.println("Welcome To My First Java Program");

        try {
            System.out.println("Please Enter In Your First Name: ");
            String firstName = bufRead.readLine();

            System.out.println("Please Enter In The Year You Were Born: ");
            String bornYear = bufRead.readLine();

            System.out.println("Please Enter In The Current Year: ");
            String thisYear = bufRead.readLine();

            int bYear = Integer.parseInt(bornYear);
            int tYear = Integer.parseInt(thisYear);

            int age = tYear - bYear;

            System.out.println("Hello " + firstName + ". You are " + age + " years old");
        }
        catch (IOException err) {
            System.out.println("Error reading line");
        }
        catch(NumberFormatException err) {
            System.out.println("Error Converting Number");
        }
    }
}
