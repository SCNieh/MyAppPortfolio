package com.example.shichaonie.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListeners(R.id.movies);
        setListeners(R.id.stock);
        setListeners(R.id.reader);
        setListeners(R.id.news);
        setListeners(R.id.capstone);

    }
    private void setListeners(int btnId){
        Button myButton = (Button) findViewById(btnId);
        String btnText = myButton.getText().toString();
        final String toastText = "This button will launch my " + btnText + " apps!";
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
