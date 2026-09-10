package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer 
{
	private Integer cno;
	private String cname;
	private double billAmo;
	private String[] col;
	private List<String> stud;
	private Set<Long> phono;
	private Map<String,Object> idDetails;

	private Company company;
	
}
