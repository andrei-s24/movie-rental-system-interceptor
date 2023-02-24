public class DiscountStatementInterceptor implements StatementInterceptor {
    private double discountPercentage;

    public DiscountStatementInterceptor(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void intercept(StatementContext context) {
        double totalAmount = 0;
        double discountAmount = totalAmount * discountPercentage / 100.0;
        double discountedAmount = totalAmount - discountAmount;
        context.addToStatement("Discount applied: " + discountPercentage + "%");
        context.addToStatement("Discounted amount: " + discountedAmount);
    }
}