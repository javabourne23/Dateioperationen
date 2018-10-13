import java.io.File;
import java.io.IOException;

/* Genauigkeit double ; S. 63 u.a.
  * 
  *  	Double:		64bit: 11 bit Exponent, 52 bit Mantisse (Nachkomma)
  *  		+/-  1.M * 2^(E-1023)
  *  		-  10^(E 308)... - 10^(E-308)... 10^(E-308)... 10^(E 308)
  *  			Genauigkeit: 16 Dezimalkommastellen   (2^52 = 4503599627370496)		billion:12^12
  * 	
  * 		0,1 = 0,00011001100110011
  */
// import Prog1Tools.IOTools;

public class DoubleZahlen {

	// String[] eingabe = 
	public static void main(String[] args) {		// wie Eingabeparameter an andere Methoden übergeben
		// TODO Auto-generated method stub
	
		erzeugeDateien(args);
//		verwendeIOTools();
		berechnedouble();

	}
	/*		Eingabe u. Ausgabe
	 * 
	 * 		Input-/ Output-Stream (Byte)
	 * 		Writer/ Reader (Char)
	 * 	
	 */
	
	// erzeuge ein Verzeichnis u. 2 Dateien; Aufruf: Create some thing
	public static void erzeugeDateien(String[] args){
		
		File dir1 = new File(args[0]);
		File f1 = new File(args[0]+"/"+args[1]);
		File f2 = new File(args[0]+"/"+args[1]+".txt");

		try {
			dir1.mkdirs();
			f1.createNewFile();
			f2.createNewFile();
			
			System.out.println("das Verzeichnis " + dir1.getName() + " :");
			String[] dirList = dir1.list(null);
			
			for (String element: dirList){
				System.out.println(element);
			}

		} catch (IOException e){
			e.getStackTrace();
			
		} catch (Exception e){
			e.getStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	public static void verwendeIOTools(){
		int		i, j, k;
		double d;
		char c;
		boolean b;
		
//		i = IOTools.redInteger();
		
		
		
		
		
		
		
	}
	
	
	public static void berechnedouble (){
		
		double d1 = 1e1;		int i1 = 1;			 int i2 = 100;
		double d2 = 1e15;		double d3 = 1e17;
		double d4 = 1e30;		double d5=1e100;
		double ergebnis1 = d3+i1;
		
		double ergebnis2 = d1+d3;
		
		System.out.println(ergebnis2);
	}
	
	
}
