package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.*;
import android.os.Bundle;
import android.content.*;


public class MainActivity extends AppCompatActivity {

    // Button Clicks
    public void clickFunction(View view){
        EditText textField = (EditText) findViewById(R.id.editText);
        String str = textField.getText().toString();
        //Toast.makeText(MainActivity.this, textField.getText().toString(), Toast.LENGTH_LONG).show();
        //Log.i("Info","Button Pressed");
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
