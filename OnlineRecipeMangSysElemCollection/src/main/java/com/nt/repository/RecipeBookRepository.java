package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.sbeans.RecipeBook;

@Component
@Repository
public interface RecipeBookRepository extends JpaRepository<RecipeBook,Long>
{

}
