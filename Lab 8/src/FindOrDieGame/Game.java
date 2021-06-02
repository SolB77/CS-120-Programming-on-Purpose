package FindOrDieGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    int board_size;
    boolean validBoardSize = false;
    boolean gameOver = false;

    int prizeLocation = 0;
    ArrayList<Integer> mineLocations = new ArrayList<>();
    ArrayList<Integer> secondChanceLocations = new ArrayList<>();

    ArrayList<Integer> cellList = new ArrayList<Integer>();
    ArrayList<String> cellItem = new ArrayList<String>();
    ArrayList<Boolean> cellClicked = new ArrayList<Boolean>();

    public void play() {
        Scanner scnr = new Scanner(System.in);
        round();
//        while (!gameOver) {
//            System.out.println("Select a square: ");
//            int playerSelection = scnr.nextInt();
//
//            if (playerSelection == prizeLocation) {
//                System.out.println("Game Over!");
//                gameOver = true;
//            }
//        }
        System.out.println(prizeLocation);
        System.out.println(mineLocations);
        System.out.println(secondChanceLocations);
        System.out.println(7/2);
    }

    public void round() {
        setBoard_size();
        buildBoard();
        System.out.println(cellList);
        System.out.println(cellItem);
        System.out.println(cellClicked);
    }

    public void buildBoard() {
        Random rand = new Random();
        boolean prizeSet = false;
        int numSecondChances = 0;
        int reqSecondChances = ((board_size*board_size)/2);

        for (int i=1;i<=(board_size*board_size);i++) {

            // Build Cells
            System.out.print("Square "+i+" ");
            if ((i%board_size) == 0) {
                System.out.println();
            }

            // Create Cell List
            cellList.add(i);

            // Create Cell Reward Value List
            // Prize random number values: 1 for prize, 2 for mine, 3 for second chance

            if (!prizeSet && numSecondChances<reqSecondChances) {
                int randomSelection = rand.nextInt(3) + 1;
                if (randomSelection == 1) {
                    cellItem.add("Prize");
                    prizeLocation = (i-1);
                    prizeSet = true;
                }
                else if (randomSelection == 2) {
                    cellItem.add("Mine");
                    mineLocations.add((i-1));
                }
                else if (randomSelection == 3) {
                    cellItem.add("Second Chance");
                    secondChanceLocations.add((i-1));
                    numSecondChances++;
                }
            }

            else if (prizeSet && numSecondChances<reqSecondChances) {
                int randomSelection = rand.nextInt(2) + 2;
                if (randomSelection == 2) {
                    cellItem.add("Mine");
                    mineLocations.add((i-1));
                }
                else if (randomSelection == 3) {
                    cellItem.add("Second Chance");
                    secondChanceLocations.add((i-1));
                    numSecondChances++;
                }
            }

            else if (prizeSet && numSecondChances==reqSecondChances) {
                cellItem.add("Mine");
                mineLocations.add(i-1);
            }

            // Create Cell Clicked List
            cellClicked.add(false);

        }

    }


    public void setBoard_size() {
        Scanner scnr = new Scanner(System.in);
        while (!validBoardSize) {
            System.out.println("How big of a board do you want to play? ");
            int input = scnr.nextInt();
            if ((input%2) == 0) {
                System.out.println("The board size must be an odd number!");
            }
            else {
                board_size = input;
                validBoardSize = true;
            }
        }
    }

    public static void main(String[] args) {
        Game newgame = new Game();
        newgame.play();
    }
}
