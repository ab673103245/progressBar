package qianfeng.a2_2progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_1;
    private Button mBtn_2;
    private Button mBtn_3;
    private ProgressBar mPb_1;
    private ProgressBar mPb_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn_1 = ((Button) findViewById(R.id.btn_1));
        mBtn_2 = ((Button) findViewById(R.id.btn_2));
        mBtn_3 = ((Button) findViewById(R.id.btn_3));

        mPb_1 = ((ProgressBar) findViewById(R.id.pb_1));
        mPb_2 = ((ProgressBar) findViewById(R.id.pb_2));

    }

    public void onClick_visible(View view) {  // 显示或隐藏
        if(mPb_1.getVisibility()==View.GONE)
        {
            mPb_1.setVisibility(View.VISIBLE);
        }else
        {
            mPb_1.setVisibility(View.GONE);
        }
    }

    public void onClick_add(View view) {  // 增加进度条
        int progress = mPb_2.getProgress();
        progress += 5;
        int secondaryProgress = mPb_2.getSecondaryProgress();
        secondaryProgress+=3;
        mPb_2.setMax(100);
        mPb_2.setProgress(progress);
        mPb_2.setSecondaryProgress(secondaryProgress);
    }

    public void onClick_reduce(View view) {  // 减少进度条
        int progress = mPb_2.getProgress();
        progress -= 5;
        int secondaryProgress = mPb_2.getSecondaryProgress();
        secondaryProgress -= 3;
        mPb_2.setMax(100);
        mPb_2.setProgress(progress);
        mPb_2.setSecondaryProgress(secondaryProgress);
    }


}
