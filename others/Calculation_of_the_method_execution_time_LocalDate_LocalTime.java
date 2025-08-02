package com.company;

public class Calculation_of_the_method_execution_time_LocalDate_LocalTime{
    public long startTime;
    public long endTime;
    public Calculation_of_the_method_execution_time_LocalDate_LocalTime(){
        this.startTime = 0; this.endTime = 0;
    }
    public void point(){
        if(startTime>0){
            this.endTime = System.currentTimeMillis();
        }
        else {
            this.startTime = System.currentTimeMillis();
        }
    }
    public void conclusion(){System.out.println(this.endTime - this.startTime);}
}