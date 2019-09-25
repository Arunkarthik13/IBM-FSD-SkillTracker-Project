<!doctype html>  
<html lang="en">  
<head>  
  <meta charset="utf-8">  
  <title>jQuery UI Auto complete - Default functionality</title>  
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">  
  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>  
  <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>   
 <script type="text/javascript">
		$(document).ready(function() {
			$("#Name").live("blur", function(e) {
				$('#msg').hide();
				if ($('#Name').val() == null || $('#Name').val() == "") {
					$('#msg').show();
					$("#msg").html("Username is required field.").css("color", "red");
				} else {
					$.ajax({
						type: "POST",
						url: '${pageContext.request.contextPath }/employee/search',
						data: $('#Name').serialize(),
						dataType: "html",
						cache: false,
						success: function(msg) {
							$('#msg').show();
							$("#msg").html(msg);
						},
						error: function(jqXHR, textStatus, errorThrown) {
							$('#msg').show();
							$("#msg").html(textStatus + " " + errorThrown);
						}
					});
				}
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
