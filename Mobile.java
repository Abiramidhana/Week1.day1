package sample;

public class Mobile {
	String contactName;
	public void sendMsg(String message)
	{
	System.out.println(message);
	
	}
	private long saveContact()
	{
		long mobileNo=1234567890l;
		return mobileNo;
	}
	void makeCall()
	{
		System.out.println("Dial the No");
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.contactName="Abirami");
		m.sendMsg("Message Successfully Sent");
		long savedContact=m.saveContact();
		System.out.println(savedContact);
		m.makeCall();
		

	}

}
