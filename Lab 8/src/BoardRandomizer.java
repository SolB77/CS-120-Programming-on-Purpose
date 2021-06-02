import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class BoardRandomizer {
private int[] boardArray;
private int n;
private boolean gameOver;

	
	public BoardRandomizer(int max) {
		int i = 0;
		int awardNum = 1;
		int mineNum = 2;
		int diceNum = 0;
		int randNum;
		gameOver = false;
		n = max;
		Random randGen = new Random();
		boardArray = new int[max * max];
		
		boardArray[randGen.nextInt(max * max)] =  awardNum;
		
		while (i < max * max/2) {
			randNum = randGen.nextInt(max * max);
			if (boardArray[randNum] != awardNum && boardArray[randNum] != mineNum) {
				boardArray[randNum] = mineNum;
				i++;
			}
			}
		
		while (i < max*max/2) {
			randNum = randGen.nextInt(max * max);
			if (boardArray[randNum] != awardNum && boardArray[randNum] != mineNum && boardArray[randNum] != diceNum) {
				boardArray[randNum] = diceNum;
				i++;
			}
		}
	}
	
	public void printBoard() {
		int i;
		int j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(boardArray[i * n + j] + " ");
			System.out.println();
		}
	}
	
	public void testLocation(int location) {
		Random randGen = new Random();
		if (boardArray[location] == 3) {
			System.out.println("You already clicked this tile, please choose a new one");
		}
		else if (boardArray[location] == 0) {
			System.out.println("You landed on a dice, roll a 5 or 6 to continue playing");
			int randNum = randGen.nextInt(6) + 1;
			if(randNum == 0  || randNum == 1 || randNum == 2 || randNum == 3 || randNum == 4) {
				System.out.println("You rolled a " + randNum + ", game over!");
				gameOver = true;
			}
			else {
				System.out.println("You rolled a " + randNum + ". You can keep playing");
			}
			
		}
		
		else if (boardArray[location] == 1) {
			System.out.println("Award");
			gameOver = true;
		}
		
		else if (boardArray[location] == 2) {
			System.out.println("Mine");
			gameOver = true;
		}
		boardArray[location] = 3;
	}
	
	public boolean getGameOver() {
		return gameOver;
	}
	
	public static void main(String[] args) {
		Random randGen = new Random();
		BoardRandomizer board = new BoardRandomizer(3);
		board.printBoard();
		
		
		while (board.getGameOver() == false) {
			int randNum = randGen.nextInt(3 * 3);
			System.out.println(randNum);
			board.testLocation(randNum);
		}
	}
	
	
	}

