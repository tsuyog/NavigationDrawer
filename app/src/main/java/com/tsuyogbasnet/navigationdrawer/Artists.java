package com.tsuyogbasnet.navigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tsuyogbasnet on 10/19/15.
 */
public class Artists extends Fragment{
    public static Artists newInstance(){
        Artists artists = new Artists();
        return artists;
    }
    public Artists(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.artists, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if (context instanceof Activity){
            activity = (Activity) context;
            ((MainActivity) activity).onSectionAttached(3);
        }
    }
}
