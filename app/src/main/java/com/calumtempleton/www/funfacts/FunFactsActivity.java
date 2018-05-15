package com.calumtempleton.www.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Access different classes
    private ColorWheel colorWheel = new ColorWheel();
    private FactBook factbook = new FactBook();

    // Field variables/class members
    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Method which sets the acitivity to be shown
        setContentView(R.layout.activity_fun_facts);

        // Assign the views for the layout file to the corressponding variables
        mFactTextView = findViewById(R.id.factTextView);
        mShowFactButton = findViewById(R.id.showFactButton);
        mRelativeLayout = findViewById(R.id.relativeView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Update the TextView with a fact
                mFactTextView.setText(factbook.getFact());
                // Change the Backgorund Color
                mRelativeLayout.setBackgroundColor(colorWheel.getColor());
                mShowFactButton.setTextColor(colorWheel.getColor());
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
