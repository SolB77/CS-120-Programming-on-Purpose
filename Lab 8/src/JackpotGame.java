import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class JackpotGame {

    // Variables
    boolean gameOver = false;
    int numLocations;
    int reqNumTrapsAndConsolationPrizes;

    // Locations
    int prizeLocation;
    ArrayList<Integer> trapLocations = new ArrayList<>();
    ArrayList<Integer> consolationLocations = new ArrayList<>();

    // Location, Location Item, and Location Hit
    ArrayList<Integer> locationList = new ArrayList<>();
    ArrayList<String> locationItem = new ArrayList<>();
    ArrayList<Boolean> locationHit = new ArrayList<>();

    public JackpotGame() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the number of locations to play: ");
        int input = scnr.nextInt();
        numLocations = input;
        reqNumTrapsAndConsolationPrizes = input/2;

        for (int i = 1; i<= numLocations; i++) {
            locationList.add(i); // i for Square/Cell Number
            locationItem.add(""); // "" for unset items
            locationHit.add(false); // false for locationHit
        }

        Random rand = new Random();

        // Set Prize Location
        int randomPrizeLocationSelection = rand.nextInt(numLocations);
        locationItem.set(randomPrizeLocationSelection, "Jackpot Prize!");
        prizeLocation = randomPrizeLocationSelection;

        // Set Trap Locations
        int numTrapsSet = 0;
        while (numTrapsSet < reqNumTrapsAndConsolationPrizes) {
            int randomTrapLocationSelection = rand.nextInt(numLocations);
            if ((randomTrapLocationSelection != prizeLocation) && (!trapLocations.contains(randomTrapLocationSelection))) {
                locationItem.set(randomTrapLocationSelection, "Trap!");
                trapLocations.add(randomTrapLocationSelection);
                numTrapsSet++;
            }
        }

        // Set Consolation Locations
        int numConsolationsSet = 0;
        while (numConsolationsSet < reqNumTrapsAndConsolationPrizes) {
            int randomConsolationLocationSelection = rand.nextInt(numLocations);
            if ((randomConsolationLocationSelection != prizeLocation) && (!trapLocations.contains(randomConsolationLocationSelection)) && (!consolationLocations.contains(randomConsolationLocationSelection))) {
                locationItem.set(randomConsolationLocationSelection, "Consolation prize!");
                consolationLocations.add(randomConsolationLocationSelection);
                numConsolationsSet++;
            }
        }

        while (!gameOver) {
            for (int i=1;i<=numLocations;i++) {
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Enter a location: ");
            int locationSelection = scnr.nextInt();
            locationSelection = locationSelection - 1;
            if (locationHit.get(locationSelection)) {
                System.out.println("Invalid location choice! The cell was already picked!");
            }
            else {
                switch (locationItem.get(locationSelection)) {
                    case "Jackpot Prize!" -> {
                        locationHit.set(locationSelection, true);
                        System.out.println("You hit the jackpot! You won! Game over!");
                        gameOver = true;
                    }
                    case "Consolation prize!" -> {
                        locationHit.set(locationSelection, true);
                        System.out.println("You hit a consolation prize! Keep going!");
                    }
                    case "Trap!" -> {
                        locationHit.set(locationSelection, true);
                        System.out.println("You hit a trap! You lost! Game over!");
                        gameOver = true;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        JackpotGame newgame = new JackpotGame();
    }
}
