/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

(function(){
    angular.module('app')
    .controller('ingredientCtrl', ingredientCtrl);

    ingredientCtrl.$inject = ['$scope','Ingredient','IngredientType'];

    function ingredientCtrl($scope, Ingredient, IngredientType){

        $scope.ingredients = [];
        $scope.ingredientTypes = [];

        $scope.newIngredient = {
            name: '',
            type: {},
            description: ''
        };

        function resetNewIngredient(){
            $scope.newIngredient = {
                name: '',
                type: {},
                description: ''
            };
        }

        Ingredient.query(function(ingredients){
            $scope.ingredients = ingredients;
        });

        IngredientType.query(function(ingredientTypes){
            $scope.ingredientTypes = ingredientTypes;
        });

        $scope.saveNewIngredient = function(){
            Ingredient.save($scope.newIngredient, function(success){
                $scope.ingredients.push(success);
                resetNewIngredient();
            }, function(err){
                console.log(err);
            });
        };
    }
})();