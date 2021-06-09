package com.Enum.Main;

public enum Dni {
    SUNDAY("Воскресенье",1),
    MONDAY("Воскресенье",2),
    TUESDAY("Воскресенье",3),
    WEDNESDAY("Воскресенье",4),
    THURSDAY("Воскресенье",5),
    FRIDAY("Воскресенье",6),
    SATURDAY("Воскресенье",7);

    private String title;
    //конструктор
    private int c;
    Dni(String name,int chislo){
        title=name;
        c=chislo;

    }

    public String GetDay(){
        return title;
    }
    public int GetChislo(){
        return c;
    }
}
