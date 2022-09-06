package corejava;

public class WrapperClass {

	public static void main(String args[]) {
		byte b = 10;
		int i = 30;

//Autoboxing: Converting primitives into objects  
		Byte byteobj = b;
		Integer intobj = i;

//Printing objects  
		System.out.println("Printing object values");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Integer object: " + intobj);

//Unboxing: Converting Objects to Primitives  
		byte bytevalue = byteobj;
		int intvalue = intobj;

//Printing primitives  
		System.out.println("Printing primitive values");
		System.out.println("byte value: " + bytevalue);
		System.out.println("int value: " + intvalue);

	}
}