/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author vsimon
 */
@Entity
@Table(name = "INGREDIENT_TYPE")
public class IngredientType extends GenericModel implements Serializable {
}
