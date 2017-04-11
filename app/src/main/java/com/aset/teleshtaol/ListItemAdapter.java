package com.aset.teleshtaol;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
//import android.view.MenuInflater;
//import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by AmanS on 4/11/2017.
 */

//Adapted from ListItemAdapter.java @Daily Enjera

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.DataObjectHolder> {
    private static List<Feed> myItems;
    private static Context myContext;

    public ListItemAdapter(List<Feed> myItems, Context myContext) {
        this.myItems = myItems;
        if(myItems != null){
            Collections.reverse(myItems);
        }
        this.myContext = myContext;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item, parent, false);
        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.Title.setText(myItems.get(position).getTitle());
        holder.Content.setText(myItems.get(position).getContent());
        holder.FeedImage.setImageResource(myItems.get(position).getImageID());
//        Glide.with(myContext)
//                .load(myItems.get(position).getImageURL())
//                .into(holder.AlbumImage);
    }

    @Override
    public int getItemCount() {
        return myItems.size();
    }

    public static class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        private TextView Title, Content; //, PubDate;
        private ImageView FeedImage; //,Overflow;


        public DataObjectHolder(View itemView) {
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.feed_title);
            Content = (TextView) itemView.findViewById(R.id.feed_content);
            FeedImage = (ImageView) itemView.findViewById(R.id.feed_img);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(myContext, DetailView.class);
            Bundle b = new Bundle();
            b.putString("ImageID",String.valueOf(myItems.get(getAdapterPosition()).getImageID()));
            b.putString("Title",String.valueOf(myItems.get(getAdapterPosition()).getTitle()));
            b.putString("Content",String.valueOf(myItems.get(getAdapterPosition()).getContent()));
            intent.putExtras(b);
            myContext.startActivity(intent);
        }

        @Override
        public boolean onLongClick(View v) {

            return true;
        }
    }
   // private static void showPopupMenu(View view, final Feed feed) {
        // inflate menu
     //   PopupMenu popup = new PopupMenu(myContext, view);
       // MenuInflater inflater = popup.getMenuInflater();
       // inflater.inflate(R.menu.pop_menu, popup.getMenu());
        //popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
          //  @Override
           // public boolean onMenuItemClick(MenuItem item) {
            //    if(item.getItemId() == R.id.action_settings){

               // }
             //   return false;
            }
        //});
        //popup.show();
    //}
//}

