public class JavaDatatypes {
	//1.2 Java dataypes
    // Class variable 
    private static char classChar = 'A';
    final static double classDouble = 8.4321;

    // Instance variables
    private int instanceInt;
    private float instanceFloat;
    private byte instanceByte;
    private String instanceString = "Hello world";
   

    // Constructor 
    public JavaDatatypes(int a, float b, byte c) {
        this.instanceInt = a;
        this.instanceFloat = b;
        this.instanceByte = c;
    }

   
    public void displayValues() {
    	//local variable 
    	Boolean localBoolean = true;
        System.out.println("int: " + instanceInt);
        System.out.println("float: " + instanceFloat);
        System.out.println("byte: " + instanceByte);
        System.out.println("double: " + classDouble);
        System.out.println("Char: " + classChar);
        System.out.println("String: " + instanceString);
        System.out.println("Boolean: " + localBoolean);
    }

    public static void main(String[] args) {
        // Creating an instance 
        JavaDatatypes javaDatatypes = new JavaDatatypes(10,(float) 8,(byte) 9);

        //modifying variables
        javaDatatypes.instanceString = "hello";
        classChar = 'B';
 


        javaDatatypes.displayValues();
    }
}
