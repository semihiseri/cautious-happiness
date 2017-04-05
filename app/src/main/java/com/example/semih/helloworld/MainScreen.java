package com.example.semih.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainScreen extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE"; // bu neden lazım?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(s/*vedInstanceSt*/ate);
        setContentView(R.layout.activity_main_screen);

    }

   public void sendMessage(View view)
   {
       Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
       intent.putExtra(EXTRA_MESSAGE, message);
       startActivity(intent);
   }
}
