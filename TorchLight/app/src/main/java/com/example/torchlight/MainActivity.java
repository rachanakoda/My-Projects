package com.example.torchlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public Boolean is_on = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        Boolean flash = getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cameraID = null;
              CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
              if(flash)
              {
                try {
                    cameraID = cameraManager.getCameraIdList()[0];
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        cameraManager.setTorchMode(cameraID, is_on);
                    }
                } catch (CameraAccessException e) {
                    e.printStackTrace();
                }
            }

        });

    }
}



