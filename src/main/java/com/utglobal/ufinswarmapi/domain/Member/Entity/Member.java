package com.utglobal.ufinswarmapi.domain.Member.Entity;

import com.utglobal.ufinswarmapi.domain.Member.Dto.MemberDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "userName", length = 3)
    @Size(min = 2, max = 4)
    private String username;

    @Column(name = "password")
    @Size(min = 8, max = 20)
    private String password;

    @Column(name = "nickname")
    @Size(min = 2, max = 30)
    private String nickname;

    @Column(name = "loginId")
    @Size(min = 8, max = 20)
    private String loginId;

    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "CreateAt", nullable = false)
    private Date createAt;

    @Column(name = "ModifiedAt", nullable = false)
    private Date modifiedAt;

    @Builder
    public Member(String username, String password, String nickname, String loginId, String email) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.loginId = loginId;
        this.userId = String.valueOf(UUID.randomUUID());
        this.email = email;
        this.createAt = new Date();
        this.modifiedAt = new Date();
    }

    public void changeUserame(String username){
        this.username = username;
        this.modifiedAt = new Date();
    }
    public void changePassword(String password){
        this.password = password;
        this.modifiedAt = new Date();
    }
    public void changeNickname(String nickname){
        this.nickname = nickname;
        this.modifiedAt = new Date();
    }
}
