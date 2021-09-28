package FindOrDieGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindOrDie {

    // Variables
    boolean validBoardSize = false;
    boolean gameOver = false;
    int boardDimension;
    int numSquares;
    int reqNumMinesAndSecondChances;

    // Prize, Mine, Second Chance Locations
    int prizeLocation;
    ArrayList<Integer> mineLocations = new ArrayList<Integer>();
    ArrayList<Integer> secondChanceLocations = new ArrayList<Integer>();

    // Cell, Cell Item, and Cell Clicked Arrays
    ArrayList<Integer> cellList = new ArrayList<Integer>();
    ArrayList<String> cellItem = new ArrayList<String>();
    ArrayList<Boolean> cellClicked = new ArrayList<Boolean>();

    public void buildBoard(int boardSize) {

        numSquares = boardSize*boardSize;

        // Initiate ArrayLists with empty values so index locations can be directly set later
        for (int i = 1; i<= numSquares; i++) {
            cellList.add(i); // i for Square/Cell Number
            cellItem.add(""); // "" for unset prize/mine/second chance locations
            cellClicked.add(false); // false for cellCLicked
        }

        Random rand = new Random();

        // Create Cell Reward Value List
        // Prize random number values: 1 for prize, 2 for mine, 3 for second chance

        // Set Prize Location
        int randomPrizeLocationSelection = rand.nextInt(numSquares);
        cellItem.set(randomPrizeLocationSelection, "Prize");
        prizeLocation = randomPrizeLocationSelection;

        // Set Mine Locations
        int numMinesSet = 0;
        while (numMinesSet < reqNumMinesAndSecondChances) {
            int randomMineLocationSelection = rand.nextInt(numSquares);
            if ((randomMineLocationSelection != prizeLocation) && (!mineLocations.contains(randomMineLocationSelection))) {
                cellItem.set(randomMineLocationSelection, "Mine");
                mineLocations.add(randomMineLocationSelection);
                numMinesSet++;
            }
        }

        // Set Second Chance Locations
        int numSecondChancesSet = 0;
        while (numSecondChancesSet < reqNumMinesAndSecondChances) {
            int randomSecondChanceLocationSelection = rand.nextInt(numSquares);
            if ((randomSecondChanceLocationSelection != prizeLocation) && (!mineLocations.contains(randomSecondChanceLocationSelection)) && (!secondChanceLocations.contains(randomSecondChanceLocationSelection))) {
                cellItem.set(randomSecondChanceLocationSelection, "Second Chance");
                secondChanceLocations.add(randomSecondChanceLocationSelection);
                numSecondChancesSet++;
            }
        }

    }

}
