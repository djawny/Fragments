package com.example.daniel.fragments.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.daniel.fragments.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.storage_button, R.id.fragment_test_button, R.id.fragment_communication_button})
    public void onButtonClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.storage_button:
                intent = new Intent(this, TestStorageActivity.class);
                startActivity(intent);
                break;
            case R.id.fragment_test_button:
                intent = new Intent(this, FragmentTestActivity.class);
                startActivity(intent);
                break;
            case R.id.fragment_communication_button:
                intent = new Intent(this, FragmentCommunicationActivity.class);
                startActivity(intent);
                break;
        }
    }
}
