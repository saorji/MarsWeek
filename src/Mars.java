public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Paris";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        shipFood = shipFood - (shipPopulation * 0.75);
        shipFood = shipFood - (shipPopulation * 0.75);

        System.out.println(shipFood);

            //An extra crate of food is found increasing shipFood by 50%
            shipFood += (shipFood * .5);

//        //The births very timed perfectly and 5 more babies join the ShipPopulation
            shipPopulation += 5;
//
//        //Choose where you want the ship to land. The Hill, The Plain, or The Ocean
//        //Create a String value called LandingLocation and set it equal to "The Hill" or "The Plain" or "The Ocean"
            String landingLocation = "The Hill";
//
//
//        //Create an if else statement. That checks to see if the LandingLocation is equal to "The Plain" ignoring case
        if (landingLocation.equalsIgnoreCase("The Plain"))
        {
            //Print "Bbzzz Landing on the Plain"
            System.out.println("Bbzzz Landing on the Plain");
        }
        else
        {
            //Print "ERROR!!! Flight plan already set. Landing on the Plain"
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        //Call a function called LandingCheck() that has a parameter of 100, returns boolean, and set it equal to Landing
        landing = landingCheck(100);
        //Run the GuessingGame by calling a new GuessingGame constructor
        new GuessingGame();

        //Run the MarsExpedition by calling a new MarsExpedition constructor
        new MarsExpedition();

        //Run the FindingsLists by calling a new FindingsLists constructor
        new FindingsLists();

    }

    //Create a public static void function called LandingCheck with an int parameter called Loops
    public static boolean landingCheck(int loops) throws InterruptedException{
            for(int i=0; i <= loops; i++){
                if(((i % 3) == 0) && ((i % 5) == 0)){
                    System.out.println("Keep Center");
                } else if ((i % 5) == 0) {
                    System.out.println("Right");
                } else if ((i % 3) == 0) {
                    System.out.println("Left");
                }else {
                    System.out.println("Calculating");
                }
                //Thread.sleep(250) slows the console down by 250 milliseconds
                Thread.sleep(250);
            }
        //Print "Landed"
        System.out.println("Landed");

        //The ship has landed on Mars. Return the value false;
        return false;
    }
}
