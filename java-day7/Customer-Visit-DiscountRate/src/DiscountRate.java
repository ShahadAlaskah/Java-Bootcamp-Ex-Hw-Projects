public class DiscountRate {
    private static double serviceDiscountPremium=0.2;
    private static double serviceDiscountGold=0.15;
    private static double serviceDiscountSilver=0.1;
    private static double productDiscountPremium=0.1;
    private static double productDiscountGold=0.1;
    private static double productDiscountSilver=0.1;

    public static double getServiceDiscountRate(String type) {
        type=type.toLowerCase();
        if (type.equals("premium")) {
            return serviceDiscountPremium;
        } else if (type.equals("gold")) {
            return serviceDiscountGold;
        } else if (type.equals("silver")) {
            return serviceDiscountSilver;
        }else {
            throw new IllegalArgumentException("wrong type");
        }
    }

    public static double getProductDiscountRate(String type) {
        type=type.toLowerCase();
        if (type.equals("premium")) {
            return productDiscountPremium;
        } else if (type.equals("gold")) {
            return productDiscountGold;
        } else if (type.equals("silver")) {
            return productDiscountSilver;
        }else {
            throw new IllegalArgumentException("wrong type");
        }
    }
}
