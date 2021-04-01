<?php 

	$connection = mysqli_connect("localhost", "id16485096_justifyester", "Jep19*05Cantik", "id16485096_db_mahasiswa");
	
	$result = array();
	$result['data'] = array();
	$select= "SELECT *from data";
	$responce = mysqli_query($connection,$select);
	
	while($row = mysqli_fetch_array($responce))
		{
			$index['id']      = $row['0'];
			$index['nama']    = $row['1'];
			$index['nim']     = $row['2'];
			$index['ipk']     = $row['3'];
			
			array_push($result['data'], $index);
		}
			
			$result["success"]="1";
			echo json_encode($result);
			mysqli_close($connection);

 ?>