package com.example.awork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.awork.Music;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import javax.xml.transform.Templates;


public class DisplayImageActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private String music_name="Castle of Sky", Music_id, Music_name, Music_type;
    private DatabaseReference myRef;
    private ImageView imageView;
    private TextView textView;
    private Query queryName, queryType;
    private String DisplayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        Intent intent = getIntent();
        Music_name = intent.getStringExtra(SheetMusicActivity.KEY_NAME);
        Music_type = intent.getStringExtra(SheetMusicActivity.KEY_TYPE);

        imageView = (ImageView) findViewById(R.id.imageview);
        textView = (TextView) findViewById(R.id.textView);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(Music_name);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef= database.getReference();



        Toast.makeText(DisplayImageActivity.this, Music_name + "\n" + Music_type, Toast.LENGTH_SHORT).show();

        ShowDisplay();
    }

    private void ShowDisplay()
    {

        myRef.child("sheet music").child(Music_type).child(Music_name).addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {

                if (dataSnapshot.hasChild("image")){
                    DisplayImage = dataSnapshot.child("image").getValue().toString();

                    Picasso.get().load(DisplayImage).into(imageView);

                    Toast.makeText(DisplayImageActivity.this, Music_name + "\n" + Music_type, Toast.LENGTH_SHORT).show();
                }
                else
                {
                   myRef.child("sheet music").child("not find").addValueEventListener(new ValueEventListener() {
                       @Override
                       public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                           DisplayImage = dataSnapshot.child("image").getValue().toString();
                           Picasso.get().load(DisplayImage).into(imageView);
                           Toast.makeText(DisplayImageActivity.this,"Sorry, We don't have this Sheet Music",Toast.LENGTH_SHORT).show();
                       }

                       @Override
                       public void onCancelled(@NonNull DatabaseError databaseError) {

                       }
                   });


                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
