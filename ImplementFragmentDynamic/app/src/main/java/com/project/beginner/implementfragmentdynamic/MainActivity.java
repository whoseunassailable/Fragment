package com.project.beginner.implementfragmentdynamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declaring the buttons
    Button buttonA, buttonB, buttonC;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA = findViewById(R.id.frag_a);
        buttonB = findViewById(R.id.frag_b);
        buttonC = findViewById(R.id.frag_c);

        loadFragments(new FragmentB(), false);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragments(new FragmentA(), true);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragments(new FragmentB(), true);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragments(new FragmentC(), true);
            }
        });

    }


    public void loadFragments(Fragment fragment, boolean flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag == false) {
            // The add parameter takes kispe add krna hai and kya add krna hai
            ft.add(R.id.container, fragment);
        } else {
            // The add parameter takes kispe add krna hai and kya add krna hai
            ft.replace(R.id.container, fragment);
        }

        ft.commit();
    }
}