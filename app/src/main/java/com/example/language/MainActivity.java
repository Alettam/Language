package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button okBtn;
    Locale locale;
    Configuration config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        spinner = findViewById(R.id.spinner);
        okBtn = findViewById(R.id.okBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinner.getSelectedItem().toString().equals("English")) {
                    locale = new Locale("en");
                    config = new Configuration();
                    config.setLocale(locale);
                    getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
                    recreate();
                }else {
                    locale = new Locale("ru");
                    config = new Configuration();
                    config.setLocale(locale);
                    getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
                    recreate();
                }

            }
        });
    }
}
