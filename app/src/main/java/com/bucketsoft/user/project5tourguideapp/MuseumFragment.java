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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_museum, container, false);


        POIListAdapter adapter = new POIListAdapter(getActivity());
        adapter.setPOISet(createThePOISet());
        ListView listView = rootView.findViewById(R.id.museum_list_view);
        listView.setAdapter(adapter);

        return  rootView;
    }

    public ArrayList<PointOfInterest> createThePOISet(){
        ArrayList<PointOfInterest> attractionPOIs = new ArrayList<>();

        attractionPOIs.add(new PointOfInterest(getString(R.string.kyoto_national_museum_text),getString(R.string.kyoto_national_museum_description),R.drawable.kyotonationalmuseum ));
        attractionPOIs.add(new PointOfInterest(getString(R.string.the_museum_of_kyoto_text),getString(R.string.the_museum_of_kyoto_description),R.drawable.themuseumofkyoto));

        return attractionPOIs;

    }

}
