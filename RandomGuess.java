package Week2;
import javax.swing.JOptionPane;



public class RandomGuess {

	public static void main(String[] args) {
		
		
		String guessString; 
		int random; 
		int guess; 
		final int MIN = 1;
		final int MAX = 5;
		
		random = MIN + (int)(Math.random() * MAX);
		guessString = JOptionPane.showInputDialog(null, 
				"Guess my number between " + MIN + " and " + MAX,
				"Random guess" , JOptionPane.INFORMATION_MESSAGE);
		
		guess = Integer.parseInt(guessString);
		
		if(guess == random)
			JOptionPane.showMessageDialog(null, "The number was " + random + " The Result is True. ", "Winning Number", JOptionPane.INFORMATION_MESSAGE);
		if(guess != random)
			JOptionPane.showMessageDialog(null, "Your number was " + Math.abs(random - guess) + " Numbers away from the random number.", "Player Guess", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
