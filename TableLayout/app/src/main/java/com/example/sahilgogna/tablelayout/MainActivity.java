package com.example.sahilgogna.tablelayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import Model.Task;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int textViewWidgets[] = {R.id.textViewMM, R.id.textViewMA, R.id.textViewTM, R.id.textViewTA, R.id.textViewTE};
    TextView[] listTextViews = new TextView[5];
    TextView clickedTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize(){
        Task[] listOfTasks = new Task[5];
        listOfTasks[0] = new Task("Java", Color.BLUE);
        listOfTasks[1] = new Task("Sport", Color.YELLOW);
        listOfTasks[2] = new Task("Android", Color.RED);
        listOfTasks[3] = new Task("Sport", Color.GREEN);
        listOfTasks[4] = new Task("Cinema");

        for (int i=0; i<listOfTasks.length ; i++ ){
            listTextViews[i] = findViewById(textViewWidgets[i]);
            listTextViews[i].setText(listOfTasks[i].getDescription());
            listTextViews[i].setTextColor(listOfTasks[i].getColour());
            listTextViews[i].setOnClickListener(this);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            String myData = (String) data.getSerializableExtra("res");
            clickedTextView.setText(myData);
        }else{
            Toast.makeText(this,"No data changed",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
//        TextView textView = (TextView)v;
//        Snackbar.make(
//                v,textView.getText().toString(),
//                Snackbar.LENGTH_LONG
//        ).show();

        clickedTextView = (TextView)v;

        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent,1);
    }
}
