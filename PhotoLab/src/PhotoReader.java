import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PhotoReader extends PhotoFile {
	//extends the PhotoFile code so that the code can access the abstract classes code

	public PhotoReader(String fileName) {
		//constructor for the file name
		super(fileName);
	}

	public Color[][] load() throws FileNotFoundException {
		File fileInput = new File(this.getFileName());
		// creates new file using the file name
		Scanner input = new Scanner(fileInput);
		// implements a scanner on the file
		int width = input.nextInt();
		// takes the first integer which is the width
		int height = input.nextInt();
		// takes the first integer which is the height
		Color[][] image = new Color[width][height];
		// sets the width and height as the array's dimensions
		for (int x = 0; x < width; x++) {
			// makes the PhotoReader render the image from left to right
			for (int j = 0; j < height; j++) {
				// makes the PhotoReader render the image from top to bottom
				Color pixel = new Color(input.nextInt(), input.nextInt(), input.nextInt());
				//takes in the value of the colors from the file using the scanner
				image[x][j] = pixel;
				//the colors are stored in the array
			}
		}
		return image;
		//returns the array
	}

}
