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

public class PopulerFragment extends Fragment {
    public PopulerFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_populer, container, false);
        ListView listview = rootView.findViewById(R.id.list2);

        final String[] items = new String[]
                {"The Batman (2022)","Uncharted (2022)","Fantastic Beasts : The Secrets of Dumbledore (2022)","Doctor Strange in the Multiverse of Madness (2022)",
                        "Sonic the Hedgehog 2 (2022)","Moonfall (2022)","Turning Red (2022)","Blacklight (2022)","The Lost City (2022)","Ambulance (2022)","The Last Duel (2021)",
                        "The Contractor (2022)"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getActivity().getApplicationContext(), items[i], Toast.LENGTH_SHORT).show());
        return rootView;
    }
}