package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="lip")
@Data
public class Student implements Serializable
{
	@Id
	@SequenceGenerator(
		    name="gen1",
		    sequenceName="stu_id_seq",
		    initialValue=1,
		    allocationSize=1
		)
		@GeneratedValue(
		    generator="gen1",
		    strategy=GenerationType.SEQUENCE
		)
    private Integer stuId;
	@Column(length=20)
	private String stuName;
	@Column(length=20)
	private String course;
	@Column(length=20)
	private Integer year;
	@Column(length=20)
	private String dept;
}
