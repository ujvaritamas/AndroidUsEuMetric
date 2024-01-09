package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.calculateId);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculate();
            }
        });

        final Button ButtonUsOrEu = (Button) findViewById(R.id.MetricBtnID);
        ButtonUsOrEu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeMetrics(ButtonUsOrEu);

            }
        });
    }

    private void changeMetrics(Button b){
        final TextView weightText = (TextView) findViewById(R.id.weightTextID);
        final TextView heightText = (TextView) findViewById(R.id.heightTextID);

        final TextView weightResText = (TextView) findViewById(R.id.resWeightMetricID);
        final TextView heightResText = (TextView) findViewById(R.id.resHeightMetricID);

        if(b.getText().equals("EU")){
            b.setText("US");
            weightText.setText(Weight.METRIC_CONST_US);
            heightText.setText(Height.METRIC_CONST_US);
            weightResText.setText(Weight.METRIC_CONST_EU);
            heightResText.setText(Height.METRIC_CONST_EU);
        }
        else{
            b.setText("EU");
            weightText.setText(Weight.METRIC_CONST_EU);
            heightText.setText(Height.METRIC_CONST_EU);
            weightResText.setText(Weight.METRIC_CONST_US);
            heightResText.setText(Height.METRIC_CONST_US);
        }

    }


    private void calculate(){

        //input
        final Button ButtonUsOrEu = (Button) findViewById(R.id.MetricBtnID);
        final EditText weightInpText = (EditText) findViewById(R.id.inpWeightID);
        final EditText heightInpText = (EditText) findViewById(R.id.inpHeightID);

        //output
        final TextView weightResText = (TextView) findViewById(R.id.resWightID);
        final TextView heightResText = (TextView) findViewById(R.id.resHeightID);

        Float tmpWeight = 0f;
        Float tmpHight = 0f;
        if (!TextUtils.isEmpty(weightInpText.getText().toString())) {
            tmpWeight = Float.parseFloat(weightInpText.getText().toString());
        }

        if (!TextUtils.isEmpty(heightInpText.getText().toString())) {
            tmpHight = Float.parseFloat(heightInpText.getText().toString());
        }
        if(ButtonUsOrEu.getText().equals("EU")){
            weightResText.setText(Float.toString(Weight.convertToEU(tmpWeight)));
            heightResText.setText(Float.toString(Height.convertToEU(tmpHight)));
        }
        else{
            weightResText.setText(Float.toString(Weight.convertToUs(tmpWeight)));
            heightResText.setText(Float.toString(Height.convertToUs(tmpHight)));
        }



    }
}