import java.awt.Color;
import java.io.File;
import java.util.Scanner;

public class Reflect implements PhotoEffect {
	// implements PhotoEffect meaning methods must be implemented in FlipHorizontal

	@Override
	public String getName() {
		String name = "Reflect";
		// sets the name of the effect to reflect
		return name;
	}

	@Override
	public Color[][] apply(Color[][] photo) {
		int height = photo.length;
		// takes the width of the image array
		int width = photo[0].length;
		// takes the height of the image array
		Color[][] newPhoto = new Color[width][height];
		// creates new Color array to store color
		for (int x = 0; x < height; x++) {
			// renders image from left to right
			for (int j = 0; j <= width / 2; j++) {
				// renders the image from top to bottom
				newPhoto[j][x] = photo[j][x];
				// sets the new Color array with old arrays values except the height's value
				// goes
				// from most to least
			}
		}
		if ((width % 2) != 0) {
			for (int x = height; x > 0; x--) {
				newPhoto[height][width / 2 + 1] = photo[height][width / 2 + 1];
			}
		}
		for (int j = 0; j < height; j++) {
			// renders image from left to right
			for (int x = width - 1; x > width/2; x--) {
				// renders the image from top to bottom
				newPhoto[j][x] = photo[j][x];
				// sets the new Color array with old arrays values except the height's value
				// goes
				// from most to least
			}

		}
		return newPhoto;
		// return new Color array
	}
}