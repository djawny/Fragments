package com.example.daniel.fragments.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.fragments.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentTest extends Fragment {

    private static final String NAME_KEY = FragmentTest.class.getClass().getCanonicalName() + "NAME_KEY";

    @BindView(R.id.textview)
    TextView mNameTextView;

    public static FragmentTest getInstance(String name) {
        final FragmentTest fragmentTest = new FragmentTest();
        Bundle bundle = new Bundle();
        bundle.putString(NAME_KEY, name);
        fragmentTest.setArguments(bundle);
        return fragmentTest;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_test, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey(NAME_KEY)) {
            final String name = bundle.getString(NAME_KEY);
            mNameTextView.setText(name);
        }
    }

    public void duplicate() {
        final String text = mNameTextView.getText().toString() + mNameTextView.getText().toString();
        mNameTextView.setText(text);
    }
}
