package com.example.nonton.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nonton.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class BaruFragment extends Fragment {
    public BaruFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_baru, container, false);
        ListView listview = rootView.findViewById(R.id.list);

        final String[] items = new String[]
                {"4 Kings (2021)","Revenge Girl (2022)","Operation Mincemeat (2022)","Kedibone (2020)","YA armahtaa (2020)"," Introduction (2021)"," APT 17 (2019)",
                        "There Are No Saints (2022)","The Contractor (2022)","Fortress: Sniper’s Eye (2022)","Homeward (Evge) (2019)","Box Fort (2020)",

                };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getActivity().getApplicationContext(), items[i], Toast.LENGTH_SHORT).show());
        return rootView;
    }
}