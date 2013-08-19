package com.deltaprogram.lldossier;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class AppsMadeActivity extends Activity {

    private AppsIHaveMade[] appsIHaveMade;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appsmade);

        // List of apps
        appsIHaveMade= new AppsIHaveMade[]
        {
                new AppsIHaveMade("BarTexter", "Text your friends visually in a bar.", "com.example.bartexter", ".FullscreenActivity"),
                new AppsIHaveMade("DeltaMadLibs", "Play MadLibs on your phone", "com.delta.deltamadlibs", ".MainActivity"),
                new AppsIHaveMade("AnotherApp", "Future apps go here", "com.example.FutureApp", ".MainActivity"),
                new AppsIHaveMade("AwesomeApp 2", "Future apps go here", "com.example.FutureApp", ".MainActivity"),
                new AppsIHaveMade("FREEApp 3", "More apps go here", "com.example.FutureApp", ".MainActivity"),
                new AppsIHaveMade("HokyApp 4", "Those apps go here", "com.example.FutureApp", ".MainActivity")
        };

        AppsAdapter appAdapter = new AppsAdapter(getApplicationContext(), R.layout.apps_i_have_made_row, appsIHaveMade );

        mListView = (ListView)findViewById(R.id.apps_listView);

        if (mListView != null)
            mListView.setAdapter(appAdapter);

        // Add the ClickListener for the adapter view
        mListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                AppsIHaveMade r = appsIHaveMade[position];

                try {
                    //String uri = "0,0?q="+r.getmAddress()+"+"+r.getmCity()+"+"+r.getmState()+"+"+r.getmZipCode();
                    //Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
                    Intent intent = new Intent(android.content.Intent.ACTION_MAIN);
                    intent.setClassName(r.getmAPKName(), r.getmAPKName() + r.getmAPKClassName());
                    startActivity(intent);

                } catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Could not load "+ r.getmAppName() +" app", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.apps_made, menu);
        return true;
    }
    
}
