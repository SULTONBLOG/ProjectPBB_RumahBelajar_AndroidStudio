package com.example.bismillah.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.bismillah.Angkasa;
import com.example.bismillah.BahasaSastra;
import com.example.bismillah.BankSoal;
import com.example.bismillah.BukuSekolah;
import com.example.bismillah.KaryaGuru;
import com.example.bismillah.KaryaKomunitas;
import com.example.bismillah.KelasDigital;
import com.example.bismillah.Keprofesian;
import com.example.bismillah.LabMaya;
import com.example.bismillah.PetaBudaya;
import com.example.bismillah.R;
import com.example.bismillah.SumberBelajar;

public class HomeFragment extends Fragment {
    ImageButton sumber_belajar,lab_maya,bank_soal,kelas_digital,
                buku_sekolah,keprofesian,peta_budaya,angkasa,
                karya_guru,komunitas,bahasa_sastra;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        sumber_belajar = v.findViewById(R.id.button_belajar);
        lab_maya = v.findViewById(R.id.button_lab);
        bank_soal = v.findViewById(R.id.button_soal);
        kelas_digital = v.findViewById(R.id.button_digital);
        buku_sekolah = v.findViewById(R.id.button_buku);
        keprofesian = v.findViewById(R.id.button_keprofesian);
        peta_budaya = v.findViewById(R.id.button_budaya);
        angkasa  = v.findViewById(R.id.button_angkasa);
        karya_guru = v.findViewById(R.id.button_guru);
        komunitas = v.findViewById(R.id.button_komunitas);
        bahasa_sastra = v.findViewById(R.id.button_bahasa_sastra);


        sumber_belajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SumberBelajar.class);
                startActivity(intent);
            }
        });
        lab_maya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LabMaya.class);
                startActivity(intent);
            }
        });
        bank_soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BankSoal.class);
                startActivity(intent);
            }
        });
        kelas_digital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KelasDigital.class);
                startActivity(intent);
            }
        });
        buku_sekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BukuSekolah.class);
                startActivity(intent);
            }
        });
        keprofesian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Keprofesian.class);
                startActivity(intent);
            }
        });
        peta_budaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PetaBudaya.class);
                startActivity(intent);
            }
        });
        angkasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Angkasa.class);
                startActivity(intent);
            }
        });
        karya_guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KaryaGuru.class);
                startActivity(intent);
            }
        });
        komunitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KaryaKomunitas.class);
                startActivity(intent);
            }
        });
        bahasa_sastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BahasaSastra.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
