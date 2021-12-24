package com.example.bottlespin;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView bottle;
    private Random random = new Random(); // this class alots random values
    private int lastDir; //initially value set by default set by java to any variable is 0
    boolean spinning; //by default false
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottle = findViewById(R.id.bottle);

        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!spinning) { //if already spinning then it won't spin again firat we've to w8 it to stop
                    int newDir = random.nextInt(1800); //max no. of rounds i.e. 1800/360=5rounds
                    float pivotX = bottle.getWidth() / 2;
                    float pivotY = bottle.getHeight() / 2;

                    Animation rotate = new RotateAnimation(lastDir, newDir, pivotX, pivotY);

                    rotate.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                            spinning=true;
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            spinning=false;
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    rotate.setDuration(2500); //2500ms = 2.5s i.e. bottle will rotate for 2.5 secs before coming to rest
                    rotate.setFillAfter(true); //to make spinning look realsistic i.e. when coming to stop, i t slows down

                    lastDir = newDir;
                    bottle.startAnimation(rotate);
                }
            }
        });

        }
    }