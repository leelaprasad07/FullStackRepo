package com.nt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer>
{
	
}
