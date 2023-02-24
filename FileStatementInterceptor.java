import java.io.FileWriter;
import java.io.IOException;

public class FileStatementInterceptor implements StatementInterceptor {
    @Override
    public void intercept(StatementContext context) {
        try {
            FileWriter writer = new FileWriter("statement.txt");
            writer.write(context.getStatement());
            writer.close();
            System.out.println("Statement saved to file.");
        } catch (IOException e) {
            System.err.println("Error writing statement to file: " + e.getMessage());
        }
    }
}