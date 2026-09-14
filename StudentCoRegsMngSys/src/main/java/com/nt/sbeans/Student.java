package com.nt.sbeans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="stu")
@AllArgsConstructor
@NoArgsConstructor
public class Student 
{
	@Id
	@Column(name="stu_id")
	private Integer studentId;
	private String studentname;
	private String course;
	private double fee;
	private String instiName;
}
