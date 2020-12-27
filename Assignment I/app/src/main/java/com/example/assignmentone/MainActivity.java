package com.example.assignmentone;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
Button button;
TextView textView;
int counter=0;
String textcounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);
    }
    public void countButton(View view) {
        counter++;
         textView.setText(String.valueOf(counter));
    }
    public void Toast_btn(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        textcounter=textView.getText().toString();
      intent.putExtra("hellothere",textcounter);
        startActivity(intent);
        finish();
    }
}

