/*
 * The program is going to work just when it is called from the main program.
   It is going to define the class based on the attributes introduced, and then 
   initialize the variables for those attributes. Then defines the getters and 
   setters for each variable and return it them. Finally is going define a toString
   returning a sentence with your first name, last name, favorite color, and 
   superpower.
 */
package superherotester;

/**
 *
 * @author 
 */
public class SuperHeroDomain
{
   //define your attributes here:
   private String firstName, lastName; 
   private String superPower, favoriteColor;  
  

    //define your constructor here:
    public SuperHeroDomain(String fn, String ln, String sp, String fc) 
    {
      //initialize the variables
        firstName = fn; 
        lastName = ln; 
        superPower = sp; 
        favoriteColor = fc;  
        
        
    }
    //define your setters and getters here:
    
    public String getFavoriteColor()
    { 
        return favoriteColor; 
    }  
    public void setFavoriteColor(String newthing) 
    {
    favoriteColor = newthing;
    }
    
    public String getFirstName()
    { 
        return firstName; 
    }  
    public void setFirstName(String newthing) 
    {
    firstName = newthing;
    }
    public String getLastName()
    { 
        return lastName; 
    }  
    public void setLastName(String newthing) 
    {
    lastName = newthing;
    } 
    public String getSuperPower()
    { 
        return superPower; 
    }  
    public void setSuperPower(String newthing) 
    {
    superPower = newthing;
    }
    
    
    //accesstype example  //define your toString here:
   public String toString () 
   {
     return "My name is " + firstName + " " + lastName + " , my superpower is "
            + superPower + ", and my favorite color is " + favoriteColor; 
    
            } 
   
}
