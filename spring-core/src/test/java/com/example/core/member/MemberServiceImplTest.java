package com.example.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.core.AppConfig;

class MemberServiceImplTest {

    MemberService memberService;

    @BeforeEach
    void setup() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @DisplayName("회원을 저장한다.")
    @Test
    void join() {
        // given
        Member member = new Member(1L, "hwan", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(findMember).isEqualTo(member);
    }
}
