import java.util.List;

public class StatementContext {
    private Customer customer;
    private String statement;

    public StatementContext(Customer customer, String statement) {
        this.customer = customer;
        this.statement = statement;
    }

    public StatementContext() {

    }

    public String getStatement(){
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public void addToStatement(String additionalInfo) {
        statement += "\n" + additionalInfo;
    }

    public void getTotalCharge() {
    
    }

}
