package com.doozycod.fleetoptics.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.doozycod.fleetoptics.R;

public class CallingEmpActivity extends AppCompatActivity {
    TextView message, message2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_emp);

        initUI();
    }

    private void initUI() {

        message = findViewById(R.id.messageCall);
        message2 = findViewById(R.id.messageCall2);

    }
}
