package parsers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssetsParser {
	public static List<DataParser> parseDataFile() {
		List<DataParser> result = new ArrayList<DataParser>();
		try {
			File f = new File("data/Persons.dat");
			Scanner scan = new Scanner(f);
			while(scan.hasNext()) {
				String line = scan.nextLine();
}
