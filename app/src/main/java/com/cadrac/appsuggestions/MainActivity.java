package com.cadrac.appsuggestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

public class MainActivity extends AppCompatActivity {
    Button b1,button1;
    String status;
    //private prefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        button1=findViewById(R.id.button1);

//app introduction start
        status = SharedPreference.getfirst(getApplicationContext());
        if (!status.equals("first")) {

            TapTargetView.showFor(this,                 // `this` is an Activity
                    TapTarget.forView(findViewById(R.id.b1), "This is a button", "Click here")
                            // All options below are optional
                            .outerCircleAlpha(0.96f)            // Specify the alpha amount for the outer circle
                            .titleTextSize(20)                  // Specify the size (in sp) of the title text
                            .descriptionTextSize(15),           // Specify the size (in sp) of the description text

                    new TapTargetView.Listener() {          // The listener can listen for regular clicks, long clicks or cancels
                        @Override
                        public void onTargetClick(TapTargetView view) {
                            super.onTargetClick(view);      // This call is optional
                            new MainActivity();
                            SharedPreference.savefirst(getApplicationContext(),"first");
                        }
                    });
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);*/
            }


        });



    }



}
