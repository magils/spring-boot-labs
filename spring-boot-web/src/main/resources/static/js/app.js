/**
 * Created by mgil on 4/1/17.
 */

var app = angular.module('myApp',['restangular']);

app.controller('myCtrl',function($scope) {
    $scope.hello = 'Hello From Angular';
});

app.controller('ItemsRequestController',function($scope,$http){

      $http.get("http://localhost:8080/demo/items").then(
          function mySucess(response){
              $scope.items = response.data;
       });

 });


app.controller('AddItemController',['$scope','Restangular',function($scope,Restangular){

    $scope.newItem = {};

    $scope.addNewItem  = function() {
        Restangular.all('demo/items').post($scope.newItem);
    };

}]);