package com.Enum.Main;

public class School {
    private Dni dni;

    //возвращает какой сейчас день недели
    public Dni returnDay(){
        return dni;
    }
    public int returnChislo(){
        return dni.GetChislo();
    }
    // устанавливает день недели
    public void setDay(Dni day){
        dni=day;
    }
}
