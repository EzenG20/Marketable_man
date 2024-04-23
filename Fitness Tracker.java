import java.util.*;
import java.io.*;
import java.time;
class Fitness_Tracker
{

    
    public  static void menu()
    {

          /*Method menu()
		 * 
		 * Input: N/A
		 *  
		 *  Process: Displays Strings representing a menu for a menu based fitness tracker
		 * 
		 * Output:Strings to the referenced Output file 
		 * */
        
        System.out.print("Enter any of the following:");
        System.out.println("A: Add a new exercise entry");
        System.out.println("V: View previous entries");
        System.out.println("Q: Quit the program");

    }

    /*public static Set<String>loadExercises()
    {
       String exerciseFile= "ExerciseSet.txt";
        Set<String> exercises= new TreeSet<>();
 
    }
*/

public void viewEntry()
{
    
}
    public static void main(String[]args)
    {

         char option;
         Scanner sc= new Scanner(System.in);
         boolean isNotDone=true;
       PrintWriter records= new PrintWriter("Records.txt");

         menu();

      while(isNotDone)
      {
        option=sc.next().charAt(0);

        switch(option)
        {

            case q: 
            System.out.println("Bye! Hopefully we can see you again! ");
             break;
            case a:
            addEntry();
            break;
            case v:
            viewEntry();


        }

      }

    }
}