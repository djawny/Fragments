package com.example.daniel.fragments.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.daniel.fragments.R;
import com.example.daniel.fragments.fragment.FragmentEditText;
import com.example.daniel.fragments.fragment.FragmentTextView;

import butterknife.ButterKnife;

public class FragmentCommunicationActivity extends AppCompatActivity implements FragmentEditText.OnButtonClicked {

    FragmentEditText mFragmentEditText;
    FragmentTextView mFragmentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);
        bindFragments();
    }

    private void bindFragments() {
        mFragmentEditText = (FragmentEditText) getSupportFragmentManager().findFragmentById(R.id.fragment_edittext);
        mFragmentTextView = (FragmentTextView) getSupportFragmentManager().findFragmentById(R.id.fragment_textview);
    }

    @Override
    public void showText(String text) {
        mFragmentTextView.showText(text);
    }
}
