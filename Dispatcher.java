import java.util.ArrayList;
import java.util.List;

class StatementDispatcher {
    private List<StatementInterceptor> interceptors = new ArrayList<>();

    public void registerInterceptor(StatementInterceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void dispatch(StatementContext context) {
        for (StatementInterceptor interceptor : interceptors) {
            interceptor.intercept(context);
        }
    }

}
