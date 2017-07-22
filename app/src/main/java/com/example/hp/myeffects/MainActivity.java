package com.example.hp.myeffects;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView; //Creating text object
    Button button;  //Creating button object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView2);// It takes textview id from the activity_main.xml
        button= (Button) findViewById(R.id.button); // It takes button id from the activity_main.xml
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Performs click function
                /**
                 ObjectAnimator is used to create and returns a copy .
                 Color.WHITE, Color.BLUE,Color.GREEN,Color.YELLOW=Changing the background color.
                 **/
                ObjectAnimator animator= ObjectAnimator.ofInt(textView,"backgroundColor",
                        Color.WHITE, Color.BLUE,Color.GREEN,Color.YELLOW);
                animator.setEvaluator(new ArgbEvaluator()); //Sets the length of the animation
                animator.setDuration(1000); //Sets the duration of the animation
                //This will invoke the animation from the first frame .
                animator.setRepeatCount(Animation.START_ON_FIRST_FRAME);
                 Toast.makeText(getApplicationContext(),
                        "Blinking effect starts",Toast.LENGTH_LONG).show(); //Toast Message
                animator.start(); //Activity Start
            }
        });
    }






    }
