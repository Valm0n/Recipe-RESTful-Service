/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

(function(){
    angular.module('app')
    .controller('ingredientTypeCtrl', ingredientCtrl);

    ingredientCtrl.$inject = ['$scope','IngredientType'];

    function ingredientCtrl($scope, IngredientType){

        $scope.ingredientTypes = [];

        $scope.newIngredientType = {
            name: '',
            description: ''
        };

        function resetNewIngredientType(){
            $scope.newIngredientType = {
                name: '',
                description: ''
            };
        }

        IngredientType.query(function(ingredientTypes){
            $scope.ingredientTypes = ingredientTypes;
        });

        $scope.saveNewIngredientType = function(){
            IngredientType.save($scope.newIngredientType, function(success){
                $scope.ingredientTypes.push(success);
                resetNewIngredientType();
            }, function(err){
                console.log(err);
            });
        };
    }
})();