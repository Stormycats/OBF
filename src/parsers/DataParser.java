package parsers;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract public class DataParser {

	public static List<DataParser> parseDataFile() {
		List<DataParser> result = new ArrayList<DataParser>();
		try {
			File f = new File("data/Persons.dat");
			Scanner scan = new Scanner(f);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				if(!line.trim().isEmpty()) {
					DataParser e = null;
					String tokens[] = line.split(";");
					String id = tokens[1];
					String nameTokens[] = tokens[2].split(",");
					String lastName = nameTokens[0];
					String firstName = nameTokens[1];
					String title = tokens[3];
					double annualSalary = 0.0, hourlyPayRate = 0.0, hoursWorked = 0.0;
					if(tokens.length == 6) {
						hourlyPayRate = Double.parseDouble(tokens[4]);
						hoursWorked = Double.parseDouble(tokens[5]);
					} else if(tokens.length == 5) {
						annualSalary = Double.parseDouble(tokens[4]);
					}
					
//					if(tokens[0].equals("D")) {
//						e = new Deposits(); //TODO: modify this
//					} else if(tokens[0].equals("S")) {
//						e = new Stocks(); //TODO: modify this
//					} else if(tokens[0].equals("P")) {
//						e = new PInvests(); //TODO: modify this
//					}
//					
					result.add(e);
				}
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}
	
	public static void main(String args[]) {

		//get the employees from the data file
		List<DataParser> payroll = parseDataFile();

		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("%-8s %-20s %-10s %-30s %9s %9s %9s\n", 
				"ID", "Name", "Type", "Title", "Gross", "Taxes", "Net"));

		//for each employee
		for(DataParser e : payroll) {
			//format their information
//			sb.append(String.format("%-8s %-20s %-10s %-30s $%8.2f $%8.2f $%8.2f\n", 
//					"TODO"); //TODO: replace these
		}
		
		System.out.println(sb);
	}
	
}