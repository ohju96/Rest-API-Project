package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor // 모든 필드를 가지고 있는 생성자
@NoArgsConstructor // 매개변수가 없는 디폴트 생성자
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}