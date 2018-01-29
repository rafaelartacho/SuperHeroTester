/** 
 * @author 6122403   
 *  Title:             SuperHeroTester
 * Semester:         COP2250 - Spring 2018
 * Lecturer's Name:  Maria Charters   
 * Description of Program’s Functionality:
 * The main goal for the Program is to get data for the user and based on that data
   is going to determine which superhero you are. In the first method (getDataFromUser)
   is going to promp the user for his first and last name, his superpower, and his favorite color. 
   Then is going to assigns a class for the object aSuperHero and there is going to analyze all 
   the data introduced by the user (it is explained in the SuperHeroDomain). Finally in the last method
   (determineSuperHeroIdentity) is going to choose which superhero you are. 
   
 */
package superherotester;
import java.util.Scanner;

/**
 *
 * @author Charters
 */
public class SuperHeroTester
{
    public static SuperHeroDomain aSuperHero;

    /**
     * This program 
     */
    public static void main(String[] args)//main program here.
    {
        getDataFromUser();
        determineSuperHeroIdentity();
        
    }
    
    public static void getDataFromUser()  //promp the user for his first and last name, super power, and favorite color. 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = keyboard.nextLine();
        System.out.println("What is your last name?");
        String lastName = keyboard.nextLine();
        System.out.println("What is your super power?");
        String superPower = keyboard.nextLine();
        System.out.println("What is your favorite color?");
        String favoriteColor = keyboard.nextLine();
        
        aSuperHero = new SuperHeroDomain(firstName, lastName, superPower, favoriteColor);
      
    }
    
    public static void determineSuperHeroIdentity() //determine which superhero you are based on the factors that the user have introduced.
    {
        System.out.println(aSuperHero);
        
        if (aSuperHero.getFavoriteColor().equalsIgnoreCase("red"))
        {
            System.out.println("You must be Spiderman!");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("green"))
        {
            System.out.println("You must be Green Goblin!");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("black"))
        {
            System.out.println("You must be Batman");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("blue"))
        {
            System.out.println("You must be Captain America");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("purple"))
        {
            System.out.println("You must be Magneto");
        }
        else
        {
            System.out.println("You are a Mystery Super Hero..."); 
        }
            
    }
    
}
