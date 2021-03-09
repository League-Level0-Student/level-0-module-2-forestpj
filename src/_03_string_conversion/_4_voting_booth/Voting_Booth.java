package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {

	public static  void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "how old are you?");
		
		int ageAsInt = Integer.parseInt(age);
		
		if(ageAsInt > 17) {
			
			JOptionPane.showInputDialog(null, "who should the next president be?");
			
		}
	
	    if(ageAsInt < 18 ) {
	    	
	    	JOptionPane.showMessageDialog(null, "nobody cares what you think");
	    	
	    }
		
		
		
		
		
		
	}
	
}

