package com.utglobal.ufinswarmapi.domain.Member.Dto;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberUpdateResponseDto {
    private Long Id;
    private String username;
    private String nickname;
    private String loginId;
    private String email;

    public MemberUpdateResponseDto fromEntity(Member member) {
        return new MemberUpdateResponseDto(
                member.getId(),
                member.getUsername(),
                member.getNickname(),
                member.getLoginId(),
                member.getEmail()
        );
    }
}
