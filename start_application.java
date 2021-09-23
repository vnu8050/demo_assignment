package signin;

public class start_application {

	public static void main(String[] args) {
		user virat = new user();
		user venu = new user();
		user sachin = new user();
		user prem = new user();
		user rishab = new user(); 
		
		venu.setUserId(1);
		venu.setUserName("venukul");
		venu.setFirstName("venu");
		venu.setLastName("kulkarni");
		venu.setEmailId("venuk123@gmail.com");
		venu.setPhoneNo(12345);
		
		virat.setUserId(2);
		virat.setUserName("virat11");
		virat.setFirstName("virat");
		virat.setLastName("kohil");
		virat.setEmailId("virat123@gmail.com");
		virat.setPhoneNo(123321);
		
		sachin.setUserId(3);
		sachin.setUserName("sacl0");
		sachin.setFirstName("sachin");
		sachin.setLastName("tendulkar");
		sachin.setEmailId("sactn123@gmail.com");
		sachin.setPhoneNo(12789);
		
		prem.setUserId(4);
		prem.setUserName("pk12");
		prem.setFirstName("prem");
		prem.setLastName("kumar");
		prem.setEmailId("pkumar123@gmail.com");
		prem.setPhoneNo(145645);
		

		rishab.setUserId(5);
		rishab.setUserName("rishab20");
		rishab.setFirstName("rishab");
		rishab.setLastName("pant");
		rishab.setEmailId("rispat123@gmail.com");
		rishab.setPhoneNo(12486);
		
		
		System.out.println(venu.getUserId());
		System.out.println(venu.getUserName());
		System.out.println(venu.getFirstName());
		System.out.println(venu.getLastName());
		System.out.println(venu.getemailId());
		System.out.println(venu.getphoneNo());
		
		System.out.println(virat.getUserId());
		System.out.println(virat.getUserName());
		System.out.println(virat.getFirstName());
		System.out.println(virat.getLastName());
		System.out.println(virat.getemailId());
		System.out.println(virat.getphoneNo());
		
		System.out.println(sachin.getUserId());
		System.out.println(sachin.getUserName());
		System.out.println(sachin.getFirstName());
		System.out.println(sachin.getLastName());
		System.out.println(sachin.getemailId());
		System.out.println(sachin.getphoneNo());
		
		System.out.println(prem.getUserId());
		System.out.println(prem.getUserName());
		System.out.println(prem.getFirstName());
		System.out.println(prem.getLastName());
		System.out.println(prem.getemailId());
		System.out.println(prem.getphoneNo());
		
		System.out.println(rishab.getUserId());
		System.out.println(rishab.getUserName());
		System.out.println(rishab.getFirstName());
		System.out.println(rishab.getLastName());
		System.out.println(rishab.getemailId());
		System.out.println(rishab.getphoneNo());
		
		
		
	}
	
	
	
}
