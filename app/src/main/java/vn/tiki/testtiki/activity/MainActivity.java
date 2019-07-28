package vn.tiki.testtiki.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vn.tiki.testtiki.R;
import vn.tiki.testtiki.adapter.HotKeyWordAdapter;
import vn.tiki.testtiki.model.HotKeyWord;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rclKeyWord;
    private HotKeyWordAdapter hotKeyWordAdapter;
    private List<HotKeyWord> dataSource=new ArrayList<>();
    private List<String> names=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();

        //init recycler view
        hotKeyWordAdapter=new HotKeyWordAdapter(this);
        rclKeyWord.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rclKeyWord.setAdapter(hotKeyWordAdapter);

        createSourceTest();
        hotKeyWordAdapter.setDataSource(dataSource);

    }

    private void mapping()
    {
        rclKeyWord=findViewById(R.id.rclKeyWord);
    }

    private void createSourceTest()
    {
        names.add("xiaomi");
        names.add("bitis hunter");
        names.add("bts");
        names.add("balo");
        names.add("bitis hunter x");
        names.add("tai nghe");
        names.add("harry potter");
        names.add("anker");
        names.add("iphone");
        names.add("balo nữ");
        names.add("nguyễn nhật ánh");
        names.add("đắc nhân tâm");
        names.add("ipad");
        names.add("senka");
        names.add("tai nghe bluetooth");
        names.add("son");
        names.add("maybelline");
        names.add("laneige");
        names.add("kem chống nắng");
        names.add("anh chính là thanh xuân của em");
        for (int i=0;i<names.size();i++)
        {
            HotKeyWord hotKeyWord=new HotKeyWord();
            hotKeyWord.setName(names.get(i));
            hotKeyWord.setType(i);
            dataSource.add(hotKeyWord);
        }

    }
}
