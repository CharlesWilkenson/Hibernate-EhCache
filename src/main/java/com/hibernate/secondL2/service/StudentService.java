package com.hibernate.secondL2.service;

import com.hibernate.secondL2.entity.Course;
import com.hibernate.secondL2.entity.CourseRegistration;
import com.hibernate.secondL2.entity.Student;
import com.hibernate.secondL2.repository.CourseRegistrationRepository;
import com.hibernate.secondL2.repository.CourseRepository;
import com.hibernate.secondL2.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final CourseRegistrationRepository registrationRepository;


    @Transactional
    public Student registerNewStudent(Student student) {
        try {
            return studentRepository.save(student);
        } catch (Exception e) {
            throw new RuntimeException("Fail to register new student");
        }
    }

    public Course registerNewCourse(Course course) {
        try {
            return courseRepository.save(course);
        } catch (Exception e) {
            throw new RuntimeException("Fail to register new course");
        }
    }

    public CourseRegistration addCourseRegistration(CourseRegistration courseRegistration) {
        log.info("Grade: {} RegisteredAt: {} Student: {} course: {}", courseRegistration.getGrade(), courseRegistration.getRegisteredAt(),
                courseRegistration.getId().getStudent().getId(), courseRegistration.getId().getCourse().getId());
      try {
            return registrationRepository.save(courseRegistration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Fail to register new course");
        }

    }

}
