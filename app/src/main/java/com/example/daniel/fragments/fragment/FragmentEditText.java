package com.example.daniel.fragments.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.daniel.fragments.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentEditText extends Fragment {

    @BindView(R.id.fragment_edittext)
    EditText mText;

    public interface OnButtonClicked {
        void showText(String text);
    }

    OnButtonClicked mListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_edittext, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnButtonClicked) {
            mListener = (OnButtonClicked) context;
        }
    }

    @OnClick(R.id.fragment_button)
    public void onButtonClicked(View view) {
        if (mListener != null) {
            mListener.showText(mText.getText().toString());
        }
    }
}
