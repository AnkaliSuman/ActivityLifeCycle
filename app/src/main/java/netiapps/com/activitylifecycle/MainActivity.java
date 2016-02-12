package netiapps.com.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextview;

    SingleTonClass stc = SingleTonClass.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mTextview = (TextView) findViewById(R.id.textView);
        stc.setMethodList("Main Activity", "OnCreate");
        stc.getListData(mTextview);
    }

    @Override
    protected void onStart() {
        super.onStart();
        stc.setMethodList("Main Activity", "On start()\n");
        stc.getListData(mTextview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        stc.setMethodList("Main Activity", "OnResume()\n");
        stc.getListData(mTextview);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        stc.setMethodList("Main Activity", "OnRestart\n");
        stc.getListData(mTextview);
    }
    @Override
    protected void onPause() {
        super.onPause();;
        stc.setMethodList("Main Activity", "OnPause()\n");
        stc.getListData(mTextview);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stc.setMethodList("Main Activity", "OnStop() \n");
        stc.getListData(mTextview);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stc.setMethodList("Main Activity", "OnDestroy()\n");
        stc.getListData(mTextview);
    }

    public void SecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void ThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}
