package com.carxclusv.chathurangaj.carxclusv;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 1/8/2016.
 */
/*public class CardAdapterWishList {
}*/
public class CardAdapterWishList extends RecyclerView.Adapter<CardAdapterWishList.ViewHolder>  {

    List<Car> carList;

    public CardAdapterWishList() {
        super();
        carList = new ArrayList<Car>();

        Car c = new Car();
        c.setName("BMW i8");
        c.setPrice("Rs 30,000,000");
        c.setMilage("5000 km | Petrol | 2015");
        c.setAddress("Bokundara | Piliyandala");
        c.setmThumbnail(R.drawable.bmw);
        carList.add(c);

        c = new Car();
        c.setName("BMW 2");
        c.setPrice("Rs 30,000,000");
        c.setMilage("5000 km | Petrol | 2015");
        c.setAddress("Bokundara | Piliyandala");
        c.setmThumbnail(R.drawable.bmw);
        carList.add(c);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_item, viewGroup, false);
        /*View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.recycler_view_card_item, null);*/
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Car car = carList.get(i);
        viewHolder.carName.setText(car.getName());
        viewHolder.carImg.setImageResource(car.getmThumbnail());
        viewHolder.price.setText(car.getPrice());
        viewHolder.milage.setText(car.getMilage());
        viewHolder.address.setText(car.getAddress());

        viewHolder.car = car;
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        public Car car;
        public ImageView carImg;
        public TextView carName;
        public TextView price, milage, address;

        public ViewHolder(View itemView) {
            super(itemView);
            carImg = (ImageView)itemView.findViewById(R.id.ivCarThumb);
            carName = (TextView)itemView.findViewById(R.id.tvCarName);
            price = (TextView)itemView.findViewById(R.id.tvPrice);
            milage = (TextView)itemView.findViewById(R.id.tvMilage);
            address = (TextView)itemView.findViewById(R.id.tvAddress);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Intent intent = new Intent(v.getContext(), TestActivity.class);
                    Intent intent = new Intent(v.getContext(), ViewCar.class);
                    v.getContext().startActivity(intent);
                    //Toast.makeText(v.getContext(), "car name: " + car.getName(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(v.getContext(), "car name: " + car.getName(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}

