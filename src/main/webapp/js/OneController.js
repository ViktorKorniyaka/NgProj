app.controller('One', ['$scope', '$http', function ($scope, $http) {
    $scope.name = 'One and Only One';

    $scope.loadRes = function() {
        $http.get("/rest/home")
            .success(function (data) {
                $scope.res = data;
            });
    }


}]);