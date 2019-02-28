package com.app.playandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        ArrayList<String> list=new ArrayList<>();
        list.add("哈哈哈");
        list.add("我同桌是王立国");
        list.add("哈哈哈");
        list.add("我同桌是王立国");
        list.add("哈哈哈");
        list.add("我同桌是王立国");
    }
}
