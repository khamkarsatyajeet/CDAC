/* 1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.  */


class Que1 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean Boolean ;

	/* static */ void displayDefault () {
	// Que1 obj = new Que1 ();
	System.out.println("Default Values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch); // or
	System.out.println("char: ASCII:" + (int)ch); // or
        System.out.println("char: [" + ch + "] (ASCII: " + (int) ch + ")");
        System.out.println("boolean: " + Boolean);	

}
	
	public static void main (String[] args) {

	Que1 obj = new Que1 ();
	obj.displayDefault(); 
	
	//displayDefault ();
	
	byte B = 1;
	System.out.println("Byte assigned value is: "+B );
	short S = 2;
	System.out.println("Short assigned value is: "+S );
	int I = 3;
	System.out.println("Integer assigned value is: "+I );
	long L = 4;
	System.out.println("Long assigned value is: "+L );
	float F = 5.5f;
	System.out.println("Float assigned value is: "+F );
	double D = 6.555;
	System.out.println("Double assigned value is: "+D );
	char CH = 'S';
	System.out.println("Char assigned value is: "+CH );
	} 

}