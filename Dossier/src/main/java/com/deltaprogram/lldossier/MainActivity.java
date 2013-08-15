package com.deltaprogram.lldossier;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView mDisplayName;
    private TextView mDisplayAge;
    private TextView mDisplayFaveApps;
    private TextView mViewBackground;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String firstName;
        String lastName;
        int numApps;

        Person   mAPerson;

        LinearLayout mMyLinearLayout;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDisplayName = (TextView) findViewById(R.id.textView3);
        mDisplayAge = (TextView) findViewById(R.id.textView5);
        mDisplayFaveApps = (TextView) findViewById(R.id.textView6);

        mAPerson = new Person("Chris", "Athanas");
        mAPerson.setmNumApps(1);
        numApps = mAPerson.getmNumApps();
        mAPerson.setmAge(45);
        mAPerson.setmFavoriteApp("GrossAnnoyingNoises.app");

        String actualDisplayString = mAPerson.getmFirstName() + " " + mAPerson.getmLastName()+ ", "
+ mAPerson.getmNumApps() + " App(s) made.";

        mDisplayName.setText(actualDisplayString);
        mDisplayName.setTextColor(Color.RED);


        actualDisplayString =  mAPerson.getmAge() + " years young.";
        mDisplayAge.setText(actualDisplayString);
        mDisplayAge.setTextColor(Color.BLUE);

        actualDisplayString =  mAPerson.getmFavoriteApp();
        mDisplayFaveApps.setText(actualDisplayString);
        mDisplayFaveApps.setTextColor(Color.BLACK);

        //mMyLinearLayout = (LinearLayout) findViewById(R.layout.activity_main);
        //mButton = new Button(this);
        //mButton.setText("My new button)");
        //mMyLinearLayout.addView(mButton);

        Button buttonToLaunchBarText = (Button) findViewById(R.id.launch_bartext);

        buttonToLaunchBarText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ACTION_MAIN,
                //Intent i = new Intent(getApplicationContext(), com.example.bartexter.FullscreenActivity.class));
                Intent i = new Intent();
                i.setAction(Intent.ACTION_MAIN);
                i.setClassName("com.example.bartexter","com.example.bartexter.FullscreenActivity" );
                startActivity(i);
                finish();
            }

        } );

    }

    // This is the best comment of all time
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
