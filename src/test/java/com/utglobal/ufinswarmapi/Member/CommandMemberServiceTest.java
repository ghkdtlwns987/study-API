package com.utglobal.ufinswarmapi.Member;

import com.utglobal.ufinswarmapi.domain.Member.Dto.MemberDto;
import com.utglobal.ufinswarmapi.domain.Member.Dto.SignupRequestDto;
import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CommandMemberServiceTest {
    Member member;
    SignupRequestDto signupRequestDto;
    @BeforeEach
    void setUp(){
        member = new Member("testusername", "testpassword", "testnickname", "testloginId", "testusername", "testemail@naver.com", new Date(), new Date());
        signupRequestDto = new SignupRequestDto("testloginId2", "testpassword", "testnickname", "testemail", "testusername");
    }

    @Test
    @DisplayName()
    void signup(){
        signupRequestDto = new SignupRequestDto("")
    }
}
