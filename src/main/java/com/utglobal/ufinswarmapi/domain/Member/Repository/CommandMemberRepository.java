package com.utglobal.ufinswarmapi.domain.Member.Repository;

import com.utglobal.ufinswarmapi.domain.Member.Entity.Member;
import org.springframework.stereotype.Repository;

public interface CommandMemberRepository  {
    Member save(Member member);

    Member delete(Member member);
}