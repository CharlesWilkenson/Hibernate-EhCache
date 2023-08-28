package com.hibernate.secondL2.repository;

import com.hibernate.secondL2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
