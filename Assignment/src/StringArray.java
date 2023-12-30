
public class StringArray {
	//1.4 strings and arrays
	public static void main(String[] args) {
        // Strings
        String a = "Hello, World!";
        System.out.println("String: " + a);

       
        int length = a.length();
        System.out.println("String Length: " + length);
        
        
        System.out.println("String lowercase: " + a.toLowerCase());
        System.out.println("String uppercase: " + a.toUpperCase());

      
        char firstChar = a.charAt(0);
        System.out.println("First Character: " + firstChar);

   
        String substring = a.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}
