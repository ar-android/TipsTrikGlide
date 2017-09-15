package com.ahmadrosid.tipstrikglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this)
                .asBitmap()
                .load("https://avatars0.githubusercontent.com/u/11156973?v=4&s=100")
                .into(new RoundedImageVIewTarget(imageView));

    }
}
