package classOchMethodTesting;

import javax.swing.JOptionPane;

public class MethodMan {
	String quote1 = "I have 15,000 comics in a warehouse, all bagged individually.",
			quote2 = "I smoke because I like to get high.",
			quote3 = "I wanna sit behind the scenes and see nothin' but the greens.",
			quote4 = "I'm a peaceful dude.",
			quote5 = "I'm in between homes right now, but my last house was dope.",
			quote6 = "No matter where you from, there's ghettos all over the place.",
			quote7 = "People know when you're frontin.",
			quote8 = "Rap is a gimmick, but I'm for the hip-hop, the culture.",
			quote9 = "Regardless of how me or this man right here or anybody else in this business get, when we walk on an airplane in first-class looking like this, we're gonna get searched.",
			quote10 = "Somebody wrote a script around us, but Dustin Abraham came with the best one.";
	public void randomMethodMan() {
		double random = Math.random()*10;
		float randomFloat = Math.round(random);
		int quoteNr = Math.round(randomFloat);
		switch (quoteNr) {
		case 1:
			JOptionPane.showMessageDialog(null, quote1);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, quote2);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, quote3);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, quote4);
			break;
		case 5:
			JOptionPane.showMessageDialog(null, quote5);
			break;
		case 6:
			JOptionPane.showMessageDialog(null, quote6);
			break;
		case 7:
			JOptionPane.showMessageDialog(null, quote7);
			break;
		case 8:
			JOptionPane.showMessageDialog(null, quote8);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, quote9);
			break;
		case 10:
			JOptionPane.showMessageDialog(null, quote10);
			break;
		}
	}
		public void selectedMethodMan(int quoteNr) {
			switch (quoteNr) {
			case 1:
				JOptionPane.showMessageDialog(null, quote1);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, quote2);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, quote3);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, quote4);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, quote5);
				break;
			case 6:
				JOptionPane.showMessageDialog(null, quote6);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, quote7);
				break;
			case 8:
				JOptionPane.showMessageDialog(null, quote8);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, quote9);
				break;
			case 10:
				JOptionPane.showMessageDialog(null, quote10);
				break;
			}
	}
}

