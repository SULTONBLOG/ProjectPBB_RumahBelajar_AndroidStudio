package com.example.bismillah.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.bismillah.R;

public class NotificationsFragment extends Fragment {
    Button riwayat_konten, riwayat_aktifitas;
    TextView v_konten,v_aktifitas;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);
        riwayat_konten = v.findViewById(R.id.button_riwayat);
        riwayat_aktifitas = v.findViewById(R.id.button_riwayat1);
        v_konten = v.findViewById(R.id.textView_konten);
        v_aktifitas = v.findViewById(R.id.textView_konten);
        riwayat_konten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v_konten.setText("Riwayat Akses Konten Anda");
            }
        });
        riwayat_aktifitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v_aktifitas.setText("Riwayat Akifitas Anda");
            }
        });

        return v;
    }

}