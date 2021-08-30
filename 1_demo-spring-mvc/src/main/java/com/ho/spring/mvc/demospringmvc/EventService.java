package com.ho.spring.mvc.demospringmvc;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event1 = Event.builder().name("이벤트 1").limitOfEnrollment(10)
                .startDateTime(LocalDateTime.of(2021, 8, 25, 10, 0, 0))
                .endDateTime(LocalDateTime.of(2021, 8, 25, 12, 0, 0)).build();
        Event event2 = Event.builder().name("이벤트 2").limitOfEnrollment(10)
                .startDateTime(LocalDateTime.of(2021, 8, 26, 10, 0, 0))
                .endDateTime(LocalDateTime.of(2021, 8, 26, 12, 0, 0)).build();

        return List.of(event1, event2);
    }
}
