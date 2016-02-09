package com.example.darsh_000.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by darsh_000 on 2/8/2016.
 */
public class MyService extends Service
{
    public IBinder onBind(Intent arg0)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int flag, int startId)
    {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
