import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Images extends JPanel {
	
	public int w = Main.width;
	public int h = Main.height;
	
	public boolean imagesLoaded = false;
	
	public Image stand;
	public Image walk1;
	public Image walk2;
	public Image walk3;
	public Image jump;
	public Image walk1Mirror;
	public Image walk2Mirror;
	public Image walk3Mirror;
	public Image jumpMirror;
	public Image gameOver;
	public Image start;
	public Image level1;
	public Image level2;
	
	public Images()
	{
		this.setBackground(Color.BLACK);
	}

	public void loadImages()
	{
		stand = new ImageIcon("/Users/kyle/Desktop/Mario/Stand.png").getImage();
		walk1 = new ImageIcon("/Users/kyle/Desktop/Mario/Walk1.png").getImage();
		walk2 = new ImageIcon("/Users/kyle/Desktop/Mario/Walk2.png").getImage();
		walk3 = new ImageIcon("/Users/kyle/Desktop/Mario/Walk3.png").getImage();
		jump = new ImageIcon("/Users/kyle/Desktop/Mario/Jump.png").getImage();
		walk1Mirror = new ImageIcon("/Users/kyle/Desktop/Mario/Walk1 Mirror.png").getImage();
		walk2Mirror = new ImageIcon("/Users/kyle/Desktop/Mario/Walk2 Mirror.png").getImage();
		walk3Mirror = new ImageIcon("/Users/kyle/Desktop/Mario/Walk3 Mirror.png").getImage();
		jumpMirror = new ImageIcon("/Users/kyle/Desktop/Mario/Jump Mirror.png").getImage();
		gameOver = new ImageIcon("/Users/kyle/Desktop/Mario/Game Over.png").getImage();
		start = new ImageIcon("/Users/kyle/Desktop/Mario/Start.png").getImage();
		level1 = new ImageIcon("/Users/kyle/Desktop/Mario/Level 1.png").getImage();
		level2 = new ImageIcon("/Users/kyle/Desktop/Mario/Level 2.png").getImage();
		imagesLoaded = true;
	}
}
