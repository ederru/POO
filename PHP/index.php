<?php
require_once('car.php');
require_once('uberX.php');
require_once('account.php');

$uberX = new uberX("KLÑ874", new Account("Miranda Gonzales", "Validado"), "Toyota", "S1");
$uberX->printDataCar();
?>