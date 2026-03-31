package com.carbonsync.utils;

// Generic API response envelope — every endpoint returns this shape
public class ResponseWrapper<T> {

    private String status;
    private String message;
    private T data;

    private ResponseWrapper(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // ── Factory methods ───────────────────────────────────────

    public static <T> ResponseWrapper<T> success(T data) {
        return new ResponseWrapper<>("success", "OK", data);
    }

    public static <T> ResponseWrapper<T> error(String message) {
        return new ResponseWrapper<>("error", message, null);
    }

    // ── Getters ───────────────────────────────────────────────

    public String getStatus()  { return status; }
    public String getMessage() { return message; }
    public T getData()         { return data; }
}
