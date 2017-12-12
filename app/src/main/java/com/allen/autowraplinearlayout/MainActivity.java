package com.allen.autowraplinearlayout;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.allen.autowraplinearlayout.view.AutoWrapLinearLayout;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private AutoWrapLinearLayout mAutoWrapLinearLayout;
    private AutoWrapLinearLayout mAutoWrapFullLinearLayout;
    private String[] str = {"我在红帐里", "照我到何年", "红昭愿", "千万愁", "烟火可垂怜 便将千万愁 便将", "灯火如昔年", "昔年"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDate();
        initListener();


    }

    private void initListener() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.radio_btn_left:
                        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.LEFT);
                        break;
                    case R.id.radio_btn_center:
                        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.CENTER);
                        break;
                    case R.id.radio_btn_right:
                        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.RIGHT);
                        break;
                    default:
                        mAutoWrapLinearLayout.setGravity(AutoWrapLinearLayout.Gravity.LEFT);
                        break;
                }
            }
        });
    }

    private void initDate() {
        mAutoWrapLinearLayout.setHorizontalSpace(20);
        mAutoWrapLinearLayout.setVerticalSpace(10);
        mAutoWrapLinearLayout.isFull(false);
        mAutoWrapFullLinearLayout.setHorizontalSpace(2);
        mAutoWrapFullLinearLayout.setVerticalSpace(2);
        mAutoWrapFullLinearLayout.isFull(true);
        mRadioGroup.check(R.id.radio_btn_left);
        for (int i = 0; i < str.length; i++) {
            final TextView textView1 = new TextView(this);
            textView1.setGravity(Gravity.CENTER);
            textView1.setBackgroundDrawable(getResources().getDrawable(R.drawable.txt_bg));
            textView1.setText(str[i]);
            textView1.setTextSize(12);
            mAutoWrapLinearLayout.addView(textView1);
            final TextView textView2 = new TextView(this);
            textView2.setGravity(Gravity.CENTER);
            textView2.setBackgroundDrawable(getResources().getDrawable(R.drawable.txt_bg_rect));
            textView2.setText(str[i]);
            textView2.setTextSize(15);
            textView2.setTextColor(Color.WHITE);
            mAutoWrapFullLinearLayout.addView(textView2);
        }
    }

    private void initView() {
        mAutoWrapLinearLayout = (AutoWrapLinearLayout) findViewById(R.id.auto_linear);
        mAutoWrapFullLinearLayout = (AutoWrapLinearLayout) findViewById(R.id.auto_linear_full);
        mRadioGroup = (RadioGroup) findViewById(R.id.radio_group);
    }
}
