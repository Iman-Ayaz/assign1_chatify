package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NextActivity extends AppCompatActivity {

    ImageView backArrow,iconOne, iconTwo, iconThree;
    Fragment fragmentOne, fragmentTwo, fragmentThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        backArrow = findViewById(R.id.backArrow);
        iconOne = findViewById(R.id.iconOne);
        iconTwo = findViewById(R.id.iconTwo);
        iconThree = findViewById(R.id.iconThree);

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();
        fragmentThree = new FragmentThree();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragmentOne).commit();

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Return to previous screen (Signup)
                finish();
            }
        });

        iconOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragmentOne).commit();
            }
        });

        iconTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragmentTwo).commit();
            }
        });

        iconThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragmentThree).commit();
            }
        });
    }
}