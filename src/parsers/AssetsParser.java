package parsers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dataFile.*;

public class AssetsParser {

	public static List<Asset> parseDataFile() {
		List<Asset> result = new ArrayList<Asset>();
		try {
			File f = new File("data/Assets.dat");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Asset a = null;
					String tokens[] = line.split(";");
					String code = tokens[0];
					String type = tokens[1];
					String label = tokens[2]; 
					double apr = 0, quarterlyDividend = 0, baseRateOfReturn = 0, betaMeasure = 0, sharePrice = 0, omegaMeasure = 0, totalValue = 0;
					String stockSymbol = null;

					if (type.equals("D")) {
						apr = Double.parseDouble(tokens[3]);

						a = new Deposit(code, type, label, apr);
					}	
					else {
						quarterlyDividend = Double.parseDouble(tokens[3]);
						baseRateOfReturn = Double.parseDouble(tokens[4]);
					}
					if (type.equals("S")) {
						betaMeasure = Double.parseDouble(tokens[5]);
						stockSymbol = tokens[6];
						sharePrice = Double.parseDouble(tokens[7]);

						a = new Stock(code, type, label, quarterlyDividend, baseRateOfReturn, betaMeasure, stockSymbol, sharePrice);
					}
					else if (type.equals("P")) {
						omegaMeasure = Double.parseDouble(tokens[5]);
						totalValue = Double.parseDouble(tokens[6]);

						a = new privateInvestment(code, type, label, quarterlyDividend, baseRateOfReturn, omegaMeasure, totalValue);
					}
				}

			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}

		return result;
	}

}