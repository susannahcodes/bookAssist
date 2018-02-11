package com.example.susannahjones.bookassist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;


/**
 * Created by susannahjones on 2/11/18.
 */

public class bookOneActivity extends AppCompatActivity {

    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetLeftIn;
    private boolean mIsBackVisible = false;
    private View mCardFrontLayout;
    private View mCardBackLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_book_one);



          //  Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
          //  setSupportActionBar(myToolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
    public void onButtonClick (View view) {
        Intent intent = new Intent();
        finish();
    }






    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }



}


