import java.util.*;
public class Guess_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rnum = (int)(Math.random()*100);
		
		//System.out.println(rnum);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=rnum){
			
			intentos++;
			
			System.out.println("Enter a number, please");
			
			numero=entrada.nextInt();
			
			if(rnum<numero){
				
				System.out.println("You entered a number larger than the secret one.");
				
			}
			
			else if(rnum>numero){
				
				System.out.println("You entered a number smaller than the secret one.");
				
			}
			
		}
		System.out.println("Correct! (" + intentos + " attempts in total)");
		
	}

}
