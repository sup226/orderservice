package com.playdata.orderservice.user.dto;

import com.playdata.orderservice.common.entity.Address;
import com.playdata.orderservice.user.entity.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSaveReqDto {

    // 필드명은 넘어오는 json의 프로퍼티(리액트)와 반드시 일치해야 함.
    private String name;

    @NotEmpty(message = "이메일은 필수입니다!")
    private String email;

    @NotEmpty(message = "비밀번호는 필수입니다!")
    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다!")
    private String password;

    private Address address;

    // 유틸 메서드
    // PasswordEncoder: 비밀번호 암호화
    public User toEntity(PasswordEncoder encoder) {
        return User.builder()
                .name(this.name)
                .email(this.email)
                .password(encoder.encode(this.password))
                .address(this.address)
                .build();
    }

}












