package temperature_converter;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("I want to convert.");
		System.out.println("1.Celcius, 2. Fahrenheit, 3. Kelvin");
		System.out.println("Please use initial numbers.");
		int d1=k.nextInt();
		System.out.println("to");
		System.out.println("1.Celcius, 2. Fahrenheit, 3. Kelvin");
		System.out.println("Please use initial numbers.");
		int d2=k.nextInt();
		System.out.println("What is the temperature?");
		double cevap=0.00;
		int d11=k.nextInt();
		if(d1==1 & d2==2 ) {cevap=(d11*1.8)+32;}
		else if(d1==1 & d2==3 ) {cevap=d11+273.15;}
		else if(d1==2 & d2==1 ) {cevap= (d11-32)/1.8;}
		else if(d1==2 & d2==3 ) {cevap= (d11+459.67)*(5/9);}
		else if(d1==3& d2==1){cevap=d11-273.15;}
		else{cevap=d11*(5/9)-459.67;}
		System.out.println("The answer is ="+cevap);
		k.close();
		}
		}
		


