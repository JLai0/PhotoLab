import java.awt.Color;
import java.io.File;
import java.util.Scanner;

public class FlipHorizontal implements PhotoEffect {
	// implements PhotoEffect meaning methods must be implemented in FlipHorizontal

	@Override
	public String getName() {
		String name = "Horizontal";
		// sets the name of the effect to horizontal
		return name;
	}

	@Override
	public Color[][] apply(Color[][] photo) {
		int width = photo.length;
		// takes the width of the image array
		int height = photo[0].length;
		// takes the height of the image array
		Color[][] newPhoto = new Color[width][height];
		// creates new Color array to store color
		for (int x = 0; x < width; x++) {
			// renders image from left to right
			for (int j = 0; j < height; j++) {
				// renders the image from top to bottom
				newPhoto[x][j] = photo[x][(height - 1) - j]; 
				// sets the new Color array with old arrays values except the height's value goes
				// from most to least
			}
		}
		return newPhoto;
		//return new Color array
	}

}
