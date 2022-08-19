import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);
        //Print "Expedition prep program starting..."
        System.out.println("Expedition prep program starting...");
        //Print "Booting up..."
        System.out.println("Booting up...");
        //Print "..."
        System.out.println("...");
        //Print "..."
        System.out.println("...");
        //Print "..."
        System.out.println("...");
        //Print "Ready"
        System.out.println("Ready");


        //Print "Hello user. What is your name?"
        System.out.println("Hello user, What is your name?");

//Create a new String variable named name which is set equal to input.nextLine()
        String name = input.nextLine();

//Print "Hi, name --- Welcome to the Expedition prep program.\n
//Are you ready to head out into the new world?\n
// Type Y or N"
        System.out.println("Hi, " + name + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

//Create a new String variable called excited which is set equal to input.nextLine()
        String excited = input.nextLine();

//Create an if statement that checks if excited is equal to Y ignoring case
        if (excited.equalsIgnoreCase("Y"))
        {
//Print "I knew you would say that. You are team leader for a reason."
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }
//Use an else statement for everything else
        else
        {
//Print “To bad you are team leader. You have to go.”
            System.out.println("To bad you are team leader. You have to go.");
        }

//Print "How many people do you want on your expedition team? (Input an int number)"
        System.out.println("How many people do you want on your expedition team? (Input an int number)");

//Create a new int variable named teamSize and set it equal to input.nextInt()
        int teamSize = input.nextInt();
//You need to use input.nextLine() to correct the location of the scanner after using nextInt()
        input.nextLine();

//Use an if statement to check if teamSize is greater than 2
        if (teamSize > 2)
        {
//Print "That's way to many people. We can only send 2 more members."
            System.out.println("That's way to many people. We can only send 2 more members");
//Set teamSize equal to 2
            teamSize = 2;
        }
//Use an else-if statement to check if teamSize is less than 2
        else if (teamSize < 2)
        {
//Print "That's not enough people. We need you and 2 more members."
            System.out.println("That's not enough people. We need you and 2 more members.");
//Set teamSize equal to 2
            teamSize = 2;
        }
//Use an else if statement to check if teamSize equals 2
        else if (teamSize == 2)
        {
//Print "That's a perfect sized team. Good job."
            System.out.println("That's a perfect sized team. Good job.");
        }


        System.out.println("You are allowed to bring one weapon with you. You know, just incase. What do you bring?");
        String weapon = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + weapon + " with you");
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String vehicleChoice = input.nextLine();
        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Roover";

        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        } else {
            vehicleChoice = "your feet";
        }
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");

    }
}
