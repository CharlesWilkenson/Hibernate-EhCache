package com.hibernate.secondL2.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.Set;

@Entity
@Cacheable
@Cache( usage = CacheConcurrencyStrategy.READ_WRITE)
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String title;

/*    @OneToMany(mappedBy = "id.course")
    Set<CourseRegistration> registrations;*/
}
