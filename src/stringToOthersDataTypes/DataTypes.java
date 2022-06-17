package stringToOthersDataTypes;
import java.util.*;

public class DataTypes {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		DataTypes obj=new DataTypes();
		System.out.println("String to Byte:"+obj.stringToByte(s));
		System.out.println("String to Short:"+obj.stringToShort(s));
		System.out.println("String to Integer is:"+obj.stringToInt(s));
		System.out.println("String to Long:"+obj.stringToLong(s));
		System.out.println("String to Float:"+obj.stringToFloat(s));
		System.out.println("String to Double:"+obj.stringToDouble(s));
		}

	}
	public int stringToInt(String s) {
		int n=Integer.parseInt(s);
		return n;
	}
	public short stringToShort(String s) {
		short shortInt=Short.parseShort(s);
		return shortInt;
	}
	public float stringToFloat(String s) {
		float f=Float.parseFloat(s);
		return f;
	}
	public byte stringToByte(String s) {
		byte b=Byte.parseByte(s);
		return b;
	}
	public double stringToDouble(String s) {
		double d=Double.parseDouble(s);
		return d;
	}
	public long stringToLong(String s) {
		long l=Long.parseLong(s);
		return l;
	}
}
