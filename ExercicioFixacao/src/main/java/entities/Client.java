package entities;

import java.awt.event.ActionListener;
import java.util.Date;

public class Client {
   private String name;
   private String email;
   private Date birthDate;

    public Client(){
    }

    public Client (String name, String email, Date birthDate){
        super();
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

}
