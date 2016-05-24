package com.carxclusv.chathurangaj.carxclusv;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PhotoSearchActivity extends AppCompatActivity {

    ImageButton imgbtn;
    Button btnsearch;
    private static final int CAM_REQUREST = 1313;

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_search);
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_search);

        /*btnTakePhoto = (Button) findViewById(R.id.button1);
        imgTakenPhoto = (ImageView) findViewById(R.id.imageView1);

        btnTakePhoto.setOnClickListener(new btnTakePhotoClicker());*/
        imgbtn = (ImageButton) findViewById(R.id.imageButton);
        btnsearch = (Button) findViewById(R.id.button3);

        imgbtn.setOnClickListener( new btnTakePhotoClicker());

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ResultList2.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        /*if (requestCode == CAMERA_PIC_REQUEST) {*/
        if (requestCode == CAM_REQUREST) {
            Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
            imgbtn.setImageBitmap(thumbnail);
        }
    }

    class btnTakePhotoClicker implements Button.OnClickListener
    {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub

            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            /*startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);*/
            startActivityForResult(cameraIntent, CAM_REQUREST);
        }
    }
}
