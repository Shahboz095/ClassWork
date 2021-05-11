package com.company.Interface1;

public class CarServiceImpl implements CarService {

    @Override
    public void getCarTuning() {
        System.out.println( "100% tonirovka");
        System.out.println("75% tonirovka");

    }

    @Override
    public String getCarModel() {
        return "SPARK";

    }

    @Override
    public int getCarCount() {
        return 10;
    }
}
