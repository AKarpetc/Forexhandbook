package karsa.forexhandbook;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class EssentialFactorsFragment extends ListFragment {


    public EssentialFactorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Resources res = getResources();
        String[] labels = res.getStringArray(R.array.labels);
        int[] icons = res.getIntArray(R.array.icons);

        setListAdapter(new ListItemAdapter(getActivity(),labels,icons));
        // Inflate the layout for this fragment
        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
