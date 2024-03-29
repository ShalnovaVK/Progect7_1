package com.example.progect7_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class Fragment2UI extends Fragment {

    public DataLauer dataLauer = new DataLauer();

    public Fragment2UI() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController = Navigation.findNavController(view);
        Button button = getActivity().findViewById(R.id.button2);
        TextView textView = getActivity().findViewById(R.id.textView2);
        String text = requireArguments().getString("MyArg");
        textView.setText(text);

        Bundle bundle =  new Bundle();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = "Хорошего дня!";
                bundle.putString("MyArg2", dataLauer.getDataFrom2to3());
                navController.navigate(R.id.fragment3, bundle);
            }
        });
    }
}