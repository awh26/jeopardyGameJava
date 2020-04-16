/* Alex Hanna
 * Comp Sci Jeopardy Project
 * Due 6/12/19 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class jeopardy {
	public static void main(String[] args) {
		
		JFrame jeopardyframe = new JFrame("This is Jeopardy!");
		jeopardyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeopardyframe.setSize(1200,800);

		JFrame teamscore = new JFrame("Team Scores");
		teamscore.setSize(600,600);
		
		Container pane = jeopardyframe.getContentPane();
		pane.setLayout(new GridLayout(6,4));
		
		// --------------------------------------------------------- SET UP + TEAM SCORES

		String team1name = JOptionPane.showInputDialog("What do you want as team 1's name?");
		String team2name = JOptionPane.showInputDialog("What do you want as team 2's name?");
		String team3name = JOptionPane.showInputDialog("What do you want as team 3's name?");
		
		JOptionPane.showMessageDialog(null,  "Now entering the studio are today's contestants. " + team1name + ", " + team2name + ", and " + team3name + ". \n These three contestants will compete today on… Jeopardy! And now here is the host of Jeopardy!, Mr. Alex Trebek!");
		JOptionPane.showMessageDialog(null,  "Alex Trebek: I am your host, Alex Trebek");
		JOptionPane.showMessageDialog(null,  "Alex Trebek: \nHere are the directions for this game of Jeopardy! \nA randomizer will chose the team who choses the first clue. \nEach response must be answered in the form of a question. \nWhichever team buzzes in first for their response can answer first, if they respond incorrectly, the other two teams can buzz in to respond. \nPress the \"+\" or \"-\" buttons to add or subtract points from each team's score. \nThe team which responded correctly has a choice of the next clue. If no teams respond correctly, the team who chose the previous clue can chose the next clue. \nHave fun!");
		
		double firstteam = (Math.random() * 9);
				
		if (firstteam >= 0 || firstteam < 3) {
			JOptionPane.showMessageDialog(null,  "Alex Trebek: The board is in your hands, " + team1name);
		} else if (firstteam >= 3 || firstteam < 6) {
			JOptionPane.showMessageDialog(null,  "Alex Trebek: The board is in your hands, " + team2name);
		} else {
			JOptionPane.showMessageDialog(null,  "Alex Trebek: The board is in your hands, " + team3name);
		}
		
		int[] teamscorearray = new int[] {0,0,0,0};

		Container teamscorecontain = teamscore.getContentPane();
		teamscorecontain.setLayout(new GridLayout(4, 3));
		
		Panel team1block = new Panel();
		team1block.setBackground(Color.BLUE);
		team1block.setPreferredSize(new Dimension(50,50));
		JLabel label1 = new JLabel(team1name + " score:");
		team1block.add(label1);
		teamscorecontain.add(team1block);
		
		Panel team2block = new Panel();
		team2block.setBackground(Color.BLUE);
		team2block.setPreferredSize(new Dimension(50,50));
		JLabel label2 = new JLabel(team2name + " score:");
		team2block.add(label2);
		teamscorecontain.add(team2block);
		
		Panel team3block = new Panel();
		team3block.setBackground(Color.BLUE);
		team3block.setPreferredSize(new Dimension(50,50));
		JLabel label3 = new JLabel(team3name + " score:");
		team3block.add(label3);
		teamscorecontain.add(team3block);
		
		Panel team1blockscore = new Panel();
		team1blockscore.setBackground(Color.BLUE);
		team1blockscore.setPreferredSize(new Dimension(50,50));
		JLabel label1score = new JLabel("" + teamscorearray[1]);
		team1blockscore.add(label1score);
		teamscorecontain.add(team1blockscore);
		
		Panel team2blockscore = new Panel();
		team2blockscore.setBackground(Color.BLUE);
		team2blockscore.setPreferredSize(new Dimension(50,50));
		JLabel label2score = new JLabel("" + teamscorearray[2]);
		team2blockscore.add(label2score);
		teamscorecontain.add(team2blockscore);
		
		Panel team3blockscore = new Panel();
		team3blockscore.setBackground(Color.BLUE);
		team3blockscore.setPreferredSize(new Dimension(50,50));
		JLabel label3score = new JLabel("" + teamscorearray[3]);
		team3blockscore.add(label3score);
		teamscorecontain.add(team3blockscore);
		
		JButton upteam1 = new JButton("+ 100 pts");
		upteam1.setFont(new Font("Times New Roman",1,12));
		upteam1.setBorder(new LineBorder(Color.WHITE));
		upteam1.setBackground(Color.BLUE);
		upteam1.setOpaque(true);
		teamscorecontain.add(upteam1);
		
		upteam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				teamscorearray[1] = teamscorearray[1] + 100;
				label1score.setText("" + Integer.toString(teamscorearray[1]));}
		});
		
		upteam1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	upteam1.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	upteam1.setBackground(Color.BLUE);
		    }
		});
		
		JButton upteam2 = new JButton("+ 100 pts");
		upteam2.setFont(new Font("Times New Roman",1,12));
		upteam2.setBorder(new LineBorder(Color.WHITE));
		upteam2.setBackground(Color.BLUE);
		upteam2.setOpaque(true);
		teamscorecontain.add(upteam2);
		
		upteam2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				teamscorearray[2] = teamscorearray[2] + 100;
				label2score.setText("" + Integer.toString(teamscorearray[2]));}
		});
		
		upteam2.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	upteam2.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	upteam2.setBackground(Color.BLUE);
		    }
		});
		
		JButton upteam3 = new JButton("+ 100 pts");
		upteam3.setFont(new Font("Times New Roman",1,12));
		upteam3.setBorder(new LineBorder(Color.WHITE));
		upteam3.setBackground(Color.BLUE);
		upteam3.setOpaque(true);
		teamscorecontain.add(upteam3);
		
		upteam3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				teamscorearray[3] = teamscorearray[3] + 100;
				label3score.setText("" + Integer.toString(teamscorearray[3]));}
		});
		
		upteam3.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	upteam3.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	upteam3.setBackground(Color.BLUE);
		    }
		});
		
		JButton downteam1 = new JButton("- 100 pts");
		downteam1.setFont(new Font("Times New Roman",1,12));
		downteam1.setBorder(new LineBorder(Color.WHITE));
		downteam1.setBackground(Color.BLUE);
		downteam1.setOpaque(true);
		teamscorecontain.add(downteam1);
		
		downteam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				teamscorearray[1] = teamscorearray[1] - 100;
				label1score.setText("" + Integer.toString(teamscorearray[1]));}
		});
		
		downteam1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	downteam1.setBackground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	downteam1.setBackground(Color.BLUE);
		    }
		});
		
		JButton downteam2 = new JButton("- 100 pts");
		downteam2.setFont(new Font("Times New Roman",1,12));
		downteam2.setBorder(new LineBorder(Color.WHITE));
		downteam2.setBackground(Color.BLUE);
		downteam2.setOpaque(true);
		teamscorecontain.add(downteam2);
		
		downteam2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				teamscorearray[2] = teamscorearray[2] - 100;
				label2score.setText("" + Integer.toString(teamscorearray[2]));}
		});
		
		downteam2.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	downteam2.setBackground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	downteam2.setBackground(Color.BLUE);
		    }
		});
		
		JButton downteam3 = new JButton("- 100 pts");
		downteam3.setFont(new Font("Times New Roman",1,12));
		downteam3.setBorder(new LineBorder(Color.WHITE));
		downteam3.setBackground(Color.BLUE);
		downteam3.setOpaque(true);
		teamscorecontain.add(downteam3);
		
		downteam3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
				teamscorearray[3] = teamscorearray[3] - 100;
				label3score.setText("" + Integer.toString(teamscorearray[3]));}
		});
		
		downteam3.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	downteam3.setBackground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	downteam3.setBackground(Color.BLUE);
		    }
		});
		
		teamscore.pack();
		
		// --------------------------------------------------------- CLUE SETUP (CUSTOM BOARD)
		
		String category1;
		String category2;
		String category3;
		String category4;
		String c1clue200;
		String c2clue200;
		String c3clue200;
		String c4clue200;
		String c1clue400;
		String c2clue400;
		String c3clue400;
		String c4clue400;
		String c1clue600;
		String c2clue600;
		String c3clue600;
		String c4clue600;
		String c1clue800;
		String c2clue800;
		String c3clue800;
		String c4clue800;
		String c1clue1000;
		String c2clue1000;
		String c3clue1000;
		String c4clue1000;
		
		int customboard = JOptionPane.showConfirmDialog(null, "Do you want to use a custom board?");
		//0=yes, 1=no
		
		if(customboard == 0) {
			JOptionPane.showMessageDialog(null,  "Type your clues and categories into each spot on the board.");

			JFrame customizeframe = new JFrame("Customize your jeopardy frame");
			customizeframe.setSize(600,600);
			Container custompane = customizeframe.getContentPane();
			custompane.setLayout(new GridLayout(6,4));
			
			JTextField cate1input = new JTextField("Category 1");
		    cate1input.setFont(new Font("Times New Roman",1,20));
		    custompane.add(cate1input);
		    category1 = cate1input.getText();
		    
		    JTextField cate2input = new JTextField("Category 2");
		    cate2input.setFont(new Font("Times New Roman",1,20));
		    custompane.add(cate2input);
		    category2 = cate2input.getText();
		    
		    JTextField cate3input = new JTextField("Category 3");
		    cate3input.setFont(new Font("Times New Roman",1,20));
		    custompane.add(cate3input);
		    category3 = cate3input.getText();
		    
		    JTextField cate4input = new JTextField("Category 4");
		    cate4input.setFont(new Font("Times New Roman",1,20));
		    custompane.add(cate4input);
		    category4 = cate4input.getText();
		    
		    JTextField c1cate200input = new JTextField("200");
		    c1cate200input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c1cate200input);
		    c1clue200 = c1cate200input.getText();
		    
		    JTextField c2cate200input = new JTextField("200");
		    c2cate200input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c2cate200input);
		    c2clue200 = c2cate200input.getText();
		    
		    JTextField c3cate200input = new JTextField("200");
		    c3cate200input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c3cate200input);
		    c3clue200 = c3cate200input.getText();
		    
		    JTextField c4cate200input = new JTextField("200");
		    c4cate200input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c4cate200input);
		    c4clue200 = c4cate200input.getText();
		    
		    JTextField c1cate400input = new JTextField("400");
		    c1cate400input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c1cate400input);
		    c1clue400 = c1cate400input.getText();
		    
		    JTextField c2cate400input = new JTextField("400");
		    c2cate400input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c2cate400input);
		    c2clue400 = c2cate400input.getText();
		    
		    JTextField c3cate400input = new JTextField("400");
		    c3cate400input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c3cate400input);
		    c3clue400 = c3cate400input.getText();
		    
		    JTextField c4cate400input = new JTextField("400");
		    c4cate400input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c4cate400input);
		    c4clue400 = c4cate400input.getText();
		    
		    JTextField c1cate600input = new JTextField("600");
		    c1cate600input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c1cate600input);
		    c1clue600 = c1cate600input.getText();
		    
		    JTextField c2cate600input = new JTextField("600");
		    c2cate600input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c2cate600input);
		    c2clue600 = c2cate600input.getText();
		    
		    JTextField c3cate600input = new JTextField("600");
		    c3cate600input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c3cate600input);
		    c3clue600 = c3cate600input.getText();
		    
		    JTextField c4cate600input = new JTextField("600");
		    c4cate600input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c4cate600input);
		    c4clue600 = c4cate600input.getText();
		    
		    JTextField c1cate800input = new JTextField("800");
		    c1cate800input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c1cate800input);
		    c1clue800 = c1cate800input.getText();
		    
		    JTextField c2cate800input = new JTextField("800");
		    c2cate800input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c2cate800input);
		    c2clue800 = c2cate800input.getText();
		    
		    JTextField c3cate800input = new JTextField("800");
		    c3cate800input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c3cate800input);
		    c3clue800 = c3cate800input.getText();
		    
		    JTextField c4cate800input = new JTextField("800");
		    c4cate800input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c4cate800input);
		    c4clue800 = c4cate800input.getText();
		    
		    JTextField c1cate1000input = new JTextField("1000");
		    c1cate1000input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c1cate1000input);
		    c1clue1000 = c1cate1000input.getText();
		    
		    JTextField c2cate1000input = new JTextField("1000");
		    c2cate1000input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c2cate1000input);
		    c2clue1000 = c2cate1000input.getText();
		    
		    JTextField c3cate1000input = new JTextField("1000");
		    c3cate1000input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c3cate1000input);
		    c3clue1000 = c3cate1000input.getText();
		    
		    JTextField c4cate1000input = new JTextField("1000");
		    c4cate1000input.setFont(new Font("Times New Roman",1,12));
		    custompane.add(c4cate1000input);
		    c4clue1000 = c4cate1000input.getText();
			customizeframe.setVisible(true);
			
		} else {
			//automatic clues
			category1 = "PLAY BALL!";
			category2 = "RECONSTRUCTION ERA";
			category3 = "AIRPORT CODES";
			category4 = "RANKS AND TITLES";
			c1clue200 = "His 1927 Salary with the Yankees was $70,000 or $1,166.67 per homer"; //babe ruth
			c2clue200 = "In 1870 this \"Goober State\" became the last to be permanently readmitted to the Union"; //Georgia
			c3clue200 = "Ronald Reagan Washington national airport has the code DCA but is located in this state"; //Virginia
			c4clue200 = "Title of both Judy Sheindlin & her husband Jerry"; //Judge
			c1clue400 = "Say Hey! Say What? In 1965 he hit 52 homers and won his ninth straight gold glove -- & made $105,000"; //willie mays
			c2clue400 = "This term was coined to refer to Northern Whites who went south seeking opportunities"; //Carpetbangers
			c3clue400 = "In 1966 London Airport was renamed this with uses the code LHR"; //Heathrow
			c4clue400 = "A vicerein is the wife of one of these officials"; //Viceroy
			c1clue600 = "This player nicknamed \"Big Papi\" pulls down $12.5 million with the Red Sox"; //david ortiz
			c2clue600 = "This man's impeachment trial brought senate president pro tem Ben Wade within 1 vote of being US President"; //Johnson
			c3clue600 = "Australia's busiest airport goes by this three letter code"; //SYD (Sydney)
			c4clue600 = "Deposed in 1797, Ludovico Manin was the last of these chief magistrates to rule Venice"; //doges
			c1clue800 = "In 1979 this no-hit king became the first major leaguer with a guaranteed $1 million salary"; //nolan ryan
			c2clue800 = "In 1868 this amendment gave African Americans full citizenship"; //14th
			c3clue800 = "From the intitials of the man it's named for, the larger of Paris' 2 airports has this 3-letter code"; //CDG (Charles De Gaulle
			c4clue800 = "In \"The Mikado\" this grand fellow was the \"Lord high everything else\""; //the pooh-bah
			c1clue1000 = "After hitting .350 in 1907, this Pittsburgh Pirates Shortstop hot his salary doubled for 1908 -- to a whopping $10,000"; //Honus Wagner
			c2clue1000 = "Charles Sumner & Thaddeus Stevens were leaders of this \"Extreme Republican Group\""; //radical Republicans
			c3clue1000 = "Jorge Chavez international airport has the 3-letter code LIM & is in this country"; //Peru
			c4clue1000 = "An ataman was the leader of a village of these horsemen who gave a tolstoy novel its title"; //Cossacks
			
			
			JFrame correctresponseframe = new JFrame("Correct responses");
			correctresponseframe.setSize(600,600);
			Container correctresponsepane = correctresponseframe.getContentPane();
			correctresponsepane.setLayout(new GridLayout(6,4));
			
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
			
			JButton cate10 = new JButton(category1);
		    cate10.setFont(new Font("Times New Roman",1,24));
		    cate10.setBorder(new LineBorder(Color.WHITE));
			cate10.setBackground(Color.BLUE);

		    JButton cate20 = new JButton(category2);
		    cate20.setFont(new Font("Times New Roman",1,24));
		    cate20.setBorder(new LineBorder(Color.WHITE));
			cate20.setBackground(Color.BLUE);			

		    JButton cate30 = new JButton(category3);
		    cate30.setFont(new Font("Times New Roman",1,24));
		    cate30.setBorder(new LineBorder(Color.WHITE));
			cate30.setBackground(Color.BLUE);
		    
		    JButton cate40 = new JButton(category4);
		    cate40.setFont(new Font("Times New Roman",1,24));
		    cate40.setBorder(new LineBorder(Color.WHITE));
			cate40.setBackground(Color.BLUE);
			
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
			
			correctresponseframe.setVisible(true);

		}
		
		//----------------------------------------------------------- BOARD SETUP
		
		JButton cate1 = new JButton(category1);
	    cate1.setFont(new Font("Times New Roman",1,20));
	    cate1.setBorder(new LineBorder(Color.BLACK));
		cate1.setBackground(Color.BLUE);
		cate1.setOpaque(true);
		cate1.setForeground(Color.WHITE);
		pane.add(cate1);

	    JButton cate2 = new JButton(category2);
	    cate2.setFont(new Font("Times New Roman",1,20));
	    cate2.setBorder(new LineBorder(Color.BLACK));
		cate2.setBackground(Color.BLUE);
		cate2.setOpaque(true);
		cate2.setForeground(Color.WHITE);
		pane.add(cate2);

	    JButton cate3 = new JButton(category3);
	    cate3.setFont(new Font("Times New Roman",1,20));
	    cate3.setBorder(new LineBorder(Color.BLACK));
		cate3.setBackground(Color.BLUE);
		cate3.setOpaque(true);
		cate3.setForeground(Color.WHITE);
		pane.add(cate3);
	    
	    JButton cate4 = new JButton(category4);
	    cate4.setFont(new Font("Times New Roman",1,20));
	    cate4.setBorder(new LineBorder(Color.BLACK));
		cate4.setBackground(Color.BLUE);
		cate4.setOpaque(true);
		cate4.setForeground(Color.WHITE);
		pane.add(cate4);
		
		JButton cate1200 = new JButton("$200");
	    cate1200.setFont(new Font("Times New Roman",1,90));
	    cate1200.setBorder(new LineBorder(Color.BLACK));
		cate1200.setBackground(Color.BLUE);
		cate1200.setOpaque(true);
		cate1200.setForeground(Color.YELLOW);
		pane.add(cate1200);
		
		cate1200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate1200.setBorder(new LineBorder(Color.GRAY, 3));
			    cate1200.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c1clue200);}
		});
		
		cate1200.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate1200.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate1200.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate2200 = new JButton("$200");
	    cate2200.setFont(new Font("Times New Roman",1,90));
	    cate2200.setBorder(new LineBorder(Color.BLACK));
		cate2200.setBackground(Color.BLUE);
		cate2200.setOpaque(true);
		cate2200.setForeground(Color.YELLOW);
		pane.add(cate2200);
		
		cate1200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate2200.setBorder(new LineBorder(Color.GRAY, 3));
			    cate2200.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c2clue200);}
		});
		
		cate2200.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate2200.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate2200.setBackground(Color.BLUE);
		    }
		});

		JButton cate3200 = new JButton("$200");
	    cate3200.setFont(new Font("Times New Roman",1,90));
	    cate3200.setBorder(new LineBorder(Color.BLACK));
		cate3200.setBackground(Color.BLUE);
		cate3200.setOpaque(true);
		cate3200.setForeground(Color.YELLOW);
		pane.add(cate3200);
		
		cate3200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate3200.setBorder(new LineBorder(Color.GRAY, 3));
			    cate3200.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c3clue200);}
		});
		
		cate3200.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate3200.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate3200.setBackground(Color.BLUE);
		    }
		});

		JButton cate4200 = new JButton("$200");
	    cate4200.setFont(new Font("Times New Roman",1,90));
	    cate4200.setBorder(new LineBorder(Color.BLACK));
		cate4200.setBackground(Color.BLUE);
		cate4200.setOpaque(true);
		cate4200.setForeground(Color.YELLOW);
		pane.add(cate4200);
		
		cate4200.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate4200.setBorder(new LineBorder(Color.GRAY, 3));
			    cate4200.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c4clue200);}
		});
		
		cate4200.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate4200.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate4200.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate1400 = new JButton("$400");
	    cate1400.setFont(new Font("Times New Roman",1,90));
	    cate1400.setBorder(new LineBorder(Color.BLACK));
		cate1400.setBackground(Color.BLUE);
		cate1400.setOpaque(true);
		cate1400.setForeground(Color.YELLOW);
		pane.add(cate1400);
		
		cate1400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate1400.setBorder(new LineBorder(Color.GRAY, 3));
			    cate1400.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c1clue400);}
		});
		
		cate1400.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate1400.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate1400.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate2400 = new JButton("$400");
	    cate2400.setFont(new Font("Times New Roman",1,90));
	    cate2400.setBorder(new LineBorder(Color.BLACK));
		cate2400.setBackground(Color.BLUE);
		cate2400.setOpaque(true);
		cate2400.setForeground(Color.YELLOW);
		pane.add(cate2400);
		
		cate2400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate2400.setBorder(new LineBorder(Color.GRAY, 3));
			    cate2400.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c2clue400);}
		});
		
		cate2400.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate2400.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate2400.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate3400 = new JButton("$400");
	    cate3400.setFont(new Font("Times New Roman",1,90));
	    cate3400.setBorder(new LineBorder(Color.BLACK));
		cate3400.setBackground(Color.BLUE);
		cate3400.setOpaque(true);
		cate3400.setForeground(Color.YELLOW);
		pane.add(cate3400);
		
		cate3400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate3400.setBorder(new LineBorder(Color.GRAY, 3));
			    cate3400.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c3clue400);}
		});
		
		cate3400.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate3400.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate3400.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate4400 = new JButton("$400");
	    cate4400.setFont(new Font("Times New Roman",1,90));
	    cate4400.setBorder(new LineBorder(Color.BLACK));
		cate4400.setBackground(Color.BLUE);
		cate4400.setOpaque(true);
		cate4400.setForeground(Color.YELLOW);
		pane.add(cate4400);
		
		cate4400.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate4400.setBorder(new LineBorder(Color.GRAY, 3));
			    cate4400.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c4clue400);}
		});
		
		cate4400.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate4400.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate4400.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate1600 = new JButton("$600");
	    cate1600.setFont(new Font("Times New Roman",1,90));
	    cate1600.setBorder(new LineBorder(Color.BLACK));
		cate1600.setBackground(Color.BLUE);
		cate1600.setOpaque(true);
		cate1600.setForeground(Color.YELLOW);
		pane.add(cate1600);
		
		cate1600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate1600.setBorder(new LineBorder(Color.GRAY, 3));
			    cate1600.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c1clue600);}
		});
		
		cate1600.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate1600.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate1600.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate2600 = new JButton("$600");
	    cate2600.setFont(new Font("Times New Roman",1,90));
	    cate2600.setBorder(new LineBorder(Color.BLACK));
		cate2600.setBackground(Color.BLUE);
		cate2600.setOpaque(true);
		cate2600.setForeground(Color.YELLOW);
		pane.add(cate2600);
		
		cate2600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate2600.setBorder(new LineBorder(Color.GRAY, 3));
			    cate2600.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c2clue600);}
		});
		
		cate2600.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate2600.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate2600.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate3600 = new JButton("$600");
	    cate3600.setFont(new Font("Times New Roman",1,90));
	    cate3600.setBorder(new LineBorder(Color.BLACK));
		cate3600.setBackground(Color.BLUE);
		cate3600.setOpaque(true);
		cate3600.setForeground(Color.YELLOW);
		pane.add(cate3600);
		
		cate3600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate3600.setBorder(new LineBorder(Color.GRAY, 3));
			    cate3600.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c3clue600);}
		});
		
		cate3600.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate3600.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate3600.setBackground(Color.BLUE);
		    }
		});

		JButton cate4600 = new JButton("$600");
	    cate4600.setFont(new Font("Times New Roman",1,90));
	    cate4600.setBorder(new LineBorder(Color.BLACK));
		cate4600.setBackground(Color.BLUE);
		cate4600.setOpaque(true);
		cate4600.setForeground(Color.YELLOW);
		pane.add(cate4600);
		
		cate4600.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate4600.setBorder(new LineBorder(Color.GRAY, 3));
			    cate4600.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c4clue600);}
		});
		
		cate4600.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate4600.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate4600.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate1800 = new JButton("$800");
	    cate1800.setFont(new Font("Times New Roman",1,90));
	    cate1800.setBorder(new LineBorder(Color.BLACK));
		cate1800.setBackground(Color.BLUE);
		cate1800.setOpaque(true);
		cate1800.setForeground(Color.YELLOW);
		pane.add(cate1800);
		
		cate1800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate1800.setBorder(new LineBorder(Color.GRAY, 3));
			    cate1800.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c1clue800);}
		});
		
		cate1800.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate1800.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate1800.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate2800 = new JButton("$800");
	    cate2800.setFont(new Font("Times New Roman",1,90));
	    cate2800.setBorder(new LineBorder(Color.BLACK));
		cate2800.setBackground(Color.BLUE);
		cate2800.setOpaque(true);
		cate2800.setForeground(Color.YELLOW);
		pane.add(cate2800);
		
		cate2800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate2800.setBorder(new LineBorder(Color.GRAY, 3));
			    cate2800.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c2clue800);}
		});
		
		cate2800.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate2800.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate2800.setBackground(Color.BLUE);
		    }
		});

		JButton cate3800 = new JButton("$800");
	    cate3800.setFont(new Font("Times New Roman",1,90));
	    cate3800.setBorder(new LineBorder(Color.BLACK));
		cate3800.setBackground(Color.BLUE);
		cate3800.setOpaque(true);
		cate3800.setForeground(Color.YELLOW);
		pane.add(cate3800);

		cate3800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate3800.setBorder(new LineBorder(Color.GRAY, 3));
			    cate3800.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c3clue800);}
		});
		
		cate3800.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate3800.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate3800.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate4800 = new JButton("$800");
	    cate4800.setFont(new Font("Times New Roman",1,90));
	    cate4800.setBorder(new LineBorder(Color.BLACK));
		cate4800.setBackground(Color.BLUE);
		cate4800.setOpaque(true);
		cate4800.setForeground(Color.YELLOW);
		pane.add(cate4800);
		
		cate4800.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate4800.setBorder(new LineBorder(Color.GRAY, 3));
			    cate4800.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c4clue800);}
		});
		
		cate4800.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate4800.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate4800.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate11000 = new JButton("$1000");
	    cate11000.setFont(new Font("Times New Roman",1,80));
	    cate11000.setBorder(new LineBorder(Color.BLACK));
		cate11000.setBackground(Color.BLUE);
		cate11000.setOpaque(true);
		cate11000.setForeground(Color.YELLOW);
		pane.add(cate11000);
		
		cate11000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate11000.setBorder(new LineBorder(Color.GRAY, 3));
			    cate11000.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c1clue1000);}
		});
		
		cate11000.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate11000.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate11000.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate21000 = new JButton("$1000");
	    cate21000.setFont(new Font("Times New Roman",1,80));
	    cate21000.setBorder(new LineBorder(Color.BLACK));
		cate21000.setBackground(Color.BLUE);
		cate21000.setOpaque(true);
		cate21000.setForeground(Color.YELLOW);
		pane.add(cate21000);
		
		cate21000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate21000.setBorder(new LineBorder(Color.GRAY, 3));
			    cate21000.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c2clue1000);}
		});
		
		cate21000.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate21000.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate21000.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate31000 = new JButton("$1000");
	    cate31000.setFont(new Font("Times New Roman",1,80));
	    cate31000.setBorder(new LineBorder(Color.BLACK));
		cate31000.setBackground(Color.BLUE);
		cate31000.setOpaque(true);
		cate31000.setForeground(Color.YELLOW);
		pane.add(cate31000);
		
		cate31000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate31000.setBorder(new LineBorder(Color.GRAY, 3));
			    cate31000.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c3clue1000);}
		});
		
		cate31000.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate31000.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate31000.setBackground(Color.BLUE);
		    }
		});
		
		JButton cate41000 = new JButton("$1000");
	    cate41000.setFont(new Font("Times New Roman",1,80));
	    cate41000.setBorder(new LineBorder(Color.BLACK));
		cate41000.setBackground(Color.BLUE);
		cate41000.setOpaque(true);
		cate41000.setForeground(Color.YELLOW);
		pane.add(cate41000);
		
		cate41000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent someArg) {
			    cate41000.setBorder(new LineBorder(Color.GRAY, 3));
			    cate41000.setBackground(Color.GRAY);
				JOptionPane.showMessageDialog(null,  c4clue1000);}
		});
		
		cate41000.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        cate41000.setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        cate41000.setBackground(Color.BLUE);
		    }
		});
		
		jeopardyframe.setVisible(true);
		teamscore.setVisible(true);
	}
}