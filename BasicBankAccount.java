
public class BasicBankAccount extends BankAccount
{
	public void withdraw(double amount)
{
	super.withdraw(amount);
	if(super.getBalance() < 0)
	{
		super.withdraw(30);
		System.out.println("Account is overdrawn. - $30 penalty charge");
		System.out.println("\n" + "New Balance: " + super.getBalance());
	}
		
}
}
