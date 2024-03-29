package section4_EscapingReferences;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() {
    return Collections.unmodifiableMap(this.records);
	}

	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}

	public CustomerReadOnly getCustomerByName(String name) {
		return this.records.get(name);
	}
}
