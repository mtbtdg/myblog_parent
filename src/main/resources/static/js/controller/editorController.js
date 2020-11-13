//定义Controller
app.controller("editorController",function($scope,$http,$controller){

    // controller的继承，本质就是共用一个$scope
    $controller('baseController',{$scope:$scope});


});