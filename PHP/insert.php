<?php

    $connection = mysqli_connect("localhost", "id16485096_justifyester", "Jep19*05Cantik", "id16485096_db_mahasiswa");
    
     $nama = $_POST["nama"];
     $nim = $_POST["nim"];
     $ipk = $_POST["ipk"];
     
     $sql = "INSERT INTO data(nama,nim,ipk) VALUES ('$nama','$nim','$ipk')";
     
     $result = mysqli_query($connection,$sql);
     
     if($result){
         echo "Data Inserted";
        
     }
     else{
         echo "Failed";
     }
     mysqli_close($connection);
     
?>