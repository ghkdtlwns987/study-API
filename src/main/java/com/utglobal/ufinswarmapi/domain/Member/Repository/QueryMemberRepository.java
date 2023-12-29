package com.utglobal.ufinswarmapi.domain.Member.Repository;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;

import java.util.Optional;

public interface QueryMemberRepository {
    /**
     * ID 를 기반으로 회원을 검색합니다.
     * @param Id
     * @return Optional<Member>
     */
    Optional<Member> findById(Long Id);

    /**
     * Email을 기반으로 회원을 검색합니다.
     * @param email
     * @return Optional<Member>
     */
    Optional<Member> findByEmail(String email);

    /**
     * Nickname을 기반으로 회원을 검색합니다.
     * @param nickname
     * @return Optional<Member>
     */
    Optional<Member> findByNickname(String nickname);

    /**
     * Username을 기반으로 회원을 검색합니다.
     * @param username
     * @return Optional<Member>
     */
    Optional<Member> findByUsername(String username);
}
