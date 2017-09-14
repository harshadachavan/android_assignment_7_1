package com.example.harshadachavan.implicitintents;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
* @purpose
* The App takes input from the user as text and then passes it to intent
* as search query input to google.
*
* @Author
* Harshada Chavan
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Define the edit text and button as java variables
        final EditText searchterm = (EditText)findViewById(R.id.search_et);

        Button searchbtn = (Button)findViewById(R.id.Button_search);

        //call an onclick listener on button click
        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //convert the text in edit text to string
                String query = searchterm.getText().toString();

                //pass this text to uri as search query
                Uri uri = Uri.parse("https://www.google.com/search?q="+query);

                //initialize intent and pass it to Activity
                Intent gSearchIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(gSearchIntent);
            }
        });
    }
}
