

var itemModule = angular.module('itemModule', []);

itemModule.controller('itemCtrl', function ($scope, $http) {
    $scope.loadCats = function () {

        $scope.selectedCategory = null;
        $scope.categories = [];

        $http({
            method: 'GET',
            url: '/OSProc/categories/get'
        }).success(function (result) {
            $scope.categories = result;
        });
    }
    $scope.loadItems = function () {
        $scope.items = [];
        $http({
            method: 'GET',
            url: '/OSProc/items/get'
        }).success(function (result) {
            $scope.items = result;
        });
    }

    $scope.addItem = function () {
        // since we are getting a string in value of select box ; we now have to parse it as json again
        var categoryObj = JSON.parse($scope.selectedCategory);

        var specificationObj = {
            "bestBefore": $scope.bestBefore,
            "year": $scope.year,
            "price": $scope.price
        };

        var itemObj = {
            "name": $scope.name,
            "serialNo": $scope.serialNo,
            "category": categoryObj,
            "specification": specificationObj
        };
        console.log(itemObj);

        jQuery.ajax({
            contentType: 'application/json',
            dataType: 'json',
            type: "post",
            url: '/OSProc/items/add',
            data: JSON.stringify(itemObj),
            success: function (data) {
                showMessage('success', 'OS-PROC Message :  <strong>Success!! </strong>, Item Saved');
                $scope.loadItems();
                clearForm();
                //reload the Items Table with ajax request to get all Items
            },
            error: function (request, status, error) {
                showMessage('danger', 'OS-PROC Message :  <strong>Fail!! </strong>, Item Not Saved ,' + error + ':  Look at console for details');
                console.log(request.responseText);

            },
            complete: function (data) {
                //use this if the request takes longer time to show loading gif
            }
        });


        function showMessage(type, message) {
            $("#alert-area").append($("<div class='alert alert-" + type + " fade in' data-alert> " + message + "</div>"));
            $(".alert").delay(3000).fadeOut("slow", function () {
                $(this).remove();
            });
        }

    };

    function clearForm() {
        $("#serialNo").val("");
        $("#name").val("");
        jQuery("#bestBefore").val("");
        jQuery("#price").val("");
        jQuery("#year").val("");
        jQuery("#catagorySelect").selectedIndex = 0;
    }
//this is to load the catagories on page load
    $(document).ready(function () {
        $scope.loadCats();
        $scope.loadItems();

    });

});


function clearForm() {
    $("#serialNo").val("");
    $("#name").val("");
    jQuery("#bestBefore").val("");
    jQuery("#price").val("");
    jQuery("#year").val("");
    jQuery("#catagorySelect").selectedIndex = 0;
}

