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
public class AllTracks extends Fragment {
    public static AllTracks newInstance(){
        AllTracks allTracks = new AllTracks();
        return allTracks;
    }
    public AllTracks(){

    }
    // overriding the create view method with own activity
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.all_tracks, container, false);
        return rootView;
    }
    //onAttach(Activity ac) is deprecated after API level 23. so i used Context
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if (context instanceof Activity){
            activity = (Activity) context;
            ((MainActivity) activity).onSectionAttached(1);// the number represents the order of drawer
        }
    }
}
