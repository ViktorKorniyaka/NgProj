app.controller('Login', ['$scope', '$http', function ($scope, $http, $location) {
    $scope.login = 'login and login login';
    $scope.go = function(){
        $scope.goiswork = 'goiswork';
        /*$location.absUrl('/two');*/
        window.location.href =  '/#/two';

    };
    $scope.sign = function() {
        $scope.goiswork = 'goiswork';
        var dataObj = {
            login : $scope.login,
            password : $scope.password
        };

        $http.post('/rest/admin/authenticated', dataObj)
            .success(function(data) {
                if(data == 'ok'){
                    window.location.href =  '/#/two';
                    $scope.mess = data;
                } else{
                    window.location.href =  '/#/login';
                    $scope.mess = data;
                }
                /*почему то в ответ нет - ответа*/

            })
            .error(function(data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
                $scope.mess = 'field error -  '+data;
            });

    };
    /*$scope.load = function() {
        $http.get("/rest/home")
            .success(function (data) {
                $scope.res = data;
            });
    }*/


}]);