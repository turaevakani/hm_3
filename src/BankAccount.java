public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit (double sum){
        amount+=sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Ошибка. Сумма которую вы ввели превышает вашу текущую сумму ", amount);
        }
        amount-=sum;
        System.out.println("Ваш остаток на счету: " + amount);



    }
}
