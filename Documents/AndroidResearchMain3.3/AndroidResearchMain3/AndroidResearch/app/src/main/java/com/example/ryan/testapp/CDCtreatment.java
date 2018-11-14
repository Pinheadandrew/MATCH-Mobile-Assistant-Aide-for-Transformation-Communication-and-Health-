package com.example.ryan.testapp;


/**
 * Created by Ryan on 1/26/2018.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;

public class CDCtreatment extends Fragment{
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstancedState){
        return inflater.inflate(R.layout.fragment_treatments_cdc,null);

  /*      View v = inflater.inflate(R.layout.fragment_treatments_cdc,null);
          Button b = (Button) v.findViewById(R.id.bookmarkButton);

//        b.setOnClickListener(this);

        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View vi) {
                make_Bookmark(vi);
            }
        });
        return v; */

    }
    public void make_Bookmark(View v)
    {
        switch(v.getId())
        {
            case R.id.bookmarkButton:
                TextView testTextView = (TextView) getView().findViewById(R.id.testTextView);
                testTextView.setText("Hello World!");
            break;
        }
//        Intent bookmark = new Intent(getActivity(), Bookmarks.class);
//        startActi1vity(bookmark);


//        Toast.makeText(getActivity(),
//                "Page Bookmarked",
//                Toast.LENGTH_SHORT).show();
    }
}

