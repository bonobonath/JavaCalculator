//**************************************************************************************************************
//Edited by Nathaniel MacKinlay
//Email: nmackinl@asu.edu 
//Asurite ID: nmacknl
// CLASS: SubOperator
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
 * Represents the subtraction operator which is a specific type of binary
 * operator.
 */
public class SubOperator extends BinaryOperator {
	public SubOperator() {
	}

	@Override
	public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
		return new Operand(pLhsOperand.getValue() - pRhsOperand.getValue());
	}

	@Override
	public int precedence() {
		return 2;
	}

	@Override
	public int stackPrecedence() {
		return 2;
	}
}