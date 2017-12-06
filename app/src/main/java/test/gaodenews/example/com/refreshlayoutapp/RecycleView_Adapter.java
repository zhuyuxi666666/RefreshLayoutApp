package test.gaodenews.example.com.refreshlayoutapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2017/5/25.
 */

public class RecycleView_Adapter extends RecyclerView.Adapter<RecycleView_Adapter.ViewHolder> {
    private List<String> mDatas;
    private LayoutInflater layoutInflater;
    //构造方法
    public RecycleView_Adapter(List<String> mDatas) {
        this.mDatas = mDatas;
    }
    //关联子布局
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycleview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_item.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    //创建ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_item;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_item= (TextView) itemView.findViewById(R.id.mRecycleview_item);
        }
    }
}
