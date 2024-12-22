package Mayuri_Peddawad;

public class operators_java {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		System.out.println(".....Arithematic Operators.....");
		System.out.println(" ");
		
		int c = a+b;
		System.out.println("Addition is " +c);
		int d = a-b;
		System.out.println("Subtraction is " +d);
		int e = a*b;
		System.out.println("Multiplication is " +e);
		int f = a/b;
		System.out.println("Division is " +f);
		int g = a%b;
		System.out.println("Modulus is " +g);
		int h = a++;
		System.out.println("Increment is " +h);
		int i = a--;
		System.out.println("Decrement is " +i);
		
		System.out.println(" ");
		System.out.println(".....Assignment Operators.....");
		System.out.println(" ");
		
		int j = 10;
		j += 3;
		System.out.println("Add with assignment operator (=) " +j);
		j -= 3;
		System.out.println("Sub with assignment operator (=) " +j);
		j *= 2;
		System.out.println("Mul with assignment operator (=) " +j);
	    j /= 2;
		System.out.println("Div with assignment operator (=) " +j);
		j %= 3;
		System.out.println("Mod with assignment operator (=) " +j);
		j &= 2;
		System.out.println("Bitwise AND with assignment operator (=) " +j);
		j |= 3;
		System.out.println("Bitwise OR with assignment operator (=) " +j);
		j ^= 1;
		System.out.println("Bitwise XOR with assignment operator (=) "+j); 
		j <<= 2;
		System.out.println("Left shift with assignment operator (=) " +j);
		j >>= 3;
		System.out.println("Right shift with assignment operator (=) " +j);
		
		System.out.println(" ");
		System.out.println(".....Comparison Operators.....");
		System.out.println(" ");
		
		int m = 5;
		int n = 3;
		System.out.println(m == n);  // returns false because 5 is not equal to 3
		System.out.println(m != n);  // returns true because 5 is not equal to 3
		System.out.println(m > n);  // returns true because 5 is greater than 3
		System.out.println(m < n);  // returns true because 5 is greater than 3
		System.out.println(m >= n); // returns true because 5 is greater, or equal, to 3
		System.out.println(m <= n); // returns false because 5 is neither less than or equal to 3
		
		System.out.println(" ");
		System.out.println(".....Logical Operators.....");
		System.out.println(" ");
		
		int x = 5;
		System.out.println(x > 3 && x < 10);  // returns true because 5 is greater than 3 AND 5 is less than 10
		System.out.println(x > 3 || x < 4);  // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
		System.out.println(!(x >3 && x< 10));  // returns false because ! (not) is used to reverse the result
	}

}
