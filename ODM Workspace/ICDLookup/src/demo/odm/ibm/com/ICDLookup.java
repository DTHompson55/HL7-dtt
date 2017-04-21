package demo.odm.ibm.com;

import java.util.regex.*;

public class ICDLookup {

private static int value;

	public ICDLookup(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICDLookup a = new ICDLookup();
		System.out.println("String 1 is "+ICDLookup.matches("Z94\\.4.*","Z94.310"));
		
	}
	
	
	public static boolean matches(String regex, String matchString){
		 Pattern p = Pattern.compile(regex);
		 Matcher m = p.matcher(matchString);
		 boolean b = m.matches();
	
		 System.out.println("Called Match with "+regex+" "+matchString+" "+b);

		return b;
	}
	
	public static void add(int a){
		value += a;
	}
	public static void clear(){
		value =0;
	}
	public static int get(){
		return value;
	}

}
