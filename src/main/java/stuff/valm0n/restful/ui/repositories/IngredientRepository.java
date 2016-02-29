/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import stuff.valm0n.restful.ui.models.Category;
import stuff.valm0n.restful.ui.models.Ingredient;
import stuff.valm0n.restful.ui.models.IngredientType;

/**
 *
 * @author vsimon
 */
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    public Ingredient findById(Long id);
    public List<Ingredient> findByNameContainingIgnoreCase(String name);
    public List<Ingredient> findByNameContainingIgnoreCaseOrIngredientType(String name, IngredientType ingredientType);
    
//    @Query("select ingredient from Ingredient i inner join i.type ar where ar.idArea = :idArea")
//    public List<Ingredient> findAll();
}
