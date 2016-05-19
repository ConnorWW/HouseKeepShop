package com.center;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.apple.housekeepshop.R;

public class AddProduct extends Activity {

    EditText pname;
    EditText pprice;
    EditText pdiscription;
    String name;
    String price;
    String discription;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_add_product);
        pname=(EditText)findViewById(R.id.addproduct_name);
        pprice=(EditText)findViewById(R.id.addproduct_price);
        pdiscription=(EditText)findViewById(R.id.addproduct_discription);
        add=(Button)findViewById(R.id.addproduct_add_button);



    }
}
