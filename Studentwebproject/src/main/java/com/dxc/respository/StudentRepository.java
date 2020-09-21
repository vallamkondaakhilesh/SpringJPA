package com.dxc.respository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.beans.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
