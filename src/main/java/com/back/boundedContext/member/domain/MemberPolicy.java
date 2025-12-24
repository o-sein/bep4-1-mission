package com.back.boundedContext.member.domain;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
public class MemberPolicy {
    private static final int PASSWORD_CHANGE_INTERVAL_DAYS = 90;

    public Duration getPasswordChangeInterval() {
        return Duration.ofDays(PASSWORD_CHANGE_INTERVAL_DAYS);
    }

    public int getPasswordChangeIntervalDays() {
        return PASSWORD_CHANGE_INTERVAL_DAYS;
    }

    public boolean isNeedToChangePassword(LocalDateTime lastChangeDate) {
        if (lastChangeDate == null) return true;

        return lastChangeDate.plusDays(PASSWORD_CHANGE_INTERVAL_DAYS).isBefore(LocalDateTime.now());
    }
}
