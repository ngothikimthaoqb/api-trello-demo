package commons;

public enum StatusCode {
    CODE_200(200, ""),
    CODE_400(400, "");

    public final int code;
    public final String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
