package sg.edu.rp.c346.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.ListViewContacts);

        alContactList = new ArrayList<>();
        Contact contact1 = new Contact("Mary", "+65", "65442334");
        Contact contact2 = new Contact("Ken", "+65", "97442437");

        alContactList.add(contact1);
        alContactList.add(contact2);

        caContact = new CustomAdapter(this, R.layout.contact_item, alContactList);

        lvContact.setAdapter(caContact);

    }
}
