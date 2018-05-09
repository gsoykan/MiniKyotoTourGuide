package com.bucketsoft.user.project5tourguideapp;

import android.content.Context;
import android.support.v4.graphics.ColorUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class POIListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<PointOfInterest> POISet;

    public POIListAdapter(Context context) {
        mContext = context;
    }

    public void setPOISet(ArrayList<PointOfInterest> POISet) {
        this.POISet = POISet;
    }

    @Override
    public int getCount() {
        return POISet.size();
    }

    @Override
    public Object getItem(int i) {
        return POISet.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.attraction_card, viewGroup, false);
        }

        TextView nameTextField = view.findViewById(R.id.card_name_text_view);
        TextView description = view.findViewById(R.id.card_description_text_view);
        ImageView POIImage = view.findViewById(R.id.card_image_view);
        nameTextField.setText(POISet.get(i).getName());
        description.setText(POISet.get(i).getDescription());

        if (POISet.get(i).hasImage()) {
            POIImage.setImageResource(POISet.get(i).getImageId());
        } else {
            POIImage.setVisibility(View.GONE);
        }
        return view;
    }
}
