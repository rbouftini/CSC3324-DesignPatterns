public class SemiPublicBilling implements Billing {
    @Override
    public double getBilling(double amount) {
        return amount * 0.95; // 5% discount
    }
}