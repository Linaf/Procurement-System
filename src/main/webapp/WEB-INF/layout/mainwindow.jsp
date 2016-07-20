<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel='shortcut icon' href='<c:url value="/resources/images/favicon-opera.ico" />' type='image/x-icon' />
  <title>OS-Proc | </title>
   
  <!--Jquery Online-->
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.4.min.js"></script>
  
  <!--Angular Library Online-->
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
  
  <!-- Bootstrap core CSS Local -->
  <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">

  <link href="<c:url value='/resources/fonts/css/font-awesome.min.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/css/animate.min.css'/>" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="<c:url value='/resources/css/custom.css'/>" rel="stylesheet">
  <link rel="resources/stylesheet" type="text/css" href="<c:url value='/resources/css/maps/jquery-jvectormap-2.0.3.css '/>" />
  <link href="<c:url value='/resources/css/icheck/flat/green.css'/>" rel="stylesheet" />
  <link href="<c:url value='/resources/css/floatexamples.css'/>" rel="stylesheet" type="text/css" />

  <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
  <script src="<c:url value='/resources/js/nprogress.js'/>"></script>

  <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>


<body class="nav-md">

  <div class="container body">


    <div class="main_container">

       <tiles:insertAttribute name="header" /> 

      <tiles:insertAttribute name="menu" /> 


      <!-- page content -->
      <div class="right_col" role="main">
       
            
              <tiles:insertAttribute name="body" /> 
         

        

      

        <!-- footer content -->

           <tiles:insertAttribute name="footer" />
        <!-- /footer content -->
      </div>
      <!-- /page content -->

    </div>

  </div>

  <div id="custom_notifications" class="custom-notifications dsp_none">
    <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
    </ul>
    <div class="clearfix"></div>
    <div id="notif-group" class="tabbed_notifications"></div>
  </div>

                    <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>

  <!-- gauge js -->
  <script type="text/javascript" src="<c:url value='/resources/js/gauge/gauge.min.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/gauge/gauge_demo.js' />"></script>
  <!-- bootstrap progress js -->
  <script src="<c:url value='/resources/js/progressbar/bootstrap-progressbar.min.js' />"></script>
  <script src="<c:url value='/resources/js/nicescroll/jquery.nicescroll.min.js' />"></script>
  <!-- icheck -->
  <script src="<c:url value='/resources/js/icheck/icheck.min.js' />"></script>
  <!-- daterangepicker -->
  <script type="text/javascript" src="<c:url value='/resources/js/moment/moment.min.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/datepicker/daterangepicker.js' />"></script>
  <!-- chart js -->
  <script src="<c:url value='/resources/js/chartjs/chart.min.js' />"></script>

  <script src="<c:url value='/resources/js/custom.js' />"></script>

  <!-- flot js -->
  <!--[if lte IE 8]><script type="text/javascript" src="js/excanvas.min.js"></script><![endif]-->
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.pie.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.orderBars.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.time.min.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/date.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.spline.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.stack.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/curvedLines.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.resize.js' />"></script>
  <script>
    $(document).ready(function() {
      // [17, 74, 6, 39, 20, 85, 7]
      //[82, 23, 66, 9, 99, 6, 2]
      var data1 = [
        [gd(2012, 1, 1), 17],
        [gd(2012, 1, 2), 74],
        [gd(2012, 1, 3), 6],
        [gd(2012, 1, 4), 39],
        [gd(2012, 1, 5), 20],
        [gd(2012, 1, 6), 85],
        [gd(2012, 1, 7), 7]
      ];

      var data2 = [
        [gd(2012, 1, 1), 82],
        [gd(2012, 1, 2), 23],
        [gd(2012, 1, 3), 66],
        [gd(2012, 1, 4), 9],
        [gd(2012, 1, 5), 119],
        [gd(2012, 1, 6), 6],
        [gd(2012, 1, 7), 9]
      ];
      $("#canvas_dahs").length && $.plot($("#canvas_dahs"), [
        data1, data2
      ], {
        series: {
          lines: {
            show: false,
            fill: true
          },
          splines: {
            show: true,
            tension: 0.4,
            lineWidth: 1,
            fill: 0.4
          },
          points: {
            radius: 0,
            show: true
          },
          shadowSize: 2
        },
        grid: {
          verticalLines: true,
          hoverable: true,
          clickable: true,
          tickColor: "#d5d5d5",
          borderWidth: 1,
          color: '#fff'
        },
        colors: ["rgba(38, 185, 154, 0.38)", "rgba(3, 88, 106, 0.38)"],
        xaxis: {
          tickColor: "rgba(51, 51, 51, 0.06)",
          mode: "time",
          tickSize: [1, "day"],
          //tickLength: 10,
          axisLabel: "Date",
          axisLabelUseCanvas: true,
          axisLabelFontSizePixels: 12,
          axisLabelFontFamily: 'Verdana, Arial',
          axisLabelPadding: 10
            //mode: "time", timeformat: "%m/%d/%y", minTickSize: [1, "day"]
        },
        yaxis: {
          ticks: 8,
          tickColor: "rgba(51, 51, 51, 0.06)",
        },
        tooltip: false
      });

      function gd(year, month, day) {
        return new Date(year, month - 1, day).getTime();
      }
    });
  </script>

  <!-- worldmap -->
  <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-2.0.3.min.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/gdp-data.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-world-mill-en.js' />"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-us-aea-en.js' />"></script>
  <!-- pace -->
  <script src="<c:url value='/resources/js/pace/pace.min.js' />"></script>
  <script>
    $(function() {
      $('#world-map-gdp').vectorMap({
        map: 'world_mill_en',
        backgroundColor: 'transparent',
        zoomOnScroll: false,
        series: {
          regions: [{
            values: gdpData,
            scale: ['#E6F2F0', '#149B7E'],
            normalizeFunction: 'polynomial'
          }]
        },
        onRegionTipShow: function(e, el, code) {
          el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
        }
      });
    });
  </script>
  <!-- skycons -->
  <script src="<c:url value='/js/skycons/skycons.min.js' />"></script>
  <script>
    var icons = new Skycons({
        "color": "#73879C"
      }),
      list = [
        "clear-day", "clear-night", "partly-cloudy-day",
        "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
        "fog"
      ],
      i;

    for (i = list.length; i--;)
      icons.set(list[i], list[i]);

    icons.play();
  </script>

  <!-- dashbord linegraph -->
  <script>
    Chart.defaults.global.legend = {
      enabled: false
    };

    var data = {
      labels: [
        "Symbian",
        "Blackberry",
        "Other",
        "Android",
        "IOS"
      ],
      datasets: [{
        data: [15, 20, 30, 10, 30],
        backgroundColor: [
          "#BDC3C7",
          "#9B59B6",
          "#455C73",
          "#26B99A",
          "#3498DB"
        ],
        hoverBackgroundColor: [
          "#CFD4D8",
          "#B370CF",
          "#34495E",
          "#36CAAB",
          "#49A9EA"
        ]

      }]
    };

    var canvasDoughnut = new Chart(document.getElementById("canvas1"), {
      type: 'doughnut',
      tooltipFillColor: "rgba(51, 51, 51, 0.55)",
      data: data
    });
  </script>
  <!-- /dashbord linegraph -->
  <!-- datepicker -->
  <script type="text/javascript">
    $(document).ready(function() {

      var cb = function(start, end, label) {
        console.log(start.toISOString(), end.toISOString(), label);
        $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
        //alert("Callback has fired: [" + start.format('MMMM D, YYYY') + " to " + end.format('MMMM D, YYYY') + ", label = " + label + "]");
      }

      var optionSet1 = {
        startDate: moment().subtract(29, 'days'),
        endDate: moment(),
        minDate: '01/01/2012',
        maxDate: '12/31/2015',
        dateLimit: {
          days: 60
        },
        showDropdowns: true,
        showWeekNumbers: true,
        timePicker: false,
        timePickerIncrement: 1,
        timePicker12Hour: true,
        ranges: {
          'Today': [moment(), moment()],
          'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
          'Last 7 Days': [moment().subtract(6, 'days'), moment()],
          'Last 30 Days': [moment().subtract(29, 'days'), moment()],
          'This Month': [moment().startOf('month'), moment().endOf('month')],
          'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
        },
        opens: 'left',
        buttonClasses: ['btn btn-default'],
        applyClass: 'btn-small btn-primary',
        cancelClass: 'btn-small',
        format: 'MM/DD/YYYY',
        separator: ' to ',
        locale: {
          applyLabel: 'Submit',
          cancelLabel: 'Clear',
          fromLabel: 'From',
          toLabel: 'To',
          customRangeLabel: 'Custom',
          daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],
          monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
          firstDay: 1
        }
      };
      $('#reportrange span').html(moment().subtract(29, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));
      $('#reportrange').daterangepicker(optionSet1, cb);
      $('#reportrange').on('show.daterangepicker', function() {
        console.log("show event fired");
      });
      $('#reportrange').on('hide.daterangepicker', function() {
        console.log("hide event fired");
      });
      $('#reportrange').on('apply.daterangepicker', function(ev, picker) {
        console.log("apply event fired, start/end dates are " + picker.startDate.format('MMMM D, YYYY') + " to " + picker.endDate.format('MMMM D, YYYY'));
      });
      $('#reportrange').on('cancel.daterangepicker', function(ev, picker) {
        console.log("cancel event fired");
      });
      $('#options1').click(function() {
        $('#reportrange').data('daterangepicker').setOptions(optionSet1, cb);
      });
      $('#options2').click(function() {
        $('#reportrange').data('daterangepicker').setOptions(optionSet2, cb);
      });
      $('#destroy').click(function() {
        $('#reportrange').data('daterangepicker').remove();
      });
    });
  </script>
  <script>
    NProgress.done();
  </script>
  <!-- /datepicker -->
  <!-- /footer content -->
</body>

</html>