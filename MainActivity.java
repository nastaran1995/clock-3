package n2.n.clk;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface d_n =Typeface.createFromAsset(getAssets(),"Fonts/digital7.otf");

        TextView txt1 =(TextView)findViewById(R.id.txt1);
        TextView txt2 =(TextView)findViewById(R.id.txt2);
        TextView txt3 =(TextView)findViewById(R.id.txt3);
        TextView txt4 =(TextView)findViewById(R.id.txt4);
        txt1.setTypeface(d_n);
        txt2.setTypeface(d_n);
        txt3.setTypeface(d_n);
        txt4.setTypeface(d_n);
        Button c_btn= (Button)findViewById(R.id.btn);
        c_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MediaPlayer Pakhsh_bib = MediaPlayer.create(MainActivity.this , R.raw.bib);
                Pakhsh_bib.start();


            }
        });
    }
}
