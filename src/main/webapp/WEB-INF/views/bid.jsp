 <div class="row">
          <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="dashboard_graph">

              <div class="row x_title">
                <div class="col-md-6">
                <h3>Bid<small> Bid  Application Form</small></h3>
                </div>
                
              </div>

              <div class="col-md-9 col-sm-9 col-xs-12">
                
 
                  <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="request-title">Request Title <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" disabled="disabled" id="request-title" name="requestTitle" required="required" class="form-control col-md-7 col-xs-12"><em>(Choose Request)</em>
                      </div>
                    </div>
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="closing-date">Closing Date  <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="closing-date"  disabled="disabled"  name="closingDate" required="required" class="form-control col-md-7 col-xs-12">
                      </div>
                    </div>
                    <div class="form-group">
                      <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Bid Amount <span class="required">*</span>
                      </label> 
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="bid-amount" class="form-control col-md-7 col-xs-12" type="text" name="bidAmount"> <em>(Amount in $) </em>
                      </div>
                    </div>
                    
                    <div class="form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12">Date Submitted <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="dateSubmitted" value=""  disabled="disabled"  class="date-picker form-control col-md-7 col-xs-12" required="required" type="text">
                      </div>
                    </div>
                    
                    <div class="form-group">
                  
                    </div>

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
                    <button type="button" class="btn btn-info btn-lg" style="width:250px"><i class="success fa fa-search pull-left"></i> Search Bid/Request</button>
                    <br>
                    <button type="button" class="btn btn-success btn-lg" style="width:250px"><i class="success fa fa-save pull-left"></i> Apply To Bid</button>
                   
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
                        <th class="column-title">Request No </th>
                        <th class="column-title">Date Posted</th>
                        <th class="column-title">Closing Date</th>
                        <th class="column-title">Requesting Org Unit </th>
                        <th class="column-title">Status </th>
                        <th class="column-title">Estimated Amount </th>
                        <th class="column-title no-link last"><span class="nobr">Detail</span>
                        </th>
                        <th class="bulk-actions" colspan="7">
                          <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
                        </th>
                      </tr>
                    </thead>

                    <tbody>
                      <tr class="even pointer">
                        <td class="a-center ">
                          <input type="checkbox" class="flat" name="table_records">
                        </td>
                        <td class=" ">121000040</td>
                        <td class=" ">May 23, 2014 11:47:56 PM </td>
                        <td class=" ">May 23, 2014 11:47:56 PM </td>
                        <td class=" ">Information System</td>
                        <td class=" "> <span class="label label-success col-sm-9">Open</span></td>
                        <td class="a-right a-right ">$7.45</td>
                        <td class=" last"><a href="#">View </a> <i class="success fa fa-plus"></i>
                        </td>
                      </tr>
                      <tr class="odd pointer">
                        <td class="a-center ">
                          <input type="checkbox" class="flat" name="table_records">
                        </td>
                        <td class=" ">121000039</td>
                        <td class=" ">May 23, 2014 11:30:12 PM</td>
                        <td class=" ">May 23, 2014 11:47:56 PM  
                        </td>
                        <td class=" ">Building and  Mantainance</td>
                        <td class=" "><span class="label label-warning col-sm-9">Closing Soon</span></td>
                        <td class="a-right a-right ">$741.20</td>
                        <td class=" last"><a href="#">View</a> <i class="success fa fa-plus"></i>
                        </td>
                      </tr>
                      <tr class="even pointer">
                        <td class="a-center ">
                          <input type="checkbox" class="flat" name="table_records">
                        </td>
                        <td class=" ">121000038</td>
                        <td class=" ">May 24, 2014 10:55:33 PM</td>
                        <td class=" ">May 23, 2014 11:47:56 PM  </i>
                        </td>
                        <td class=" ">Security</td>
                        <td class=" "><span class="label label-danger col-sm-9" >Closed</span></td>
                        <td class="a-right a-right ">$432.26</td>
                        <td class=" last"><a href="#">View</a> <i class="success fa fa-plus"></i>
                        </td>
                      </tr>
                      <tr class="odd pointer">
                        <td class="a-center ">
                          <input type="checkbox" class="flat" name="table_records">
                        </td>
                        <td class=" ">121000037</td>
                        <td class=" ">May 24, 2014 10:52:44 PM</td>
                        <td class=" ">May 23, 2014 11:47:56 PM </td>
                        <td class=" ">Public Affairs</td>
                        <td class=" "><span class="label label-info col-sm-9"  >Approved</span></td>
                        <td class="a-right a-right ">$333.21</td>
                        <td class=" last"><a href="#">View</a> <i class="success fa fa-plus"></i>
                        </td>
                      </tr>
                      <tr class="even pointer">
                        <td class="a-center ">
                          <input type="checkbox" class="flat" name="table_records">
                        </td>
                        <td class=" ">121000040</td>
                        <td class=" ">May 24, 2014 11:47:56 PM </td>
                        <td class=" ">May 23, 2014 11:47:56 PM </td>
                        <td class=" ">CEO</td>
                        <td class=" "><span class="label label-info col-sm-9">Approved</span></td>
                        <td class="a-right a-right ">$7.45</td>
                        <td class=" last"><a href="#">View</a> <i class="success fa fa-plus"></i>
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
