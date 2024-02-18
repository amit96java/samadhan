package com.samadhan.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;

@AllArgsConstructor
@NoArgsConstructor
public class GeneralResponse {
    public String message;
    public int statusCode;
    public String errorMessage;
    public JSONObject data;
    public Object object;

    public GeneralResponse(String message, int statusCode, String errorMessage) {
        this.message = message;
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }
}
