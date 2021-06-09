package com.Enum.Main;

public class Main {
    public static void main(String[] args){
        School primer=new School();
        Dni tuesday=Dni.TUESDAY;
        primer.setDay(tuesday);
        if(Dni.TUESDAY==primer.returnDay()){
            System.out.println("prekrasno");
        }else System.out.println("ne prekrasno");
    }
}
