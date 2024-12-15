public class PrivateBilling implements Billing {
    @Override
    public double getBilling(double amount) {
        return amount; // No discount
    }
}