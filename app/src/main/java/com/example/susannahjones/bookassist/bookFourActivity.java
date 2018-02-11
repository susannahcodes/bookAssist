package com.example.susannahjones.bookassist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.net.Uri;




/**
 * Created by susannahjones on 2/11/18.
 */

public class bookFourActivity extends AppCompatActivity {
    private String urlString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_four);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void onButtonClick (View view) {
        urlString = "https://g.co/kgs/WVgmyD";
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