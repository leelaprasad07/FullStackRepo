package com.nt.sbeans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="recipe_book")
public class RecipeBook 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recipeId;
	
	private String recipeName;
	
	private String cuisine;
	
	@ElementCollection
	@CollectionTable(
			name="recipe_ingredients",
			joinColumns=@JoinColumn(name="recipe_id")
			)
	@Column(name="ingredient")
	private List<String> ingredients =new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(
			name="recipe_tips",
			joinColumns=@JoinColumn(name="recipe_id")
			)
	@Column(name="tip")
	private Set<String> cookingTips=new HashSet<>();

	public void setIngredients(List<String> ingredients) {
	    this.ingredients = ingredients;
	}

}
