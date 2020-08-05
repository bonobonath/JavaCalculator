//*****
//Edited by Nathaniel MacKinlay
//Email: nmackinl@asu.edu 
//Asurite ID: nmacknl
//CLASS: NegOperator
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
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {
	public NegOperator() {
	}

	@Override
	public Operand evaluate(Operand pOperand) {
		return new Operand(-pOperand.getValue());
	}

	@Override
	public int precedence() {
		return 4;
	}

	@Override
	public int stackPrecedence() {
		return 4;
	}
}