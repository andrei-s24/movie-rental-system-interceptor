import java.util.ArrayList;
import java.util.List;

class StatementDispatcher {
    private List<StatementInterceptor> interceptors = new ArrayList<>();

    public void register(StatementInterceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void remove(StatementInterceptor interceptor) {
        interceptors.remove(interceptor);
    }

    public void dispatch(StatementContext context) {
        for (StatementInterceptor interceptor : interceptors) {
            interceptor.intercept(context);
        }
    }

}
