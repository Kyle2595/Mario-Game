import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Keying extends JPanel {

	public Rectangle character;
	public Rectangle bottomBox;
	public Rectangle startBoxS1;
	public Rectangle startBoxS2;
	public Rectangle startBoxS3;
	public Rectangle startBoxS4;
	public Rectangle startBoxS5;
	public Rectangle startBoxU1;
	public Rectangle startBoxU2;
	public Rectangle startBoxU3;
	public Rectangle startBoxP1;
	public Rectangle startBoxP2;
	public Rectangle startBoxP3;
	public Rectangle startBoxP4;
	public Rectangle startBoxE1;
	public Rectangle startBoxE2;
	public Rectangle startBoxE3;
	public Rectangle startBoxE4;
	public Rectangle startBoxR1;
	public Rectangle startBoxR2;
	public Rectangle startBoxR3;
	public Rectangle startBoxR4;
	public Rectangle startBoxR5;
	public Rectangle startBoxJ1;
	public Rectangle startBoxJ2;
	public Rectangle startBoxJ3;
	public Rectangle startBoxJ4;
	public Rectangle startBoxA1;
	public Rectangle startBoxA2;
	public Rectangle startBoxA3;
	public Rectangle startBoxA4;
	public Rectangle startBoxV1;
	public Rectangle startBoxV2;
	public Rectangle startBoxV3;
	public Rectangle startBoxV4;
	public Rectangle startBoxA1_2;
	public Rectangle startBoxA2_2;
	public Rectangle startBoxA3_2;
	public Rectangle startBoxA4_2;
	public Rectangle startBoxM1;
	public Rectangle startBoxM2;
	public Rectangle startBoxM3;
	public Rectangle startBoxM4;
	public Rectangle startBoxM5;
	public Rectangle startBoxA1_3;
	public Rectangle startBoxA2_3;
	public Rectangle startBoxA3_3;
	public Rectangle startBoxA4_3;
	public Rectangle startBoxN1;
	public Rectangle startBoxN2;
	public Rectangle startBoxN3;
	public Rectangle startBoxStart;
	public Rectangle startBoxSS1;
	public Rectangle startBoxSS2;
	public Rectangle startBoxSS3;
	public Rectangle startBoxSS4;
	public Rectangle startBoxSS5;
	public Rectangle startBoxUS1;
	public Rectangle startBoxUS2;
	public Rectangle startBoxUS3;
	public Rectangle startBoxPS1;
	public Rectangle startBoxPS2;
	public Rectangle startBoxPS3;
	public Rectangle startBoxPS4;
	public Rectangle startBoxES1;
	public Rectangle startBoxES2;
	public Rectangle startBoxES3;
	public Rectangle startBoxES4;
	public Rectangle startBoxRS1;
	public Rectangle startBoxRS2;
	public Rectangle startBoxRS3;
	public Rectangle startBoxRS4;
	public Rectangle startBoxRS5;
	public Rectangle startBoxJS1;
	public Rectangle startBoxJS2;
	public Rectangle startBoxJS3;
	public Rectangle startBoxJS4;
	public Rectangle startBoxAS1;
	public Rectangle startBoxAS2;
	public Rectangle startBoxAS3;
	public Rectangle startBoxAS4;
	public Rectangle startBoxVS1;
	public Rectangle startBoxVS2;
	public Rectangle startBoxVS3;
	public Rectangle startBoxVS4;
	public Rectangle startBoxAS1_2;
	public Rectangle startBoxAS2_2;
	public Rectangle startBoxAS3_2;
	public Rectangle startBoxAS4_2;
	public Rectangle startBoxMS1;
	public Rectangle startBoxMS2;
	public Rectangle startBoxMS3;
	public Rectangle startBoxMS4;
	public Rectangle startBoxMS5;
	public Rectangle startBoxAS1_3;
	public Rectangle startBoxAS2_3;
	public Rectangle startBoxAS3_3;
	public Rectangle startBoxAS4_3;
	public Rectangle startBoxNS1;
	public Rectangle startBoxNS2;
	public Rectangle startBoxNS3;
	public Rectangle box1;
	public Rectangle box2;
	public Rectangle box3;
	public Rectangle box4;
	public Rectangle box5;
	public Rectangle box6;
	public Rectangle box7;
	public Rectangle box8;
	public Rectangle box9;
	public Rectangle box10;
	public Rectangle box11;
	public Rectangle box12;
	public Rectangle box13;
	public Rectangle castleBox1;
	public Rectangle castleBox2;
	public Rectangle castleBox3;
	public Rectangle castleBox4;
	public Rectangle castleBox5;
	public Rectangle flagBox1;
	public Polygon flagBox2;
	public Rectangle endBox1;
	public Rectangle boxS1;
	public Rectangle boxS2;
	public Rectangle boxS3;
	public Rectangle boxS4;
	public Rectangle boxS5;
	public Rectangle boxS6;
	public Rectangle boxS7;
	public Rectangle boxS8;
	public Rectangle boxS9;
	public Rectangle boxS10;
	public Rectangle boxS11;
	public Rectangle boxS12;
	public Rectangle boxS13;
	public Rectangle castleBoxS1;
	public Rectangle castleBoxS2;
	public Rectangle castleBoxS3;
	public Rectangle castleBoxS4;
	public Rectangle castleBoxS5;
	public Rectangle box14;
	public Rectangle box15;
	public Rectangle box16;
	public Rectangle box17;
	public Rectangle box18;
	public Rectangle box19;
	public Rectangle box20;
	public Rectangle box21;
	public Rectangle box22;
	public Rectangle box23;
	public Rectangle box24;
	public Rectangle box25;
	public Rectangle box26;
	public Rectangle box27;
	public Rectangle box28;
	public Rectangle castleBox6;
	public Rectangle castleBox7;
	public Rectangle castleBox8;
	public Rectangle castleBox9;
	public Rectangle castleBox10;
	public Rectangle boxS14;
	public Rectangle boxS15;
	public Rectangle boxS16;
	public Rectangle boxS17;
	public Rectangle boxS18;
	public Rectangle boxS19;
	public Rectangle boxS20;
	public Rectangle boxS21;
	public Rectangle boxS22;
	public Rectangle boxS23;
	public Rectangle boxS24;
	public Rectangle boxS25;
	public Rectangle boxS26;
	public Rectangle boxS27;
	public Rectangle boxS28;
	public Rectangle castleBoxS6;
	public Rectangle castleBoxS7;
	public Rectangle castleBoxS8;
	public Rectangle castleBoxS9;
	public Rectangle castleBoxS10;
	public Rectangle flagBox3;
	public Polygon flagBox4;
	public Rectangle endBox2;

	public int charW = 80;
	public int charH = 110;

	public long jumpingTime = 400;
	public long flagTime = 300;

	public boolean right = false;
	public boolean left = false;
	public boolean mouseActive = false;
	public boolean jumping = false;
	public boolean reset = false;
	public boolean flagRaised = false;
	public boolean keyboard = true;
	public boolean seizureMode = false;

	public boolean level1 = false;
	public boolean level2 = false;
	public boolean level3 = false;
	public boolean gameOver = false;

	public int[] trinagleArrayX1 = {3335, 3335, 3400};
	public int[] trinagleArrayY1 = {800, 850, 825};
	public int[] trinagleArrayX2 = {4235, 4235, 4300};

	public Point mouse;
	public Point setPoint = new Point(0,0);


	public Keying(Display f, Images i)
	{
		character = new Rectangle(180, 800, charW, charH);	
		bottomBox = new Rectangle(0, 950, 1500, 30);

		// Level 1 box definitions
		box1 = new Rectangle(0, 950, 500, 30);
		box2 = new Rectangle(600, 950, 1300, 30);
		box3 = new Rectangle(400, 900, 100, 50);
		box4 = new Rectangle(800, 900, 130, 50);
		box5 = new Rectangle(930, 850, 100, 150);
		box6 = new Rectangle(1800, 870, 100, 130);
		box7 = new Rectangle(1500, 700, 100, 100);
		box8 = new Rectangle(1600, 750, 100, 50);
		box9 = new Rectangle(1850, 650, 150, 50);
		box10 = new Rectangle(2150, 350, 125, 50);
		box11 = new Rectangle(2050, 540, 100, 50);
		box12 = new Rectangle(1750, 420, 200, 50);
		box13 = new Rectangle(2500, 950, 1000, 30);
		castleBox1 = new Rectangle(3150, 750, 350, 200);
		castleBox2 = new Rectangle(3150, 700, 50, 50);
		castleBox3 = new Rectangle(3250, 700, 50, 50);
		castleBox4 = new Rectangle(3350, 700, 50, 50);
		castleBox5 = new Rectangle(3450, 700, 50, 50);
		flagBox1 = new Rectangle(3315, 500, 20, 300);
		flagBox2 = new Polygon(trinagleArrayX1, trinagleArrayY1, 3);
		endBox1 = new Rectangle(3275, 800, 100, 150);

		// Level 1 shadow box definitions
		boxS1 = new Rectangle(box1.x, box1.y, box1.width, box1.height);
		boxS2 = new Rectangle(box2.x, box2.y, box2.width, box2.height);
		boxS3 = new Rectangle(box3.x, box3.y, box3.width, box3.height);
		boxS4 = new Rectangle(box4.x, box4.y, box4.width, box4.height);
		boxS5 = new Rectangle(box5.x, box5.y, box5.width, box5.height);
		boxS6 = new Rectangle(box6.x, box6.y, box6.width, box6.height);
		boxS7 = new Rectangle(box7.x, box7.y, box7.width, box7.height);
		boxS8 = new Rectangle(box8.x, box8.y, box8.width, box8.height);
		boxS9 = new Rectangle(box9.x, box9.y, box9.width, box9.height);
		boxS10 = new Rectangle(box10.x, box10.y, box10.width, box10.height);
		boxS11 = new Rectangle(box11.x, box11.y, box11.width, box11.height);
		boxS12 = new Rectangle(box12.x, box12.y, box12.width, box12.height);
		boxS13 = new Rectangle(box13.x, box13.y, box13.width, box13.height);
		castleBoxS1 = new Rectangle(castleBox1.x, castleBox1.y, castleBox1.width, castleBox1.height);
		castleBoxS2 = new Rectangle(castleBox2.x, castleBox2.y, castleBox2.width, castleBox2.height);
		castleBoxS3 = new Rectangle(castleBox3.x, castleBox3.y, castleBox3.width, castleBox3.height);
		castleBoxS4 = new Rectangle(castleBox4.x, castleBox4.y, castleBox4.width, castleBox4.height);
		castleBoxS5 = new Rectangle(castleBox5.x, castleBox5.y, castleBox5.width, castleBox5.height);

		// Level 2 definitions
		box14 = new Rectangle(0, 950, 300, 30);
		box15 = new Rectangle(500, 950, 700, 30);
		box16 = new Rectangle(1000, 850, 200, 100);
		box17 = new Rectangle(1050, 750, 150, 100);
		box18 = new Rectangle(1100, 650, 100, 100);
		box19 = new Rectangle(1500, 850, 200, 100);
		box20 = new Rectangle(1500, 750, 150, 100);
		box21 = new Rectangle(1500, 650, 100, 100);
		box22 = new Rectangle(1500, 950, 700, 30);
		box23 = new Rectangle(2200, 850, 100, 150);
		box24 = new Rectangle(2500, 850, 100, 150);
		box25 = new Rectangle(2800, 850, 100, 150);
		box26 = new Rectangle(3100, 850, 100, 150);
		box27 = new Rectangle(3400, 850, 100, 150);
		box28 = new Rectangle(3700, 950, 700, 30);
		castleBox6 = new Rectangle(4050, 750, 350, 200);
		castleBox7 = new Rectangle(4050, 700, 50, 50);
		castleBox8 = new Rectangle(4150, 700, 50, 50);
		castleBox9 = new Rectangle(4250, 700, 50, 50);
		castleBox10 = new Rectangle(4350, 700, 50, 50);
		flagBox3 = new Rectangle(4215, 500, 20, 300);
		flagBox4 = new Polygon(trinagleArrayX2, trinagleArrayY1, 3);
		endBox2 = new Rectangle(4175, 800, 100, 150);
		
		// Level 2 shadow box definitions
		boxS14 = new Rectangle(box14.x, box14.y, box14.width, box14.height);
		boxS15 = new Rectangle(box15.x, box15.y, box15.width, box15.height);
		boxS16 = new Rectangle(box16.x, box16.y, box16.width, box16.height);
		boxS17 = new Rectangle(box17.x, box17.y, box17.width, box17.height);
		boxS18 = new Rectangle(box18.x, box18.y, box18.width, box18.height);
		boxS19 = new Rectangle(box19.x, box19.y, box19.width, box19.height);
		boxS20 = new Rectangle(box20.x, box20.y, box20.width, box20.height);
		boxS21 = new Rectangle(box21.x, box21.y, box21.width, box21.height);
		boxS22 = new Rectangle(box22.x, box22.y, box22.width, box22.height);
		boxS23 = new Rectangle(box23.x, box23.y, box23.width, box23.height);
		boxS24 = new Rectangle(box24.x, box24.y, box24.width, box24.height);
		boxS25 = new Rectangle(box25.x, box25.y, box25.width, box25.height);
		boxS26 = new Rectangle(box26.x, box26.y, box26.width, box26.height);
		boxS27 = new Rectangle(box27.x, box27.y, box27.width, box27.height);
		boxS28 = new Rectangle(box28.x, box28.y, box28.width, box28.height);
		castleBoxS6 = new Rectangle(castleBox6.x, castleBox6.y, castleBox6.width, castleBox6.height);
		castleBoxS7 = new Rectangle(castleBox7.x, castleBox7.y, castleBox7.width, castleBox7.height);
		castleBoxS8 = new Rectangle(castleBox8.x, castleBox8.y, castleBox8.width, castleBox8.height);
		castleBoxS9 = new Rectangle(castleBox9.x, castleBox9.y, castleBox9.width, castleBox9.height);
		castleBoxS10 = new Rectangle(castleBox10.x, castleBox10.y, castleBox10.width, castleBox10.height);

		// Start hit box
		startBoxStart = new Rectangle(530, 650, 450, 100);
		
		// S
		startBoxS1 = new Rectangle(450, 200, 25, 25);
		startBoxS2 = new Rectangle(startBoxS1.x + 25, startBoxS1.y - 25, 75, 25);
		startBoxS3 = new Rectangle(startBoxS1.x + 25, startBoxS1.y + 25, 50, 25);
		startBoxS4 = new Rectangle(startBoxS1.x + 75, startBoxS1.y + 50, 25, 25);
		startBoxS5 = new Rectangle(startBoxS1.x, startBoxS1.y + 75, 75, 25);
		// U
		startBoxU1 = new Rectangle(startBoxS1.x + 125, startBoxS1.y - 25, 25, 100);
		startBoxU2 = new Rectangle(startBoxU1.x + 25, startBoxS1.y + 75, 50, 25);
		startBoxU3 = new Rectangle(startBoxU1.x + 75, startBoxS1.y - 25, 25, 100);
		// P
		startBoxP1 = new Rectangle(startBoxU1.x + 125, startBoxS1.y - 25, 25, 125);
		startBoxP2 = new Rectangle(startBoxP1.x + 25, startBoxS1.y - 25, 50, 25);
		startBoxP3 = new Rectangle(startBoxP1.x + 75, startBoxS1.y, 25, 25);
		startBoxP4 = new Rectangle(startBoxP1.x + 25, startBoxS1.y + 25, 50, 25);
		// E
		startBoxE1 = new Rectangle(startBoxP1.x + 125, startBoxS1.y, 25, 75);
		startBoxE2 = new Rectangle(startBoxE1.x + 25, startBoxS1.y - 25, 75, 25);
		startBoxE3 = new Rectangle(startBoxE1.x + 25, startBoxS1.y + 25, 50, 25);
		startBoxE4 = new Rectangle(startBoxE1.x + 25, startBoxS1.y + 75, 75, 25);
		// R
		startBoxR1 = new Rectangle(startBoxE1.x + 125, startBoxS1.y - 25, 25, 125);
		startBoxR2 = new Rectangle(startBoxR1.x + 25, startBoxS1.y - 25, 50, 25);
		startBoxR3 = new Rectangle(startBoxR1.x + 75, startBoxS1.y, 25, 25);
		startBoxR4 = new Rectangle(startBoxR1.x + 25, startBoxS1.y + 25, 50, 25);
		startBoxR5 = new Rectangle(startBoxR1.x + 75, startBoxS1.y + 50, 25, 50);
		// J
		startBoxJ1 = new Rectangle(250, 400, 100, 25);
		startBoxJ2 = new Rectangle(startBoxJ1.x + 50, startBoxJ1.y + 25, 25, 75);
		startBoxJ3 = new Rectangle(startBoxJ1.x + 25, startBoxJ1.y + 100, 25, 25);
		startBoxJ4 = new Rectangle(startBoxJ1.x, startBoxJ1.y + 75, 25, 25);
		// A
		startBoxA1 = new Rectangle(startBoxJ1.x + 125, startBoxJ1.y + 25, 25, 100);
		startBoxA2 = new Rectangle(startBoxA1.x + 25, startBoxJ1.y, 50, 25);
		startBoxA3 = new Rectangle(startBoxA1.x + 75, startBoxJ1.y + 25, 25, 100);
		startBoxA4 = new Rectangle(startBoxA1.x + 25, startBoxJ1.y + 50, 50, 25);
		// V
		startBoxV1 = new Rectangle(startBoxA1.x + 125, startBoxJ1.y, 25, 100);
		startBoxV2 = new Rectangle(startBoxV1.x + 25, startBoxJ1.y + 100, 25, 25);
		startBoxV3 = new Rectangle(startBoxV1.x + 50, startBoxJ1.y + 75, 25, 25);
		startBoxV4 = new Rectangle(startBoxV1.x + 75, startBoxJ1.y, 25, 75);
		// A
		startBoxA1_2 = new Rectangle(startBoxV1.x + 125, startBoxJ1.y + 25, 25, 100);
		startBoxA2_2 = new Rectangle(startBoxA1_2.x + 25, startBoxJ1.y, 50, 25);
		startBoxA3_2 = new Rectangle(startBoxA1_2.x + 75, startBoxJ1.y + 25, 25, 100);
		startBoxA4_2 = new Rectangle(startBoxA1_2.x + 25, startBoxJ1.y + 50, 50, 25);
		// M
		startBoxM1 = new Rectangle(startBoxA4_2.x + 200, startBoxJ1.y + 25, 25, 100);
		startBoxM2 = new Rectangle(startBoxM1.x + 25, startBoxJ1.y, 25, 25);
		startBoxM3 = new Rectangle(startBoxM1.x + 50, startBoxJ1.y + 25, 25, 75);
		startBoxM4 = new Rectangle(startBoxM1.x + 75, startBoxJ1.y, 25, 25);
		startBoxM5 = new Rectangle(startBoxM1.x + 100, startBoxJ1.y + 25, 25, 100);
		// A
		startBoxA1_3 = new Rectangle(startBoxM1.x + 150, startBoxJ1.y + 25, 25, 100);
		startBoxA2_3 = new Rectangle(startBoxA1_3.x + 25, startBoxJ1.y, 50, 25);
		startBoxA3_3 = new Rectangle(startBoxA1_3.x + 75, startBoxJ1.y + 25, 25, 100);
		startBoxA4_3 = new Rectangle(startBoxA1_3.x + 25, startBoxJ1.y + 50, 50, 25);
		// N
		startBoxN1 = new Rectangle(startBoxA1_3.x + 125, startBoxJ1.y + 25, 25, 100);
		startBoxN2 = new Rectangle(startBoxN1.x + 25, startBoxJ1.y, 50, 25);
		startBoxN3 = new Rectangle(startBoxN1.x + 75, startBoxJ1.y + 25, 25, 100);

		// S Shadow
		startBoxSS1 = new Rectangle(startBoxS1.x, startBoxS1.y, startBoxS1.width, startBoxS1.height);
		startBoxSS2 = new Rectangle(startBoxS2.x, startBoxS2.y, startBoxS2.width, startBoxS2.height);
		startBoxSS3 = new Rectangle(startBoxS3.x, startBoxS3.y, startBoxS3.width, startBoxS3.height);
		startBoxSS4 = new Rectangle(startBoxS4.x, startBoxS4.y, startBoxS4.width, startBoxS4.height);
		startBoxSS5 = new Rectangle(startBoxS5.x, startBoxS5.y, startBoxS5.width, startBoxS5.height);
		// U Shadow
		startBoxUS1 = new Rectangle(startBoxU1.x, startBoxU1.y, startBoxU1.width, startBoxU1.height);
		startBoxUS2 = new Rectangle(startBoxU2.x, startBoxU2.y, startBoxU2.width, startBoxU2.height);
		startBoxUS3 = new Rectangle(startBoxU3.x, startBoxU3.y, startBoxU3.width, startBoxU3.height);
		// P Shadow
		startBoxPS1 = new Rectangle(startBoxP1.x, startBoxP1.y, startBoxP1.width, startBoxP1.height);
		startBoxPS2 = new Rectangle(startBoxP2.x, startBoxP2.y, startBoxP2.width, startBoxP2.height);
		startBoxPS3 = new Rectangle(startBoxP3.x, startBoxP3.y, startBoxP3.width, startBoxP3.height);
		startBoxPS4 = new Rectangle(startBoxP4.x, startBoxP4.y, startBoxP4.width, startBoxP4.height);
		// E Shadow 
		startBoxES1 = new Rectangle(startBoxE1.x, startBoxE1.y, startBoxE1.width, startBoxE1.height);
		startBoxES2 = new Rectangle(startBoxE2.x, startBoxE2.y, startBoxE2.width, startBoxE2.height);
		startBoxES3 = new Rectangle(startBoxE3.x, startBoxE3.y, startBoxE3.width, startBoxE3.height);
		startBoxES4 = new Rectangle(startBoxE4.x, startBoxE4.y, startBoxE4.width, startBoxE4.height);
		// R Shadow
		startBoxRS1 = new Rectangle(startBoxR1.x, startBoxR1.y, startBoxR1.width, startBoxR1.height);
		startBoxRS2 = new Rectangle(startBoxR2.x, startBoxR2.y, startBoxR2.width, startBoxR2.height);
		startBoxRS3 = new Rectangle(startBoxR3.x, startBoxR3.y, startBoxR3.width, startBoxR3.height);
		startBoxRS4 = new Rectangle(startBoxR4.x, startBoxR4.y, startBoxR4.width, startBoxR4.height);
		startBoxRS5 = new Rectangle(startBoxR5.x, startBoxR5.y, startBoxR5.width, startBoxR5.height);
		// J Shadow
		startBoxJS1 = new Rectangle(startBoxJ1.x, startBoxJ1.y, startBoxJ1.width, startBoxJ1.height);
		startBoxJS2 = new Rectangle(startBoxJ2.x, startBoxJ2.y, startBoxJ2.width, startBoxJ2.height);
		startBoxJS3 = new Rectangle(startBoxJ3.x, startBoxJ3.y, startBoxJ3.width, startBoxJ3.height);
		startBoxJS4 = new Rectangle(startBoxJ4.x, startBoxJ4.y, startBoxJ4.width, startBoxJ4.height);
		// A Shadow
		startBoxAS1 = new Rectangle(startBoxA1.x, startBoxA1.y, startBoxA1.width, startBoxA1.height);
		startBoxAS2 = new Rectangle(startBoxA2.x, startBoxA2.y, startBoxA2.width, startBoxA2.height);
		startBoxAS3 = new Rectangle(startBoxA3.x, startBoxA3.y, startBoxA3.width, startBoxA3.height);
		startBoxAS4 = new Rectangle(startBoxA4.x, startBoxA4.y, startBoxA4.width, startBoxA4.height);
		// V Shadow
		startBoxVS1 = new Rectangle(startBoxV1.x, startBoxV1.y, startBoxV1.width, startBoxV1.height);
		startBoxVS2 = new Rectangle(startBoxV2.x, startBoxV2.y, startBoxV2.width, startBoxV2.height);
		startBoxVS3 = new Rectangle(startBoxV3.x, startBoxV3.y, startBoxV3.width, startBoxV3.height);
		startBoxVS4 = new Rectangle(startBoxV4.x, startBoxV4.y, startBoxV4.width, startBoxV4.height);
		// A Shadow
		startBoxAS1_2 = new Rectangle(startBoxA1_2.x, startBoxA1_2.y, startBoxA1_2.width, startBoxA1_2.height);
		startBoxAS2_2 = new Rectangle(startBoxA2_2.x, startBoxA2_2.y, startBoxA2_2.width, startBoxA2_2.height);
		startBoxAS3_2 = new Rectangle(startBoxA3_2.x, startBoxA3_2.y, startBoxA3_2.width, startBoxA3_2.height);
		startBoxAS4_2 = new Rectangle(startBoxA4_2.x, startBoxA4_2.y, startBoxA4_2.width, startBoxA4_2.height);
		// M Shadow
		startBoxMS1 = new Rectangle(startBoxM1.x, startBoxM1.y, startBoxM1.width, startBoxM1.height);
		startBoxMS2 = new Rectangle(startBoxM2.x, startBoxM2.y, startBoxM2.width, startBoxM2.height);
		startBoxMS3 = new Rectangle(startBoxM3.x, startBoxM3.y, startBoxM3.width, startBoxM3.height);
		startBoxMS4 = new Rectangle(startBoxM4.x, startBoxM4.y, startBoxM4.width, startBoxM4.height);
		startBoxMS5 = new Rectangle(startBoxM5.x, startBoxM5.y, startBoxM5.width, startBoxM5.height);
		// A Shadow
		startBoxAS1_3 = new Rectangle(startBoxA1_3.x, startBoxA1_3.y, startBoxA1_3.width, startBoxA1_3.height);
		startBoxAS2_3 = new Rectangle(startBoxA2_3.x, startBoxA2_3.y, startBoxA2_3.width, startBoxA2_3.height);
		startBoxAS3_3 = new Rectangle(startBoxA3_3.x, startBoxA3_3.y, startBoxA3_3.width, startBoxA3_3.height);
		startBoxAS4_3 = new Rectangle(startBoxA4_3.x, startBoxA4_3.y, startBoxA4_3.width, startBoxA4_3.height);
		// N Shadow
		startBoxNS1 = new Rectangle(startBoxN1.x, startBoxN1.y, startBoxN1.width, startBoxN1.height);
		startBoxNS2 = new Rectangle(startBoxN2.x, startBoxN2.y, startBoxN2.width, startBoxN2.height);
		startBoxNS3 = new Rectangle(startBoxN3.x, startBoxN3.y, startBoxN3.width, startBoxN3.height);

		f.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
				if(keyboard == true)
				{
					if(e.getKeyCode() == KeyEvent.VK_D)
					{
						right = true;
						mouseActive = false;
					}

					if(e.getKeyCode() == KeyEvent.VK_A)
					{
						left = true;
						mouseActive = false;
					}

					if(e.getKeyCode() == KeyEvent.VK_SPACE)
					{
						jumping = true;
						new Thread(new jumpThread()).start();
					}
				}

				if(e.getKeyCode() == KeyEvent.VK_M)
				{
					mouseActive = true;
				}

				if(e.getKeyCode() == KeyEvent.VK_R)
				{
					reset = true;
					keyboard = true;
				}
				
				if(e.getKeyCode() == KeyEvent.VK_C)
				{
					seizureMode = !seizureMode;
				}
				
				if(e.getKeyCode() == KeyEvent.VK_0)
				{
					level1 = false;
					level2 = false;
					level3 = false;
					reset = true;
					gameOver = false;
					keyboard = true;
				}

				if(e.getKeyCode() == KeyEvent.VK_1)
				{
					level1 = true;
					level2 = false;
					level3 = false;
					reset = true;
					gameOver = false;
					keyboard = true;
				}

				if(e.getKeyCode() == KeyEvent.VK_2)
				{
					level1 = false;
					level2 = true;
					level3 = false;
					reset = true;
					gameOver = false;
					keyboard = true;
				}
			}

			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_D)
				{
					right = false;
				}

				if(e.getKeyCode() == KeyEvent.VK_A)
				{
					left = false;
				}
			}
		});

		f.addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent e)
			{
				mouse = new Point(e.getX(), e.getY() - 25);
				if(mouseActive == true && character.x != Main.width - charW)
				{
					if(mouse.x > 750)
					{
						startBoxSS1.x = startBoxS1.x + ((mouse.x - 750) / 50);
						startBoxSS2.x = startBoxS2.x + ((mouse.x - 750) / 50);
						startBoxSS3.x = startBoxS3.x + ((mouse.x - 750) / 50);
						startBoxSS4.x = startBoxS4.x + ((mouse.x - 750) / 50);
						startBoxSS5.x = startBoxS5.x + ((mouse.x - 750) / 50);

						startBoxUS1.x = startBoxU1.x + ((mouse.x - 750) / 50);
						startBoxUS2.x = startBoxU2.x + ((mouse.x - 750) / 50);
						startBoxUS3.x = startBoxU3.x + ((mouse.x - 750) / 50);

						startBoxPS1.x = startBoxP1.x + ((mouse.x - 750) / 50);
						startBoxPS2.x = startBoxP2.x + ((mouse.x - 750) / 50);
						startBoxPS3.x = startBoxP3.x + ((mouse.x - 750) / 50);
						startBoxPS4.x = startBoxP4.x + ((mouse.x - 750) / 50);

						startBoxES1.x = startBoxE1.x + ((mouse.x - 750) / 50);
						startBoxES2.x = startBoxE2.x + ((mouse.x - 750) / 50);
						startBoxES3.x = startBoxE3.x + ((mouse.x - 750) / 50);
						startBoxES4.x = startBoxE4.x + ((mouse.x - 750) / 50);

						startBoxRS1.x = startBoxR1.x + ((mouse.x - 750) / 50);
						startBoxRS2.x = startBoxR2.x + ((mouse.x - 750) / 50);
						startBoxRS3.x = startBoxR3.x + ((mouse.x - 750) / 50);
						startBoxRS4.x = startBoxR4.x + ((mouse.x - 750) / 50);
						startBoxRS5.x = startBoxR5.x + ((mouse.x - 750) / 50);

						startBoxJS1.x = startBoxJ1.x + ((mouse.x - 750) / 50);
						startBoxJS2.x = startBoxJ2.x + ((mouse.x - 750) / 50);
						startBoxJS3.x = startBoxJ3.x + ((mouse.x - 750) / 50);
						startBoxJS4.x = startBoxJ4.x + ((mouse.x - 750) / 50);

						startBoxAS1.x = startBoxA1.x + ((mouse.x - 750) / 50);
						startBoxAS2.x = startBoxA2.x + ((mouse.x - 750) / 50);
						startBoxAS3.x = startBoxA3.x + ((mouse.x - 750) / 50);
						startBoxAS4.x = startBoxA4.x + ((mouse.x - 750) / 50);

						startBoxVS1.x = startBoxV1.x + ((mouse.x - 750) / 50);
						startBoxVS2.x = startBoxV2.x + ((mouse.x - 750) / 50);
						startBoxVS3.x = startBoxV3.x + ((mouse.x - 750) / 50);
						startBoxVS4.x = startBoxV4.x + ((mouse.x - 750) / 50);

						startBoxAS1_2.x = startBoxA1_2.x + ((mouse.x - 750) / 50);
						startBoxAS2_2.x = startBoxA2_2.x + ((mouse.x - 750) / 50);
						startBoxAS3_2.x = startBoxA3_2.x + ((mouse.x - 750) / 50);
						startBoxAS4_2.x = startBoxA4_2.x + ((mouse.x - 750) / 50);

						startBoxMS1.x = startBoxM1.x + ((mouse.x - 750) / 50);
						startBoxMS2.x = startBoxM2.x + ((mouse.x - 750) / 50);
						startBoxMS3.x = startBoxM3.x + ((mouse.x - 750) / 50);
						startBoxMS4.x = startBoxM4.x + ((mouse.x - 750) / 50);
						startBoxMS5.x = startBoxM5.x + ((mouse.x - 750) / 50);

						startBoxAS1_3.x = startBoxA1_3.x + ((mouse.x - 750) / 50);
						startBoxAS2_3.x = startBoxA2_3.x + ((mouse.x - 750) / 50);
						startBoxAS3_3.x = startBoxA3_3.x + ((mouse.x - 750) / 50);
						startBoxAS4_3.x = startBoxA4_3.x + ((mouse.x - 750) / 50);

						startBoxNS1.x = startBoxN1.x + ((mouse.x - 750) / 50);
						startBoxNS2.x = startBoxN2.x + ((mouse.x - 750) / 50);
						startBoxNS3.x = startBoxN3.x + ((mouse.x - 750) / 50);

					}

					if(mouse.x < 750)
					{
						startBoxSS1.x = startBoxS1.x - ((750 - mouse.x) / 50);
						startBoxSS2.x = startBoxS2.x - ((750 - mouse.x) / 50);
						startBoxSS3.x = startBoxS3.x - ((750 - mouse.x) / 50);
						startBoxSS4.x = startBoxS4.x - ((750 - mouse.x) / 50);
						startBoxSS5.x = startBoxS5.x - ((750 - mouse.x) / 50);

						startBoxUS1.x = startBoxU1.x - ((750 - mouse.x) / 50);
						startBoxUS2.x = startBoxU2.x - ((750 - mouse.x) / 50);
						startBoxUS3.x = startBoxU3.x - ((750 - mouse.x) / 50);

						startBoxPS1.x = startBoxP1.x - ((750 - mouse.x) / 50);
						startBoxPS2.x = startBoxP2.x - ((750 - mouse.x) / 50);
						startBoxPS3.x = startBoxP3.x - ((750 - mouse.x) / 50);
						startBoxPS4.x = startBoxP4.x - ((750 - mouse.x) / 50);

						startBoxES1.x = startBoxE1.x - ((750 - mouse.x) / 50);
						startBoxES2.x = startBoxE2.x - ((750 - mouse.x) / 50);
						startBoxES3.x = startBoxE3.x - ((750 - mouse.x) / 50);
						startBoxES4.x = startBoxE4.x - ((750 - mouse.x) / 50);

						startBoxRS1.x = startBoxR1.x - ((750 - mouse.x) / 50);
						startBoxRS2.x = startBoxR2.x - ((750 - mouse.x) / 50);
						startBoxRS3.x = startBoxR3.x - ((750 - mouse.x) / 50);
						startBoxRS4.x = startBoxR4.x - ((750 - mouse.x) / 50);
						startBoxRS5.x = startBoxR5.x - ((750 - mouse.x) / 50);

						startBoxJS1.x = startBoxJ1.x - ((750 - mouse.x) / 50);
						startBoxJS2.x = startBoxJ2.x - ((750 - mouse.x) / 50);
						startBoxJS3.x = startBoxJ3.x - ((750 - mouse.x) / 50);
						startBoxJS4.x = startBoxJ4.x - ((750 - mouse.x) / 50);

						startBoxAS1.x = startBoxA1.x - ((750 - mouse.x) / 50);
						startBoxAS2.x = startBoxA2.x - ((750 - mouse.x) / 50);
						startBoxAS3.x = startBoxA3.x - ((750 - mouse.x) / 50);
						startBoxAS4.x = startBoxA4.x - ((750 - mouse.x) / 50);

						startBoxVS1.x = startBoxV1.x - ((750 - mouse.x) / 50);
						startBoxVS2.x = startBoxV2.x - ((750 - mouse.x) / 50);
						startBoxVS3.x = startBoxV3.x - ((750 - mouse.x) / 50);
						startBoxVS4.x = startBoxV4.x - ((750 - mouse.x) / 50);

						startBoxAS1_2.x = startBoxA1_2.x - ((750 - mouse.x) / 50);
						startBoxAS2_2.x = startBoxA2_2.x - ((750 - mouse.x) / 50);
						startBoxAS3_2.x = startBoxA3_2.x - ((750 - mouse.x) / 50);
						startBoxAS4_2.x = startBoxA4_2.x - ((750 - mouse.x) / 50);

						startBoxMS1.x = startBoxM1.x - ((750 - mouse.x) / 50);
						startBoxMS2.x = startBoxM2.x - ((750 - mouse.x) / 50);
						startBoxMS3.x = startBoxM3.x - ((750 - mouse.x) / 50);
						startBoxMS4.x = startBoxM4.x - ((750 - mouse.x) / 50);
						startBoxMS5.x = startBoxM5.x - ((750 - mouse.x) / 50);

						startBoxAS1_3.x = startBoxA1_3.x - ((750 - mouse.x) / 50);
						startBoxAS2_3.x = startBoxA2_3.x - ((750 - mouse.x) / 50);
						startBoxAS3_3.x = startBoxA3_3.x - ((750 - mouse.x) / 50);
						startBoxAS4_3.x = startBoxA4_3.x - ((750 - mouse.x) / 50);

						startBoxNS1.x = startBoxN1.x - ((750 - mouse.x) / 50);
						startBoxNS2.x = startBoxN2.x - ((750 - mouse.x) / 50);
						startBoxNS3.x = startBoxN3.x - ((750 - mouse.x) / 50);
					}

					/*
					if(mouse.y > 500)
					{
						startBoxSS1.y = startBoxS1.y + ((mouse.y - 500) / 50);
						startBoxSS2.y = startBoxS2.y + ((mouse.y - 500) / 50);
						startBoxSS3.y = startBoxS3.y + ((mouse.y - 500) / 50);
						startBoxSS4.y = startBoxS4.y + ((mouse.y - 500) / 50);
						startBoxSS5.y = startBoxS5.y + ((mouse.y - 500) / 50);

						startBoxUS1.y = startBoxU1.y + ((mouse.y - 500) / 50);
						startBoxUS2.y = startBoxU2.y + ((mouse.y - 500) / 50);
						startBoxUS3.y = startBoxU3.y + ((mouse.y - 500) / 50);

						startBoxPS1.y = startBoxP1.y + ((mouse.y - 500) / 50);
						startBoxPS2.y = startBoxP2.y + ((mouse.y - 500) / 50);
						startBoxPS3.y = startBoxP3.y + ((mouse.y - 500) / 50);
						startBoxPS4.y = startBoxP4.y + ((mouse.y - 500) / 50);

						startBoxES1.y = startBoxE1.y + ((mouse.y - 500) / 50);
						startBoxES2.y = startBoxE2.y + ((mouse.y - 500) / 50);
						startBoxES3.y = startBoxE3.y + ((mouse.y - 500) / 50);
						startBoxES4.y = startBoxE4.y + ((mouse.y - 500) / 50);

						startBoxRS1.y = startBoxR1.y + ((mouse.y - 500) / 50);
						startBoxRS2.y = startBoxR2.y + ((mouse.y - 500) / 50);
						startBoxRS3.y = startBoxR3.y + ((mouse.y - 500) / 50);
						startBoxRS4.y = startBoxR4.y + ((mouse.y - 500) / 50);
						startBoxRS5.y = startBoxR5.y + ((mouse.y - 500) / 50);

						startBoxJS1.y = startBoxJ1.y + ((mouse.y - 500) / 50);
						startBoxJS2.y = startBoxJ2.y + ((mouse.y - 500) / 50);
						startBoxJS3.y = startBoxJ3.y + ((mouse.y - 500) / 50);
						startBoxJS4.y = startBoxJ4.y + ((mouse.y - 500) / 50);

						startBoxAS1.y = startBoxA1.y + ((mouse.y - 500) / 50);
						startBoxAS2.y = startBoxA2.y + ((mouse.y - 500) / 50);
						startBoxAS3.y = startBoxA3.y + ((mouse.y - 500) / 50);
						startBoxAS4.y = startBoxA4.y + ((mouse.y - 500) / 50);

						startBoxVS1.y = startBoxV1.y + ((mouse.y - 500) / 50);
						startBoxVS2.y = startBoxV2.y + ((mouse.y - 500) / 50);
						startBoxVS3.y = startBoxV3.y + ((mouse.y - 500) / 50);
						startBoxVS4.y = startBoxV4.y + ((mouse.y - 500) / 50);

						startBoxAS1_2.y = startBoxA1_2.y + ((mouse.y - 500) / 50);
						startBoxAS2_2.y = startBoxA2_2.y + ((mouse.y - 500) / 50);
						startBoxAS3_2.y = startBoxA3_2.y + ((mouse.y - 500) / 50);
						startBoxAS4_2.y = startBoxA4_2.y + ((mouse.y - 500) / 50);

						startBoxMS1.y = startBoxM1.y + ((mouse.y - 500) / 50);
						startBoxMS2.y = startBoxM2.y + ((mouse.y - 500) / 50);
						startBoxMS3.y = startBoxM3.y + ((mouse.y - 500) / 50);
						startBoxMS4.y = startBoxM4.y + ((mouse.y - 500) / 50);
						startBoxMS5.y = startBoxM5.y + ((mouse.y - 500) / 50);

						startBoxAS1_3.y = startBoxA1_3.y + ((mouse.y - 500) / 50);
						startBoxAS2_3.y = startBoxA2_3.y + ((mouse.y - 500) / 50);
						startBoxAS3_3.y = startBoxA3_3.y + ((mouse.y - 500) / 50);
						startBoxAS4_3.y = startBoxA4_3.y + ((mouse.y - 500) / 50);

						startBoxNS1.y = startBoxN1.y + ((mouse.y - 500) / 50);
						startBoxNS2.y = startBoxN2.y + ((mouse.y - 500) / 50);
						startBoxNS3.y = startBoxN3.y + ((mouse.y - 500) / 50);
					}
					if(mouse.y < 500)
					{
						startBoxSS1.y = startBoxS1.y - ((500 - mouse.y) / 50);
						startBoxSS2.y = startBoxS2.y - ((500 - mouse.y) / 50);
						startBoxSS3.y = startBoxS3.y - ((500 - mouse.y) / 50);
						startBoxSS4.y = startBoxS4.y - ((500 - mouse.y) / 50);
						startBoxSS5.y = startBoxS5.y - ((500 - mouse.y) / 50);

						startBoxUS1.y = startBoxU1.y - ((500 - mouse.y) / 50);
						startBoxUS2.y = startBoxU2.y - ((500 - mouse.y) / 50);
						startBoxUS3.y = startBoxU3.y - ((500 - mouse.y) / 50);

						startBoxPS1.y = startBoxP1.y - ((500 - mouse.y) / 50);
						startBoxPS2.y = startBoxP2.y - ((500 - mouse.y) / 50);
						startBoxPS3.y = startBoxP3.y - ((500 - mouse.y) / 50);
						startBoxPS4.y = startBoxP4.y - ((500 - mouse.y) / 50);

						startBoxES1.y = startBoxE1.y - ((500 - mouse.y) / 50);
						startBoxES2.y = startBoxE2.y - ((500 - mouse.y) / 50);
						startBoxES3.y = startBoxE3.y - ((500 - mouse.y) / 50);
						startBoxES4.y = startBoxE4.y - ((500 - mouse.y) / 50);

						startBoxRS1.y = startBoxR1.y - ((500 - mouse.y) / 50);
						startBoxRS2.y = startBoxR2.y - ((500 - mouse.y) / 50);
						startBoxRS3.y = startBoxR3.y - ((500 - mouse.y) / 50);
						startBoxRS4.y = startBoxR4.y - ((500 - mouse.y) / 50);
						startBoxRS5.y = startBoxR5.y - ((500 - mouse.y) / 50);

						startBoxJS1.y = startBoxJ1.y - ((500 - mouse.y) / 50);
						startBoxJS2.y = startBoxJ2.y - ((500 - mouse.y) / 50);
						startBoxJS3.y = startBoxJ3.y - ((500 - mouse.y) / 50);
						startBoxJS4.y = startBoxJ4.y - ((500 - mouse.y) / 50);

						startBoxAS1.y = startBoxA1.y - ((500 - mouse.y) / 50);
						startBoxAS2.y = startBoxA2.y - ((500 - mouse.y) / 50);
						startBoxAS3.y = startBoxA3.y - ((500 - mouse.y) / 50);
						startBoxAS4.y = startBoxA4.y - ((500 - mouse.y) / 50);

						startBoxVS1.y = startBoxV1.y - ((500 - mouse.y) / 50);
						startBoxVS2.y = startBoxV2.y - ((500 - mouse.y) / 50);
						startBoxVS3.y = startBoxV3.y - ((500 - mouse.y) / 50);
						startBoxVS4.y = startBoxV4.y - ((500 - mouse.y) / 50);

						startBoxAS1_2.y = startBoxA1_2.y - ((500 - mouse.y) / 50);
						startBoxAS2_2.y = startBoxA2_2.y - ((500 - mouse.y) / 50);
						startBoxAS3_2.y = startBoxA3_2.y - ((500 - mouse.y) / 50);
						startBoxAS4_2.y = startBoxA4_2.y - ((500 - mouse.y) / 50);

						startBoxMS1.y = startBoxM1.y - ((500 - mouse.y) / 50);
						startBoxMS2.y = startBoxM2.y - ((500 - mouse.y) / 50);
						startBoxMS3.y = startBoxM3.y - ((500 - mouse.y) / 50);
						startBoxMS4.y = startBoxM4.y - ((500 - mouse.y) / 50);
						startBoxMS5.y = startBoxM5.y - ((500 - mouse.y) / 50);

						startBoxAS1_3.y = startBoxA1_3.y - ((500 - mouse.y) / 50);
						startBoxAS2_3.y = startBoxA2_3.y - ((500 - mouse.y) / 50);
						startBoxAS3_3.y = startBoxA3_3.y - ((500 - mouse.y) / 50);
						startBoxAS4_3.y = startBoxA4_3.y - ((500 - mouse.y) / 50);

						startBoxNS1.y = startBoxN1.y - ((500 - mouse.y) / 50);
						startBoxNS2.y = startBoxN2.y - ((500 - mouse.y) / 50);
						startBoxNS3.y = startBoxN3.y - ((500 - mouse.y) / 50);
					}
					 */
				}
				repaint();
			}
		});

		f.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				mouse = new Point(e.getX(), e.getY() - 25);

				if(e.getButton() == MouseEvent.BUTTON1 && !mouseActive)
				{
					character.x = mouse.x;
					character.y = mouse.y;
				}
			}
		});
	}

	public void paintComponent(Graphics g)
	{
		if(Main.f.i.imagesLoaded == true)
		{
			super.paintComponent(g);

			Point ptFallingLeft = new Point(character.x + 1, character.y + character.height + 1);
			Point ptFallingRight = new Point(character.x + charW - 1, character.y + character.height + 1);
			Point ptBottomLeft = new Point(character.x, character.y + character.height);
			Point ptBottomRight = new Point(character.x + charW, character.y + character.height);
			Point ptTopLeft = new Point(character.x, character.y);
			Point ptTopRight = new Point(character.x + charW, character.y);


			this.setBackground(Color.BLACK);
			//g.setColor(Color.WHITE);
			//g.fillRect(character.x, character.y, character.width, character.height);

			if(gameOver == true)
			{
				g.drawImage(Main.f.i.gameOver, 400, 200, 700, 500, null);
			}

			// Code for the start screen
			if(level1 == false && level2 == false && level3 == false && gameOver == false)
			{
				if(!bottomBox.contains(ptFallingLeft) && !mouseActive && !jumping)
				{
					character.y++;
				}

				// Draw Shadow
				g.setColor(Color.GRAY);
				g.fillRect(startBoxSS1.x, startBoxSS1.y, startBoxSS1.width, startBoxSS1.height);
				g.fillRect(startBoxSS2.x, startBoxSS2.y, startBoxSS2.width, startBoxSS2.height);
				g.fillRect(startBoxSS3.x, startBoxSS3.y, startBoxSS3.width, startBoxSS3.height);
				g.fillRect(startBoxSS4.x, startBoxSS4.y, startBoxSS4.width, startBoxSS4.height);
				g.fillRect(startBoxSS5.x, startBoxSS5.y, startBoxSS5.width, startBoxSS5.height);
				g.fillRect(startBoxUS1.x, startBoxUS1.y, startBoxUS1.width, startBoxUS1.height);
				g.fillRect(startBoxUS2.x, startBoxUS2.y, startBoxUS2.width, startBoxUS2.height);
				g.fillRect(startBoxUS3.x, startBoxUS3.y, startBoxUS3.width, startBoxUS3.height);
				g.fillRect(startBoxPS1.x, startBoxPS1.y, startBoxPS1.width, startBoxPS1.height);
				g.fillRect(startBoxPS2.x, startBoxPS2.y, startBoxPS2.width, startBoxPS2.height);
				g.fillRect(startBoxPS3.x, startBoxPS3.y, startBoxPS3.width, startBoxPS3.height);
				g.fillRect(startBoxPS4.x, startBoxPS4.y, startBoxPS4.width, startBoxPS4.height);
				g.fillRect(startBoxES1.x, startBoxES1.y, startBoxES1.width, startBoxES1.height);
				g.fillRect(startBoxES2.x, startBoxES2.y, startBoxES2.width, startBoxES2.height);
				g.fillRect(startBoxES3.x, startBoxES3.y, startBoxES3.width, startBoxES3.height);
				g.fillRect(startBoxES4.x, startBoxES4.y, startBoxES4.width, startBoxES4.height);
				g.fillRect(startBoxRS1.x, startBoxRS1.y, startBoxRS1.width, startBoxRS1.height);
				g.fillRect(startBoxRS2.x, startBoxRS2.y, startBoxRS2.width, startBoxRS2.height);
				g.fillRect(startBoxRS3.x, startBoxRS3.y, startBoxRS3.width, startBoxRS3.height);
				g.fillRect(startBoxRS4.x, startBoxRS4.y, startBoxRS4.width, startBoxRS4.height);
				g.fillRect(startBoxRS5.x, startBoxRS5.y, startBoxRS5.width, startBoxRS5.height);
				g.fillRect(startBoxJS1.x, startBoxJS1.y, startBoxJS1.width, startBoxJS1.height);
				g.fillRect(startBoxJS2.x, startBoxJS2.y, startBoxJS2.width, startBoxJS2.height);
				g.fillRect(startBoxJS3.x, startBoxJS3.y, startBoxJS3.width, startBoxJS3.height);
				g.fillRect(startBoxJS4.x, startBoxJS4.y, startBoxJS4.width, startBoxJS4.height);
				g.fillRect(startBoxAS1.x, startBoxAS1.y, startBoxAS1.width, startBoxAS1.height);
				g.fillRect(startBoxAS2.x, startBoxAS2.y, startBoxAS2.width, startBoxAS2.height);
				g.fillRect(startBoxAS3.x, startBoxAS3.y, startBoxAS3.width, startBoxAS3.height);
				g.fillRect(startBoxAS4.x, startBoxAS4.y, startBoxAS4.width, startBoxAS4.height);
				g.fillRect(startBoxVS1.x, startBoxVS1.y, startBoxVS1.width, startBoxVS1.height);
				g.fillRect(startBoxVS2.x, startBoxVS2.y, startBoxVS2.width, startBoxVS2.height);
				g.fillRect(startBoxVS3.x, startBoxVS3.y, startBoxVS3.width, startBoxVS3.height);
				g.fillRect(startBoxVS4.x, startBoxVS4.y, startBoxVS4.width, startBoxVS4.height);
				g.fillRect(startBoxAS1_2.x, startBoxAS1_2.y, startBoxAS1_2.width, startBoxAS1_2.height);
				g.fillRect(startBoxAS2_2.x, startBoxAS2_2.y, startBoxAS2_2.width, startBoxAS2_2.height);
				g.fillRect(startBoxAS3_2.x, startBoxAS3_2.y, startBoxAS3_2.width, startBoxAS3_2.height);
				g.fillRect(startBoxAS4_2.x, startBoxAS4_2.y, startBoxAS4_2.width, startBoxAS4_2.height);
				g.fillRect(startBoxMS1.x, startBoxMS1.y, startBoxMS1.width, startBoxMS1.height);
				g.fillRect(startBoxMS2.x, startBoxMS2.y, startBoxMS2.width, startBoxMS2.height);
				g.fillRect(startBoxMS3.x, startBoxMS3.y, startBoxMS3.width, startBoxMS3.height);
				g.fillRect(startBoxMS4.x, startBoxMS4.y, startBoxMS4.width, startBoxMS4.height);
				g.fillRect(startBoxMS5.x, startBoxMS5.y, startBoxMS5.width, startBoxMS5.height);
				g.fillRect(startBoxAS1_3.x, startBoxAS1_3.y, startBoxAS1_3.width, startBoxAS1_3.height);
				g.fillRect(startBoxAS2_3.x, startBoxAS2_3.y, startBoxAS2_3.width, startBoxAS2_3.height);
				g.fillRect(startBoxAS3_3.x, startBoxAS3_3.y, startBoxAS3_3.width, startBoxAS3_3.height);
				g.fillRect(startBoxAS4_3.x, startBoxAS4_3.y, startBoxAS4_3.width, startBoxAS4_3.height);
				g.fillRect(startBoxNS1.x, startBoxNS1.y, startBoxNS1.width, startBoxNS1.height);
				g.fillRect(startBoxNS2.x, startBoxNS2.y, startBoxNS2.width, startBoxNS2.height);
				g.fillRect(startBoxNS3.x, startBoxNS3.y, startBoxNS3.width, startBoxNS3.height);

				if(seizureMode == false)
				{
					g.setColor(Color.WHITE);
				}
				
				if (seizureMode == true)
				{
					Calendar cal = Calendar.getInstance();
					SimpleDateFormat sdf = new SimpleDateFormat("S");
					String s = sdf.format(cal.getTime());
					int out = Integer.valueOf(s);

					if(out <= 166 || out > 500 && out <= 666)
					{
						g.setColor(Color.RED);
					}

					if(out > 166 && out <= 333 || out > 666 && out <= 832)
					{
						g.setColor(Color.BLUE);
					}

					if(out > 333 && out <= 500 || out > 832 && out <= 1000)
					{
						g.setColor(Color.GREEN);
					}
				}
				
				// Draw Words
				g.fillRect(bottomBox.x, bottomBox.y, bottomBox.width, bottomBox.height);
				g.fillRect(startBoxS1.x, startBoxS1.y, startBoxS1.width, startBoxS1.height);
				g.fillRect(startBoxS2.x, startBoxS2.y, startBoxS2.width, startBoxS2.height);
				g.fillRect(startBoxS3.x, startBoxS3.y, startBoxS3.width, startBoxS3.height);
				g.fillRect(startBoxS4.x, startBoxS4.y, startBoxS4.width, startBoxS4.height);
				g.fillRect(startBoxS5.x, startBoxS5.y, startBoxS5.width, startBoxS5.height);
				g.fillRect(startBoxU1.x, startBoxU1.y, startBoxU1.width, startBoxU1.height);
				g.fillRect(startBoxU2.x, startBoxU2.y, startBoxU2.width, startBoxU2.height);
				g.fillRect(startBoxU3.x, startBoxU3.y, startBoxU3.width, startBoxU3.height);
				g.fillRect(startBoxP1.x, startBoxP1.y, startBoxP1.width, startBoxP1.height);
				g.fillRect(startBoxP2.x, startBoxP2.y, startBoxP2.width, startBoxP2.height);
				g.fillRect(startBoxP3.x, startBoxP3.y, startBoxP3.width, startBoxP3.height);
				g.fillRect(startBoxP4.x, startBoxP4.y, startBoxP4.width, startBoxP4.height);
				g.fillRect(startBoxE1.x, startBoxE1.y, startBoxE1.width, startBoxE1.height);
				g.fillRect(startBoxE2.x, startBoxE2.y, startBoxE2.width, startBoxE2.height);
				g.fillRect(startBoxE3.x, startBoxE3.y, startBoxE3.width, startBoxE3.height);
				g.fillRect(startBoxE4.x, startBoxE4.y, startBoxE4.width, startBoxE4.height);
				g.fillRect(startBoxR1.x, startBoxR1.y, startBoxR1.width, startBoxR1.height);
				g.fillRect(startBoxR2.x, startBoxR2.y, startBoxR2.width, startBoxR2.height);
				g.fillRect(startBoxR3.x, startBoxR3.y, startBoxR3.width, startBoxR3.height);
				g.fillRect(startBoxR4.x, startBoxR4.y, startBoxR4.width, startBoxR4.height);
				g.fillRect(startBoxR5.x, startBoxR5.y, startBoxR5.width, startBoxR5.height);
				g.fillRect(startBoxJ1.x, startBoxJ1.y, startBoxJ1.width, startBoxJ1.height);
				g.fillRect(startBoxJ2.x, startBoxJ2.y, startBoxJ2.width, startBoxJ2.height);
				g.fillRect(startBoxJ3.x, startBoxJ3.y, startBoxJ3.width, startBoxJ3.height);
				g.fillRect(startBoxJ4.x, startBoxJ4.y, startBoxJ4.width, startBoxJ4.height);
				g.fillRect(startBoxA1.x, startBoxA1.y, startBoxA1.width, startBoxA1.height);
				g.fillRect(startBoxA2.x, startBoxA2.y, startBoxA2.width, startBoxA2.height);
				g.fillRect(startBoxA3.x, startBoxA3.y, startBoxA3.width, startBoxA3.height);
				g.fillRect(startBoxA4.x, startBoxA4.y, startBoxA4.width, startBoxA4.height);
				g.fillRect(startBoxV1.x, startBoxV1.y, startBoxV1.width, startBoxV1.height);
				g.fillRect(startBoxV2.x, startBoxV2.y, startBoxV2.width, startBoxV2.height);
				g.fillRect(startBoxV3.x, startBoxV3.y, startBoxV3.width, startBoxV3.height);
				g.fillRect(startBoxV4.x, startBoxV4.y, startBoxV4.width, startBoxV4.height);
				g.fillRect(startBoxA1_2.x, startBoxA1_2.y, startBoxA1_2.width, startBoxA1_2.height);
				g.fillRect(startBoxA2_2.x, startBoxA2_2.y, startBoxA2_2.width, startBoxA2_2.height);
				g.fillRect(startBoxA3_2.x, startBoxA3_2.y, startBoxA3_2.width, startBoxA3_2.height);
				g.fillRect(startBoxA4_2.x, startBoxA4_2.y, startBoxA4_2.width, startBoxA4_2.height);
				g.fillRect(startBoxM1.x, startBoxM1.y, startBoxM1.width, startBoxM1.height);
				g.fillRect(startBoxM2.x, startBoxM2.y, startBoxM2.width, startBoxM2.height);
				g.fillRect(startBoxM3.x, startBoxM3.y, startBoxM3.width, startBoxM3.height);
				g.fillRect(startBoxM4.x, startBoxM4.y, startBoxM4.width, startBoxM4.height);
				g.fillRect(startBoxM5.x, startBoxM5.y, startBoxM5.width, startBoxM5.height);
				g.fillRect(startBoxA1_3.x, startBoxA1_3.y, startBoxA1_3.width, startBoxA1_3.height);
				g.fillRect(startBoxA2_3.x, startBoxA2_3.y, startBoxA2_3.width, startBoxA2_3.height);
				g.fillRect(startBoxA3_3.x, startBoxA3_3.y, startBoxA3_3.width, startBoxA3_3.height);
				g.fillRect(startBoxA4_3.x, startBoxA4_3.y, startBoxA4_3.width, startBoxA4_3.height);
				g.fillRect(startBoxN1.x, startBoxN1.y, startBoxN1.width, startBoxN1.height);
				g.fillRect(startBoxN2.x, startBoxN2.y, startBoxN2.width, startBoxN2.height);
				g.fillRect(startBoxN3.x, startBoxN3.y, startBoxN3.width, startBoxN3.height);
								
				g.drawImage(Main.f.i.start, startBoxStart.x, startBoxStart.y, startBoxStart.width, startBoxStart.height, null);
				
				if(startBoxStart.contains(ptTopLeft) && startBoxStart.contains(ptTopRight))
				{
					level1 = true;
					level2 = false;
					level3 = false;
					reset = true;
					gameOver = false;
					keyboard = true;
				}

				if(right == true && character.x != Main.width - (charW + 6))
				{
					character.x +=1;
				}

				if(left == true && character.x != 0)
				{
					character.x -=1;
				}

				if(jumping == true)
				{
					character.y--;
				}
			}

			// Code for level 1
			if(level1 == true && gameOver == false)
			{
				g.drawImage(Main.f.i.level1, setPoint.x, setPoint.y, 3800, Main.height, null);
				
				// Draw Level Shadows
				g.setColor(Color.GRAY);
				g.fillRect(boxS1.x, boxS1.y, boxS1.width, boxS1.height);
				g.fillRect(boxS2.x, boxS2.y, boxS2.width, boxS2.height);
				g.fillRect(boxS3.x, boxS3.y, boxS3.width, boxS3.height);
				g.fillRect(boxS4.x, boxS4.y, boxS4.width, boxS4.height);
				g.fillRect(boxS5.x, boxS5.y, boxS5.width, boxS5.height);
				g.fillRect(boxS6.x, boxS6.y, boxS6.width, boxS6.height);
				g.fillRect(boxS7.x, boxS7.y, boxS7.width, boxS7.height);
				g.fillRect(boxS8.x, boxS8.y, boxS8.width, boxS8.height);
				g.fillRect(boxS9.x, boxS9.y, boxS9.width, boxS9.height);
				g.fillRect(boxS10.x, boxS10.y, boxS10.width, boxS10.height);
				g.fillRect(boxS11.x, boxS11.y, boxS11.width, boxS11.height);
				g.fillRect(boxS12.x, boxS12.y, boxS12.width, boxS12.height);
				g.fillRect(boxS13.x, boxS13.y, boxS13.width, boxS13.height);
				g.fillRect(castleBoxS1.x, castleBoxS1.y, castleBoxS1.width, castleBoxS1.height);
				g.fillRect(castleBoxS2.x, castleBoxS2.y, castleBoxS2.width, castleBoxS2.height);
				g.fillRect(castleBoxS3.x, castleBoxS3.y, castleBoxS3.width, castleBoxS3.height);
				g.fillRect(castleBoxS4.x, castleBoxS4.y, castleBoxS4.width, castleBoxS4.height);
				g.fillRect(castleBoxS5.x, castleBoxS5.y, castleBoxS5.width, castleBoxS5.height);

				// Draw Level
				g.setColor(Color.WHITE);
				g.fillRect(box1.x, box1.y, box1.width, box1.height);
				g.fillRect(box2.x, box2.y, box2.width, box2.height);
				g.fillRect(box3.x, box3.y, box3.width, box3.height);
				g.fillRect(box4.x, box4.y, box4.width, box4.height);
				g.fillRect(box5.x, box5.y, box5.width, box5.height);
				g.fillRect(box6.x, box6.y, box6.width, box6.height);
				g.fillRect(box7.x, box7.y, box7.width, box7.height);
				g.fillRect(box8.x, box8.y, box8.width, box8.height);
				g.fillRect(box9.x, box9.y, box9.width, box9.height);
				g.fillRect(box10.x, box10.y, box10.width, box10.height);
				g.fillRect(box11.x, box11.y, box11.width, box11.height);
				g.fillRect(box12.x, box12.y, box12.width, box12.height);
				g.fillRect(box13.x, box13.y, box13.width, box13.height);
				g.fillRect(castleBox1.x, castleBox1.y, castleBox1.width, castleBox1.height);
				g.fillRect(castleBox2.x, castleBox2.y, castleBox2.width, castleBox2.height);
				g.fillRect(castleBox3.x, castleBox3.y, castleBox3.width, castleBox3.height);
				g.fillRect(castleBox4.x, castleBox4.y, castleBox4.width, castleBox4.height);
				g.fillRect(castleBox5.x, castleBox5.y, castleBox5.width, castleBox5.height);
				g.fillRect(flagBox1.x, flagBox1.y, flagBox1.width, flagBox1.height);
				g.fillPolygon(flagBox2);
				g.setColor(Color.BLACK);
				g.fillRect(endBox1.x, endBox1.y, endBox1.width, endBox1.height);

				// Move shadows
				boxS1.x = (box1.x + ((750 - box1.x) / 20) - 20);
				boxS2.x = box2.x + ((750 - box2.x) / 20);
				boxS3.x = box3.x + ((750 - box3.x) / 20);
				boxS4.x = box4.x + ((750 - box4.x) / 20);
				boxS5.x = box5.x + ((750 - box5.x) / 20);
				boxS6.x = box6.x + ((750 - box6.x) / 20);
				boxS7.x = box7.x + ((750 - box7.x) / 20);
				boxS8.x = box8.x + ((750 - box8.x) / 20);
				boxS9.x = box9.x + ((750 - box9.x) / 20);
				boxS10.x = box10.x + ((750 - box10.x) / 20);
				boxS11.x = box11.x + ((750 - box11.x) / 20);
				boxS12.x = box12.x + ((750 - box12.x) / 20);
				boxS13.x = box13.x + ((750 - box13.x) / 20);
				castleBoxS1.x = castleBox1.x + ((750 - castleBox1.x) / 20);
				castleBoxS2.x = castleBox2.x + ((750 - castleBox2.x) / 20);
				castleBoxS3.x = castleBox3.x + ((750 - castleBox3.x) / 20);
				castleBoxS4.x = castleBox4.x + ((750 - castleBox4.x) / 20);
				castleBoxS5.x = castleBox5.x + ((750 - castleBox5.x) / 20);

				if(!box1.contains(ptFallingLeft) && !box2.contains(ptFallingRight) && !box2.contains(ptFallingLeft) && !box3.contains(ptFallingLeft) && !box3.contains(ptFallingRight)
						&& !box4.contains(ptFallingRight) && !box5.contains(ptFallingLeft) && !box5.contains(ptFallingRight) && !box6.contains(ptFallingLeft) 
						&& !box6.contains(ptFallingRight) && !box7.contains(ptFallingLeft) && !box7.contains(ptFallingRight) && !box8.contains(ptFallingLeft) 
						&& !box8.contains(ptFallingRight) && !box9.contains(ptFallingLeft) && !box9.contains(ptFallingRight) && !box10.contains(ptFallingLeft)
						&& !box10.contains(ptFallingRight) && !box11.contains(ptFallingLeft) && !box11.contains(ptFallingRight) && !box12.contains(ptFallingLeft)
						&& !box12.contains(ptFallingRight) && !box13.contains(ptFallingLeft) && !box13.contains(ptFallingRight) && !mouseActive && !jumping)
				{
					character.y++;
				}

				if(right == true && !box3.contains(ptBottomRight) && !box2.contains(ptBottomRight) && !box4.contains(ptBottomRight) && !box5.contains(ptBottomRight)
						&& !box6.contains(ptBottomRight) && !box7.contains(ptBottomRight) && !box7.contains(ptTopRight) && !box8.contains(ptBottomRight) && !box8.contains(ptTopRight)
						&& !box9.contains(ptBottomRight) && !box9.contains(ptTopRight) && !box10.contains(ptBottomRight) && !box10.contains(ptTopRight) && !box11.contains(ptBottomRight)
						&& !box11.contains(ptTopRight) && !box12.contains(ptBottomRight) && !box12.contains(ptTopRight) && !box13.contains(ptBottomRight) && !box13.contains(ptTopRight) 
						&& character.x != Main.width - 500)
				{
					character.x +=1;
				}

				if(left == true && !box3.contains(ptBottomLeft) && !box1.contains(ptBottomLeft) && !box5.contains(ptBottomLeft) && !box6.contains(ptBottomLeft) && !box7.contains(ptBottomLeft)
						&& !box7.contains(ptTopLeft) && !box8.contains(ptBottomLeft) && !box8.contains(ptTopLeft) && !box9.contains(ptBottomLeft) && !box9.contains(ptTopLeft)
						&& !box10.contains(ptBottomLeft) && !box10.contains(ptTopLeft) && !box11.contains(ptBottomLeft) && !box11.contains(ptTopLeft) && !box12.contains(ptBottomLeft)
						&& !box12.contains(ptTopLeft) && character.x != 0)
				{
					character.x -=1;
				}

				if(jumping == true && !box7.contains(ptTopLeft) && !box7.contains(ptTopRight) && !box8.contains(ptTopLeft) && !box8.contains(ptTopRight) && !box9.contains(ptTopLeft)
						&& !box9.contains(ptTopRight) && !box11.contains(ptTopLeft) && !box11.contains(ptTopRight) && !box12.contains(ptTopLeft) && !box12.contains(ptTopRight))
				{
					character.y--;
				}

				// Make the screen scroll
				if(right == true && !box6.contains(ptBottomRight) && !box7.contains(ptBottomRight) && !box8.contains(ptBottomRight) && !box9.contains(ptBottomRight) && !box10.contains(ptBottomRight) 
						&& !box11.contains(ptBottomRight) && !box12.contains(ptBottomRight) && character.x == Main.width - 500)
				{
					box1.x -= 1;
					box2.x -= 1;
					box3.x -= 1;
					box4.x -= 1;
					box5.x -= 1;
					box6.x -= 1;
					box7.x -= 1;
					box8.x -= 1;
					box9.x -= 1;
					box10.x -= 1;
					box11.x -= 1;
					box12.x -= 1;
					box13.x -= 1;
					castleBox1.x -= 1;
					castleBox2.x -= 1;
					castleBox3.x -= 1;
					castleBox4.x -= 1;
					castleBox5.x -= 1;
					flagBox1.x -= 1;
					flagBox2.xpoints[0] -= 1;
					flagBox2.xpoints[1] -= 1;
					flagBox2.xpoints[2] -= 1;
					endBox1.x -= 1;
					setPoint.x -= 1;
				}

				if(endBox1.contains(ptTopLeft) && flagBox2.ypoints[0] > 520)
				{
					right = false;
					left = false;
					keyboard = false;
					flagRaised = true;
				}

				if(flagBox2.ypoints[0] <= 520)
				{
					flagRaised = false;
				}

				if(flagRaised == true)
				{
					flagBox2.ypoints[0]--;
					flagBox2.ypoints[1]--;
					flagBox2.ypoints[2]--;
				}
				
				if(reset == true)
				{
					character.x = 180;
					character.y = 800;
					box1.x = 0;
					box2.x = 600;
					box3.x = 400;
					box4.x = 800;
					box5.x = 930;
					box6.x = 1800;
					box7.x = 1500;
					box8.x = 1600;
					box9.x = 1850;
					box10.x = 2150;
					box11.x = 2050;
					box12.x = 1750;
					box13.x = 2500;
					castleBox1.x = 3150;
					castleBox2.x = 3150;
					castleBox3.x = 3250;
					castleBox4.x = 3350;
					castleBox5.x = 3450;
					flagBox1.x = 3315;
					flagBox2.xpoints[0] = 3335;
					flagBox2.xpoints[1] = 3335;
					flagBox2.xpoints[2] = 3400;
					flagBox2.ypoints[0] = 800;
					flagBox2.ypoints[1] = 850;
					flagBox2.ypoints[2] = 825;
					endBox1.x = 3275;
					setPoint.x = 0;
					reset = false;
				}
			}

			// Code for level 2
			if(level2 == true && gameOver == false)
			{
				g.drawImage(Main.f.i.level2, setPoint.x, setPoint.y, 4700, Main.height, null);
				
				// Draw Level Shadows
				g.setColor(Color.GRAY);
				g.fillRect(boxS14.x, boxS14.y, boxS14.width, boxS14.height);
				g.fillRect(boxS15.x, boxS15.y, boxS15.width, boxS15.height);
				g.fillRect(boxS16.x, boxS16.y, boxS16.width, boxS16.height);
				g.fillRect(boxS17.x, boxS17.y, boxS17.width, boxS17.height);
				g.fillRect(boxS18.x, boxS18.y, boxS18.width, boxS18.height);
				g.fillRect(boxS19.x, boxS19.y, boxS19.width, boxS19.height);
				g.fillRect(boxS20.x, boxS20.y, boxS20.width, boxS20.height);
				g.fillRect(boxS21.x, boxS21.y, boxS21.width, boxS21.height);
				g.fillRect(boxS22.x, boxS22.y, boxS22.width, boxS22.height);
				g.fillRect(boxS23.x, boxS23.y, boxS23.width, boxS23.height);
				g.fillRect(boxS24.x, boxS24.y, boxS24.width, boxS24.height);
				g.fillRect(boxS25.x, boxS25.y, boxS25.width, boxS25.height);
				g.fillRect(boxS26.x, boxS26.y, boxS26.width, boxS26.height);
				g.fillRect(boxS27.x, boxS27.y, boxS27.width, boxS27.height);
				g.fillRect(boxS28.x, boxS28.y, boxS28.width, boxS28.height);
				g.fillRect(castleBoxS6.x, castleBoxS6.y, castleBoxS6.width, castleBoxS6.height);
				g.fillRect(castleBoxS7.x, castleBoxS7.y, castleBoxS7.width, castleBoxS7.height);
				g.fillRect(castleBoxS8.x, castleBoxS8.y, castleBoxS8.width, castleBoxS8.height);
				g.fillRect(castleBoxS9.x, castleBoxS9.y, castleBoxS9.width, castleBoxS9.height);
				g.fillRect(castleBoxS10.x, castleBoxS10.y, castleBoxS10.width, castleBoxS10.height);


				// Draw Level
				g.setColor(Color.WHITE);
				g.fillRect(box14.x, box14.y, box14.width, box14.height);
				g.fillRect(box15.x, box15.y, box15.width, box15.height);
				g.fillRect(box16.x, box16.y, box16.width, box16.height);
				g.fillRect(box17.x, box17.y, box17.width, box17.height);
				g.fillRect(box18.x, box18.y, box18.width, box18.height);
				g.fillRect(box19.x, box19.y, box19.width, box19.height);
				g.fillRect(box20.x, box20.y, box20.width, box20.height);
				g.fillRect(box21.x, box21.y, box21.width, box21.height);
				g.fillRect(box22.x, box22.y, box22.width, box22.height);
				g.fillRect(box23.x, box23.y, box23.width, box23.height);
				g.fillRect(box24.x, box24.y, box24.width, box24.height);
				g.fillRect(box25.x, box25.y, box25.width, box25.height);
				g.fillRect(box26.x, box26.y, box26.width, box26.height);
				g.fillRect(box27.x, box27.y, box27.width, box27.height);
				g.fillRect(box28.x, box28.y, box28.width, box28.height);
				g.fillRect(castleBox6.x, castleBox6.y, castleBox6.width, castleBox6.height);
				g.fillRect(castleBox7.x, castleBox7.y, castleBox7.width, castleBox7.height);
				g.fillRect(castleBox8.x, castleBox8.y, castleBox8.width, castleBox8.height);
				g.fillRect(castleBox9.x, castleBox9.y, castleBox9.width, castleBox9.height);
				g.fillRect(castleBox10.x, castleBox10.y, castleBox10.width, castleBox10.height);
				g.fillRect(flagBox3.x, flagBox3.y, flagBox3.width, flagBox3.height);
				g.fillPolygon(flagBox4);
				g.setColor(Color.BLACK);
				g.fillRect(endBox2.x, endBox2.y, endBox2.width, endBox2.height);

				// Move shadows
				boxS14.x = box14.x + ((750 - box14.x) / 20) - 20;
				boxS15.x = box15.x + ((750 - box15.x) / 20);
				boxS16.x = box16.x + ((750 - box16.x) / 20);
				boxS17.x = box17.x + ((750 - box17.x) / 20);
				boxS18.x = box18.x + ((750 - box18.x) / 20);
				boxS19.x = box19.x + ((750 - box19.x) / 20);
				boxS20.x = box20.x + ((750 - box20.x) / 20);
				boxS21.x = box21.x + ((750 - box21.x) / 20);
				boxS22.x = box22.x + ((750 - box22.x) / 20);
				boxS23.x = box23.x + ((750 - box23.x) / 20);
				boxS24.x = box24.x + ((750 - box24.x) / 20);
				boxS25.x = box25.x + ((750 - box25.x) / 20);
				boxS26.x = box26.x + ((750 - box26.x) / 20);
				boxS27.x = box27.x + ((750 - box27.x) / 20);
				boxS28.x = box28.x + ((750 - box28.x) / 20);
				castleBoxS6.x = castleBox6.x + ((750 - castleBox6.x) / 20);
				castleBoxS7.x = castleBox7.x + ((750 - castleBox7.x) / 20);
				castleBoxS8.x = castleBox8.x + ((750 - castleBox8.x) / 20);
				castleBoxS9.x = castleBox9.x + ((750 - castleBox9.x) / 20);
				castleBoxS10.x = castleBox10.x + ((750 - castleBox10.x) / 20);

				if(!box14.contains(ptFallingLeft) && !box15.contains(ptFallingRight) && !box15.contains(ptFallingLeft) && !box16.contains(ptFallingRight) && !box16.contains(ptFallingLeft)
						&& !box17.contains(ptFallingRight) && !box17.contains(ptFallingLeft) && !box18.contains(ptFallingRight) && !box18.contains(ptFallingLeft) && !box19.contains(ptFallingRight)
						&& !box19.contains(ptFallingLeft) && !box20.contains(ptFallingRight) && !box20.contains(ptFallingLeft) && !box21.contains(ptFallingRight) && !box21.contains(ptFallingLeft)
						&& !box22.contains(ptFallingRight) && !box22.contains(ptFallingLeft) && !box23.contains(ptFallingRight) && !box23.contains(ptFallingLeft) && !box24.contains(ptFallingRight)
						&& !box24.contains(ptFallingLeft) && !box25.contains(ptFallingRight) && !box25.contains(ptFallingLeft) && !box26.contains(ptFallingRight) && !box26.contains(ptFallingLeft)
						&& !box27.contains(ptFallingRight) && !box27.contains(ptFallingLeft) && !box28.contains(ptFallingRight) && !box28.contains(ptFallingLeft) && !mouseActive && !jumping)
				{
					character.y++;
				}

				if(right == true && !box16.contains(ptBottomRight) && !box17.contains(ptBottomRight) && !box18.contains(ptBottomRight) && !box19.contains(ptBottomRight) && !box20.contains(ptBottomRight)
						&& !box21.contains(ptBottomRight) && !box22.contains(ptBottomRight) && !box23.contains(ptBottomRight) && !box24.contains(ptBottomRight) && !box25.contains(ptBottomRight)
						&& !box26.contains(ptBottomRight) && !box27.contains(ptBottomRight) && !box28.contains(ptBottomRight) && character.x != Main.width - 500)
				{
					character.x +=1;
				}

				if(left == true && !box16.contains(ptBottomLeft) && !box17.contains(ptBottomLeft) && !box18.contains(ptBottomLeft) && !box19.contains(ptBottomLeft) && !box20.contains(ptBottomLeft)
						&& !box21.contains(ptBottomLeft) && !box22.contains(ptBottomLeft) && !box23.contains(ptBottomLeft) && !box24.contains(ptBottomLeft) && !box25.contains(ptBottomLeft) 
						&& !box26.contains(ptBottomLeft) && !box27.contains(ptBottomLeft) && character.x != 0)
				{
					character.x -=1;
				}

				if(jumping == true)
				{
					character.y--;
				}

				// Make the screen scroll
				if(right == true && !box16.contains(ptBottomRight) && !box17.contains(ptBottomRight) && !box18.contains(ptBottomRight) && !box19.contains(ptBottomRight) && !box20.contains(ptBottomRight)
						&& !box21.contains(ptBottomRight) && !box22.contains(ptBottomRight) && !box23.contains(ptBottomRight) && !box24.contains(ptBottomRight) && !box25.contains(ptBottomRight)
						&& !box26.contains(ptBottomRight) && !box27.contains(ptBottomRight) && !box28.contains(ptBottomRight) && character.x == Main.width - 500)
				{
					box14.x -= 1;
					box15.x -= 1;
					box16.x -= 1;
					box17.x -= 1;
					box18.x -= 1;
					box19.x -= 1;
					box20.x -= 1;
					box21.x -= 1;
					box22.x -= 1;
					box23.x -= 1;
					box24.x -= 1;
					box25.x -= 1;
					box26.x -= 1;
					box27.x -= 1;
					box28.x -= 1;
					castleBox6.x -= 1;
					castleBox7.x -= 1;
					castleBox8.x -= 1;
					castleBox9.x -= 1;
					castleBox10.x -= 1;
					flagBox3.x -= 1;
					flagBox4.xpoints[0] -= 1;
					flagBox4.xpoints[1] -= 1;
					flagBox4.xpoints[2] -= 1;
					endBox2.x -= 1;
					setPoint.x -= 1;
				}
				
				if(endBox2.contains(ptTopLeft) && flagBox4.ypoints[0] > 520)
				{
					right = false;
					left = false;
					keyboard = false;
					flagRaised = true;
				}

				if(flagBox4.ypoints[0] <= 520)
				{
					flagRaised = false;
				}

				if(flagRaised == true)
				{
					flagBox4.ypoints[0]--;
					flagBox4.ypoints[1]--;
					flagBox4.ypoints[2]--;
				}
				
				if(reset == true)
				{
					character.x = 180;
					character.y = 800;
					box14.x = 0;
					box15.x = 500;
					box16.x = 1000;
					box17.x = 1050;
					box18.x = 1100;
					box19.x = 1500;
					box20.x = 1500;
					box21.x = 1500;
					box22.x = 1500;
					box23.x = 2200;
					box24.x = 2500;
					box25.x = 2800;
					box26.x = 3100;
					box27.x = 3400;
					box28.x = 3700;
					castleBox6.x = 4050;
					castleBox7.x = 4050;
					castleBox8.x = 4150;
					castleBox9.x = 4250;
					castleBox10.x = 4350;
					flagBox3.x = 4215;
					flagBox4.xpoints[0] = 4235;
					flagBox4.xpoints[1] = 4235;
					flagBox4.xpoints[2] = 4300;
					flagBox4.ypoints[0] = 800;
					flagBox4.ypoints[1] = 850;
					flagBox4.ypoints[2] = 825;
					endBox2.x = 4175;
					setPoint.x = 0;
					reset = false;
				}
			}

			// Below handles character animation
			if(!right && !left && !jumping)
			{
				g.drawImage(Main.f.i.stand, character.x, character.y, charW, charH, null);

			}

			if(right == true && !jumping)
			{
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("S");
				String s = sdf.format(cal.getTime());
				int out = Integer.valueOf(s);
				//System.out.println(out);

				if(out <= 166 || out > 500 && out <= 666)
				{
					g.drawImage(Main.f.i.walk1, character.x, character.y, charW, charH, null);
				}

				if(out > 166 && out <= 333 || out > 666 && out <= 832)
				{
					g.drawImage(Main.f.i.walk2, character.x, character.y, charW, charH, null);
				}

				if(out > 333 && out <= 500 || out > 832 && out <= 1000)
				{
					g.drawImage(Main.f.i.walk3, character.x, character.y, charW, charH, null);
				}
			}

			if(left == true && !jumping)
			{
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("S");
				String s = sdf.format(cal.getTime());
				int out = Integer.valueOf(s);

				if(out <= 166 || out > 500 && out <= 666)
				{
					g.drawImage(Main.f.i.walk1Mirror, character.x, character.y, charW, charH, null);
				}

				if(out > 166 && out <= 333 || out > 666 && out <= 832)
				{
					g.drawImage(Main.f.i.walk2Mirror, character.x, character.y, charW, charH, null);
				}

				if(out > 333 && out <= 500 || out > 832 && out <= 1000)
				{
					g.drawImage(Main.f.i.walk3Mirror, character.x, character.y, charW, charH, null);
				}
			}

			if(jumping == true && !left)
			{
				g.drawImage(Main.f.i.jump, character.x, character.y, charW, charH, null);
			}

			if(jumping == true && left)
			{
				g.drawImage(Main.f.i.jumpMirror, character.x, character.y, charW, charH, null);
			}

			if(ptTopLeft.y > Main.height)
			{
				gameOver = true;
			}
			repaint();
		}
	}

	// Class for handling the jumping
	public class jumpThread implements Runnable
	{
		@Override
		public void run() 
		{
			try
			{
				Thread.sleep(jumpingTime);
				jumping = false;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				new Thread(this).start();
				System.exit(0);
			}
		}
	}
}