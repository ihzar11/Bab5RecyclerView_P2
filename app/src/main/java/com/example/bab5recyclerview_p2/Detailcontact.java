package com.example.bab5recyclerview_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class Detailcontact extends AppCompatActivity {

    ImageView imageView;
    TextView nama, notelfon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailcontact);
        getIncomingIntent();
    }

    private void getIncomingIntent()
    {
        String name = getIntent().getStringExtra("nama");
        String phone = getIntent().getStringExtra("phone");
        String image = getIntent().getStringExtra("image");
        setImage(name, phone, image);
    }



    private void setImage(String name, String phone, String image){

    imageView = (ImageView) findViewById(R.id.imageContact);
    nama = (TextView) findViewById(R.id.txtName);
    notelfon = (TextView) findViewById(R.id.txtPhone);
    nama.setText(name);
    notelfon.setText(phone);
    imageView.setImageURI(Uri.parse(image));

    }



}