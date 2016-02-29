/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff.valm0n.restful.ui.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stuff.valm0n.restful.ui.models.IngredientType;
import stuff.valm0n.restful.ui.repositories.IngredientTypeRepository;

/**
 *
 * @author vsimon
 */
@RestController
@RequestMapping("/ingredientType")
public class IngredientTypeController {
    
    @Autowired
    IngredientTypeRepository repository;
    
    @RequestMapping(value="", method=RequestMethod.GET)
    public List<IngredientType> getAll(){
        return repository.findAll();
    }
    
    @RequestMapping(value="", method=RequestMethod.POST)
    public IngredientType saveIngredientType(@RequestBody IngredientType type){
        return repository.save(type);
    }
}
