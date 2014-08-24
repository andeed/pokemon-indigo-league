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
// Version: v0.1.0.1                                           //
// Updated: 24/08/2014                                         //
// Authors: Andy Davies                                        //
// Website: http://www.github.com/andeed/pokemon-indigo-league //
/////////////////////////////////////////////////////////////////

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private final String WINDOW_TITLE = "";
	private final int    FRAME_WIDTH  = 160;
	private final int    FRAME_HEIGHT = 144;
	
	public static void main(String[] args) {
		new GameWindow();
	}
	
	public GameWindow() {
		// Set window properties
		setTitle(WINDOW_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create visible game frame
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		panel.setBackground(Color.WHITE);
		
		// Add the frame to the window
		add(panel);
		
		// Display the window
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
