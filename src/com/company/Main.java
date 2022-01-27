package com.company;

public class Main {

    public static void main(String[] args) {
	SoChan soChan= new SoChan();
    SoLe soLe = new SoLe();

    soChan.setName("số chẵn");
    soLe.setName("Số lẻ");
    soLe.start();
    // khi sử dụng join thì sẽ chạy đối tượng đc join trước
        try {
            soLe.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        soChan.start();


    }
}
