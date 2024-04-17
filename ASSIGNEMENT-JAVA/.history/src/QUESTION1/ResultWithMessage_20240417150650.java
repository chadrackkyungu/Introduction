package QUESTION1;

public class ResultWithMessage<T> {
    private T result;
    private String message;

    public ResultWithMessage(T result, String message) {
        this.result = result;
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
