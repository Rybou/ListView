package com.example.bourymbodj.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<phoneContact> phoneContacts = GetPhoneContact();

        final ListView lv1 = (ListView) findViewById(R.id.listView);
        lv1.setAdapter(new CustomBaseAdapter(this, phoneContacts));


    }

    private ArrayList<phoneContact> GetPhoneContact(){
        ArrayList<phoneContact> results = new ArrayList<phoneContact>();

        phoneContact sr1 = new phoneContact();
        sr1.setName("John Smith");
        sr1.setPhone("214-555-1234");
        results.add(sr1);

        phoneContact sr2 = new phoneContact();
        sr2.setName("Jane Doe");
        sr2.setPhone("469-555-2587");
        results.add(sr2);

        phoneContact sr3 = new phoneContact();
        sr3.setName("Steve Young");
        sr3.setPhone("305-555-7895");
        results.add(sr3);

        phoneContact sr4 = new phoneContact();
        sr4.setName("Fred Jones");
        sr4.setPhone("612-555-8214");
        results.add(sr4);

        phoneContact sr5 = new phoneContact();
        sr5.setName("Boury Mbodj");
        sr5.setPhone("613-435-8214");
        results.add(sr5);

        phoneContact sr6 = new phoneContact();
        sr6.setName("EDD Hardy");
        sr6.setPhone("283-245-8741");
        results.add(sr5);



        return results;
    }
}




