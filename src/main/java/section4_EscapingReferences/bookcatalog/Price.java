package section4_EscapingReferences.bookcatalog;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
		rates.put("PHP", 0.02);
	}

	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}

	public Double getRate(String currency) {
		return rates.get(currency);
	}
	
}
