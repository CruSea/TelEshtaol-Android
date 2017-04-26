package com.aset.teleshtaol;

/**
  Created by AmanS on 4/11/2017.
 **/
//Adapted from Album.java @ DailyEnjera
public class Feed {
    private int ImageID;
    private String Title,Content;

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
