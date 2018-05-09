package com.bucketsoft.user.project5tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionFragment extends Fragment {

    public AttractionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attraction, container, false);
        POIListAdapter adapter = new POIListAdapter(getActivity());
        adapter.setPOISet(createThePOISet());
        ListView listView = rootView.findViewById(R.id.attraction_list_view);
        listView.setAdapter(adapter);
        return rootView;
    }

    public ArrayList<PointOfInterest> createThePOISet() {
        ArrayList<PointOfInterest> attractionPOIs = new ArrayList<>();
        attractionPOIs.add(new PointOfInterest(getString(R.string.fushimi_inari_shrine_text), getString(R.string.fushimi_inari_shrine_description), R.drawable.fushimiinarishrine));
        attractionPOIs.add(new PointOfInterest(getString(R.string.kinkakuji_text), getString(R.string.kinkakuji_description), R.drawable.kinkakuji));
        return attractionPOIs;

    }

}
