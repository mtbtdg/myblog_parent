//定义Controller
app.controller("indexController",function($scope,$http,$controller){

    // controller的继承，本质就是共用一个$scope
    $controller('baseController',{$scope:$scope});

    // 加载数据的方法
    $scope.reloadArticleList = function(){
        // 分页查询
        $http.post("index/findPage/"+$scope.paginationConf.currentPage+"/"+$scope.paginationConf.itemsPerPage).success(function(resp){
            if(resp.success){
                // 分页数据
                $scope.list = resp.data;
                // 总记录数
                $scope.paginationConf.totalItems = resp.total;
            }else{
                // 表示失败
                alert(resp.message);
            }
        });
    };


    $scope.getData = function (){
        this.reloadArticleList();
    }

});