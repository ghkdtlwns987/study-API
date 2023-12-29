package com.utglobal.ufinswarmapi.domain.Member.Service.Impl;

import com.utglobal.ufinswarmapi.domain.Member.Service.Inter.MemberExistsUtil;

public class MemberExistsUtilImpl implements MemberExistsUtil {
    @Override
    public boolean usernameAlreadyExists(Long Id, String username) {
        return false;
    }

    @Override
    public boolean emailAlreadyExists(Long Id, String email) {
        return false;
    }

    @Override
    public boolean nicknameAlreadyExists(Long Id, String nickname) {
        return false;
    }

    @Override
    public boolean loginIdAlreadyExists(Long Id, String loginId) {
        return false;
    }
}
