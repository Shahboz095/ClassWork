package com.company;

import com.company.AbctractionTest.Vehicle;
import com.company.Interface.UserServiceImpl;
import com.company.Interface1.CarServiceImpl;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.carModel();               // Abctraction


                   /*    */



        UserServiceImpl userService = new UserServiceImpl();   //Interface
        userService.getUserData("19NOyabr");
        String userName = userService.getUserName();
        System.out.println(userName);


        /* */

        CarServiceImpl carService = new CarServiceImpl();
        carService.getCarTuning();

        String carModel = carService.getCarModel();
        System.out.println("Car model:"+carModel);

        int carCount = carService.getCarCount();
        System.out.println("Car counts:"+carCount);


    }
}
