package com.techclub.mckvie;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Syllabus extends AppCompatActivity {

    Button button1st;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        button1st= (Button) findViewById(R.id.button1st);
        button1st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager =(DownloadManager)getSystemService(DOWNLOAD_SERVICE);
                Uri uri =Uri.parse("http://www.mckvie.edu.in/site/assets/files/1161/1st_year_b_tech_syllabus_revised_18_08_10.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
