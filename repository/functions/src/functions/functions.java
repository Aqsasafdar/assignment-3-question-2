package functions;

public class functions {

	public static void main(String[] args)
	{
		String s11=new String("computer");
//		String s3=new String("Computer");
//		System.out.println(s1);
//		String s2=s1.toUpperCase();
//		System.out.println("uppercase :"+s2);
//		 s2=s1.toLowerCase();
//		System.out.println("lowercase :"+s2);
//		System.out.println("length is :"+s2.length());
	int i=s11.indexOf("mpu");
		System.out.println("index is :"+i);
		 i=s11.lastIndexOf("mp",1);
		System.out.println("index is :"+i);
//		if(s1.equalsIgnoreCase(s3))
//			System.out.println("String are same ");
//		else
//			System.out.println("String are not same ");
//		i=s1.compareTo(s3);
//		if(i==0)
//			System.out.println("String are same ");
//		else if(i>0)
//			System.out.println("opposite to dictionary order ");
//		else
//			System.out.println(" dictionary order ");
		String s=" ch";
		String s1=s.concat("aqsa").concat("safdar ");
		System.out.println(s1);
		String s2=s1.substring(6);
		int s4=s1.length();
		System.out.println(s2);
		System.out.println(s4);
		//String s3=s1.trim();
		//System.out.println(s3);
	}

}
