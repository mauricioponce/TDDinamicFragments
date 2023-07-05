package com.example.dinamicfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dinamicfragments.databinding.FragmentSecondBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_PARAM1 = "param1";
    public static final String ARG_PARAM2 = "param2";

    public static final String ARG_PARAM3 = "p3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private int mParam3;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getInt(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        FragmentSecondBinding binding = FragmentSecondBinding.inflate(getLayoutInflater());
        binding.tvToThird.setOnClickListener(v -> {
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_secondFragment_to_thirdFragment);
        });


        binding.tvResult.setText(mParam1 + " - " + mParam2 + " - " + mParam3);

        return binding.getRoot();
    }
}