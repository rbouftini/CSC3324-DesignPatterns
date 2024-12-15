public class GovernmentBilling implements Billing {
    @Override
    public double getBilling(double amount) {
        return amount * 0.9; // 10% discount
    }
}