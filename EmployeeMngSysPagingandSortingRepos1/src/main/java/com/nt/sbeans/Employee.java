package com.nt.sbeans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="kohli")
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	@Id
	private Integer employeeId;
	private String employeeName;
	private String department;
	private Double salary; 

}
