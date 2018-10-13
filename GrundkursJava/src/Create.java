import java.io.File;
import java.io.IOException;

/*		Eingabe u. Ausgabe
 * 
 * 		Input-/ Output-Stream (Byte)
 * 		Writer/ Reader (Char)
 * 	
 */
// erzeuge ein Verzeichnis u. 2 Dateien; Aufruf: java Create some thing


public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File dir1 = new File(args[0]);						// Dir-Objekt, Pfad = Name
			File f1 = new File(args[0]+"/"+args[1]);			// Datei-Objekt, Pfad
			File f2 = new File(args[0]+"/"+args[1]+".txt");

			if (dir1.exists()){
				System.out.println("Datei oder Verzeichnis " + dir1 + " existiert bereits.");
				return;
			}
			
			
			dir1.mkdir();				// erzeuge physisches Verzeichnis
			f1.createNewFile();		
			f2.createNewFile();
			
			System.out.println("das Verzeichnis " + dir1.getName() + " :");
			String[] dirList = dir1.list(null);
			
			for (String element: dirList){
				System.out.println(element);
			}

		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Aufruf erfolgt über: java Create <Verzeichnisname> <Dateiname>");
		} catch (Exception e){
			System.out.println(e);
		}
		
	}	
		
//		public static void erzeugeDateien(String[] args){
			
}
