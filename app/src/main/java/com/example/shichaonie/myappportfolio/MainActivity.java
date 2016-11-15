package com.example.shichaonie.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Toast mToast = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view){
        Button mBtn = (Button) view;
        switch (view.getId()){   //Wait for access to each app, accomplish switch-case late;
            case R.id.movies:
                break;
            case R.id.stock:
                break;
            case R.id.reader:
                break;
            case R.id.news:
                break;
            case R.id.capstone:
                break;
        }
        String btnText = mBtn.getText().toString();
        String toastText = "This button will launch my " + btnText + " apps!";
        show(toastText);
    }
    public void show(String msg){
        if(mToast == null){
            mToast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
        }else {
            mToast.setText(msg);
        }
        mToast.show();
    }

}
