package classOchMethodTesting;

import javax.swing.JOptionPane;

public class MethodMan {
	String[] quotes = {  "I have 15,000 comics in a warehouse, all bagged individually.",
			"I smoke because I like to get high.",
			"I wanna sit behind the scenes and see nothin' but the greens.",
			"I'm a peaceful dude.",
			"I'm in between homes right now, but my last house was dope.",
			"No matter where you from, there's ghettos all over the place.",
			"People know when you're frontin.",
			"Rap is a gimmick, but I'm for the hip-hop, the culture.",
			"Regardless of how me or this man right here or anybody else in this business get, when we walk on an airplane in first-class looking like this, we're gonna get searched.",
			"Somebody wrote a script around us, but Dustin Abraham came with the best one."};

	public void randomMethodMan() {
		int quoteNr =(int) (Math.random()*10);
		
		JOptionPane.showMessageDialog(null, quotes[quoteNr]);
			
		
	}
	public void selectedMethodMan(int quoteNr) {
			JOptionPane.showMessageDialog(null, quotes[quoteNr]);
	}
}

