import java.util.HashMap;

import io.intercom.api.Company;
import io.intercom.api.CustomAttribute;
import io.intercom.api.Intercom;


public class IntercomJavaTest {

	public static void main(String[] args) {
		Intercom.setAppID("drlbmz91");
		Intercom.setApiKey("f93795bbd9c4f3e6ecdff556d4e5e8ba3679dd87");
		
		Company company = new Company();
	    company.setName("Blue Sun");
	    company.setCompanyID("1");
	    company.setPlan(new Company.Plan("premium"));
	    company.addCustomAttribute(CustomAttribute.newIntegerAttribute("foddstuff-items", 246));
	    company.addCustomAttribute(CustomAttribute.newStringAttribute("bestseller", "fruity oaty bar"));
	    Company.create(company);
	    
	    HashMap<String, String> map = new HashMap<String, String>();
	    map.put("name", "Blue Sun");
	    Company company2 = Company.find(map);
	    
	    System.out.println(company2);
	}

}
