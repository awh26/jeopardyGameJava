/*
 * Alex Hanna
 * Comp Sci Jeopardy Project
 * Due 6/12/19
 * Note - This is my version of Jeopardy which allows for the players to click on each square on the game board and then it reveals a clue.  The correct responses are on the other frame.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jeopardyOption {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jeopardyframe = new JFrame("This is Jeopardy!");
		jeopardyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeopardyframe.setSize(1200,800);
		Container jeopane = jeopardyframe.getContentPane();
		jeopane.setLayout(new GridLayout(6,4));
		
		JFrame correctresponseframe = new JFrame("Correct responses");
		correctresponseframe.setSize(600,600);
		correctresponseframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container correctresponsepane = correctresponseframe.getContentPane();
		correctresponsepane.setLayout(new GridLayout(6,4));
		
		JOptionPane.showMessageDialog(null,  "Now entering the studio are today's contestants. Team 1, Team 2, and Team 3. \n These three contestants will compete today on… Jeopardy! And now here is the host of Jeopardy!, Mr. Alex Trebek!");
		JOptionPane.showMessageDialog(null,  "I am your host, Alex Trebek");
		
		// ---------------------------------------------------------
			
		//automatic clues
		String category1 = "PLAY BALL!";
		String category2 = "RECONSTRUCTION ERA";
		String category3 = "AIRPORT CODES";
		String category4 = "RANKS AND TITLES";
		String c1clue200 = "His 1927 Salary with the Yankees was $70,000 "
				+ "or $1,166.67 per homer"; //Babe Ruth
		String c2clue200 = "In 1870 this \"Goober State\" became the last to be "
				+ "permanently readmitted to the Union"; //Georgia
		String c3clue200 = "Ronald Reagan Washington national airport has the "
				+ "code DCA but is located in this state"; //Virginia
		String c4clue200 = "Title of both Judy Sheindlin & her husband Jerry"; //Judge
		String c1clue400 = "Say Hey! Say What? In 1965 he hit 52 homers and won "
				+ "his ninth straight gold glove -- & made $105,000"; //Willie mays
		String c2clue400 = "This term was coined to refer to Northern Whites who "
				+ "went south seeking opportunities"; //Carpetbangers
		String c3clue400 = "In 1966 London Airport was renamed this with uses "
				+ "the code LHR"; //Heathrow
		String c4clue400 = "A vicerein is the wife of one of these officials"; //Viceroy
		String c1clue600 = "This player nicknamed \"Big Papi\" pulls down "
				+ "$12.5 million with the Red Sox"; //David Ortiz
		String c2clue600 = "This man's impeachment trial brought senate president "
				+ "pro tem Ben Wade within 1 vote of being US President"; //Johnson
		String c3clue600 = "Australia's busiest airport goes by this \nthree letter code"; //SYD (Sydney)
		String c4clue600 = "Deposed in 1797, Ludovico Manin was the last of these "
				+ "chief magistrates to rule Venice"; //doges
		String c1clue800 = "In 1979 this no-hit king became the first major "
				+ "leaguer with a guaranteed $1 million salary"; //Nolan Ryan
		String c2clue800 = "In 1868 this amendment gave African Americans "
				+ "full citizenship"; //14th
		String c3clue800 = "From the intitials of the man it's named for, the larger "
				+ "of Paris' 2 airports has this 3-letter code"; //CDG Charles De Gaulle
		String c4clue800 = "In \"The Mikado\" this grand fellow was the "
				+ "\"Lord high everything else\""; //the pooh-bah
		String c1clue1000 = "After hitting .350 in 1907, this "
				+ "Pittsburgh Pirates Shortstop's "
				+ "his salary doubled for 1908 -- to a whopping $10,000"; //Honus Wagner
		String c2clue1000 = "Charles Sumner & Thaddeus Stevens were leaders of "
				+ "this \"Extreme Republican Group\""; //Radical Republicans
		String c3clue1000 = "Jorge Chavez international airport has the 3-letter "
				+ "code LIM & is in this country"; //Peru
		String c4clue1000 = "An ataman was the leader of a village of these "
				+ "horsemen who gave a tolstoy novel its title"; //Cossacks
		
		
		//-----------------------------------------------------------
		
		String c1clue200answer = "Who is Babe Ruth?";
		String c2clue200answer = "What is Georgia?";
		String c3clue200answer = "What is Virginia?";
		String c4clue200answer = "What is a Judge?";
		String c1clue400answer = "Who is Willie mays?";
		String c2clue400answer = "What is a Carpetbanger?";
		String c3clue400answer = "What is Heathrow?";
		String c4clue400answer = "What is a Viceroy?";
		String c1clue600answer = "Who is David Ortiz?";
		String c2clue600answer = "WHo is Johnson?";
		String c3clue600answer = "What is SYD (Sydney)?";
		String c4clue600answer = "What are the doges?";
		String c1clue800answer = "WHo is Nolan Ryan?";
		String c2clue800answer = "What is the 14th amendment?";
		String c3clue800answer = "What is CDG (Charles De Gaulle)?";
		String c4clue800answer = "What is the pooh-bah?";
		String c1clue1000answer = "Who is Honus Wagner?";
		String c2clue1000answer = "Who were the Radical Republicans?";
		String c3clue1000answer = "What is Peru?";
		String c4clue1000answer = "What were the Cossacks?";
		
		//----------------------------------------------------------
		
		JButton cate1 = new JButton(category1);
	    cate1.setFont(new Font("Times New Roman",1,24));
	    cate1.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate1.setBackground(Color.BLUE);
		jeopane.add(cate1);

	    JButton cate2 = new JButton(category2);
	    cate2.setFont(new Font("Times New Roman",1,24));
	    cate2.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate2.setBackground(Color.BLUE);
		jeopane.add(cate2);
		

	    JButton cate3 = new JButton(category3);
	    cate3.setFont(new Font("Times New Roman",1,24));
	    cate3.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate3.setBackground(Color.BLUE);
		jeopane.add(cate3);
	    
	    JButton cate4 = new JButton(category4);
	    cate4.setFont(new Font("Times New Roman",1,24));
	    cate4.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate4.setBackground(Color.BLUE);
		jeopane.add(cate4);
		
		JButton cate10 = new JButton(category1);
	    cate10.setFont(new Font("Times New Roman",1,24));
	    cate10.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate10.setBackground(Color.BLUE);

	    JButton cate20 = new JButton(category2);
	    cate20.setFont(new Font("Times New Roman",1,24));
	    cate20.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate20.setBackground(Color.BLUE);		

	    JButton cate30 = new JButton(category3);
	    cate30.setFont(new Font("Times New Roman",1,24));
	    cate30.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate30.setBackground(Color.BLUE);
	    
	    JButton cate40 = new JButton(category4);
	    cate40.setFont(new Font("Times New Roman",1,24));
	    cate40.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate40.setBackground(Color.BLUE);

		// ----------------------------------------------------
		
		correctresponsepane.add(cate10);
		correctresponsepane.add(cate20);
		correctresponsepane.add(cate30);
		correctresponsepane.add(cate40);
		
		JTextField c1cate200answer = new JTextField(c1clue200answer);
	    c1cate200answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c1cate200answer);
	    
	    JTextField c2cate200answer = new JTextField(c2clue200answer);
	    c2cate200answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c2cate200answer);

	    JTextField c3cate200answer = new JTextField(c3clue200answer);
	    c3cate200answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c3cate200answer);

	    JTextField c4cate200answer = new JTextField(c4clue200answer);
	    c4cate200answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c4cate200answer);

	    JTextField c1cate400answer = new JTextField(c1clue400answer);
	    c1cate400answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c1cate400answer);

	    JTextField c2cate400answer = new JTextField(c2clue400answer);
	    c2cate400answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c2cate400answer);

	    JTextField c3cate400answer = new JTextField(c3clue400answer);
	    c3cate400answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c3cate400answer);

	    JTextField c4cate400answer = new JTextField(c4clue400answer);
	    c4cate400answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c4cate400answer);

	    JTextField c1cate600answer = new JTextField(c1clue600answer);
	    c1cate600answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c1cate600answer);
		
		JTextField c2cate600answer = new JTextField(c2clue600answer);
	    c2cate600answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c2cate600answer);
		
		JTextField c3cate600answer = new JTextField(c3clue600answer);
	    c3cate600answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c3cate600answer);
		
		JTextField c4cate600answer = new JTextField(c4clue600answer);
	    c4cate600answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c4cate600answer);

	    JTextField c1cate800answer = new JTextField(c1clue800answer);
	    c1cate800answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c1cate800answer);

	    JTextField c2cate800answer = new JTextField(c2clue800answer);
	    c2cate800answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c2cate800answer);

	    JTextField c3cate800answer = new JTextField(c3clue800answer);
	    c3cate800answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c3cate800answer);

	    JTextField c4cate800answer = new JTextField(c4clue800answer);
	    c4cate800answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c4cate800answer);

	    JTextField c1cate1000answer = new JTextField(c1clue1000answer);
	    c1cate1000answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c1cate1000answer);

	    JTextField c2cate1000answer = new JTextField(c2clue1000answer);
	    c2cate1000answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c2cate1000answer);

	    JTextField c3cate1000answer = new JTextField(c3clue1000answer);
	    c3cate1000answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c3cate1000answer);

	    JTextField c4cate1000answer = new JTextField(c4clue1000answer);
	    c4cate1000answer.setFont(new Font("Times New Roman",1,12));
		correctresponsepane.add(c4cate1000answer);

		// --------------------------------------------------------------
		
		JButton cate1200 = new JButton("200");
	    cate1200.setFont(new Font("Times New Roman",1,12));
	    cate1200.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate1200.setBackground(Color.BLUE);
		jeopane.add(cate1200);
		
		cate1200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate1200.setText(c1clue200);}
		});
		
		JButton cate2200 = new JButton("200");
	    cate2200.setFont(new Font("Times New Roman",1,12));
	    cate2200.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate2200.setBackground(Color.BLUE);
		jeopane.add(cate2200);
		
		cate2200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate2200.setText(c2clue200);}
		});

		JButton cate3200 = new JButton("200");
	    cate3200.setFont(new Font("Times New Roman",1,12));
	    cate3200.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate3200.setBackground(Color.BLUE);
		jeopane.add(cate3200);
		
		cate3200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate3200.setText(c3clue200);}
		});

		JButton cate4200 = new JButton("200");
	    cate4200.setFont(new Font("Times New Roman",1,12));
	    cate4200.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate4200.setBackground(Color.BLUE);
		jeopane.add(cate4200);
		
		cate4200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate4200.setText(c4clue200);}
		});
		
		JButton cate1400 = new JButton("400");
	    cate1400.setFont(new Font("Times New Roman",1,12));
	    cate1400.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate1400.setBackground(Color.BLUE);
		jeopane.add(cate1400);
		
		cate1400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate1400.setText(c1clue400);}
		});
		
		JButton cate2400 = new JButton("400");
	    cate2400.setFont(new Font("Times New Roman",1,12));
	    cate2400.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate2400.setBackground(Color.BLUE);
		jeopane.add(cate2400);
		
		cate2400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate2400.setText(c2clue400);}
		});
		
		JButton cate3400 = new JButton("400");
	    cate3400.setFont(new Font("Times New Roman",1,12));
	    cate3400.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate3400.setBackground(Color.BLUE);
		jeopane.add(cate3400);
		
		cate3400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate3400.setText(c3clue400);}
		});
		
		JButton cate4400 = new JButton("400");
	    cate4400.setFont(new Font("Times New Roman",1,12));
	    cate4400.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate4400.setBackground(Color.BLUE);
		jeopane.add(cate4400);
		
		cate4400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate4400.setText(c4clue400);}
		});
		
		JButton cate1600 = new JButton("600");
	    cate1600.setFont(new Font("Times New Roman",1,12));
	    cate1600.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate1600.setBackground(Color.BLUE);
		jeopane.add(cate1600);
		
		cate1600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate1600.setText(c1clue600);}
		});
		
		JButton cate2600 = new JButton("600");
	    cate2600.setFont(new Font("Times New Roman",1,12));
	    cate2600.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate2600.setBackground(Color.BLUE);
		jeopane.add(cate2600);
		
		cate2600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate2600.setText(c2clue600);}
		});
		
		JButton cate3600 = new JButton("600");
	    cate3600.setFont(new Font("Times New Roman",1,12));
	    cate3600.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate3600.setBackground(Color.BLUE);
		jeopane.add(cate3600);
		
		cate3600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate3600.setText(c3clue600);}
		});

		JButton cate4600 = new JButton("600");
	    cate4600.setFont(new Font("Times New Roman",1,12));
	    cate4600.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate4600.setBackground(Color.BLUE);
		jeopane.add(cate4600);
		
		cate4600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate4600.setText(c4clue600);}
		});
		
		JButton cate1800 = new JButton("800");
	    cate1800.setFont(new Font("Times New Roman",1,12));
	    cate1800.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate1800.setBackground(Color.BLUE);
		jeopane.add(cate1800);
		
		cate1800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate1800.setText(c1clue800);}
		});
		
		JButton cate2800 = new JButton("800");
	    cate2800.setFont(new Font("Times New Roman",1,12));
	    cate2800.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate2800.setBackground(Color.BLUE);
		jeopane.add(cate2800);
		
		cate2800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate2800.setText(c2clue800);}
		});

		JButton cate3800 = new JButton("800");
	    cate3800.setFont(new Font("Times New Roman",1,12));
	    cate3800.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate3800.setBackground(Color.BLUE);
		jeopane.add(cate3800);

		cate3800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate3800.setText(c3clue800);}
		});
		
		JButton cate4800 = new JButton("800");
	    cate4800.setFont(new Font("Times New Roman",1,12));
	    cate4800.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate4800.setBackground(Color.BLUE);
		jeopane.add(cate4800);
		
		cate4800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate4800.setText(c4clue800);}
		});
		
		JButton cate11000 = new JButton("1000");
	    cate11000.setFont(new Font("Times New Roman",1,12));
	    cate11000.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate11000.setBackground(Color.BLUE);
		jeopane.add(cate11000);
		
		cate11000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate11000.setText(c1clue1000);}
		});
		
		JButton cate21000 = new JButton("1000");
	    cate21000.setFont(new Font("Times New Roman",1,12));
	    cate21000.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate21000.setBackground(Color.BLUE);
		jeopane.add(cate21000);
		
		cate21000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate21000.setText(c2clue1000);}
		});
		
		JButton cate31000 = new JButton("1000");
	    cate31000.setFont(new Font("Times New Roman",1,12));
	    cate31000.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate31000.setBackground(Color.BLUE);
		jeopane.add(cate31000);
		
		cate31000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate31000.setText(c3clue1000);}
		});
		
		JButton cate41000 = new JButton("1000");
	    cate41000.setFont(new Font("Times New Roman",1,12));
	    cate41000.setBorder(new javax.swing.border.LineBorder(Color.WHITE));
		cate41000.setBackground(Color.BLUE);
		jeopane.add(cate41000);
		
		cate41000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				cate41000.setText(c4clue1000);}
		});
		jeopardyframe.setVisible(true);
		correctresponseframe.setVisible(true);

	}
}