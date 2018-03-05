package org.futurebrains.store.store.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.futurebrains.store.store.R;
import org.futurebrains.store.store.activities.WebActivity;
import org.futurebrains.store.store.model.AppModel;

import java.util.ArrayList;

/**
 * Created by Divya on 2/22/2018.
 */




public class RecyclerCustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private String tag;
    private ArrayList<AppModel> list;


    // Constructor which takes 2 parameters
    public RecyclerCustomAdapter(Context context, ArrayList<AppModel> list, String tag) {
        this.tag = tag;
        this.list = list;
        this.context = context;
    }

    public ArrayList<AppModel> getList() {
        return list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_horizontal, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Holder rowHolder = (Holder) holder;
        rowHolder.bind(list.get(position));
    }

    class Holder extends RecyclerView.ViewHolder {
        private String url;
        private LinearLayout parent;
        private ImageView appLogo;
        private TextView appName;

        public Holder(View itemView) {
            super(itemView);
            parent = (LinearLayout) itemView.findViewById(R.id.app_details);
            appLogo = (ImageView) itemView.findViewById(R.id.app_logo);
            appName = (TextView) itemView.findViewById(R.id.app_name);
        }

        void bind(final AppModel model) {
            url = model.getAppUrl();
            appName.setText(model.getAppName());
            appLogo.setImageDrawable(model.getAppImageResource());

            parent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, WebActivity.class).putExtra("url", url));
                }
            });
        }
    }
}
