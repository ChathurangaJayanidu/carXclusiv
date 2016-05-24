package com.carxclusv.chathurangaj.carxclusv;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 1/8/2016.
 */
public class NewsCardAdapter extends RecyclerView.Adapter<NewsCardAdapter.ViewHolder> {

    List<CarNews> carList;

    public NewsCardAdapter() {
        super();
        carList = new ArrayList<CarNews>();
        CarNews c = new CarNews();
        c.setName("Top 5 Microvan Models in Sri Lanka");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam.");
        c.setThumbnail(R.drawable.news1);
        c.setmDate("10 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);

        c = new CarNews();
        c.setName("2015 FORD EVEREST Review");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua.");
        c.setThumbnail(R.drawable.news2);
        c.setmDate("01 January 2016");
        c.setmNewsType("Reviews");
        carList.add(c);

        c = new CarNews();
        c.setName("BMW i8");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis.");
        c.setThumbnail(R.drawable.bmw);
        c.setmDate("08 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);

        c = new CarNews();
        c.setName("BMW i8");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam.");
        c.setThumbnail(R.drawable.bmw);
        c.setmDate("08 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);


        c = new CarNews();
        c.setName("BMW i8");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minimveniam, quis.");
        c.setThumbnail(R.drawable.bmw);
        c.setmDate("08 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);

        c = new CarNews();
        c.setName("BMW i8");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minimveniam, quis.");
        c.setThumbnail(R.drawable.bmw);
        c.setmDate("08 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);

        c = new CarNews();
        c.setName("BMW i8");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minimveniam, quis.");
        c.setThumbnail(R.drawable.bmw);
        c.setmDate("08 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);

        c = new CarNews();
        c.setName("BMW i8");
        c.setDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minimveniam, quis.");
        c.setThumbnail(R.drawable.bmw);
        c.setmDate("08 January 2016");
        c.setmNewsType("FEATURE");
        carList.add(c);

        //c = new Car();
        //carList.add(c);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_news_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        CarNews carNews = carList.get(i);
        viewHolder.title.setText(carNews.getName());
        viewHolder.description.setText(carNews.getDes());
        viewHolder.imgThumbnail.setImageResource(carNews.getThumbnail());
        viewHolder.date.setText(carNews.getmDate());
        viewHolder.newsType.setText(carNews.getmNewsType());
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView title;
        public TextView description;
        public TextView date;
        public Button newsType;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnailn);
            title = (TextView)itemView.findViewById(R.id.tvTitlen);
            description = (TextView)itemView.findViewById(R.id.tvDescriptionn);
            date = (TextView) itemView.findViewById(R.id.tvDaten);
            newsType = (Button) itemView.findViewById(R.id.btnNewsTypen);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ViewCar.class);
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}


