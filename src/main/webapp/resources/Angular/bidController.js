
//Bids Module

var bidModule = angular.module('bidModule', []);

    bidModule.controller('bidCtrl', function ($scope, $http) {
        
        $scope.requests = []; // all approved Requests as per the perspective are Bids from this point forward.
        $scope.loadBids = function () {
            $scope.bids = [];
            $http({
                   method: 'GET',
                   url: '/OSProc/requests/get/approved'
            }).success(function (result) {
                    $scope.requests = result;
            });
        };
        $scope.setForm = function (request) {
            $scope.id = request.id;
            $scope.approvedDate = request.approvedDate;
            $scope.status = request.requestStatus;
            $scope.date = new Date();
            $scope.supplierName = "Dummy Data";
            $scope.request = request;
                  
        };
    
    $scope.addSupplierBid = function () {
         
         var supplierObj = {
            "businessRegNo": "8262hata7202",
            "buisnessType": "Stationary",
            "id":1,
            "name": "Bre Lala Entertainment",
            "rank": "0.99"
        };
        // Get this supplier Id from the session as the user etts logged in
  
        var supplierBidObj = {
            "requestId": $scope.request,
            "amount": $scope.amount,
            "date": "2001-11-11",
            "supplierId": supplierObj
         };
        
        console.log(supplierObj);
     
        jQuery.ajax({
            contentType: 'application/json',
            dataType: 'json',
            type: "post",
            url: '/OSProc/supplierBids/add',
            data: JSON.stringify(supplierBidObj),
            success: function (data) {
                showMessage('success', 'OS-PROC Message :  <strong>Success!! </strong>, Bid Submitted');
                console.log(data);
                clearForm();
            },
            error: function (request, status, error) {
                showMessage('danger', 'OS-PROC Message :  <strong>Fail!! </strong>, Bid Not Saved ,' + error + ':  Look at console for details');
                console.log(request.responseText);
            
            },
            complete: function (data) {
                console.log(data);
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
        jQuery("#id").val("");
       
    }
    //this is to load the catagories on page load
    $(document).ready(function () {
        $scope.loadBids();
        
        
        

    });
    
});
