package com.hibernate.secondL2.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRegistration {

    @Id
    @EmbeddedId
    private PK id;
    //@Id
    //private Student student;
    //
    //@Id
    //private Course course;

    @CreatedDate
    private Instant registeredAt = Instant.now();
    private double grade;

    @Builder
    @Setter
    @Getter
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PK {

        @ManyToOne
        private Student student;

        @ManyToOne
        private Course course;
    }
}


