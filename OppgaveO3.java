import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String args[]) {
	    
	   Scanner in = new Scanner(System.in);
	   
	   System.out.println("Skriv et heltall: ");
	   int n = in.nextInt();
	   
	   if(n<0){
	       System.out.println("Tallet kan ikke være negativt");
	   }
	   else{
	       long sum = 1;
	       for(int i = 1; i<=n; i++){
	           sum *= i;
	       }
	       System.out.println(n+"!" + " = "+sum);
	       in.close();
	   }
	    
	}
}