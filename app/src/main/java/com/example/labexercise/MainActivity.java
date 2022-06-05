package com.example.labexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button leftButton;
    private Button rightButton;
    private String buttonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //code for part 1
//        setContentView(R.layout.layout_part_1);
        //code for part 2
//        setContentView(R.layout.layout_part_2);
//        leftButton = (Button) findViewById(R.id.btnLeft);
//        rightButton = (Button) findViewById(R.id.btnRight);
//        buttonText = getString(R.string.btn_not_pressed_lbl);
        //code for part 3
        setContentView(R.layout.layout_part_3);
    }

    //code for part 2
//    public void buttonClick(View view){
        //first clear text
//        ((Button)view).setText("");
//        if(view.getId() == R.id.btnLeft){
//            rightButton.setText(buttonText);
//        }
//        else{
//            leftButton.setText(buttonText);
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}