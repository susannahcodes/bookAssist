package com.example.susannahjones.bookassist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by susannahjones on 2/11/18.
 */

public class bookTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_two);

        // ImageView myImageView = (ImageView) findViewById(R.id.my_main_image);
        //   myImageView.setImageResource(R.drawable.library);
    }


    public void onButtonClick (View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

}
