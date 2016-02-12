package netiapps.com.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 11/2/2016.
 */
public class SecondActivity extends AppCompatActivity {
    private TextView mTextview;

    SingleTonClass stc = SingleTonClass.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_second);
        setSupportActionBar(toolbar);
        mTextview = (TextView) findViewById(R.id.textView);
        stc.setMethodList("Second Activity", "OnCreate");
        stc.getListData(mTextview);
    }
    @Override
    protected void onStart() {
        super.onStart();
        stc.setMethodList("Second Activity", "On start()\n");
        stc.getListData(mTextview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        stc.setMethodList("Second Activity", "OnResume()\n");
        stc.getListData(mTextview);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        stc.setMethodList("Second Activity", "OnRestart\n");
        stc.getListData(mTextview);
    }
    @Override
    protected void onPause() {
        super.onPause();;
        stc.setMethodList("Second Activity", "OnPause()\n");
        stc.getListData(mTextview);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stc.setMethodList("Second Activity", "OnStop() \n");
        stc.getListData(mTextview);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stc.setMethodList("Second Activity", "OnDestroy()\n");
        stc.getListData(mTextview);
    }

     public void ThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void FirstActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
