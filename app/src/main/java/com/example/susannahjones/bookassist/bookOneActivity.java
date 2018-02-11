package com.example.susannahjones.bookassist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;



/**
 * Created by susannahjones on 2/11/18.
 */

public class bookOneActivity extends AppCompatActivity {

    private String urlString;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_book_one);
            assert getSupportActionBar() != null;
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
    public void onButtonClick (View view) {
        urlString = "https://g.co/kgs/cGyKJp";
        Uri uri = Uri.parse(urlString);
        Intent uIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(uIntent);
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


