public class CreditCalculator {
    public int volume;//сумма кредита
    public int period;//количество месяцев, в течение которых выплачивается кредит
    public int rate;//годовая ставка в %

    public CreditCalculator(int volume, int period, int rate)
    {
        this.volume = volume;
        this.period = period;
        this.rate = rate;
    }
    public double getMonthlyPayment() {
       //...
        return 0;
    }

    public double getTotalAmount() {
       //...
        return 0;
    }

    public double getOverpayment() {
        //...
        return 0;
    }
}
