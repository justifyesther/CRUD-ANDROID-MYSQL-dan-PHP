<?php

    $connection = mysqli_connect("localhost", "id16485096_justifyester", "Jep19*05Cantik", "id16485096_db_mahasiswa");
    
    $id = $_POST["id"];
     
    $sql = "DELETE FROM data WHERE id='$id'";
     
    $result = mysqli_query($connection,$sql);
     
    if($result){
        echo "Data Deleted";
        
    }
    else{
        echo "Failed";
    }
    mysqli_close($connection);
     


?>