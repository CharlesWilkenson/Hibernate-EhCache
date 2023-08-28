package com.hibernate.secondL2.repository;

import com.hibernate.secondL2.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
