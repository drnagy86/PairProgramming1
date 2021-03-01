import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.time.Month;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
            //scanner 
        //1.Please enter your date of birth(format YYYY-MM-DD)
        System.out.println("Enter your birth date (YYYY-MM-DD)");
        String userInput = scanner.nextLine();
        scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");



        //2.create local date object to compare user date and pattern
        //validation of input
        LocalDate userDate = LocalDate.parse(userInput, formatter);

        Month month = userDate.getMonth();
        String yourMonth = month.getDisplayName(TextStyle.FULL, Locale.US);
        int yourDay = userDate.getDayOfMonth();


        //3. if/else ladder for zodiac

        if (yourMonth.equals("March") && yourDay >= 21 || yourMonth.equals    ("April") && yourDay <= 19){
            System.out.println("Aries");
        
           
        } else if(yourMonth.equals("April") && yourDay <= 20 || yourMonth.equals("May") && yourDay >= 20){
            System.out.println("Taurus");
        

     } else if (yourMonth.equals("May") && yourDay >= 21 || yourMonth.equals    ("June") && yourDay <= 20){
            System.out.println("Gemini");
           
        } else if(yourMonth.equals("June") && yourDay <= 21 || yourMonth.equals("July") && yourDay >= 22){
            System.out.println("Cancer");
        }

        else if (yourMonth.equals("July") && yourDay >= 23 || yourMonth.equals    ("August") && yourDay <= 22){
            System.out.println("Leo");
        
           
        } else if(yourMonth.equals("August") && yourDay <= 23 || yourMonth.equals("September") && yourDay >= 23){
            System.out.println("Virgo");
        }

        if (yourMonth.equals("September") && yourDay >= 23 || yourMonth.equals  ("October") && yourDay <= 22){
            System.out.println("Libra");
        
           
        } else if(yourMonth.equals("October") && yourDay <= 23 || yourMonth.equals("November") && yourDay >= 21){
            System.out.println("Scorpio");
        }

        else if (yourMonth.equals("November") && yourDay >= 22 || yourMonth.equals    ("December") && yourDay <= 21){
            System.out.println("Sagitarius");
        
           
        } else if(yourMonth.equals("December") && yourDay >= 22 || yourMonth.equals("January") && yourDay <= 19){
            System.out.println("Capricorn");
        }

        else if (yourMonth.equals("January") && yourDay >= 20 || yourMonth.equals    ("February") && yourDay <= 18){
            System.out.println("Aquarius");
        
           
        } else if(yourMonth.equals("February") && yourDay >= 19 || yourMonth.equals("March") && yourDay <= 20){
            System.out.println("Pisces");
        }

        //4. display to console

        

        







    }
}
