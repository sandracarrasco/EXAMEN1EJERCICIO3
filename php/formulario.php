<?php
   include "conexion.inc.php";  
   date_default_timezone_set("America/La_Paz");
    
?>

<form method="GET" action="https://localhost:44355/WebForm1.aspx">
    Nombre<input type="Text" name="nombre"/>
	Apellido<input type="Text" name="apellido"/>
	CI<input type="Text" name="ci"/>
	 <?php
     	
		$fecha="";
		$hora="hora";
		$fecha =date("Y-m-d");
		$hora = date("H:i:s");
	    $consulta ="INSERT INTO fecha(fecha,hora)VALUES('$fecha','$hora')";
	
		$resultado=mysqli_query($conn,$consulta);
       
	
		
    ?>
	<input type="submit" name="Enviar"/>
</form>
	