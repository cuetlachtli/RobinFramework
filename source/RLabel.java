package RobinFramework;
import java.awt.Font;
import javax.swing.JLabel;

//Robin Labels: developed by Fernando López Rubio & Fredele Sentíes Lozano
//November 2014

public class RLabel extends JLabel {
	protected String fontDefault="Arial";
	protected final int h1 = 40,
				  	h2 = 30,
				  	h3 = 20,
				  	p = 10;

	public RLabel(String cont,String type){
		super(cont);
		if(type.equals("h1")){
			this.setFont(new Font(fontDefault,Font.BOLD,40));
		}
		else if(type.equals("h2")){
			this.setFont(new Font(fontDefault,Font.BOLD,30));
		}
		else if(type.equals("h3")){
			this.setFont(new Font(fontDefault,Font.BOLD,20));
		}
		else if(type.equals("p")){
			this.setFont(new Font(fontDefault,Font.PLAIN,10));
		}
	}
	
	public RLabel(String cont,String type, String font){
		super(cont);
		if(type.equals("h1")){
			this.setFont(new Font(font,Font.BOLD,h1));
		}
		else if(type.equals("h2")){
			this.setFont(new Font(font,Font.BOLD,h2));
		}
		else if(type.equals("h2")){
			this.setFont(new Font(font,Font.BOLD,h3));
		}
		else if(type.equals("p")){
			this.setFont(new Font(font,Font.PLAIN,p));
		}
		
	}

	public RLabel(String cont,String type,String font , int Multiplier){
		super(cont);
		if(type.equals("h1")){
			this.setFont(new Font(font,Font.BOLD,h1*Multiplier));
		}
		else if(type.equals("h2")){
			this.setFont(new Font(font,Font.BOLD,h2*Multiplier));
		}
		else if(type.equals("h2")){
			this.setFont(new Font(font,Font.BOLD,h3*Multiplier));
		}
		else if(type.equals("p")){
			this.setFont(new Font(font,Font.PLAIN,p*Multiplier));
		}
	}
}
