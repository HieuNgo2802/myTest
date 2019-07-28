package vn.tiki.testtiki.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vn.tiki.testtiki.R;
import vn.tiki.testtiki.model.HotKeyWord;

public class HotKeyWordAdapter extends RecyclerView.Adapter<HotKeyWordAdapter.ViewHolder> {
    private AppCompatActivity context;
    private List<HotKeyWord> dataSource;

    public HotKeyWordAdapter(AppCompatActivity context) {
        this.context = context;
        dataSource=new ArrayList<>();
    }

    public void setDataSource(List<HotKeyWord> dataSource) {
        this.dataSource = dataSource;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hot_key, parent, false);
        return new HotKeyWordAdapter.ViewHolder(view);      }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HotKeyWord hotKeyWord=dataSource.get(position);
        Drawable unWrappedDrawable= AppCompatResources.getDrawable(context,R.drawable.border_keyword_item);
        Drawable wrappredDrawable= DrawableCompat.wrap(unWrappedDrawable);
        DrawableCompat.setTint(wrappredDrawable,context.getResources().getColor(getColor(hotKeyWord.getType())));
        holder.lnKeyWord.setBackground(wrappredDrawable);
        holder.txtName.setText(hotKeyWord.getName());

    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        LinearLayout lnKeyWord;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtKeyWord);
            lnKeyWord=itemView.findViewById(R.id.lnKeyWord);
        }
    }

    private int getColor(int type)
    {
        switch (type)
        {
            case 0:
                return R.color.color1;
            case 1:
                return R.color.color2;
            case 2:
                return R.color.color3;
            case 3:
                return R.color.color4;
            case 4:
                return R.color.color5;
            case 5:
                return R.color.color6;
            case 6:
                return R.color.color7;
            case 7:
                return R.color.color8;
            case 8:
                return R.color.color9;
            case 9:
                return R.color.color10;
            case 10:
                return R.color.color11;
            case 11:
                return R.color.color12;
            case 12:
                return R.color.color13;
            case 13:
                return R.color.color14;
            case 14:
                return R.color.color15;
            case 15:
                return R.color.color16;
            case 16:
                return R.color.color17;
            case 17:
                return R.color.color18;
            case 18:
                return R.color.color19;
            case 19:
                return R.color.color20;
              default:
                  return R.color.color1;
        }
    }
}
