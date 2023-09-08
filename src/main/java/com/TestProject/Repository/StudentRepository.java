package com.TestProject.Repository;

import com.TestProject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select e from Student e where e.firstname=:firstname")
    public List<Student> getByFirstName(@Param("firstname") String firstname);

    @Query("select e from Student e where e.lastname=:firstname")
    public List<Student> getByLastName(@Param("firstname") String lastname);

    @Query("select e from Student e where e.firstname=?1 and e.lastname=?2")
    public List<Student> findByIndex(String firstname, String lastname);

    }


