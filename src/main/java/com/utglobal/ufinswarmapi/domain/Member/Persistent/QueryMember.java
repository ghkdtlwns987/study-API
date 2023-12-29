package com.utglobal.ufinswarmapi.domain.Member.Persistent;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import com.utglobal.ufinswarmapi.domain.Member.Repository.QueryMemberRepository;

import java.util.Optional;

public class QueryMember implements QueryMemberRepository {
    @Override
    public Optional<Member> findById(Long Id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByNickname(String nickname) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByUsername(String username) {
        return Optional.empty();
    }
}
