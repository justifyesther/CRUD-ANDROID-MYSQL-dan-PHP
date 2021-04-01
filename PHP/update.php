<?php

    $connection = mysqli_connect("localhost", "id16485096_justifyester", "Jep19*05Cantik", "id16485096_db_mahasiswa");
    
     $id = $_POST["id"];
     $nama = $_POST["nama"];
     $nim = $_POST["nim"];
     $ipk = $_POST["ipk"];
     
     $sql = "UPDATE data SET  nama = '$nama', nim = '$nim', ipk = '$ipk' WHERE id = '$id' ";
     
     $result = mysqli_query($connection,$sql);
     
     if($result){
         echo "Data Updated";
        
     }
     else{
         echo "Failed";
     }
     mysqli_close($connection);
     
        
?>