package com.hibernate.secondL2.dto;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRegistrationDto {

    private PKDto id;
    //private Integer student;
    //private Integer course;
    private double grade;


    @Builder
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PKDto {
        private Integer student;
        private Integer course;
    }
}

