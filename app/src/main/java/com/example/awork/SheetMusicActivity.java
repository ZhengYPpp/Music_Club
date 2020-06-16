package com.example.awork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SheetMusicActivity extends AppCompatActivity {

    private EditText editText;
    private RadioGroup radioGroupType;
    private Button button;


    public static final String KEY_NAME = "keyName";
    public static final String KEY_TYPE = "keyType";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_music);

        editText = findViewById(R.id.inputText);
        radioGroupType = findViewById(R.id.radioType);
        button = findViewById(R.id.buttonDisplay);



        DisplayMethod();

    }

    public void DisplayMethod(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent display = new Intent(SheetMusicActivity.this,DisplayImageActivity.class);

                display.setAction("com.example.awork.DisplayImageActivity");

                display.putExtra(KEY_NAME, editText.getText().toString());

                Bundle bundle = new Bundle();


                String type;
                int selectedId = radioGroupType.getCheckedRadioButtonId();
                RadioButton radioColourButton = findViewById(selectedId);
                type = radioColourButton.getText().toString();
                bundle.putString(KEY_TYPE, type);



                display.putExtras(bundle);

                startActivity(display);
            }
        });
    }



}
