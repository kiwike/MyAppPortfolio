package hu.kiwike.myappportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends Activity implements View.OnClickListener {

    @InjectView(R.id.button) Button button1;
    @InjectView(R.id.button2) Button button2;
    @InjectView(R.id.button3) Button button3;
    @InjectView(R.id.button4) Button button4;
    @InjectView(R.id.button5) Button button5;
    @InjectView(R.id.button6) Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String app;
        switch (view.getId()) {
            case R.id.button:
                app = getString(R.string.spotify_streamer);
                break;
            case R.id.button2:
                app = getString(R.string.scores);
                break;
            case R.id.button3:
                app = getString(R.string.library);
                break;
            case R.id.button4:
                app = getString(R.string.build_it_bigger);
                break;
            case R.id.button5:
                app = getString(R.string.xyz_reader);
                break;
            case R.id.button6:
                app = getString(R.string.capstone_app);
                break;
            default:
                app = "";
        }
        Toast.makeText(getApplicationContext(), "This button will launch my " + app + " app!", Toast.LENGTH_LONG).show();
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
