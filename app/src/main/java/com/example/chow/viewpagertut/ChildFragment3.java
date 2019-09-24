package com.example.chow.viewpagertut;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by per6 on 1/10/18.
 */

public class ChildFragment3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.child_fragment_3_layout, container, false);
        Button buttonInFragment3 = rootView.findViewById(R.id.button_3);
        buttonInFragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "button in fragment 3", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
