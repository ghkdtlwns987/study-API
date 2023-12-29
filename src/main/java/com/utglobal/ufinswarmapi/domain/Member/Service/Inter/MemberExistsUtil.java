package com.utglobal.ufinswarmapi.domain.Member.Service.Inter;

public interface MemberExistsUtil {
    boolean usernameAlreadyExists(Long Id, String username);
    boolean emailAlreadyExists(Long Id, String email);
    boolean nicknameAlreadyExists(Long Id, String nickname);
    boolean loginIdAlreadyExists(Long Id, String loginId);
}
