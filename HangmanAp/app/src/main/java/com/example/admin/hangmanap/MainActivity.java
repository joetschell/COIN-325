package com.example.admin.hangmanap;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    public int mCorrect = 0;
    public int mWrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Title = (TextView) findViewById(R.id.Title);

        ImageView Noose = (ImageView) findViewById(R.id.Noose);

        Button newGame = (Button) findViewById(R.id.newGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_game);
            }
        });

        Button Close = (Button) findViewById(R.id.Close);
        Close.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                finish();
            }
        });

        ImageView Gallows = (ImageView) findViewById(R.id.Gallows);
        final TextView aLetter = (TextView) findViewById(R.id.aLetter);

        final Button aButton = (Button) findViewById(R.id.aButton);
        aButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aButton.setEnabled(false);
                aLetter.setVisibility(View.VISIBLE);
                mCorrect++;
                if (mCorrect == 5) {
                    disableButtons();
                    findViewById(R.id.mWon).setVisibility(View.VISIBLE);
                }

            }
        });

        final TextView pLetter = (TextView) findViewById(R.id.pLetter);
        final TextView p2Letter = (TextView) findViewById(R.id.p2Letter);
        final Button pButton = (Button) findViewById(R.id.pButton);
        final ImageView gallows = (ImageView) findViewById(R.id.Gallows);
        pButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pButton.setEnabled(false);
                pLetter.setVisibility(View.VISIBLE);
                p2Letter.setVisibility(View.VISIBLE);
                mCorrect++;
                if (mCorrect == 5) {
                    disableButtons();
                    findViewById(R.id.mWon).setVisibility(View.VISIBLE);
                }

            }
        });

        final TextView lLetter = (TextView) findViewById(R.id.lLetter);
        final Button lButton = (Button) findViewById(R.id.lButton);
        pButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                lButton.setEnabled(false);
                lLetter.setVisibility(View.VISIBLE);
                mCorrect++;
                if (mCorrect == 5) {
                    disableButtons();
                    findViewById(R.id.mWon).setVisibility(View.VISIBLE);
                }

            }
        });

        final TextView eLetter = (TextView) findViewById(R.id.eLetter);
        final Button eButton = (Button) findViewById(R.id.eButton);
        pButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                eButton.setEnabled(false);
                eLetter.setVisibility(View.VISIBLE);
                mCorrect++;
                if (mCorrect == 5) {
                    disableButtons();
                    findViewById(R.id.mWon).setVisibility(View.VISIBLE);
                }

            }
        });

        final Button bButton = (Button) findViewById(R.id.bButton);
        final Button cButton = (Button) findViewById(R.id.cButton);
        final Button dButton = (Button) findViewById(R.id.dButton);
        final Button fButton = (Button) findViewById(R.id.fButton);
        final Button gButton = (Button) findViewById(R.id.gButton);
        final Button hButton = (Button) findViewById(R.id.hButton);
        final Button iButton = (Button) findViewById(R.id.iButton);
        final Button jButton = (Button) findViewById(R.id.jButton);
        final Button kButton = (Button) findViewById(R.id.kButton);
        final Button mButton = (Button) findViewById(R.id.mButton);
        final Button nButton = (Button) findViewById(R.id.nButton);
        final Button oButton = (Button) findViewById(R.id.oButton);
        final Button qButton = (Button) findViewById(R.id.qButton);
        final Button rButton = (Button) findViewById(R.id.rButton);
        final Button sButton = (Button) findViewById(R.id.sButton);
        final Button tButton = (Button) findViewById(R.id.tButton);
        final Button uButton = (Button) findViewById(R.id.uButton);
        final Button vButton = (Button) findViewById(R.id.vButton);
        final Button wButton = (Button) findViewById(R.id.wButton);
        final Button xButton = (Button) findViewById(R.id.xButton);
        final Button yButton = (Button) findViewById(R.id.yButton);
        final Button zButton = (Button) findViewById(R.id.zButton);

        bButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               anyOtherButtonClick(bButton);
            }
        });
        cButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(cButton);
            }
        });
        dButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(dButton);
            }
        });
        fButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(fButton);
            }
        });
        gButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(gButton);
            }
        });
        hButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(hButton);
            }
        });
        iButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(iButton);
            }
        });
        jButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(jButton);
            }
        });
        kButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(kButton);
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(mButton);
            }
        });
        nButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(nButton);
            }
        });
        oButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(oButton);
            }
        });
        qButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(qButton);
            }
        });
        rButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(rButton);
            }
        });
        sButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(sButton);
            }
        });
        tButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(tButton);
            }
        });
        uButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(uButton);
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(vButton);
            }
        });
        wButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(wButton);
            }
        });
        xButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(xButton);
            }
        });
        yButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(yButton);
            }
        });
        zButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                anyOtherButtonClick(zButton);
            }
        });



    }



    public void anyOtherButtonClick(Button button){
        button.setEnabled(false);
        Drawable gallows_head = getResources().getDrawable(R.drawable.gallows_head);
        ImageView gallows_headImage = (ImageView)findViewById(R.id.image);
        gallows_headImage.setImageDrawable(gallows_head);

        Drawable gallows_head_body = getResources().getDrawable(R.drawable.gallows_head_body);
        ImageView gallows_head_bodyImage = (ImageView)findViewById(R.id.image);
        gallows_head_bodyImage.setImageDrawable(gallows_head_body);

        Drawable gallows_head_body_1arm = getResources().getDrawable(R.drawable.gallows_head_body_1arm);
        ImageView gallows_head_body_1armImage = (ImageView)findViewById(R.id.image);
        gallows_head_body_1armImage.setImageDrawable(gallows_head_body_1arm);

        Drawable gallows_head_body_2arm = getResources().getDrawable(R.drawable.gallows_head_body_2arm);
        ImageView gallows_head_body_2armImage = (ImageView)findViewById(R.id.image);
        gallows_head_body_2armImage.setImageDrawable(gallows_head_body_2arm);

        Drawable gallows_head_body_2arm_1leg = getResources().getDrawable(R.drawable.gallows_head_body_2arm_1leg);
        ImageView gallows_head_body_2arm_1legImage = (ImageView)findViewById(R.id.image);
        gallows_head_body_2arm_1legImage.setImageDrawable(gallows_head_body_2arm_1leg);

        Drawable gallows_head_body_2arm_2leg = getResources().getDrawable(R.drawable.gallows_head_body_2arm_2leg);
        ImageView gallows_head_body_2arm_2legImage = (ImageView)findViewById(R.id.image);
        gallows_head_body_2arm_2legImage.setImageDrawable(gallows_head_body);


        switch(mWrong){
            case 0:
                findViewById(R.id.Gallows).setEnabled(false);
                gallows_headImage.setEnabled(true);
                break;
            case 1:
                gallows_headImage.setEnabled(false);
                gallows_head_bodyImage.setEnabled(true);
                break;
            case 2:
                gallows_head_bodyImage.setEnabled(false);
                gallows_head_body_1armImage.setEnabled(true);
                break;
            case 3:
                gallows_head_body_1armImage.setEnabled(false);
                gallows_head_body_2armImage.setEnabled(true);
                break;
            case 4:
                gallows_head_body_2armImage.setEnabled(false);
                gallows_head_body_2arm_1legImage.setEnabled(true);
                break;
            case 5:
                gallows_head_body_2arm_1legImage.setEnabled(false);
                gallows_head_body_2arm_2legImage.setEnabled(true);
                findViewById(R.id.mLost).setVisibility(View.VISIBLE);
                disableButtons();
                break;


        }

        mWrong++;
        button.setEnabled(false);
    }





    public void disableButtons(){
        findViewById(R.id.aButton).setEnabled(false);
        findViewById(R.id.bButton).setEnabled(false);
        findViewById(R.id.cButton).setEnabled(false);
        findViewById(R.id.dButton).setEnabled(false);
        findViewById(R.id.eButton).setEnabled(false);
        findViewById(R.id.fButton).setEnabled(false);
        findViewById(R.id.gButton).setEnabled(false);
        findViewById(R.id.hButton).setEnabled(false);
        findViewById(R.id.iButton).setEnabled(false);
        findViewById(R.id.jButton).setEnabled(false);
        findViewById(R.id.kButton).setEnabled(false);
        findViewById(R.id.lButton).setEnabled(false);
        findViewById(R.id.mButton).setEnabled(false);
        findViewById(R.id.oButton).setEnabled(false);
        findViewById(R.id.pButton).setEnabled(false);
        findViewById(R.id.qButton).setEnabled(false);
        findViewById(R.id.rButton).setEnabled(false);
        findViewById(R.id.sButton).setEnabled(false);
        findViewById(R.id.tButton).setEnabled(false);
        findViewById(R.id.uButton).setEnabled(false);
        findViewById(R.id.vButton).setEnabled(false);
        findViewById(R.id.wButton).setEnabled(false);
        findViewById(R.id.xButton).setEnabled(false);
        findViewById(R.id.yButton).setEnabled(false);
        findViewById(R.id.zButton).setEnabled(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
