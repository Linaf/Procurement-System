<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script src="/OSProc/resources/Angular/bidController.js"></script>
<div ng-app="bidModule">
    <div ng-controller="bidCtrl">
<div class="row" >
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="dashboard_graph">

              <div class="row x_title">
                <div class="col-md-6">
                <h3>Bid<small> Bid  Application Form</small></h3>
                </div>
                
              </div>

              <div class="col-md-9 col-sm-9 col-xs-12">
                
    <div id="alert-area"></div>
                  <div class="form-horizontal form-label-left"  >

                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Request Title <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                            <input ng-model="id" id="id"  disabled="disabled"  type="text"  class="form-control col-md-7 col-xs-12"/>
                         
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="approvedDate">Date Posted  <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                         <input ng-model="approvedDate" id="approvedDate"  disabled="disabled"  type="text"  class="form-control col-md-7 col-xs-12"/>
                      </div>
                    </div>
                      
                    <div class="form-group">
                      <label for="status" class="control-label col-md-3 col-sm-3 col-xs-12">Status<span class="required">*</span>
                      </label> 
                      <div class="col-md-6 col-sm-6 col-xs-12">
                         <input ng-model="status" id="status"  disabled="disabled"  type="text"  class="form-control col-md-7 col-xs-12"/>
                      </div>
                    </div>
                    
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12">Date Submitted <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="date" ng-model="date" value=""  disabled="disabled"  class="date-picker form-control col-md-7 col-xs-12" required="required" type="text">
                      </div>
                    </div>
                      
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12">Submitted By <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="supplierName" ng-model="supplierName" value="Dummy Value"  disabled="disabled"  class="date-picker form-control col-md-7 col-xs-12" required="required" type="text">
                      </div>
                    </div>
                    
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12">Amount<span class="required">* </span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="amount" ng-model="amount" value=""  class="date-picker form-control col-md-7 col-xs-12" required="required" type="text"> <em>(in USD)</em>
                      </div>
                    </div>
                    

                  </div>
              
            
          





              </div>
              <div class="col-md-3 col-sm-3 col-xs-12 bg-white">
                <div class="x_title">
                  <h2>Choose Your Action</h2>
                  <div class="clearfix"></div>
                </div>

                <div class="col-md-12 col-sm-12 col-xs-6">
                  <div>
                     
                        <div class="x_content">
                  <div class="buttons" style="text-align:center;margin:auto;">
                    <!-- Standard button -->
                    <button type="button" class="btn btn-danger btn-lg" style="width:250px"><i class="success fa fa-eraser pull-left"></i> Clear Form/Result</button>
                    <br>
                    <button type="button" class="btn btn-info btn-lg" style="width:250px"><i class="success fa fa-search pull-left"></i> Search Bid/Request</button>
                    <br>
                    <button type="button" class="btn btn-success btn-lg" ng-click="addSupplierBid()" style="width:250px"><i class="success fa fa-save pull-left"></i> Apply To Bid</button>
                   
                    <br>
                  </div>
                </div>


                  </div>
                
                </div>
               

              </div>

              <div class="clearfix"></div>
            </div>
          </div>

        </div>
        <br />

        <div class="row" >
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="dashboard_graph">

              <div class="row x_title">
                <div class="col-md-6">
                  <h3>Requests<small> Open / Closed Bids</small></h3>
                </div>
             <div class="col-md-6"> 
                  <div id="reportrange" class="pull-right" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                    <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                    <span>December 30, 2014 - January 28, 2015</span> <b class="caret"></b>
                  </div>
                </div>
              </div>

          <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Show Open Bids</a>
                        </li>
                        <li><a href="#">Show Closed Bids</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>

                <div class="x_content">

                  

                  <table class="table table-striped responsive-utilities jambo_table bulk_action">
                    <thead>
                      <tr class="headings">
                        <th class="column-title">Request No </th>
                        <th class="column-title">Date Posted</th>
                        <th class="column-title">Status </th>
                        <th class="column-title no-link last"><span class="nobr">Detail</span>
                        </th>
                        
                      </tr>
                    </thead>

                                    
                    <tbody>
                      <tr ng-repeat="request in requests" ng-click="setForm(request)">
                      
                        <td class=" ">{{request.id}}</td>
                        <td class=" ">{{request.approvedDate}} </td>
                        <td class=" "> <span class="label label-success col-sm-9">Open</span></td>
                        <td class=" last"><a href="#">View </a> <i class="success fa fa-plus"></i>
                        </td>
                      </tr>
                      
                    </tbody>

                  </table>
                </div>
              </div>
            </div>
                

              <div class="clearfix"></div>
            </div>
          </div>

        </div>
        <br />
    </div>
</div>
