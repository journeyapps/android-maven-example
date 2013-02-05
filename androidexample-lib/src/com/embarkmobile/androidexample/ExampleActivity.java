package com.embarkmobile.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *
 */
public class ExampleActivity extends Activity {
    private Counter counter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);

        counter = new Counter();

        Button button = (Button)findViewById(R.id.buttonIncrement);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.increment();
                updateCounter();
            }
        });

        updateCounter();
    }

    private void updateCounter() {
        final TextView textCounter = (TextView)findViewById(R.id.textCounter);
        textCounter.setText("Counter: " + counter.getValue());
    }
}
