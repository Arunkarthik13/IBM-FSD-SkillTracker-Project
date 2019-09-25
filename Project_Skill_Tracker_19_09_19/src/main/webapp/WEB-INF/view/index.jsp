<!doctype html>  
<html lang="en">  
<head>  
  <meta charset="utf-8">  
  <title>jQuery UI Auto complete - Default functionality</title>  
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">  
  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>  
  <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>  
  <link rel="stylesheet" href="/resources/demos/style.css">  
  <script>  
  $(function() {  
    $( "#Name" ).autocomplete({  
      source:'${pageContext.request.contextPath }/employee/search'  
    });  
  });  
  </script>  
</head>  
<body>  
<div class="ui-widget">  
  <label for="Name">Search Name </label>  
  <input id="Name">  
</div>  
</body>  
</html> 