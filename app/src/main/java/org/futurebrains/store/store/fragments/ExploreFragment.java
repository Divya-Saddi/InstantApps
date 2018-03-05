package org.futurebrains.store.store.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.futurebrains.store.store.R;
import org.futurebrains.store.store.model.AppModel;
import org.futurebrains.store.store.utils.RecyclerCustomAdapter;

import java.util.ArrayList;


public class ExploreFragment extends Fragment
{
    ArrayList<AppModel> list;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {  list = getArguments().getParcelableArrayList("TotalAppsList");  }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {   View view = inflater.inflate(R.layout.fragment_music, container, false);

        RecyclerView mRecyclerView = (RecyclerView)view.findViewById(R.id.explore_recycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        RecyclerCustomAdapter adapter = new RecyclerCustomAdapter(getContext(),list,"HomeFragment");
        mRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri)
    {  }

    @Override
    public void onAttach(Context context)
    {  super.onAttach(context);  }


    @Override
    public void onDetach()
    {  super.onDetach(); }


}
