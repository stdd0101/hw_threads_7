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

    private double getMonthlyRate()
    {
        return this.rate/12/100.0;
    }

    private double getCoefficient() {
        double rate = getMonthlyRate();
        double pou = Math.pow(1 + rate, this.period);
        return (rate * pou)/(pou - 1);
    }

    public double getMonthlyPayment() {
        return (Math.round(this.volume * this.getCoefficient()));
    }

    public double getTotalAmount() {
        return this.getMonthlyPayment() * this.period;
    }

    public double getOverpayment() {
        return this.getTotalAmount() - this.volume;
    }
}
