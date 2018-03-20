package com.example.hp.ratingpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar myBar = (RatingBar) findViewById(R.id.ratingBar);
        Button submitBtn = (Button) findViewById(R.id.button);
        final TextView showRating = (TextView) findViewById(R.id.myText);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRating.setText("Rating is: " + myBar.getRating());
            }
        });
    }
}
