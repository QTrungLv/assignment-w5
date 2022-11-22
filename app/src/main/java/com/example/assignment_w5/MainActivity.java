package com.example.assignment_w5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number;
    Button button;
    EditText editText;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.numberCount);
        button = findViewById(R.id.count);
        editText = findViewById(R.id.editText);

        if(savedInstanceState != null){
                editText.setText(savedInstanceState.getString("reply_text"));
        }
    }


    public void handlerOnClick(View view) {
        count++;
        number.setText(""+count);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (editText.getText().toString() != "") {
            outState.putString("reply_text",editText.getText().toString());
        }
    }
}