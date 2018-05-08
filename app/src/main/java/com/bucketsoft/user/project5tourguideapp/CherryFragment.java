package com.bucketsoft.user.project5tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CherryFragment extends Fragment {


    public CherryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cherry, container, false);


        POIListAdapter adapter = new POIListAdapter(getActivity());
        adapter.setPOISet(createThePOISet());
        ListView listView = rootView.findViewById(R.id.cherry_list_view);
        listView.setAdapter(adapter);

        return  rootView;
    }

    public ArrayList<PointOfInterest> createThePOISet(){
        ArrayList<PointOfInterest> attractionPOIs = new ArrayList<>();

        attractionPOIs.add(new PointOfInterest(getString(R.string.philosophers_path_text),getString(R.string.philosophers_path_description),R.drawable.philosopherspath ));
        attractionPOIs.add(new PointOfInterest(getString(R.string.maruyama_park_text),getString(R.string.maruyama_park_description),R.drawable.maruyamapark));

        return attractionPOIs;

    }

}
