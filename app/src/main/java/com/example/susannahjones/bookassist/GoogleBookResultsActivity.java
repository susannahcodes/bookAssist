package com.example.susannahjones.bookassist;

/**
 * Created by Evelyn on 2/10/2018.
 */

import android.app.Activity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;

public class GoogleBookResultsActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googleresults);
    }


    void Search() throws URISyntaxException, IOException {
        String key = "";
        String qry = "";
        String cx = "012634030488779693307:3wutlschcyc";
        String fileType = "png,jpg";
        String searchType = "image";
        URL url = new URL("https://www.googleapis.com/customsearch/v1?key=" + key + "&amp;cx=" + cx + "&amp;q=" + qry + "&amp;fileType=" + fileType + "&amp;searchType=" + searchType + "&amp;alt=json");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        GoogleBookResults results = new Gson().fromJson(br, GoogleBookResults.class);
        conn.disconnect();
    }
}