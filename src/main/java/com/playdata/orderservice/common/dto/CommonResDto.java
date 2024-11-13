package com.playdata.orderservice.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter @Setter @ToString
@NoArgsConstructor
public class CommonResDto {

    // 동일한 응답을 위한 dto
    private int statusCode;
    private String statusMessage;
    private Object result;

    public CommonResDto(HttpStatus httpStatus, String statusMessage, Object result) {
        this.statusCode = httpStatus.value();
        this.statusMessage = statusMessage;
        this.result = result;
    }
}
