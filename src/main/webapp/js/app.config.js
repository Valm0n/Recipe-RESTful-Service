/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function(){
    angular.module('app')
    .run(['$rootScope', '$state', '$stateParams', 
                function($rootScope, $state, $stateParams){
                    $rootScope.state = $state;
                    $rootScope.stateParams = $stateParams;
                }
            ]
        )
    .config(['$stateProvider', '$urlRouterProvider', '$httpProvider',
                function($stateProvider, $urlRouterProvider, $httpProvider) {
                    
                    $urlRouterProvider.otherwise('/');
                    
                    $stateProvider
                        .state('app', {
                            abstract: true,
                            template: '<ui-view/>'
                    })
                        .state('app.recipes', {
                            url: "/",
                            templateUrl: 'partials/recipes.html',
                            controller: 'recipeCtrl',
                    })
                        .state('app.ingredients', {
                            url: "/ingredients",
                            templateUrl: 'partials/ingredients.html',
                            controller: 'ingredientCtrl'
                    })
                        .state('app.ingredientTypes', {
                            url: "/ingredientTypes",
                            templateUrl: 'partials/ingredientTypes.html',
                            controller: 'ingredientTypeCtrl'
                    });
                        
                        
                    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
                }
            ]
        );
})();