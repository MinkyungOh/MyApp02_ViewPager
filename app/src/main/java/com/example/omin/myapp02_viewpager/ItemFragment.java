package com.example.omin.myapp02_viewpager;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ItemFragment extends Fragment {

    public static ItemFragment newInstance(int i) {

        Bundle args = new Bundle();
        args.putInt("position", i);

        ItemFragment fragment = new ItemFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_imageview);
        imageView.setImageResource(getArguments().getInt("position"));

        return view;
    }
}
