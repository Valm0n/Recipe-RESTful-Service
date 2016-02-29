/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author vsimon
 */
@Entity
public class Recipe extends GenericModel implements Serializable {
    
    private String steps;
    private int difficulty;
    private int price;
    
    @ManyToMany
    @JoinTable(name="REL_RECIPE_INGREDIENTS",
      joinColumns=@JoinColumn(name="RECIPE_ID", referencedColumnName="ID"),
      inverseJoinColumns=@JoinColumn(name="INGREDIENT_ID", referencedColumnName="ID"))
    private Set<Ingredient> ingredients;
    
    @ManyToMany
    @JoinTable(name="REL_RECIPE_CATEGORIES",
      joinColumns=@JoinColumn(name="RECIPE_ID", referencedColumnName="ID"),
      inverseJoinColumns=@JoinColumn(name="CATEGORY_ID", referencedColumnName="ID"))
    private Set<Category> categories;

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
    
    
}
