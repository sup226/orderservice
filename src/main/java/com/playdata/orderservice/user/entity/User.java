package com.playdata.orderservice.user.entity;

import com.playdata.orderservice.common.entity.Address;
import com.playdata.orderservice.user.dto.UserResDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter @NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Embedded // @Embeddable로 선언된 값 대입 (기본 생성자 필수)
    private Address address;

    @Enumerated(EnumType.STRING)
    @Builder.Default // build시 초기화된 값으로 세팅하기 위한 아노테이션
    private Role role = Role.USER; // 기본값

    private String refreshToken;


    public UserResDto fromEntity() {
        return UserResDto.builder()
                .id(id)
                .name(name)
                .email(email)
                .role(role)
                .address(address)
                .build();
    }


}















