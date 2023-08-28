package com.hibernate.secondL2.rest;

import com.hibernate.secondL2.dto.CourseRegistrationDto;
import com.hibernate.secondL2.entity.Course;
import com.hibernate.secondL2.entity.CourseRegistration;
import com.hibernate.secondL2.entity.Student;
import com.hibernate.secondL2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course-registration")
@RequiredArgsConstructor
public class CourseRegistrationController {
private final StudentService service;
    private final ModelMapper modelMapper = new ModelMapper();

    @PostMapping
    public ResponseEntity<CourseRegistration> addCourseRegistration(@RequestBody CourseRegistrationDto registrationDto){
      //  return new ResponseEntity<>(service.addCourseRegistration(convertToEntity(registrationDto)), HttpStatus.CREATED);
      return new ResponseEntity<>(service.addCourseRegistration(modelMapper.map(registrationDto, CourseRegistration.class)), HttpStatus.CREATED);
    }

    private CourseRegistration convertToEntity(CourseRegistrationDto registrationDto){
        return CourseRegistration.builder()
                .id(new CourseRegistration.PK(Student.builder().id(registrationDto.getId().getStudent()).build(),
                        Course.builder().id(registrationDto.getId().getCourse()).build()))
                .grade(registrationDto.getGrade())
                .build();
    }
}
