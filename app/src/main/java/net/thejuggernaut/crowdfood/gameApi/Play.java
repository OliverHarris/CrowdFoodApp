package net.thejuggernaut.crowdfood.gameApi;

import java.io.Serializable;

public class Play  implements Serializable {
    String barcode;
    String session;

    public  Play(){};

    public Play(String barcode, String session){
        this.barcode = barcode;
        this.session = session;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
