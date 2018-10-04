package com.example.inspiron.gitproject;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    WifiInfo wInfo = wifiManager.getConnectionInfo();
    String macAddress= "initial";

    WifiManager mWifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
//    WifiManager mWifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
        mWifiManager.startScan()
    //    mWifiManager.startScan();
    List<ScanResult> results = mWifiManager.getScanResults();
        for (ScanResult result : results)
    {
        System.out.println("Access Point MacAddr:" + result.BSSID);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
