import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhotoLabRunner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		//takes in user input so that the user can choose 1 or 3 pictures
		int userChoice = userInput.nextInt();
		FlipHorizontal horizontal = new FlipHorizontal();
		//creates the new flip horizontal object
		FlipVertical vertical = new FlipVertical();
		//creates the new flip vertical object
		Reflect reflectimg = new Reflect();
		PhotoEffect[] effects = { horizontal, vertical, reflectimg };
		// creates effects array
		if (userChoice == 1) {
			PhotoFile helmet = new PhotoReader("ECHelmet.txt");
			//creates PhotoFile object that will be load "ECHelmet.txt"
			helmet.load();
			//loads file
			PhotoFile[] image = { helmet };
			//helmet is set in the PhotoFile array
			PhotoLab.start(image, effects);
			//starts photo lab with image loaded and effects implemented
		}
		if (userChoice == 2) {
			PhotoFile morning = new PhotoReader("ECMorning.txt");
			//creates PhotoFile object that will be load "ECMorning.txt"
			morning.load();
			//loads file
			PhotoFile[] image = { morning };
			//morning is set in the PhotoFile array
			PhotoLab.start(image, effects);
			//starts photo lab with image loaded and effects implemented
		}
		if (userChoice == 3) {
			PhotoFile shield = new PhotoReader("ECShield.txt");
			//creates PhotoFile object that will be load "ECShield.txt"
			shield.load();
			//loads file
			PhotoFile[] image = { shield };
			//shield is set in the PhotoFile array
			PhotoLab.start(image, effects);
			//starts photo lab with image loaded and effects implemented
		}
	}

}
