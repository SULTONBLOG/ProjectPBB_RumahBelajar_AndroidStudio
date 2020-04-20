package com.example.bismillah.ui.pesan;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.bismillah.R;

public class PesanFragment extends Fragment {

    private PesanViewModel PesanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PesanViewModel =
                ViewModelProviders.of(this).get(PesanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pesan, container, false);
        final TextView textView = root.findViewById(R.id.text_pesan);
        PesanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}