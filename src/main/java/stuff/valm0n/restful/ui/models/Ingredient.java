/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author vsimon
 */
@Entity
public class Ingredient extends GenericModel implements Serializable {
    
    @ManyToOne(cascade=CascadeType.DETACH, fetch=FetchType.EAGER)
    @JoinColumn(name="INGREDIENT_TYPE")
    private IngredientType ingredientType;

    public Ingredient(){}
    
    public IngredientType getType() {
        return ingredientType;
    }

    public void setType(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    } 
}
