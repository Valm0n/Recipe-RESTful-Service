/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stuff.valm0n.restful.ui.models.Ingredient;
import stuff.valm0n.restful.ui.repositories.IngredientRepository;

/**
 *
 * @author vsimon
 */
@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    
    @Autowired
    IngredientRepository repository;
    
    @RequestMapping(value="", method=RequestMethod.GET)
    public List<Ingredient> getAllContaining(@RequestParam(value="name", defaultValue="") String name){
        return repository.findByNameContainingIgnoreCase(name);
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Ingredient getIngredient(@PathVariable("id") Long id){
        return repository.findById(id);
    }
    
    @RequestMapping(value="", method=RequestMethod.POST)
    public Ingredient saveNewIngredient(@RequestBody Ingredient ingredient){
        return repository.save(ingredient);
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteIngredient(@PathVariable("id") Long id){
        repository.delete(id);
    }
    
    
    
    
}
