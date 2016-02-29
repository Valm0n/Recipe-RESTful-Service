/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function () {
    angular.module('app')
            .service('IngredientType', ingredientType)

    ingredientType.$inject = ['$resource'];

    function ingredientType($resource) {
        return new $resource('/ingredientType');
    }
})();
