package com.saurya.mysmartvpn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.haipq.android.flagkit.FlagImageView;
import com.suke.widget.SwitchButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    SwitchButton switchButton;
    FlagImageView flagImageView;
    TextView country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.connect_vpn);
        flagImageView = (FlagImageView) findViewById(R.id.flagView);
        country = findViewById(R.id.server_country);


        /**Flags Methods*/

//        flagImageView.setCountryCode("IN"); // with text code
//        flagImageView.setCountryCode(Locale.); //  with Locale
//        flagImageView.defaultLocal(); // Show current device



        /**Switch Methods */

//        switchButton.setChecked(true);
//        switchButton.isChecked();
//        switchButton.toggle();     //switch state
//        switchButton.toggle(false);//switch without animation
//        switchButton.setShadowEffect(true);//disable shadow effect
//        switchButton.setEnabled(false);//disable button
//        switchButton.setEnableEffect(false);//disable the switch animation

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if (switchButton.isChecked()) {

                    Toast.makeText(MainActivity.this, "Connecting", Toast.LENGTH_SHORT).show();
                    flagImageView.setBackgroundResource(R.drawable.flag_in);
                    country.setText("India");


                } else {

                    Toast.makeText(MainActivity.this, "Disconnected", Toast.LENGTH_SHORT).show();
                    flagImageView.setBackgroundResource(0);
                    country.setText("");

                }

            }
        });


    }
}