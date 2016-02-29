/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function () {
    angular.module('app')
            .service('Recipe', recipe)

    recipe.$inject = ['$resource'];

    function recipe($resource) {
        return new $resource('/recipes');
    }
})();
