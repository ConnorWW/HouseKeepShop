package com.register;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.apple.housekeepshop.R;

public class OpenShopActivity extends Activity {

    EditText eshopName;
    EditText eshopIntro;
    EditText eshopLocation;
    Button openShop_button;
    String shopName;
    String shopIntro;
    String shopLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_open_shop);
        Intent intent=getIntent();
        String idnumber=intent.getStringExtra("idnumber");
        eshopName=(EditText)findViewById(R.id.openshop_shopname);
        eshopIntro=(EditText)findViewById(R.id.openshop_shopinfo);
        eshopLocation=(EditText)findViewById(R.id.openshop_shoplocation);
        openShop_button=(Button)findViewById(R.id.openshop_button);
        openShop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shopName=eshopName.getText().toString();
                shopIntro=eshopIntro.getText().toString();
                shopLocation=eshopLocation.getText().toString();
                
            }
        });

        Log.d("OpenActivity",idnumber);

    }
}
