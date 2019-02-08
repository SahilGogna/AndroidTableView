package com.example.sahilgogna.tablelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editTextDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialize();
    }

    private void initialize(){
        editTextDescription = findViewById(R.id.editTextDescription);
    }

    public void returnResult(View view){
        Intent intent = new Intent();
        if(!editTextDescription.getText().toString().equals("")){
            intent.putExtra("res",editTextDescription.getText().toString());
            setResult(RESULT_OK, intent);
        }else
            setResult(RESULT_CANCELED, intent);
        finish();
    }
}
