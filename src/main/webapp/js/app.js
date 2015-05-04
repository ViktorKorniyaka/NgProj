var app = angular.module('app', ['ngRoute','ngTable']);

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/one', {
        templateUrl: '/html/tmpl/one.html',
        controller: 'One'
    });
    $routeProvider.when('/two', {
        templateUrl: '/html/tmpl/two.html',
        controller: 'Two'
    });
    $routeProvider.when('/login', {
        templateUrl: '/html/tmpl/login.html',
        controller: 'Login'
    });
    $routeProvider.when('/access', {
        templateUrl: '/html/tmpl/access.html',
        controller: 'Access'
    });
    $routeProvider.when('/menu', {
        templateUrl: '/html/tmpl/menuTmpl.html',
        controller: 'modalDemo'
    });

    $routeProvider.otherwise({redirectTo: '/login'});
}]);


