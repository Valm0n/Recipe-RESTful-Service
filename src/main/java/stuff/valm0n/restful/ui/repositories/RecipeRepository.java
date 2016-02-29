/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import stuff.valm0n.restful.ui.models.Recipe;

/**
 *
 * @author vsimon
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    public Recipe findById(Long id);
    public List<Recipe> findByNameContainingIgnoreCase(String name);}
