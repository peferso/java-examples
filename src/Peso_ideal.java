import javax.swing.*; // for joption panel objects
public class Peso_ideal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do{
			
			genero=JOptionPane.showInputDialog("Enter your gender (H/M)");
			
		}while( genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false );
		
	}

}
