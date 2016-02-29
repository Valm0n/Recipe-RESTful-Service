/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular.module('app', ['ngResource','smart-table', 'ui.router'])
        .filter('serialize', function(){
            return function(input){
                var output = "";
                if(Array.isArray(input)){
                    switch(input.length){
                        case 0:
                            break;
                        case 1:
                            output = input[0].name;
                            break;
                        case 2:
                            output = input[0].name + ", " + input[1].name;
                            break;
                        default:
                            output = input[0].name + ", " + input[1].name + ", ...";
                    }
                }
                return output;
            }
    })
        .filter('difficulty', function(){
            return function(input){
                var output = "\u2605";
                if(angular.isNumber(input)){
                    for(var i=1; i < input; i++){
                        output += "\u2605";
                    }
                }
                return output;
            }
    });