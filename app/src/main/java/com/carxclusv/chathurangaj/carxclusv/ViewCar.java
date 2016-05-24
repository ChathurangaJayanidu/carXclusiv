package com.carxclusv.chathurangaj.carxclusv;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
//import com.klinker.android.sliding.SlidingActivity;

/**
 * Created by DELL on 12/26/2015.
 */
/*
public class ViewCar extends SlidingActivity {

    @Override
    public void init(Bundle savedInstanceState) {
        setTitle("CarXclusv");

        */
/*setPrimaryColors(
                getResources().getColor(R.color.primary_color),
                getResources().getColor(R.color.primary_color_dark)
        );*//*


        setImage(R.drawable.bmw);
        setImage(R.drawable.sigiriya2);

        //setPrimaryColors(R.color.colorPrimary,R.color.colorPrimaryDark);
        enableFullscreen();

        setContent(R.layout.content_view_car);
        //setContent(R.layout.activity_content);
    }
}*/
public class ViewCar extends AppCompatActivity {

    PagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    int[] mResources;
    ImageView imgBasic, imgPrice, imgDetails, imgMaps;
    //Bundle bundle = null;
    Button btnweb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_car_detail2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        //setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });

        mCustomPagerAdapter = new CustomPagerAdapter(this);
        mViewPager = (ViewPager) findViewById(R.id.pager2);
        mViewPager.setAdapter(mCustomPagerAdapter);


        //setimages
        imgPrice = (ImageView) findViewById(R.id.img_price);
        imgBasic = (ImageView) findViewById(R.id.img_bmwbasic);
        imgDetails = (ImageView) findViewById(R.id.img_bmw_desciption);
        imgMaps= (ImageView) findViewById(R.id.img_bmwmap);

        imgPrice.setImageResource(R.drawable.bmw_price);
        imgBasic.setImageResource(R.drawable.bmwbasic);
        //imgDetails.setImageResource(R.drawable.bmw_details);
        imgMaps.setImageResource(R.drawable.bmw_map);

        //bundle = getIntent().getExtras();

        btnweb= (Button) findViewById(R.id.goweb);

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), WebViewCar.class);
                startActivity(i);
            }
        });


    }

    public static void start(Context c)
    {
        c.startActivity(new Intent(c, ViewCar.class));
    }


    void setImages(){
        /*if(bundle.getString("carname")=="BMW 520d 2012")
        {
            mResources= new int[]{
                    R.drawable.car10,
                    R.drawable.car11,
                    R.drawable.car12,
                    R.drawable.car14,
                    R.drawable.car15,
                    R.drawable.car13
            };

        }else{
            mResources= new int[]{
                    R.drawable.bmw,
                    R.drawable.bmw,
                    R.drawable.bmw,
                    R.drawable.bmw,
                    R.drawable.bmw,
                    R.drawable.bmw
            };
        }*/

        /*mResources= new int[]{
                R.drawable.bmw,
                R.drawable.bmw,
                R.drawable.bmw,
                R.drawable.bmw,
                R.drawable.bmw,
                R.drawable.bmw
        };*/

        mResources= new int[]{
                R.drawable.car10,
                R.drawable.car11,
                R.drawable.car12,
                R.drawable.car14,
                R.drawable.car15,
                R.drawable.car13
        };

    }


    class CustomPagerAdapter extends PagerAdapter {

        Context mContext;
        LayoutInflater mLayoutInflater;

        public CustomPagerAdapter(Context context) {
            mContext = context;
            mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            setImages();
            return mResources.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((LinearLayout) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView_pagexml);
            imageView.setImageResource(mResources[position]);

            container.addView(itemView);

            return itemView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((LinearLayout) object);
        }
    }


}
