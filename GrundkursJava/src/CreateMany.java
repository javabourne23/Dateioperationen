import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/*		Eingabe u. Ausgabe
 * 
 * 		Input-/ Output-Stream (Byte)
 * 		Writer/ Reader (Char)
 * 	
 * 		1) Erzeuge 1 Verzeichnis u. div. Dateien darin!
 * 
 * 		Wie Create, aber:
 * 		- erzeuge mehrere Dateien per Schleife mit durchnummerierten Namen
 * 		- Aufruf: CreateMany <Verzeichnis> <Datei> <AnzahlDateien>
 * 
 * 		2) verschiebe Dateien
 * 
 */		




public class CreateMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		erzeugeDateien(args);
//		verschiebeDateien()

	}	
		
  	public static void erzeugeDateien(String[] args){
//		final int anzahl = 5;
  						
		try {
			File[] filemany = new File[Integer.parseInt(args[2])];			// Integer.parseInt
			
			
			File dir = new File(args[0]);				// Verzeichnis-Objekt erzeugen
			for (int i=0; i<filemany.length; i++){				
				filemany[i] = new File(args[0]+"/"+args[1]+i);
				
			}
//			File dir1 = new File(args[0]);						// Dir-Objekt, Pfad = Name
//			File f1 = new File(args[0]+"/"+args[1]);			// Datei-Objekt, Pfad	erzeugen
//			File f2 = new File(args[0]+"/"+args[1]+".txt");
//
			if (dir.exists()){
				System.out.println("Datei oder Verzeichnis " + dir + " existiert bereits.");
				return;
			}
			
			
			dir.mkdir();				// erzeuge physisches Verzeichnis
			for (int i=0; i<filemany.length; i++){				
				filemany[i].createNewFile();		// erzeuge physische Dateien
			}
			
			System.out.println("das Verzeichnis " + dir.getName() + " :");
			String[] dirList = dir.list();			// Fehler: list(null)!
			
/*			for (String element: dirList){
				System.out.println(element);
			}
*/
			for (int i=0; i<dirList.length;i++){
				System.out.println(dirList[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Aufruf erfolgt über: java CreateMany <Verzeichnisname> <Dateiname>");
		} catch (Exception e){
			System.out.println(e);
		}
		
  	}
}
