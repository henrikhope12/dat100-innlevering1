import java.util.Scanner;

public class OppgaveO2 {

	public static void main(String args[]) {
	    
	    Scanner in = new Scanner(System.in);
	    int poengsum;
	    
   for(int i = 0; i<10;i++){
	 
	  while(true){
	     System.out.print("Hvor mange poeng fikk du? ");
	     poengsum = in.nextInt();
	     if(poengsum>=0 && poengsum<=100){
	          break;
	     }
	     else{
	         System.out.println("Ugyldig poengsum, skriv et tall fra 0 til 100");
	     }
	  }
	     
	     if(poengsum>=0 && poengsum<=39){
	        System.out.println("Karakter: F");
	    }
	    else if(poengsum>=40 && poengsum<=49){
	        System.out.println("Karakter: E");
	    }
	    else if(poengsum>=50 && poengsum<59){
	        System.out.println("Karakter: D");
	    }
	    else if(poengsum>=60 && poengsum<=79){
	        System.out.println("Karakter: C");
	    }
	    else if(poengsum>=80 && poengsum<=89){
	        System.out.println("Karakter: B");
	    }
	    else if(poengsum>=90 && poengsum<=100){
	        System.out.println("Karakter: A");
	    }
	 }
     in.close();
	}
}