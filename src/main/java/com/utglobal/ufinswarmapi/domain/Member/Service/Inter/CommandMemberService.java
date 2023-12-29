package com.utglobal.ufinswarmapi.domain.Member.Service.Inter;

import com.utglobal.ufinswarmapi.domain.Member.Dto.*;

public interface CommandMemberService {
    SignupResponseDto signup(SignupRequestDto signupRequestDto);

    MemberUpdateResponseDto changePassword(MemberUpdatePasswordRequestDto memberUpdatePasswordRequestDto);

    MemberUpdateResponseDto changeNickname(MemberUpdateNicknameRequestDto memberUpdateNicknameRequestDto);

    MemberUpdateResponseDto changeUsername(MemberUpdateUsernameRequestDto memberUpdateUsernameRequestDto);
}
