package netiapps.com.activitylifecycle;

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
public class ThirdActivity extends AppCompatActivity {
    private TextView mTextview;
    SingleTonClass stc = SingleTonClass.getInstance();
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        toolbar = (Toolbar) findViewById(R.id.toolbar_third);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Third Activity");
        mTextview = (TextView) findViewById(R.id.textView);
        stc.setMethodList("Third Activity", "OnCreate");
        stc.getListData(mTextview);
    }
    @Override
    protected void onStart() {
        super.onStart();
        stc.setMethodList("Third Activity", "On start()\n");
        stc.getListData(mTextview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        stc.setMethodList("Third Activity", "OnResume()\n");
        stc.getListData(mTextview);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        stc.setMethodList("Third Activity", "OnRestart\n");
        stc.getListData(mTextview);
    }
    @Override
    protected void onPause() {
        super.onPause();;
        stc.setMethodList("Third Activity", "OnPause()\n");
        stc.getListData(mTextview);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stc.setMethodList("Third Activity", "OnStop() \n");
        stc.getListData(mTextview);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stc.setMethodList("Third Activity", "OnDestroy()\n");
        stc.getListData(mTextview);
    }

    public void SecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void FirstActivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
