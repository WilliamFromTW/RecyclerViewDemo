package com.evanhou.app.recyclerviewdemo;

/**
 * Created by evanhou on 2016/5/26.
 */
public class Post {

    public String posterName;
    public String posterThumbnailUrl;
    public String content;

    public Post(String posterName,
                String posterThumbnailUrl, String content) {
        this.posterName = posterName;
        this.posterThumbnailUrl = posterThumbnailUrl;
        this.content = content;
    }

}
