package com.utglobal.ufinswarmapi.domain.Member.Dto;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequestDto {
    private String loginId;
    private String password;
    private String nickname;
    private String email;
    private String username;

    public Member toEntity(){
        return Member.builder()
                .loginId(loginId)
                .password(password)
                .nickname(nickname)
                .email(email)
                .username(username)
                .build();
    }
}
