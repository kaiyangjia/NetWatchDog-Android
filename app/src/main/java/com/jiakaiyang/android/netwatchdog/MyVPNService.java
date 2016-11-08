package com.jiakaiyang.android.netwatchdog;

import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Network;
import android.net.VpnService;
import android.os.IBinder;

import java.net.DatagramSocket;
import java.net.Socket;

/**
 * Created by jia on 16/11/7.
 *
 */

public class MyVPNService extends VpnService {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    private void config(){
        VpnService.Builder builder = new VpnService.Builder();
        builder.addRoute("0.0.0.0", 0);
    }


    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    public void onRevoke() {
        super.onRevoke();
    }

    @Override
    public boolean protect(DatagramSocket socket) {
        return super.protect(socket);
    }

    @Override
    public boolean protect(int socket) {
        return super.protect(socket);
    }

    @Override
    public boolean protect(Socket socket) {
        return super.protect(socket);
    }

    @Override
    public boolean setUnderlyingNetworks(Network[] networks) {
        return super.setUnderlyingNetworks(networks);
    }
}
