//**************************************************************************************************************
//Edited by Nathaniel MacKinlay
//Email: nmackinl@asu.edu 
//Asurite ID: nmacknl
// CLASS: Operand
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************
package project4;

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
	private Double mValue;

	public Operand(Double pValue) {
		setValue(pValue);
	}

	public Double getValue() {
		return mValue;
	}

	public void setValue(Double pValue) {
		mValue = pValue;
	}
}