package com.viettel.vssfood.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonResponse {
    private String message;
    private Object data;

    public JsonResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public JsonResponse(String message) {
        this.data = "";
        this.message = message;
    }
}
