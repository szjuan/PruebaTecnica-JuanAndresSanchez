package com.example.pruebatecnicajuanandressanchez;

import Task;

import static jdk.internal.org.jline.utils.Status.getStatus;


public class Tarjeta (cardId, cardNumebr, status, expiresAt, balance){

    public int tarjetaid = cardID;
    public int tarjetanumber = cardID;

    public int tarjetastatus  = status;
    public int tarjetasexpires = cardID;

    public int tarjetabalance = balance;
}

public class TaskManager {

    public void generar_CardNumber(){
        cardNumber = productID + 1111111111;
    }

    public void emision_tarjeta(){
        Tarjeta(cardId, cardNumebr, status, expiresAt, balance);
    };


    public void Activacion(){

        if getStatus() == "ISSUED"
            setStatus("ACTIVE");

        else:
            setStatus("BLOCKED");

    }

    public void bloqueo(cardId){
        setStatus("");
    };

    public void consulta(){
       consulta =  toStringConsulata();
    }
}
