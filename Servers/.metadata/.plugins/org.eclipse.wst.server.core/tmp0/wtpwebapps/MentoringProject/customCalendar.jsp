<!DOCTYPE html>
<html>
  <!--
    https://github.com/jujumuncher/caleandar
  -->
  <head>
    <title>CustomCalendar</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
    <link rel="stylesheet" href="css/calendar.css"/>
  </head>
  <body>
    <div id="caleandar">

    </div>

    <script type="text/javascript" src="js/caleandar.js"></script>
    <script>

        var events = [
          {
            'Date': new Date(2018, 5, 7),
            'Title': 'evento 1',
            'Link': function(){
                      console.log(new Date(2018, 5, 7));
                        
                    }
          },
 /*         {'Date': new Date(2018, 4, 18), 'Title': 'evento 2', 'Link': 'https://garfield.com'},
          {'Date': new Date(2018, 5, 27), 'Title': 'evento 3', 'Link':  function(){alert("le diste click a este evento");}},*/
        ];
var settings = {
  Color: '',
  LinkColor: '',
  NavShow: true,
  NavVertical: false,
  NavLocation: '',
  DateTimeFormat: 'mmm, yyyy',
  DatetimeLocation: '',
  EventTargetWholeDay: true,
  DisabledDays: []
};

var element = document.getElementById('caleandar');
caleandar(element, events, settings);
    </script>
  </body>
</html>
