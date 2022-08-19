import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists {
    public FindingsLists() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found");

        //Create an Arraylist<String> named rockList and set it equal to new ArrayList<String>()
        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        //rock, weird rock, smooth rock, and not rock
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        //Print "Wait a second that last on is not a rock we need to delete that one from the list."
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        //Remove "not rock" from the rockList ArrayList by using rockList.remove()
        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Perfect");

        Thread.sleep(500);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        //Print "Which of the fossils would you like to learn more about (Spelling and Spacing is important)?"
        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);

        //Create a String variable called fossilChoice and set it equal to input.nextLine()
        String fossilChoice = input.nextLine();


        if (fossilChoice.equalsIgnoreCase("Bird Fossil"))
        {
        //Print "Fossil: fossilChoice \nDescription: fossilDirectory.get(fossilChoice)
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        //Create an else if statement to check if fossilChoice equals "Fish Fossil"
        else if (fossilChoice.equalsIgnoreCase("Fish Fossil"))
        {
        //Print "Fossil: fossilChoice \nDescription: fossilDirectory.get(fossilChoice)
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        //Create an else if statement to check if fossilChoice equals "Tooth Fossil"
        else if (fossilChoice.equalsIgnoreCase("Tooth Fossil"))
        {
        //Print "Fossil: fossilChoice \nDescription: fossilDirectory.get(fossilChoice)
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(500);

        HashSet<String> suppliesBrought = new HashSet<>();

        HashSet<String> suppliesUsed = new HashSet<>();

        //Use .add() to add "Food" to the HashSet suppliesBrought
        suppliesBrought.add("Food");
        //Use .add() to add "Water" to the HashSet suppliesBrought
        suppliesBrought.add("Water");
        //Use .add() to add "Medicine" to the HashSet suppliesBrought
        suppliesBrought.add("Medicine");

        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        //Printing what is left over
        System.out.println("Medicine");
    }
}
