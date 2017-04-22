package com.myapplication.multitype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.myapplication.R;
import com.myapplication.multitype.binder.BannerViewBinder;
import com.myapplication.multitype.binder.CategoryViewBinder;
import com.myapplication.multitype.binder.DescViewBinder;
import com.myapplication.multitype.binder.DetailViewBinder;
import com.myapplication.multitype.binder.FooterViewBinder;
import com.myapplication.multitype.binder.ItemsViewBinder;
import com.myapplication.multitype.binder.LineViewBinder;
import com.myapplication.multitype.entity.Common;
import com.myapplication.multitype.entity.Detail;
import com.myapplication.multitype.entity.Line;
import com.myapplication.multitype.binder.RecommendViewBinder;
import com.myapplication.multitype.binder.TicketViewBinder;
import com.myapplication.multitype.entity.Banner;
import com.myapplication.multitype.entity.Category;
import com.myapplication.multitype.entity.Desc;
import com.myapplication.multitype.entity.Item;
import com.myapplication.multitype.entity.Response;
import com.myapplication.multitype.entity.Ticket;
import com.myapplication.multitype.entity.Recommend;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class MultiTypeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MultiTypeAdapter multiTypeAdapter;
    private Response response;
    private Items items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_type);
        recyclerView  = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        multiTypeAdapter = new MultiTypeAdapter();
        multiTypeAdapter.register(Line.class,new LineViewBinder());
        multiTypeAdapter.register(Banner.class,new BannerViewBinder());
        multiTypeAdapter.register(Category.class,new CategoryViewBinder());
        multiTypeAdapter.register(Desc.class,new DescViewBinder());
        multiTypeAdapter.register(Item.class,new ItemsViewBinder());
        multiTypeAdapter.register(Detail.class,new DetailViewBinder());
        multiTypeAdapter.register(Recommend.class,new RecommendViewBinder());
        multiTypeAdapter.register(Ticket.class,new TicketViewBinder());
        multiTypeAdapter.register(Common.class,new FooterViewBinder());
        onDataCreated();
        items = new Items();
        onItemsCreated(items);
        multiTypeAdapter.setItems(items);

        recyclerView.setAdapter(multiTypeAdapter);

    }

    private void onDataCreated() {
        Banner banner = new Banner(R.mipmap.banner);
        Desc desc = new Desc("濮存昕，郭达-主演人艺周年纪念演出《白鹿原》","￥40-680");
        List<Item> items = new ArrayList<>();
        Item item1 = new Item(R.mipmap.date,"04月28日-05月01日 19:30-21:30","");
        Item item2 = new Item(R.mipmap.address,"首都剧场","北京东城区王府井大街22号");
        items.add(item1);
        items.add(item2);
        List<Ticket> tickets = new ArrayList<>();
        Ticket ticket1 = new Ticket("680","￥680");
        Ticket ticket2 = new Ticket("580","￥580");
        Ticket ticket3 = new Ticket("480","￥480");
        Ticket ticket4 = new Ticket("380","￥380");
        Ticket ticket5 = new Ticket("280","￥280");
        Ticket ticket6 = new Ticket("180","￥180");
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        List<Recommend> recommends = new ArrayList<>();
        Recommend recommen1 = new Recommend(R.mipmap.re1,"话剧《玩命唉一个姑娘》第十二轮","隆福剧场","05月27日开始","￥99起");
        Recommend recommen2 = new Recommend(R.mipmap.re2,"精编儿童创意舞台剧","隆福剧场","05月27日开始","￥199起");
        Recommend recommen3 = new Recommend(R.mipmap.re3,"不！是你的咖啡--咖啡制作体验","1897咖啡厅","进行中","￥299起");
        Recommend recommen4 = new Recommend(R.mipmap.re4,"与“蓝胖子”一起私奔童年，陶艺体验","王府井甘雨胡同","进行中，8天后结束","￥399起");
        Recommend recommen5 = new Recommend(R.mipmap.re5,"冰上的尤里专场","王府井次元之都","05月20日开始","￥499起");
        recommends.add(recommen1);
        recommends.add(recommen2);
        recommends.add(recommen3);
        recommends.add(recommen4);
        recommends.add(recommen5);
        List<Detail> details = new ArrayList<>();
        Detail detail1 = new Detail(R.mipmap.d1,"人艺出品，必是精品","啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊");
        Detail detail2 = new Detail(R.mipmap.d2,"","啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊");
        Detail detail3 = new Detail(R.mipmap.d3,"","啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊啊阿啊啊啊啊啊啊啊");
        details.add(detail1);
        details.add(detail2);
        details.add(detail3);
        response = new Response(banner,desc,items,details,tickets,recommends);
    }

    private void onItemsCreated(Items items) {
        items.add(response.banner);
        items.add(response.desc);
        items.add(new Line());
        for (int i=0;i<response.items.size();i++){
            items.add( response.items.get(i));
        }

        items.add(new Line());

        items.add(new Category("活动详情"));

        for (int i=0;i<response.details.size();i++){
            items.add(response.details.get(i));
        }

        items.add(new Line());

        items.add(new Category("票种明细"));
        for (int i=0;i<response.tickets.size();i++){
            items.add(response.tickets.get(i));
        }
        items.add(new Line());
        items.add(new Category("这个活动附近还有"));
        for (int i=0;i<response.recommends.size();i++){
            items.add(response.recommends.get(i));
        }
        items.add(new Common());
    }
}
