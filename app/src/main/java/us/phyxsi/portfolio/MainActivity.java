package us.phyxsi.portfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void buttonStreamerClick(View view) {
        displayToast("This button will launch my spotify streamer app!");
    }

    public void buttonScoreAppClick(View view) {
        displayToast("This button will launch my scores app!");
    }

    public void buttonLibraryAppClick(View view) {
        displayToast("This button will launch my library app!");
    }

    public void buttonBuildItClick(View view) {
        displayToast("This button will launch my build it bigger app!");
    }

    public void buttonXyzReaderClick(View view) {
        displayToast("This button will launch my xyz reader app!");
    }

    public void buttonCapstoneClick(View view) {
        displayToast("This button will launch my capstone app!");
    }

    public void displayToast(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
