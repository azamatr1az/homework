package com.telran.org.homeework_javapro;

import static com.telran.org.homeework_javapro.Phone2.makeCall;
import static com.telran.org.homeework_javapro.Phone2.receiveCall;

public class HomeworkPhone2 {
    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone("111 111 111");
        SmartPhone smartPhone = new SmartPhone("222 222 222");
        RadioPhone radioPhone = new RadioPhone("333 333 333");


        buttonPhone.call("555-555-555");
        buttonPhone.receiveCall("777-777-777");

        smartPhone.call("666-666-666");
        smartPhone.receiveCall("888-888-888");

        radioPhone.call("777-777-777");
        radioPhone.receiveCall("999-999-999");


        makeCall(buttonPhone, "444-444-444");
        makeCall(smartPhone, "555-555-555");
        makeCall(radioPhone, "666-666-666");

        receiveCall(buttonPhone, "777-777-777");
        receiveCall(smartPhone, "888-888-888");
        receiveCall(radioPhone, "999-999-999");


    }
}







