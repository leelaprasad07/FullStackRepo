package com.nt;

import java.util.List;
//import jakarta.persistence.*;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.repository.RecipeBookRepository;
import com.nt.sbeans.RecipeBook;
import com.nt.service.IRecipeBookService;

@SpringBootApplication
public class OnlineRecipeMangSysElemCollectionApplication implements CommandLineRunner
{
	@Autowired
	private RecipeBookRepository recipeBook;
    @Autowired
    private IRecipeBookService service;
	public static void main(String[] args) 
	{
		SpringApplication.run(OnlineRecipeMangSysElemCollectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		RecipeBook r1=new RecipeBook(null,
				"Paneer Butter Masala",
                "Indian",
                List.of("Paneer", "Butter", "Tomato", "Cream"),
                Set.of("Use fresh paneer", "Cook on low flame")
				);
		
		
		RecipeBook r2 = new RecipeBook(null,
                "Fried Rice",
                "Chinese",
                List.of("Rice", "Carrot", "Beans", "Soy Sauce"),
                Set.of("Use cold rice"));
		
		 RecipeBook r3 = new RecipeBook(null,
                 "Pasta Alfredo",
                 "Italian",
                 List.of("Pasta", "Cheese", "Milk"),
                 Set.of("Do not overcook pasta"));

         RecipeBook r4 = new RecipeBook(null,
                 "Tacos",
                 "Mexican",
                 List.of("Tortilla", "Chicken", "Lettuce"),
                 Set.of("Serve hot"));

         RecipeBook r5 = new RecipeBook(null,
                 "Sushi",
                 "Japanese",
                 List.of("Rice", "Fish", "Seaweed"),
                 Set.of("Use fresh fish"));
         
         recipeBook.saveAll(List.of(r1,r2,r3,r4,r5));
         
         System.out.println("\n===== ALL RECIPES =====");
         recipeBook.findAll().forEach(System.out::println);
         
         System.out.println("\n===== FIND BY ID =====");
         RecipeBook recipe = recipeBook.findById(2L).orElse(null);    
         if (recipe != null) {
             System.out.println(recipe);

             System.out.println("Ingredients:");
             service.getAllRecipes()
                    .forEach(System.out::println);

             System.out.println("Cooking Tips:");
             service.getAllRecipes()
                    .forEach(System.out::println);
         }
      // UPDATE INGREDIENTS

         System.out.println("\n===== UPDATE INGREDIENTS =====");

         if (recipe != null) {
             recipe.setIngredients(
                     List.of("Paneer",
                             "Butter",
                             "Tomato",
                             "Cream",
                             "Cashew Paste"));

             service.saveRecipe(recipe);

             System.out.println("Updated Recipe:");
             
            		RecipeBook b= service.updateIngredients(2L,List.of("wheat","rice"));
            		System.out.println(b);
         }

         // DELETE

         System.out.println("\n===== DELETE RECIPE =====");

        System.out.println(service.deleteRecipe(2L));

         System.out.println("Remaining Records:");
         service.getAllRecipes()
                 .forEach(System.out::println);
     };
 }
