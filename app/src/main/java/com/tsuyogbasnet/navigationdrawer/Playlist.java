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
public class Playlist extends Fragment {
    public static Playlist newInstance(){
        Playlist playlist = new Playlist();
        return playlist;
    }
    public Playlist(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.playlist, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if (context instanceof Activity){
            activity=  (Activity) context;
            ((MainActivity) activity).onSectionAttached(2);
        }

    }
}
