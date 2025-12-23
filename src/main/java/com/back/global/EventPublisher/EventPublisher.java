package com.back.global.EventPublisher;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 의존성 주입 가능하도록
public class EventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public void publish(Object event) {
        applicationEventPublisher.publishEvent(event);
    }
}
