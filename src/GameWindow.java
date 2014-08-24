/////////////////////////////////////////////////////////////////
//                   Pokemon: Indigo League                    //
//                      A Pokemon Fangame                      //
//-------------------------------------------------------------//
//       Based on Game Freak's Pokemon Generation I Games      //
//     An Adaptation of OLM's Pokemon: Indigo League Anime     //
//-------------------------------------------------------------//
// Elements Copyright:                                         //
// (c) 1995-2014 Nintendo                                      //
// (c) 1995-2014 Creatures                                     //
// (c) 1995-2014 GAME FREAK inc.                               //
// (c) 1997-2014 OLM, Inc.                                     //
// (c) 1998-2006 4Licensing Corporation                        //
//-------------------------------------------------------------//
// Version: v0.2.0.0                                           //
// Updated: 24/08/2014                                         //
// Authors: Andy Davies                                        //
// Website: http://www.github.com/andeed/pokemon-indigo-league //
/////////////////////////////////////////////////////////////////

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private final String WINDOW_TITLE = "";
	private final int    FRAME_WIDTH  = 160;
	private final int    FRAME_HEIGHT = 144;
	private final String ICON_FILE    = "./src/pokeball.png"; 
	
	private final JLabel frame;
	
	public static void main(String[] args) {
		new GameWindow();
	}
	
	public GameWindow() {
		// Set window properties
		setTitle(WINDOW_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(new ImageIcon(ICON_FILE).getImage());
		
		// Create visible game frame
		frame = new JLabel();
		frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		frame.setBackground(Color.WHITE);
		frame.setOpaque(true);
		
		// Load an image and display it
		try {
			File file = new File("./src/placeholder.png");
			displayImageFromFile(file);
		} catch (IOException e) {
			System.err.println("File not found.");
		}
		
		// Add the frame to the window
		add(frame);
		
		// Display the window
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void displayImageFromFile(File file) throws IOException {
		BufferedImage image = ImageIO.read(file);
		frame.setIcon(new ImageIcon(image));
	}
	
}
