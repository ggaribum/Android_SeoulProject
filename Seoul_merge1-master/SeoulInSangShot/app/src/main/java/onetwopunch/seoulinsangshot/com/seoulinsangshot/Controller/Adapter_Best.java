package onetwopunch.seoulinsangshot.com.seoulinsangshot.Controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import onetwopunch.seoulinsangshot.com.seoulinsangshot.Model.Model_Best;
import onetwopunch.seoulinsangshot.com.seoulinsangshot.R;

/**
 * Created by Beom2 on 2017-10-06.
 */

public class Adapter_Best extends RecyclerView.Adapter<Adapter_Best.ViewHolder> {

    //레트로핏 변수
    List<Model_Best> tempArr;
    Context adapterContext;

    public Adapter_Best(Context context, List<Model_Best> tempArr) {
        this.adapterContext = context;
        this.tempArr = tempArr;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_best, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       holder.bestID.setText("@ "+tempArr.get(position).getId());

        Picasso
                .with(adapterContext)
                .load(tempArr.get(position).getUrl())
                .into(holder.bestImage);
    }

    @Override
    public int getItemCount() {
        return tempArr.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView bestID;
        public TextView bestHits;
        public TextView bestLike;
        public ImageView bestImage;


        public ViewHolder(View itemView){
            super(itemView);

            bestID=(TextView)itemView.findViewById(R.id.bestID_TextView);
            bestHits=(TextView)itemView.findViewById(R.id.bestHITS_TextView);
            bestLike=(TextView)itemView.findViewById(R.id.bestLIKE_TextView);
            bestImage=(ImageView)itemView.findViewById(R.id.bestImageView);

        }

    }
}
