package com.example.daniel.fragments.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daniel.fragments.Fragment.FragmentEditText;
import com.example.daniel.fragments.Fragment.FragmentTextView;
import com.example.daniel.fragments.R;

import butterknife.ButterKnife;

public class FragmentCommunicationActivity extends AppCompatActivity implements FragmentEditText.OnButtonClicked {

    FragmentEditText mFragmentEditText;
    FragmentTextView mFragmentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);
        ButterKnife.bind(this);

        mFragmentEditText = (FragmentEditText) getSupportFragmentManager().findFragmentById(R.id.fragment_edittext);
        mFragmentTextView = (FragmentTextView) getSupportFragmentManager().findFragmentById(R.id.fragment_textview);
    }

    @Override
    public void showText(String text) {
        mFragmentTextView.showText(text);
    }
}
