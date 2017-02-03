import javax.swing.JFrame;


public class Main {

	public static Display f = new Display();
	public static int width = 1500;
	public static int height = 1000;
	
	public static void main(String[] args){
		f.setSize(width, height);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Java Game");
		f.setLocationRelativeTo(null);
	}

}
