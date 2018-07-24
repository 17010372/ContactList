package sg.edu.rp.c346.contactlist;

/**
 * Created by 17010372 on 24/7/2018.
 */

public class Contact {

    private String name;

    private String contact;

    public Contact(String name, String code, String contact) {
        this.name = name;

        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +'\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

