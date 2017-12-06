package test.gaodenews.example.com.refreshlayoutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private List<String> mDatas=new ArrayList<>();
    private RecycleView_Adapter recycleView_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView= (RecyclerView) findViewById(R.id.recyclerview);

        //初始化适配器存入数据
        recycleView_adapter=new RecycleView_Adapter(mDatas);
        //加载适配器
        mRecycleView.setAdapter(recycleView_adapter);
        //添加布局管理器===否则显示不出来数据=====总的
        //一行显示一个
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        //一行显示两个或3个或多个
        //mRecycleView.setLayoutManager(new GridLayoutManager(this,4));
        //自己设置
        //mRecycleView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        //添加LinearLayoutManager分割线的方法
        mRecycleView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        //添加GridLayoutManager分割线的方法
        // mRecycleView.addItemDecoration(new DividerGridItemDecoration(getApplication()));
        OnDatas();
    }

    private void OnDatas() {
        mDatas.add("刘德华1");
        mDatas.add("刘德华2");
        mDatas.add("刘德华3");
        mDatas.add("刘德华4");
        mDatas.add("刘德华5");
        mDatas.add("刘德华6");
        mDatas.add("刘德华7");
        mDatas.add("刘德华8");
        mDatas.add("刘德华9");
        mDatas.add("刘德华10");
        mDatas.add("刘德华11");
        mDatas.add("刘德华12");
        mDatas.add("刘德华13");
        mDatas.add("刘德华14");
        mDatas.add("刘德华15");


    }

}