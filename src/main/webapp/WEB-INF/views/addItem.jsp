
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script src="/OSProc/resources/Angular/itemController.js"></script>
<div ng-app="itemModule">
    <div ng-controller="itemCtrl">

        <div class="row" >
            <form:form modelAttribute="item" class="form-horizontal"  id="itemForm">
                <div class="col-md-12 col-sm-12 col-xs-12 bg-white" >
                    <div class="row x_title">
                        <div class="col-md-6">
                            <h3>Item<small> add/search a new Item</small></h3>
                        </div>

                    </div>
                    <div class="col-md-9 col-sm-9 col-xs-12">

                        <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                        <div id="alert-area"></div>

                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Serial Number <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <form:input ng-model="serialNo" id="serialNo" path="serialNo" type="text"  class="form-control col-md-7 col-xs-12"/>
                                <form:errors path="serialNo" cssClass="text-danger"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Name <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <form:input  id="name" path="name" type="text" ng-model="name" class="form-control col-md-7 col-xs-12" />
                                <form:errors path="name" cssClass="text-danger"/>
                            </div>
                        </div>
                        <hr />
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Category <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">

                                <select id="catagorySelect"  name="category" ng-model="selectedCategory"  class="form-control col-md-7 col-xs-12">
                                    <option value="">Select a Category</option>
                                    <option ng:repeat="category in categories" value="{{category}}">{{category.name}}</option>
                                </select> 

                                <form:errors path="category" cssClass="text-danger"/>
                            </div>
                        </div>
                        <hr />
                        <!-- Specification Section -->
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Best Before <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input  id="bestBefore"  type="text" ng-model="bestBefore" class="form-control col-md-7 col-xs-12"  />

                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Estimated Price <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input  id="price"  type="text" ng-model="price" class="form-control col-md-7 col-xs-12" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Year <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input  id="year"  type="text" ng-model="year" class="form-control col-md-7 col-xs-12"  />

                            </div>
                        </div>
                    </div>


                    <!--The Actions--> 
                    <div class="col-md-3 col-sm-3 col-xs-12 ">
                        <div class="x_title">
                            <h2>Choose Your Action</h2>
                            <div class="clearfix"></div>
                        </div>

                        <div class="col-md-12 col-sm-12 col-xs-6">
                            <div class="x_content">
                                <div class="buttons" style="text-align:center;margin:auto;">
                                    <button type="button" class="btn btn-danger btn-lg" style="width:250px" id="btnClear" onClick="clearForm()" ng-click="clearForm()" ><i class="success fa fa-eraser pull-left"  ></i> Clear Form/Result</button>
                                    <br>
                                    <button type="button" class="btn btn-info btn-lg" style="width:250px"><i class="success fa fa-search pull-left"></i> Search Item/Request</button>
                                    <br>
                                    <button type="button" class="btn btn-success btn-lg" style="width:250px" id="btnAdd"  ng-click="addItem()" ><i class="success fa fa-save pull-left"></i> Add Item</button>
                                    <br>

                                </div>
                            </div>

                        </div>


                    </div>
                </div>
            </form:form>
        </div>

        <div class="row">
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
                                            <th class="column-title">Select  </th>
                                            <th class="column-title">Serial No </th>
                                            <th class="column-title"> Item Name</th>
                                            <th class="column-title">Category</th>
                                            <th class="column-title">Best Before</th>
                                            <th class="column-title">Estimated Price </th>
                                            <th class="column-title">Year </th>
                                           
                                        </tr>
                                    </thead>

                                    <tbody>
                                        <tr ng-repeat="item in items">
                                              <td class="a-center ">
                                                     <input type="checkbox" class="flat" name="table_records">
                                             </td>
                                            <td>{{ item.serialNo}}</td>
                                            <td>{{ item.name}}</td>
                                            <td>{{ item.category.name}}</td>
                                            <td>{{ item.specification.bestBefore}}</td>
                                            <td>{{ item.specification.price}}</td>
                                            <td>{{ item.specification.year}}</td>
                                          
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
    </div>
</div>
<script src="/OSProc/resources/js/bootstrap.min.js"></script>

<!-- input mask -->
<script src="/OSProc/resources/js/input_mask/jquery.inputmask.js"></script>
<script>
                                                $(document).ready(function () {
                                                    $(":input").inputmask();
                                                });
</script>