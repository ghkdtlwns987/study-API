package com.utglobal.ufinswarmapi.Member;

import com.utglobal.ufinswarmapi.domain.Member.Dto.SignupRequestDto;
import com.utglobal.ufinswarmapi.domain.Member.Dto.SignupResponseDto;
import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import com.utglobal.ufinswarmapi.domain.Member.Service.Inter.CommandMemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Date;

public class CommandMemberServiceTest {
    Member member;
    SignupRequestDto signupRequestDto;

    @Mock
    CommandMemberService commandMemberService;
    @BeforeEach
    void setUp(){
        member = new Member("testusername", "testpassword", "testnickname", "testloginId", "testusername", "testemail@naver.com", new Date(), new Date());
        signupRequestDto = new SignupRequestDto("testloginId2", "testpassword", "testnickname", "testemail", "testusername");
    }

    @Test
    void signup(){
        Member member1 = signupRequestDto.toEntity();

    }
}
