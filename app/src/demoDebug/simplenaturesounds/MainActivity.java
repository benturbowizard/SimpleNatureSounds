package com.turboapps.simplenaturesounds;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.CompoundButton;

public class MainActivity extends Activity {


    boolean plays1 = true, plays2 = true, plays3 = true,
            plays4 = true, plays5 = true, plays6 = true;

    private final static int MAX_VOLUME = 100;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Debug functions to wake device
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);


        setContentView(R.layout.activity_main);

        // Media Player Section

        Switch switch1 = findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playAudio1(buttonView);
                    plays1 = true;

                }

                if (!isChecked) {
                    killAudio1();
                    plays1 = false;
                }
            }
        });

        Switch switch2 = findViewById(R.id.switch2);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playAudio2(buttonView);
                    plays2 = true;

                }

                if (!isChecked) {
                    killAudio2();
                    plays2 = false;
                }
            }
        });

        Switch switch3 = findViewById(R.id.switch3);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playAudio3(buttonView);
                    plays3 = true;

                }

                if (!isChecked) {
                    killAudio3();
                    plays3 = false;
                }
            }
        });

        Switch switch4 = findViewById(R.id.switch4);
        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playAudio4(buttonView);
                    plays4 = true;

                }

                if (!isChecked) {
                    killAudio4();
                    plays4 = false;
                }
            }
        });

        Switch switch5 = findViewById(R.id.switch5);
        switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playAudio5(buttonView);
                    plays5 = true;

                }

                if (!isChecked) {
                    killAudio5();
                    plays5 = false;
                }
            }
        });

        Switch switch6 = findViewById(R.id.switch6);
        switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    playAudio6(buttonView);
                    plays6 = true;

                }

                if (!isChecked) {
                    killAudio6();
                    plays6 = false;
                }
            }
        });


        //Seek bar Volume Control

        SeekBar seekBar1 = findViewById(R.id.seekBar1);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);
        SeekBar seekBar4 = findViewById(R.id.seekBar4);
        SeekBar seekBar5 = findViewById(R.id.seekBar5);
        SeekBar seekBar6 = findViewById(R.id.seekBar6);

        seekBar1.setMax(0);
        seekBar1.setMax(100);
        seekBar1.setProgress(100);

        seekBar2.setMax(0);
        seekBar2.setMax(100);
        seekBar2.setProgress(100);

        seekBar3.setMax(0);
        seekBar3.setMax(100);
        seekBar3.setProgress(100);

        seekBar4.setMax(0);
        seekBar4.setMax(100);
        seekBar4.setProgress(100);

        seekBar5.setMax(0);
        seekBar5.setMax(100);
        seekBar5.setProgress(100);

        seekBar6.setMax(0);
        seekBar6.setMax(100);
        seekBar6.setProgress(100);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress1, boolean fromUser) {
                float volume1 = (float) (1 - (Math.log(MAX_VOLUME - progress1) / Math.log(MAX_VOLUME)));
                PlayAudio1.volume1 = volume1;
                if (plays1) {
                    PlayAudio1.mCurrentPlayer1.setVolume(volume1, volume1);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar1) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar1) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress2, boolean fromUser) {
                float volume2 = (float) (1 - (Math.log(MAX_VOLUME - progress2) / Math.log(MAX_VOLUME)));
                PlayAudio2.volume2 = volume2;
                if (plays2) {
                    PlayAudio2.mCurrentPlayer2.setVolume(volume2, volume2);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar2) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar2) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar3, int progress3, boolean fromUser) {
                float volume3 = (float) (1 - (Math.log(MAX_VOLUME - progress3) / Math.log(MAX_VOLUME)));
                PlayAudio3.volume3 = volume3;
                if (plays3) {
                    PlayAudio3.mCurrentPlayer3.setVolume(volume3, volume3);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar3) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar3) {

            }
        });

        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar4, int progress4, boolean fromUser) {
                float volume4 = (float) (1 - (Math.log(MAX_VOLUME - progress4) / Math.log(MAX_VOLUME)));
                PlayAudio4.volume4 = volume4;
                if (plays4) {
                    PlayAudio4.mCurrentPlayer4.setVolume(volume4, volume4);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar4) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar4) {

            }
        });

        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar5, int progress5, boolean fromUser) {
                float volume5 = (float) (1 - (Math.log(MAX_VOLUME - progress5) / Math.log(MAX_VOLUME)));
                PlayAudio5.volume5 = volume5;
                if (plays5) {
                    PlayAudio5.mCurrentPlayer5.setVolume(volume5, volume5);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar5) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar5) {

            }
        });

        seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar6, int progress6, boolean fromUser) {
                float volume6 = (float) (1 - (Math.log(MAX_VOLUME - progress6) / Math.log(MAX_VOLUME)));
                PlayAudio6.volume6 = volume6;
                if (plays6) {
                    PlayAudio6.mCurrentPlayer6.setVolume(volume6, volume6);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar6) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar6) {

            }
        });


    }

    //Handle PlayAudioX Service calls

    public void playAudio1(View view) {
        Intent objIntent = new Intent(this, PlayAudio1.class);
        startService(objIntent);
    }

    public void killAudio1() {
        stopService(new Intent(this, PlayAudio1.class));
    }

    public void playAudio2(View view) {
        Intent objIntent = new Intent(this, PlayAudio2.class);
        startService(objIntent);
    }

    public void killAudio2() {
        stopService(new Intent(this, PlayAudio2.class));
    }

    public void playAudio3(View view) {
        Intent objIntent = new Intent(this, PlayAudio3.class);
        startService(objIntent);
    }

    public void killAudio3() {
        stopService(new Intent(this, PlayAudio3.class));
    }

    public void playAudio4(View view) {
        Intent objIntent = new Intent(this, PlayAudio4.class);
        startService(objIntent);
    }

    public void killAudio4() {
        stopService(new Intent(this, PlayAudio4.class));
    }

    public void playAudio5(View view) {
        Intent objIntent = new Intent(this, PlayAudio5.class);
        startService(objIntent);
    }

    public void killAudio5() {
        stopService(new Intent(this, PlayAudio5.class));
    }

    public void playAudio6(View view) {
        Intent objIntent = new Intent(this, PlayAudio6.class);
        startService(objIntent);
    }

    public void killAudio6() {
        stopService(new Intent(this, PlayAudio6.class));
    }

    //Exit on Back press prompt
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.exit);
        builder.setMessage(R.string.sure);

        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                if (plays1) {
                    killAudio1();
                }
                if (plays2) {
                    killAudio2();
                }
                if (plays3) {
                    killAudio3();
                }
                if (plays4) {
                    killAudio4();
                }
                if (plays5) {
                    killAudio5();
                }
                if (plays6) {
                    killAudio6();
                }

                MainActivity.super.onBackPressed();
                finish();
            }

        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

}
