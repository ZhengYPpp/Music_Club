package com.example.awork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GoShopActivity extends AppCompatActivity {

    private TextView text;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private ImageView imageView1, imageView2, imageView3, imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_shop);

        text = (TextView)findViewById(R.id.IntroductionText);

        //text.setVisibility(View.INVISIBLE);
        imageView1 = (ImageView) findViewById(R.id.d1c);
        imageView2 = (ImageView) findViewById(R.id.s25);
        imageView3 = (ImageView) findViewById(R.id.lx1e);
        imageView4 = (ImageView) findViewById(R.id.d10);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Brand: Kepma\n" +
                        "Model: D1C / D1CE\n" +
                        "Category: Folk Guitar\n" +
                        "Specifications: 41 inches\n" +
                        "Fillet/missing corner: missing corner\n" +
                        "\n" +
                        "Introduction: Kepma D1C is a very good guitar, following the design of Kepma classic EAC, EDC, " +
                        "\nthe panel is made of Sitika spruce, the back and side panels are made of Sapele wood, kauri. \n" +
                        "The fingerboard is made of rosewood, which is light and convenient and durable at the same time.\n" +
                        " The matching strings are 012-053 anti-rust models. \n" +
                        "The production uses the automatic numerical control of HAAS-CNC to produce the key parts of the guitar. \n" +
                        "Is a good novice recommended guitar. And the price is between $150-$200.");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Brand: Brook\n" +
                        "Model: S25-DCG, S25-ACG\n" +
                        "Category: Single Board Folk Guitar\n" +
                        "Specifications: 41/40 inches\n" +
                        "Fillet/missing corner: missing corner\n" +
                        "\n" +
                        "Introduction: Brook S25 series is a commemorative version launched by Brook for the fifth anniversary." +
                        "\n From the appearance, it can be found that these five years of intensive research and improvement. \n" +
                        "This commemorative model is good enough to match the musicians who love Brook.\n" +
                        " The faceplate of this guitar is made of spruce wood, while the back and side plates are made of Sapele wood. \n" +
                        "The neck is made of standard mahogany wood. While being well-made, the price is very affordable," +
                        "\n and the market price is between $250~$350.");
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Brand: Martin\n" +
                        "Model: LX1E Little Martin\n" +
                        "Category: Folk Guitar\n" +
                        "Fillet/missing corner: rounded corner\n" +
                        "\n" +
                        "Introduction: While the Little Martin is our smallest guitar, it is very big on tone, quality and versatility.\n" +
                        "The LX1E acoustic electric model features a solid Sitka spruce top, mahogany high-pressure laminate (HPL) back and sides,\n" +
                        "and a warm satin finish. \n" +
                        "It's ideal for travel, student practice or for just playing around the house or campfire. \n" +
                        "This model includes SUSTAINABLE WOOD CERTIFIED parts. Very intimate, there are also left-hand models to choose from.\n" +
                        " Both price and quality are important for guitar lovers. This price ranges from 500 to 800 on the market.\n" +
                        " If you take good care of it, you can play for a lifetime!");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Brand: Farida\n" +
                        "Models: D10, D10C, D10E, D10CE\n" +
                        "Category: Folk Guitar\n" +
                        "Size: 41\n" +
                        "Fillet/missing corner: rounded corner\n" +
                        "\n" +
                        "Introduction: Farida D10 this guitar is a folk guitar that is more professional.\n" +
                        "If you are switching from a student to a more professional musician, this guitar is highly recommended. \n" +
                        "The D10 panel is made of high-quality single-board Sitka spruce, with mahogany as the side and bottom plates. \n" +
                        "D10 is the most affordable surface veneer model in Farida's D series, \n" +
                        "and the value price is very suitable for developing musicians to buy.");
            }
        });




    }



}
