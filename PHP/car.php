<?php

class Car {
    public $id;
    public $driver;
    public $passenger;

    public function __construct($driver) {
        $this->driver = $driver;
    }


}