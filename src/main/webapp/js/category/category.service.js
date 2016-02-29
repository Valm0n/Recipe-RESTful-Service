/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

(function(){
    angular.module('app')
    .service('Category', category);
    
    category.$inject = ['$resource'];
    
    function category($resource){
        return new $resource('/categories');
    }
})();
