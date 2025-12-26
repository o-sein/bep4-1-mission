package com.back.boundedContext.member.app;

import com.back.boundedContext.member.domain.MemberPolicy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberGetRandomSecureTipUseCase {
    private final MemberPolicy memberPolicy;

    public String getRandomSecureTip() {
        return "비밀번호의 유효기간은 %d일이며, 정기적으로 변경하는 것이 좋습니다."
                .formatted(memberPolicy.getPasswordChangeIntervalDays());
    }
}
