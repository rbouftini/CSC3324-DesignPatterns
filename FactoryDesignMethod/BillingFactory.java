public class BillingFactory {
    public static Billing getBilling(String clientType) {
        switch (clientType.toLowerCase()) {
            case "government":
                return new GovernmentBilling();
            case "semi-public":
                return new SemiPublicBilling();
            case "private":
                return new PrivateBilling();
            default:
                throw new IllegalArgumentException("Unknown client type: " + clientType);
        }
    }
}
