package com.hibernate.secondL2.repository;

import com.hibernate.secondL2.entity.CourseRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, CourseRegistration.PK> {

}
