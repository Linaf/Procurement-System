
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script src="/OSProc/resources/Angular/controllers.js"></script>
<div ng-app="requestModule">
    <div ng-controller="requestCtrl">

        
 <div class="row">
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="dashboard_graph">

              <div class="row x_title">
                <div class="col-md-6">
                </div>
                
              </div>

              <div class="col-md-9 col-sm-9 col-xs-12">
 
 
                  <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" style="right:10%">

                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12 pull-right" for="request-title">Request Date  <span id="requestDate"></span>
                      </label>
                      
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="closing-date">Requesting Org Unit  <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="closing-date"   ng-model="requestingOrgUnit" class="form-control col-md-7 col-xs-12">
                      </div>
                    </div>

                    <hr />
                     <div class="form-group " >
                         <label class="control-label col-md-3 col-sm-3 col-xs-12 ">Add Request Items <span class="required">*</span></label> 
                    

                        <div class="col-md-9 col-sm-9 col-xs-12">

                           <div class ="col-md-4 col-sm-3 col-xs-6">
                               <label class ="col-md-4 col-sm-3 col-xs-6 " >Items</label>
                               <div class ="col-md-9 col-sm-9 col-xs-6">

                                   <select id="catagorySelect"  name="category" ng-model="selectedCategory"  class="form-control col-md-7 col-xs-12">
                                      <option>-- Select Items --</option>
                                        <option ng:repeat="item in items" value="{{item}}">{{item.name}}</option>
                                </select> 

                              </div>
                          </div>
               
                        <div class ="col-md-3 col-sm-3 col-xs-6"> 
                            <label  class ="col-md-4 col-sm-3 col-xs-6">Quantity</label>
                                <div  class ="col-md-9 col-sm-3 col-xs-6"> 
                                     <input ng-model="quantity" type="text" id="closing-date"  class="form-control col-md-7 col-xs-12" />
                                </div> 
                          </div>

                          <div class ="col-md-3 col-sm-3 col-xs-6"> 
                          <i class="fa fa-plus fa-2x" aria-hidden="true" ></i>
                          </div>
                    
                      </div>
                    
                      </div>

                      <hr />


                    
                 
                  </form>
              
            
          





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
                    <button type="button" class="btn btn-info btn-lg" style="width:250px"><i class="success fa fa-search pull-left"></i> Search Request</button>
                    <br>
                    <button type="button" class="btn btn-success btn-lg" style="width:250px"><i class="success fa fa-save pull-left"></i> Request Items</button>
                   
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
                        <th>
                          <input type="checkbox" id="check-all" class="flat">
                        </th>
                       
                        <th class="column-title">Request Name</th>
                        <th class="column-title no-link last"><span class="nobr">Detail</span>
                        </th>
                        <th class="bulk-actions" colspan="7">
                          <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
                        </th>
                      </tr>
                    </thead>

                    <tbody>
                      <tr class="even pointer">
                        <td class=" ">May 23, 2014 11:47:56 PM </td>
                        <td class=" ">Information System</td>
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


<script src="/OSProc/resources/js/bootstrap.min.js"></script>

<!-- input mask -->
<script src="/OSProc/resources/js/input_mask/jquery.inputmask.js"></script>
<script>
                                                $(document).ready(function () {
                                                    $(":input").inputmask();
                                                });
</script>