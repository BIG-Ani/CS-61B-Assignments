/* BadTransactionException.java */

/**
 *  Implements an exception that should be thrown for invalide amounts.
 **/

public class BadTransactionException extends Exception{
	public int transactAmount;

	public BadTransactionException(int badAmount){
		super("invalide operate amount: "+ badAmount);

		transactAmount = badAmount;
	}

}