package karsa.forexhandbook;


import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EssentialFactorsFragment extends ListFragment {


    private int chapterId;

    public EssentialFactorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Resources resCh = getResources();
        Context context = getActivity().getApplicationContext();

        TypedArray array_labels = null ;
        TypedArray array_icons = null;

        try {
            Class<R.array> res = R.array.class;
            Field field_l;
            Field field_i;
            field_l = res.getField("icons_" + "1");
            field_i = res.getField("chapter_" + "1");
            array_labels  = context.getResources().obtainTypedArray(field_l.getInt(null));
            array_icons  = context.getResources().obtainTypedArray(field_i.getInt(null));
            String s = "dd";
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        String[] labels = resCh.getStringArray(R.array.chapter_1);
        int[] icons = resCh.getIntArray(R.array.icons_1);

        //setListAdapter(new ListItemAdapter(getActivity(),labels,icons));
        setListAdapter(new ListItemAdapter(getActivity(),array_labels,array_icons));
        // Inflate the layout for this fragment
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    public void setChapterId(int id)
    {
        this.chapterId = id;
    }
}
