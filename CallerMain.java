package classOchMethodTesting;

import javax.swing.JOptionPane;

public class CallerMain {

	public static void main(String[] args) {
		MethodMan methodMan = new MethodMan();
		boolean loop = true;
		while(loop) {
			
			String in = JOptionPane.showInputDialog("Welcome to the Method Man quote supplier!\nChoose a quote nr from 1 to 10 or leave blank for a random quote:");
			
			if(in != null) {
				if(in.contentEquals("")) {
					methodMan.randomMethodMan();
				}
				
				else if (in.length()>0) {
					int i = Integer.parseInt(in);
					methodMan.selectedMethodMan(i);
				}
			
			}else {
				loop = false;
			}
		}
	}
}
