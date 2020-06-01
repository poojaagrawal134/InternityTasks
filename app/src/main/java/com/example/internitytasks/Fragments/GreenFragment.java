package com.example.internitytasks.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.internitytasks.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GreenFragment extends Fragment {
    EditText editText;
    private OnGreenFragmentListener mCallback;
    public GreenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_green, container, false);
        editText=v.findViewById(R.id.enter);
        Button button = v.findViewById(R.id.buttonsend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                mCallback.messageFromGreenFragment(message);
            }
        });

        return v;
    }
    public interface OnGreenFragmentListener {
        void messageFromGreenFragment(String text);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnGreenFragmentListener) {
            mCallback = (OnGreenFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnGreenFragmentListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }

}
