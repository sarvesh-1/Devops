<?php 
if(isset($_POST['submit'])){
    $username =$_POST['username'];
    $password = $_POST['password'];
    $email = $_POST['email'];
    echo 'The details enetered by you are - Username:'.$username.'Password:'.$password."<br>";
    if(empty($username)||empty($password)||empty($email)){
        echo "Some fileds are empty";
        echo "$username<br>";
    }
    else{
        $sql= "INSERT INTO `users`(`username`,`password`,`email`) VALUES ('$username','$password','$email')";
        if($mysqli->quesry($sql)){
            echo "data inserted successfully...";
        }
        else{
            echo "Error....".$mysql->error;
        }
    }
}