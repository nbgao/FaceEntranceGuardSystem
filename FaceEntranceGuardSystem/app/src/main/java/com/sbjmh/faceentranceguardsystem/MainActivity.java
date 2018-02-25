package com.sbjmh.faceentranceguardsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        Button button_register = this.findViewById(R.id.button_register);
        Button button_detect = this.findViewById(R.id.button_detect);
        button_register.setOnClickListener(this);
        button_detect.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button_register:{
                Toast.makeText(MainActivity.this, "Register Face !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.button_detect:{
                Toast.makeText(MainActivity.this, "Detect Face !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetectActivity.class);

                startActivity(intent);
                break;
            }
        }
    }
}
