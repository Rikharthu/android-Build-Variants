package com.example.uberv.buildvariants;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.app_id_tv)
    TextView mAppIdTv;
    @BindView(R.id.build_type_tv)
    TextView mBuilTypeTv;
    @BindView(R.id.flavor_tv)
    TextView mFlavorTv;
    @BindView(R.id.version_code_tv)
    TextView mVersionCodeTv;
    @BindView(R.id.version_name_tv)
    TextView mVersionNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // TODO what is BuildConfig class
        // TODO also this: https://developer.android.com/studio/build/manifest-build-variables.html

        mAppIdTv.setText(String.format("applicaiton id: %s", BuildConfig.APPLICATION_ID));
        mBuilTypeTv.setText(String.format("build type: %s", BuildConfig.BUILD_TYPE));
        mFlavorTv.setText(String.format("flavor: %s", BuildConfig.FLAVOR));
        mVersionCodeTv.setText(String.format("version code: %s", BuildConfig.VERSION_CODE));
        mVersionNameTv.setText(String.format("version name: %s", BuildConfig.VERSION_NAME));

        String value = Something.FLAVOR;
        Log.d("MainActivity", value);
    }
}
