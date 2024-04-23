import javax.swing.*;
import java.io.Serial;

public class GameFrame extends JFrame {
	@Serial
	private static final long serialVersionUID = 1L;

	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Sam's Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new GameFrame();
	}
}
