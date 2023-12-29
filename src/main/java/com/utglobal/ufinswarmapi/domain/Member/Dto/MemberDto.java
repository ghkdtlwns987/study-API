package com.utglobal.ufinswarmapi.domain.Member.Dto;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String username;
    private String password;
    private String nickname;
    private String loginId;
    private String userId;
    private String email;
    private Date createAt;
    private Date modifiedDate;
    public Member toEntity() {
        return new Member(username, password, nickname, loginId, email);
    }

    public static MemberDto fromEntity(Member member){
        return MemberDto.builder()
                .username(member.getUsername())
                .password(member.getPassword())
                .nickname(member.getNickname())
                .loginId(member.getLoginId())
                .userId(member.getUserId())
                .email(member.getEmail())
                .createAt(member.getCreateAt())
                .modifiedDate(member.getModifiedAt())
                .build();
    }


}
