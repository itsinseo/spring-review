package com.sparta.springreview.user.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class SignupRequestDto {
    @Pattern(regexp = "^[a-zA-Z0-9]{3,}$", message = "닉네임의 구성이 올바르지 않습니다.")
    private String username;

    @Pattern(regexp = "^.{4,}$", message = "비밀번호의 구성이 올바르지 않습니다.")
    private String password;

    private String passwordConfirm;
}
