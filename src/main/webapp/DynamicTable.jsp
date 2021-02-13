<!DOCTYPE html>
<html lang="en-us">
   <head>
      <title>Datatables User</title>
      
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/> 
      <link rel="stylesheet" href="https://cdn.datatables.net/1.10.11/css/jquery.dataTables.min.css"/> 
      <link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.2/css/buttons.dataTables.min.css"/> 
      <link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.2/css/select.dataTables.min.css"/>
      <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.0.2/css/responsive.dataTables.min.css"/> 
      
      <style>
        table.dataTable tbody>tr.selected,
        table.dataTable tbody>tr>.selected {
          background-color: #A2D3F6;
        }
      </style>
   </head>
   <body>

    <div class="container">
      <br>
      <table cellpadding="0" cellspacing="0" border="0" class="dataTable table table-striped" id="example">

      </table>
      <br>
    </div>

    <script src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js"></script>
    <script src="js/altEditor/dataTables.altEditor.free.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.1.2/js/dataTables.buttons.min.js"></script>
    <script src="https://cdn.datatables.net/select/1.1.2/js/dataTables.select.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.0.2/js/dataTables.responsive.min.js"></script>

    <script>
      $(document).ready(function() {

        var dataSet = [
          ["Tiger Nixon", "System Architect", "Edinburgh", "5421", "2011/04/25", "$320,800"],
          ["Garrett Winters", "Accountant", "Tokyo", "8422", "2011/07/25", "$170,750"],
          ["Ashton Cox", "Junior Technical Author", "San Francisco", "1562", "2009/01/12", "$86,000"],
          ["Cedric Kelly", "Senior Javascript Developer", "Edinburgh", "6224", "2012/03/29", "$433,060"],
          ["Airi Satou", "Accountant", "Tokyo", "5407", "2008/11/28", "$162,700"],
          ["Brielle Williamson", "Integration Specialist", "New York", "4804", "2012/12/02", "$372,000"],
          ["Herrod Chandler", "Sales Assistant", "San Francisco", "9608", "2012/08/06", "$137,500"],
          ["Rhona Davidson", "Integration Specialist", "Tokyo", "6200", "2010/10/14", "$327,900"],
          ["Colleen Hurst", "Javascript Developer", "San Francisco", "2360", "2009/09/15", "$205,500"],
          ["Sonya Frost", "Software Engineer", "Edinburgh", "1667", "2008/12/13", "$103,600"],
          ["Jena Gaines", "Office Manager", "London", "3814", "2008/12/19", "$90,560"],
          ["Quinn Flynn", "Support Lead", "Edinburgh", "9497", "2013/03/03", "$342,000"],
          ["Charde Marshall", "Regional Director", "San Francisco", "6741", "2008/10/16", "$470,600"],
          ["Haley Kennedy", "Senior Marketing Designer", "London", "3597", "2012/12/18", "$313,500"],
          ["Tatyana Fitzpatrick", "Regional Director", "London", "1965", "2010/03/17", "$385,750"],
          ["Michael Silva", "Marketing Designer", "London", "1581", "2012/11/27", "$198,500"]
        ];

        var columnDefs = [{
          title: "Name"
        }, {
          title: "Username"
        }, {
          title: "Password"
        }, {
          title: "Type."
        }, {
          title: "Start date"
        }, {
          title: "Status"
        }];

        var myTable;

        myTable = $('#example').DataTable({
          "sPaginationType": "full_numbers",
          data: dataSet,
          columns: columnDefs,
          dom: 'Bfrtip',        // Needs button container
          select: 'single',
          responsive: true,
          altEditor: true,     // Enable altEditor
          buttons: [{
            text: 'Add',
            name: 'add'        // do not change name
          },
          {
            extend: 'selected', // Bind to Selected row
            text: 'Edit',
            name: 'edit'        // do not change name
          },
          {
            extend: 'selected', // Bind to Selected row
            text: 'Delete',
            name: 'delete'      // do not change name
         }]

        });
        
      });
    </script>

   </body>
</html>