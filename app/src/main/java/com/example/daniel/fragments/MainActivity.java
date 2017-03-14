package com.example.daniel.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
    public void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.storage_button:
                Intent intent1 = new Intent(this, TestStorageActivity.class);
                startActivity(intent1);
                break;
            case R.id.fragment_test_button:
                Intent intent2 = new Intent(this, FragmentTestActivity.class);
                startActivity(intent2);
                break;
            case R.id.fragment_communication_button:
                Intent intent3 = new Intent(this, FragmentCommunicationActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
