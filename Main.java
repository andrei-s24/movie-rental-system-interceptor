public class Main {
    public static void main(String[] args) {
        // Create a customer and some rentals
        Customer customer = new Customer("John Doe");
        Movie movie1 = new Movie("The Shawshank Redemption", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 3);
        customer.addRental(rental1);
    
        // Create a file interceptor and a context object
        StatementInterceptor fileInterceptor = new FileStatementInterceptor();
        StatementInterceptor discountInterceptor = new DiscountStatementInterceptor(25);
        StatementContext context = new StatementContext(customer, customer.statement());
    
        // Create a dispatcher and register the interceptor
        StatementDispatcher dispatcher = new StatementDispatcher();
        dispatcher.register(discountInterceptor);
        dispatcher.register(fileInterceptor);
    
        // Call the dispatcher's dispatch method with the context object
        dispatcher.dispatch(context);
    
        // Print the statement
        System.out.println(context.getStatement());
    }
}
