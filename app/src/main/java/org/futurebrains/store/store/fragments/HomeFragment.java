package org.futurebrains.store.store.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.futurebrains.store.store.R;
import org.futurebrains.store.store.activities.WebActivity;
import org.futurebrains.store.store.model.AppModel;
import org.futurebrains.store.store.utils.PopulateData;
import org.futurebrains.store.store.utils.RecyclerCustomAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.

 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment
{   private ArrayList<AppModel> appsList;
    private ArrayList<AppModel> recommendedAppsList;

    @Override
    public void onAttach(Context context)
    {  super.onAttach(context);  }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {  super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();

        appsList = bundle.getParcelableArrayList("appsList");
        recommendedAppsList = bundle.getParcelableArrayList("topAppsList");



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {   RecyclerView mGridView,mRecyclerView;
        View V;
        // Inflate the layout for this fragment
        V =  inflater.inflate(R.layout.fragment_home, container, false);
        mGridView     = (RecyclerView)V.findViewById(R.id.app_recycler);
        mGridView.setLayoutManager(new GridLayoutManager(getContext(),3));
        mRecyclerView = (RecyclerView)V.findViewById(R.id.recomendations_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));



        RecyclerCustomAdapter gridAdapter = new RecyclerCustomAdapter(getContext(),appsList,"HomeFragment");
        mRecyclerView.setAdapter(gridAdapter);
        gridAdapter.notifyDataSetChanged();

        RecyclerCustomAdapter recommendedAdapter = new RecyclerCustomAdapter(getContext(),recommendedAppsList,"HomeFragment");
        mRecyclerView.setAdapter(recommendedAdapter);
        recommendedAdapter.notifyDataSetChanged();

        return V;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }



    @Override
    public void onDetach() {
        super.onDetach();

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
