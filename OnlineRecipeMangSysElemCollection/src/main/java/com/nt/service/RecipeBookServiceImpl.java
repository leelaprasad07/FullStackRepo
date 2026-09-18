package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.RecipeBookRepository;
import com.nt.sbeans.RecipeBook;

@Service
public class RecipeBookServiceImpl implements IRecipeBookService {

    @Autowired
    private RecipeBookRepository repo;

    @Override
    public RecipeBook saveRecipe(RecipeBook recipe) {
        return repo.save(recipe);
    }

    @Override
    public List<RecipeBook> saveAllRecipes(List<RecipeBook> recipes) {
        return repo.saveAll(recipes);
    }

    @Override
    public List<RecipeBook> getAllRecipes() {
        return repo.findAll();
    }

    @Override
    public RecipeBook getRecipeById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() ->
                   new RuntimeException("Recipe not found with ID : " + id));
    }

    @Override
    public RecipeBook updateIngredients(Long id, List<String> ingredients) {

        RecipeBook recipe = getRecipeById(id);

        recipe.setIngredients(ingredients);

        return repo.save(recipe);
    }

    @Override
    public String deleteRecipe(Long id) {

        RecipeBook recipe = getRecipeById(id);

        repo.delete(recipe);

        return "Recipe deleted successfully with ID : " + id;
    }
}