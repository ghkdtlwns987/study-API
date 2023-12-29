package com.utglobal.ufinswarmapi.domain.Member.Dto;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SignupResponseDto {
    private String username;
    private String nickname;
    private String loginId;
    private String email;
    private Date createAt;

    public SignupResponseDto fromEntity(Member member){
        return new SignupResponseDto(
                member.getUsername(),
                member.getNickname(),
                member.getLoginId(),
                member.getEmail(),
                member.getCreateAt()
        );
    }
}
