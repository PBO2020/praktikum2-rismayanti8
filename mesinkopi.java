package com.company;

public class mesinkopi {
    private String JenisKopi;
    private String Topping;
    private String asal;
    private int JumlahStokKopi;

    public void setJenisKopi(String JenisKopi){
        this.JenisKopi=JenisKopi;
    }
    public void setTopping(String Topping){

        this.Topping=Topping;
    }
    public void setAsal(String asal) {
        this.asal = asal;
    }
    public void setJumlahStokKopi(int JumlahStokKopi){
        this.JumlahStokKopi=JumlahStokKopi;
    }
    public String getJenisKopi(){
        return JenisKopi;
    }
    public String getTopping(){
        return Topping;
    }
    public String getAsal(){
        return asal;
    }
    public int getJumlahStokKopi(){
        return JumlahStokKopi;
    }
}
