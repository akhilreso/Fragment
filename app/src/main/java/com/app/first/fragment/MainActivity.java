package com.app.first.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link the fragment to activity
        //creat a referance to fragment manneger



        button=(Button)findViewById(R.id.button_acti);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                MyFragment frg =new MyFragment();
                android.app.FragmentManager manager=getFragmentManager();
                android.app.FragmentTransaction transaction=manager.beginTransaction();
                transaction.add(R.id.fragment ,frg,"AkhilFragment");
                //now commit the transaction
                transaction.commit();






            }




        });


    }
}
