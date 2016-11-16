package com.example.bruno.projetoestruturando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
*@author Bruno Felix
*/
public class MainActivity extends AppCompatActivity {

    /*
    private boolean viewGroupIsVisible = true;
    private View mViewGroup;
    private Button mButton;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        mViewGroup = findViewById(R.id.viewsContainer);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
        */
    }

    /*
    @Override
    public void onClick(View button) {

        if (viewGroupIsVisible) {
            mViewGroup.setVisibility(View.GONE);
            mButton.setText("Show");
        } else {
            mViewGroup.setVisibility(View.VISIBLE);
            mButton.setText("Hide");
        }

        viewGroupIsVisible = !viewGroupIsVisible;
    }
    */


}