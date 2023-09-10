package com.TestProject.Repository;

import com.TestProject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select e from Student e where e.firstname=:firstname")
    public List<Student> getAllByFirstName(@Param("firstname") String firstname);

//    @Query("SELECT COUNT(s) FROM Student s WHERE s.firstname = :firstname")
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Student s WHERE s.firstname = ?1")
    public boolean isExistsByFirstName(@Param("firstname") String firstname);

    @Query("select case when count(s) > 0 then true else false end from Student s where s.username =:username")
    public boolean isExistByUsername(@Param("username")String username);

    @Query("select e from Student e where e.lastname=:firstname")
    public List<Student> getByLastName(@Param("firstname") String lastname);

    @Query("select e from Student e where e.firstname=?1 and e.lastname=?2")
    public List<Student> findByIndex(String firstname, String lastname);

    @Query("select s.email,s.password from Student s")
    List<Object> getEmailAndPassword();

    @Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Student s WHERE s.email=:email")
    public boolean isExistByEmail(@Param("email") String email);
}


