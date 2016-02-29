/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

(function(){
    angular.module('app')
    .controller('recipeCtrl', recipeCtrl);

    recipeCtrl.$inject = ['$scope','Recipe','Category','Ingredient'];

    function recipeCtrl($scope, Recipe, Category, Ingredient){

        $scope.recipes = [];
        $scope.ingredients = [];
        $scope.categories = [];

        $scope.newRecipe = {
            name: '',
            description: '',
            steps: '',
            difficulty: 0,
            price: 0,
            ingredients: [],
            categories: []
        };

        function resetNewRecipe(){
            $scope.newRecipe = {
                name: '',
                description: '',
                steps: '',
                difficulty: 0,
                price: 0,
                ingredients: [],
                categories: []
            };
        }

        Recipe.query(function(recipes){
            $scope.recipes = recipes;
        });
        Category.query(function(categories){
            $scope.categories = categories;
        });
        Ingredient.query(function(ingredients){
            $scope.ingredients = ingredients;
        });

        $scope.saveNewRecipe = function(){
            Recipe.save($scope.newRecipe, function(success){
                $scope.recipes.push(success);
                resetNewRecipe();
            }, function(err){
                console.log(err);
            });
        };
    }
})();