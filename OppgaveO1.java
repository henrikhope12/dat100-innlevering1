import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.print("Oppgi bruttoinntekt i kroner: ");
		double inntekt = in.nextDouble();
		double skatt = 0;
		
		double startinn1 = 217401;
		double sluttinn1 = 306050;
		double sats1 = 0.017;
		
		double startinn2 = 306051;
		double sluttinn2 = 697150;
		double sats2 = 0.04;
		
		double startinn3 = 697151;
		double sluttinn3 = 942400;
		double sats3 = 0.137;
		
		double startinn4 = 942401;
		double sluttinn4 = 1410750;
		double sats4 = 0.167;
		
		double startinn5 = 1410751;
		double sats5 = 0.177;
		
		if(inntekt>startinn1){
		    double total = Math.min(inntekt, sluttinn1) - startinn1;
		    skatt += total * sats1;
		}
		
		if(inntekt>startinn2){
		    double total = Math.min(inntekt, sluttinn2) - startinn2;
		    skatt += total * sats2;
		}
		
		if(inntekt>startinn3){
		    double total = Math.min(inntekt, sluttinn3) - startinn3;
		    skatt += total * sats3;
		}
		
		if(inntekt>startinn4){
		    double total = Math.min(inntekt, sluttinn4) - startinn4;
		    skatt += total * sats4;
		}
		
		if(inntekt>startinn5){
		    double total = inntekt - startinn5;
		    skatt += total * sats5;
		}
		
		
	System.out.println("Total trinnskatt å betale: "+ skatt + " kr");
		
		in.close();
		
	}
    
}