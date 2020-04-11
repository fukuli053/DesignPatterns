package com.furkanergun;

public abstract class Ordek {
    protected IUcabilme ucabilme;
    protected IOtebilme otebilme;

    public void uc(){
        ucabilme.Uc();
    };
    
    public void ot(){
        otebilme.ot();
    }

}
