package day1.classroom;

public class Mobile {
	public int makeCall() {
		System.out.println("called raja");
		return 12332;

	}

	
	public String sendSms() {
		System.out.println("the text ");
		return "Hi";
		
	}
	
	public boolean shutdownPhone()
	{
		System.out.println("Phone is off");
		return true;
	}
	
	public static void main(String[] args) {
		Mobile myMob = new Mobile();
		int Cll = myMob.makeCall();
		System.out.println(Cll);
		 	
		 String ed = myMob.sendSms();
		 System.out.println(ed);
		 
		boolean shut = myMob.shutdownPhone();
		System.out.println(shut);

	}
	
} 
