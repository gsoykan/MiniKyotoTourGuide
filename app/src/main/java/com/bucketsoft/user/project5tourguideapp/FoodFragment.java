package com.bucketsoft.user.project5tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {


    public FoodFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);
        POIListAdapter adapter = new POIListAdapter(getActivity());
        adapter.setPOISet(createThePOISet());
        ListView listView = rootView.findViewById(R.id.food_list_view);
        listView.setAdapter(adapter);
        return rootView;
    }

    public ArrayList<PointOfInterest> createThePOISet() {
        ArrayList<PointOfInterest> attractionPOIs = new ArrayList<>();
        attractionPOIs.add(new PointOfInterest(getString(R.string.kaisekai_ryori_text), getString(R.string.kaisekai_ryori_description), R.drawable.kaisekairyori));
        attractionPOIs.add(new PointOfInterest(getString(R.string.shojin_ryori_text), getString(R.string.shojin_ryori_description), R.drawable.shojinryori));
        return attractionPOIs;

    }

}
