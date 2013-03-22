package gui;

import java.awt.Dimension;
import javax.swing.JFrame;

import map.Grid;


@SuppressWarnings("serial")
public class GuiMain extends JFrame {

	public static MapDisplay mapDisplay; // JPanel

	public GuiMain(Grid myGrid) {
		super("Life Simulation");

		initialiseMap(myGrid);
		new ArrangeGui(this);
		initialiseFrame();
	}

	private void initialiseMap(Grid myGrid) {

		mapDisplay = new MapDisplay();
		mapDisplay.setPreferredSize(new Dimension(myGrid.getWidth() * 5, myGrid
				.getHeight() * 5));
		mapDisplay.updateMap(myGrid);

	}

	private void initialiseFrame() {

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		pack();

	}

	public static void main(String[] args) {
		new GuiMain(new Grid(200, 200));
	}

}
