package com.nt.service;

import java.util.List;

import com.nt.sbeans.RecipeBook;

public interface IRecipeBookService {

    public RecipeBook saveRecipe(RecipeBook recipe);

    public List<RecipeBook> saveAllRecipes(List<RecipeBook> recipes);

    public List<RecipeBook> getAllRecipes();

    public RecipeBook getRecipeById(Long id);

    public RecipeBook updateIngredients(Long id, List<String> ingredients);

    public String deleteRecipe(Long id);
}