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

package com.telran.org.homeework_javapro;

public class Phone2 {
    private String phoneName;
    private String ownNumber;

    public Phone2(String phoneName, String ownNumber) {
        this.phoneName = phoneName;
        this.ownNumber = ownNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call(String phoneNumber) {
        System.out.println(" try to make a call to number " + phoneNumber);
    }

    public void receiveCall(String callerNumber) {
        System.out.println(" try to receive a call from number " + callerNumber);
    }
    public static void makeCall(Phone2 phone2, String phoneNumber) {
        phone2.call(phoneNumber);
    }

    public static void receiveCall(Phone2 phone2, String callerNumber) {
        phone2.receiveCall(callerNumber);
    }
}

package com.telran.org.homeework_javapro;

public class ButtonPhone extends Phone2 {

        public ButtonPhone(String ownNumber) {
            super("ButtonPhone", ownNumber);
        }

        @Override
        public void call(String phoneNumber) {
            System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to make a call to number " + phoneNumber);
            super.call(phoneNumber);
        }

        @Override
        public void receiveCall(String callerNumber) {
            System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to receive a call from number " + callerNumber);
            super.receiveCall(callerNumber);
        }
}

package com.telran.org.homeework_javapro;

public class SmartPhone extends Phone2{

    public SmartPhone(String ownNumber) {
        super("SmartPhone", ownNumber);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to make a call to number " + phoneNumber);
        super.call(phoneNumber);
    }

    @Override
    public void receiveCall(String callerNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to receive a call from number " + callerNumber);
        super.receiveCall(callerNumber);
    }
}

package com.telran.org.homeework_javapro;

public class RadioPhone extends Phone2 {

    public RadioPhone(String ownNumber) {
        super("RadioPhone", ownNumber);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to make a call to number " + phoneNumber);
        super.call(phoneNumber);
    }

    @Override
    public void receiveCall(String callerNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to receive a call from number " + callerNumber);
        super.receiveCall(callerNumber);
    }
}



