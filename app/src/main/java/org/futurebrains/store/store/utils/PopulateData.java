package org.futurebrains.store.store.utils;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;

import org.futurebrains.store.store.R;
import org.futurebrains.store.store.model.AppModel;

import java.util.ArrayList;

/**
 * Created by Divya on 2/22/2018.
 */

public class PopulateData {
    Context context;

    public PopulateData(Context context) {
        this.context = context;
    }

    public ArrayList<AppModel> getRecomendedApps()
    {
        ArrayList<AppModel> list = new ArrayList<>();
        list.add(new AppModel(context.getDrawable(R.drawable.whatsapp), "Whatsapp", "https://www.whatsapp.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.facebook), "Facebook", "https://www.facebook.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.instagram), "Instagram", "https://www.instagram.com/?hl=en"));
        list.add(new AppModel(context.getDrawable(R.drawable.linkedin), "LinkedIn", "https://www.linkedin.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.twitter), "Twitter", "https://twitter.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.youtube), "Youtube", "https://www.youtube.com/"));
        return list;
    }


    public ArrayList<AppModel> getAppsCatageories()
    {
        ArrayList<AppModel> list = new ArrayList<>();
        list.add(new AppModel(context.getDrawable(R.mipmap.ic_social), "Social", "https://www.whatsapp.com/"));
        list.add(new AppModel(context.getDrawable(R.mipmap.ic_travel), "Travel", "https://www.facebook.com/"));
        list.add(new AppModel(context.getDrawable(R.mipmap.ic_social), "Food", "https://www.instagram.com/?hl=en"));
        list.add(new AppModel(context.getDrawable(R.mipmap.ic_social), "Books", "https://www.linkedin.com/"));
        list.add(new AppModel(context.getDrawable(R.mipmap.ic_social), "Music", "https://twitter.com/"));
        list.add(new AppModel(context.getDrawable(R.mipmap.ic_social), "News", "https://www.youtube.com/"));

        return list;
    }

    public ArrayList<AppModel> getShoppingApps() {
        ArrayList<AppModel> list = new ArrayList<>();
        list.add(new AppModel(context.getDrawable(R.drawable.mytra), "Myntra", "https://www.whatsapp.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.amazon), "Amazon", "https://www.facebook.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.flipkart), "Flipkart", "https://www.instagram.com/?hl=en"));
        list.add(new AppModel(context.getDrawable(R.drawable.ebay), "LinkedIn", "https://www.linkedin.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.ajio), "Twitter", "https://twitter.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.snapdeal), "Youtube", "https://www.youtube.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.shopclues), "Youtube", "https://www.youtube.com/"));
        return list;
    }

    public ArrayList<AppModel> getTravelApps() {
        ArrayList<AppModel> list = new ArrayList<>();
        list.add(new AppModel(context.getDrawable(R.drawable.uber), "Uber", "https://www.whatsapp.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.ola), "Ola", "https://www.facebook.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.makemytrip), "Instagram", "https://www.instagram.com/?hl=en"));
        list.add(new AppModel(context.getDrawable(R.drawable.trivago), "LinkedIn", "https://www.linkedin.com/"));

        return list;
    }

    public ArrayList<AppModel> getFoodapps() {
        ArrayList<AppModel> list = new ArrayList<>();
        list.add(new AppModel(context.getDrawable(R.drawable.swiggy), "Swiggy", "https://www.whatsapp.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.foodpanda), "Food Panda", "https://www.facebook.com/"));
        return list;
    }

    public ArrayList<AppModel> getTotalApps()
    {   ArrayList<AppModel> list = new ArrayList<>();

        list.add(new AppModel(context.getDrawable(R.drawable.gana), "Gana", "https://gaana.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.swiggy), "Swiggy", "https://www.swiggy.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.uber), "Uber", "https://www.uber.com/en-IN/"));
        list.add(new AppModel(context.getDrawable(R.drawable.ola), "Ola", "https://www.olacabs.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.mytra), "Myntra", "https://www.myntra.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.whatsapp), "Whatsapp", "https://www.whatsapp.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.facebook), "Facebook", "https://www.facebook.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.instagram), "Instagram", "https://www.instagram.com/?hl=en"));
        list.add(new AppModel(context.getDrawable(R.drawable.linkedin), "LinkedIn", "https://www.linkedin.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.twitter), "Twitter", "https://twitter.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.youtube), "Youtube", "https://www.youtube.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.quora), "Quora", "https://www.myntra.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.pintrest), "Pintrest", "https://in.pinterest.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.amazon), "Amazon", "https://www.amazon.in/"));
        list.add(new AppModel(context.getDrawable(R.drawable.flipkart), "Flipkart", "https://www.flipkart.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.ebay), "Ebay", "https://www.ebay.in/"));
        list.add(new AppModel(context.getDrawable(R.drawable.ajio), "AJIO", "https://www.ajio.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.snapdeal), "Snapdeal", "https://www.snapdeal.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.shopclues), "Shopclues", "https://www.shopclues.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.makemytrip), "Make my trip", "https://www.makemytrip.com/"));
        list.add(new AppModel(context.getDrawable(R.drawable.trivago), "Trivago", "https://www.trivago.in/"));
        list.add(new AppModel(context.getDrawable(R.drawable.foodpanda), "Food Panda", "https://www.foodpanda.in/"));
        list.add(new AppModel(context.getDrawable(R.drawable.wink), "Wink", "https://www.wynk.in/music"))
        return list;
    }
}



