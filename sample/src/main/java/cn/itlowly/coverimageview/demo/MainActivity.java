package cn.itlowly.coverimageview.demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import cn.itlowly.view.CoverImageView;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private CoverImageView cimg_test;
    private SeekBar sb_r;
    private SeekBar sb_g;
    private SeekBar sb_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cimg_test = findViewById(R.id.cimg_test);

        sb_r = findViewById(R.id.sb_r);
        sb_g = findViewById(R.id.sb_g);
        sb_b = findViewById(R.id.sb_b);

        sb_r.setOnSeekBarChangeListener(this);
        sb_g.setOnSeekBarChangeListener(this);
        sb_b.setOnSeekBarChangeListener(this);

        random(sb_r);
        random(sb_g);
        random(sb_b);
    }

    private void random(SeekBar seekBar) {
        int random = (int) (Math.random() * 255);
        seekBar.setProgress(random);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int rgbR = sb_r.getProgress();
        int rgbG = sb_g.getProgress();
        int rgbB = sb_b.getProgress();

        cimg_test.setCoverColor(Color.argb(255, rgbR, rgbG, rgbB));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
