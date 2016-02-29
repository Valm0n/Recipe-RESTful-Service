/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import stuff.valm0n.restful.ui.models.IngredientType;

/**
 *
 * @author vsimon
 */
public interface IngredientTypeRepository extends JpaRepository<IngredientType, Long> {}
