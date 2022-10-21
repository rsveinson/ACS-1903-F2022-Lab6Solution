import java.util.Scanner;

/**
 * ACS-1903 Lab 6 Q8
 * @author (your name and student number)
 */

public class PlanetMoons{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String planet;
        int moons = -1;

        // enter your code here;
        // get the planet name
        System.out.println("Enter a planet.");
        planet = kb.next();
        
        // convert input to all lower case
        //planet = planet.toLowerCase();
        
        // new assign a value to moons based on planet name
        // you can set planet to all lower case in the switch expression if you prefer
        switch(planet.toLowerCase()){
            case "mercury":
            case "venus":   moons = 0;
            break;
            case "earth":   moons = 1;
            break;
            case "mars":    moons = 2;
            break;
            case "jupiter": moons = 80;
            break;
            case "saturn": moons = 83;
            break;
            case "uranus": moons = 27;
            break;
            case "neptune": moons = 14;
            break;
            default:    moons = -1;
        }// end switch
        
        // moons have been set now output summary
        
        System.out.println(moons >= 0 ? moons : "Unkonwn");

    }// end main
}// end class
