package com.TestProject.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void getByFirstName() {
        boolean isExists = studentRepository.isExistsByFirstName("fahim");
        assertThat(isExists).isTrue();
    }

    @Test
    void isExistByUsername() {
        boolean isExistByUsername = studentRepository.isExistByUsername("mahbu");
        assertThat(isExistByUsername).isTrue();
    }

    @Test
    void isExistByEmail() {
        boolean check = studentRepository.isExistByEmail("shohag@gmail.com");
        assertThat(check).isTrue();
    }
}