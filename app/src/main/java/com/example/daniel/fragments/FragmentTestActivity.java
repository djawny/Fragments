package com.example.daniel.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentTestActivity extends AppCompatActivity {

    private static final String TAG = FragmentTest.class.getCanonicalName();

    FragmentTest fragmentTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);
        ButterKnife.bind(this);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.activity_fragment_test, FragmentTest.getInstance("Daniel"), TAG)
                .commit();
        fragmentTest = (FragmentTest) getSupportFragmentManager().findFragmentByTag(TAG);
    }

    @OnClick(R.id.duplicate)
    public void onDuplicateButtonClicked() {
        fragmentTest.duplicate();
    }
}
