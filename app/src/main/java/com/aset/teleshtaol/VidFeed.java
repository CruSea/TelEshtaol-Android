package com.aset.teleshtaol;

/**
 Created by AmanS on 4/26/2017.
 **/

public class VidFeed {
    private int VideoID;
    private String VidTitle,VidContent;


    public int getVideoID() {
        return VideoID;
    }

    public void setVideoID(int vidID) {
        VideoID = vidID;
    }

    public String getVidTitle() {
        return VidTitle;
    }

    public void setVidTitle(String vidTitle) {
        VidTitle = vidTitle;
    }

    public String getVidContent() {
        return VidContent;
    }

    public void setVidContent(String vidContent) {
        VidContent = vidContent;
    }
}
