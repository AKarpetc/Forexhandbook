package karsa.forexhandbook;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sassa_000 on 19.06.2016.
 */
public class ListItemAdapter extends BaseAdapter {

    String[] result;
    Context context;
    int[] imageId;
    private static LayoutInflater inflater=null;

    public ListItemAdapter(FragmentActivity mainActivity, String[] menuItemList, int[] itemsImages)
    {
        result = menuItemList;
        context = mainActivity;
        imageId = itemsImages;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.fx_item_list,null);
        holder.tv = (TextView)rowView.findViewById(R.id.itemText);
        holder.img = (ImageView)rowView.findViewById(R.id.itemView);
        TypedArray imgs = context.getResources().obtainTypedArray(R.array.icons);
        //Drawable drawable =  context.getResources().getDrawable(imageId[position]);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imgs.getResourceId(position,-1));
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgs.recycle();
        return rowView;
    }
}
