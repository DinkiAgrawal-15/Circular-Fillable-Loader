package com.example.loader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

public class MainActivity extends AppCompatActivity {
    CircularFillableLoaders circularFillableLoaders;
    SeekBar seekBar;
    int currentProgress = 80;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circularFillableLoaders = (CircularFillableLoaders)findViewById(R.id.circularFillableLoaders);


        seekBar = (SeekBar)findViewById(R.id.seekbaar);
        seekBar.setMax(100);
        seekBar.setProgress(currentProgress);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                circularFillableLoaders.setProgress(progress);



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
