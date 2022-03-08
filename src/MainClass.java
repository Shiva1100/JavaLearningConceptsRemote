
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("This is working fine");
		
		// creating the object name 
		MainClass mc = new MainClass();
		// calling the method : objectName.method();
		String result = mc.subOfString("Abhilash", 3);
		System.out.println("The resulf of subsString "+result);
		String courName = mc.subOfString("New Selenium Course", 3);
		System.out.println("The result of CourNme SusbString-"+courName.trim());
		String listOfWords = "1 of the student is wonderfull batch and learning-Java";
		mc.splitOfStr(listOfWords);
		String res = mc.revStrig("Abhilash");
		System.out.println("result of String is "+res);
	}
	
	public String revStrig(String str) {
		
		char ch; String revstr="";
		
		for (int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
		
	}
		System.out.println("The reverse String is :"+revstr);
		return revstr;
		
		
		
		
		
	}
	
	public String subOfString(String str, int a) {
		
		String subsStr = str.substring(a,5);
		return subsStr;
	}

	public void splitOfStr(String str) {
		String[] ar1 = str.split(" ");
		int lengthOfAr1 = ar1.length;
		for(int i=0;i<lengthOfAr1;i++) {
			String eachItem = ar1[i];
			System.out.println("The Invidiual items "+eachItem);
		}
		

		
	}
	
}
