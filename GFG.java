// Java program to demonstrate
// Decoding Basic Base 64 format to String

import java.util.*;
public class GFG {
	public static void main(String[] args)
	{

		// create an encoded String to decode
		String encoded
			= "WW91ciBDb2RlIGZvciB0aGUgTGV0J3MgRGVjb2RlIGNvbnRlc3QgaXM6IEM4SDQ1MQ==";

		// print encoded String
		System.out.println("Encoded String:\n"
						+ encoded);

		// decode into String from encoded format
		byte[] actualByte = Base64.getDecoder()
								.decode(encoded);

		String actualString = new String(actualByte);

		// print actual String
		System.out.println("actual String:\n"
						+ actualString);
	}
}
