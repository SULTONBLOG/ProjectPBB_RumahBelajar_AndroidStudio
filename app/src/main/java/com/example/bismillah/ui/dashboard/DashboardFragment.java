package com.example.bismillah.ui.dashboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.bismillah.R;

public class DashboardFragment extends Fragment {
    Button konten1,konten2,konten3,konten4,konten5,konten6,konten7,konten8,konten9,konten10,konten11,
            login1,login2,login3,
            regis1,regis2,regis3,regis4,regis5,regis6,regis7,regis8,regis9,regis10,regis11,regis12,regis13,regis14,regis15,
            regis16,regis17,regis18,regis19,regis20,regis21,regis22,
            hubugi;
    TextView jawab_konten1,jawab_konten2,jawab_konten3,jawab_konten4,jawab_konten5,jawab_konten6,jawab_konten7,jawab_konten8,jawab_konten9,jawab_konten10,jawab_konten11,
            jawab_login1,jawab_login2,jawab_login3,
            jawab_regis1,jawab_regis2,jawab_regis3,jawab_regis4,jawab_regis5,
            jawab_regis6,jawab_regis7,jawab_regis8,jawab_regis9,jawab_regis10,
            jawab_regis11,jawab_regis12,jawab_regis13,jawab_regis14,jawab_regis15,
            jawab_regis16,jawab_regis17,jawab_regis18,jawab_regis19,jawab_regis20,
            jawab_regis21,jawab_regis22;


    public View onCreateView(@NonNull final LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        konten1 = v.findViewById(R.id.button_konten1);
        konten2 = v.findViewById(R.id.button_konten2);
        konten3 = v.findViewById(R.id.button_konten3);
        konten4 = v.findViewById(R.id.button_konten4);
        konten5 = v.findViewById(R.id.button_konten5);
        konten6 = v.findViewById(R.id.button_konten6);
        konten7 = v.findViewById(R.id.button_konten7);
        konten8 = v.findViewById(R.id.button_konten8);
        konten9 = v.findViewById(R.id.button_konten9);
        konten10 = v.findViewById(R.id.button_konten10);
        konten11 = v.findViewById(R.id.button_konten11);

        login1 = v.findViewById(R.id.button_login1);
        login2 = v.findViewById(R.id.button_login2);
        login3 = v.findViewById(R.id.button_login3);

        regis1 = v.findViewById(R.id.button_registrasi1);
        regis2 = v.findViewById(R.id.button_registrasi2);
        regis3 = v.findViewById(R.id.button_registrasi3);
        regis4 = v.findViewById(R.id.button_registrasi4);
        regis5 = v.findViewById(R.id.button_registrasi5);
        regis6 = v.findViewById(R.id.button_registrasi6);
        regis7 = v.findViewById(R.id.button_registrasi7);
        regis8 = v.findViewById(R.id.button_registrasi8);
        regis9 = v.findViewById(R.id.button_registrasi9);
        regis10 = v.findViewById(R.id.button_registrasi10);
        regis11 = v.findViewById(R.id.button_registrasi11);
        regis12 = v.findViewById(R.id.button_registrasi12);
        regis13 = v.findViewById(R.id.button_registrasi13);
        regis14 = v.findViewById(R.id.button_registrasi14);
        regis15 = v.findViewById(R.id.button_registrasi15);
        regis16 = v.findViewById(R.id.button_registrasi16);
        regis17 = v.findViewById(R.id.button_registrasi17);
        regis18 = v.findViewById(R.id.button_registrasi18);
        regis19 = v.findViewById(R.id.button_registrasi19);
        regis20 = v.findViewById(R.id.button_registrasi20);
        regis21 = v.findViewById(R.id.button_registrasi21);
        regis22 = v.findViewById(R.id.button_registrasi22);

        jawab_konten1 = v.findViewById(R.id.jawab_konten1);
        jawab_konten2 = v.findViewById(R.id.jawab_konten2);
        jawab_konten3 = v.findViewById(R.id.jawab_konten3);
        jawab_konten4 = v.findViewById(R.id.jawab_konten4);
        jawab_konten5 = v.findViewById(R.id.jawab_konten5);
        jawab_konten6 = v.findViewById(R.id.jawab_konten6);
        jawab_konten7 = v.findViewById(R.id.jawab_konten7);
        jawab_konten8 = v.findViewById(R.id.jawab_konten8);
        jawab_konten9 = v.findViewById(R.id.jawab_konten9);
        jawab_konten10 = v.findViewById(R.id.jawab_konten10);
        jawab_konten11 = v.findViewById(R.id.jawab_konten11);

        jawab_login1 = v.findViewById(R.id.jawab_login1);
        jawab_login2 = v.findViewById(R.id.jawab_login2);
        jawab_login3 = v.findViewById(R.id.jawab_login3);

        jawab_regis1 = v.findViewById(R.id.jawab_registrasi1);
        jawab_regis2 = v.findViewById(R.id.jawab_registrasi2);
        jawab_regis3 = v.findViewById(R.id.jawab_registrasi3);
        jawab_regis4 = v.findViewById(R.id.jawab_registrasi4);
        jawab_regis5 = v.findViewById(R.id.jawab_registrasi5);
        jawab_regis6 = v.findViewById(R.id.jawab_registrasi6);
        jawab_regis7 = v.findViewById(R.id.jawab_registrasi7);
        jawab_regis8 = v.findViewById(R.id.jawab_registrasi8);
        jawab_regis9 = v.findViewById(R.id.jawab_registrasi9);
        jawab_regis10 = v.findViewById(R.id.jawab_registrasi10);
        jawab_regis11 = v.findViewById(R.id.jawab_registrasi11);
        jawab_regis12 = v.findViewById(R.id.jawab_registrasi12);
        jawab_regis13 = v.findViewById(R.id.jawab_registrasi13);
        jawab_regis14 = v.findViewById(R.id.jawab_registrasi14);
        jawab_regis15 = v.findViewById(R.id.jawab_registrasi15);
        jawab_regis16 = v.findViewById(R.id.jawab_registrasi16);
        jawab_regis17 = v.findViewById(R.id.jawab_registrasi17);
        jawab_regis18 = v.findViewById(R.id.jawab_registrasi18);
        jawab_regis19 = v.findViewById(R.id.jawab_registrasi19);
        jawab_regis20 = v.findViewById(R.id.jawab_registrasi20);
        jawab_regis21 = v.findViewById(R.id.jawab_registrasi21);
        jawab_regis22 = v.findViewById(R.id.jawab_registrasi22);

        hubugi = v.findViewById(R.id.hubungi_kami);

        final boolean[] status = {true};


        konten1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_konten1);
                    jawab_konten1.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten1.setText("");
                    status[0] = true;
                }
            }
        });
        konten2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten2);
                    jawab_konten2.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten2.setText("");
                    status[0]=true;
                }
            }
        });
        konten3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten3);
                    jawab_konten3.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten3.setText("");
                    status[0]=true;
                }
            }
        });
        konten4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten4);
                    jawab_konten4.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten4.setText("");
                    status[0]=true;
                }
            }
        });
        konten5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten5);
                    jawab_konten5.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten5.setText("");
                    status[0]=true;
                }
            }
        });
        konten6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten6);
                    jawab_konten6.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten6.setText("");
                    status[0]=true;
                }
            }
        });
        konten7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten7);
                    jawab_konten7.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten7.setText("");
                    status[0]=true;
                }
            }
        });
        konten8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten8);
                    jawab_konten8.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten8.setText("");
                    status[0]=true;
                }
            }
        });
        konten9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten9);
                    jawab_konten9.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten9.setText("");
                    status[0]=true;
                }
            }
        });
        konten10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten10);
                    jawab_konten10.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten10.setText("");
                    status[0]=true;
                }
            }
        });
        konten11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0]== true){
                    String message = getString(R.string.jawab_konten11);
                    jawab_konten11.setText(message);
                    status[0] = false;
                }else {
                    jawab_konten11.setText("");
                    status[0]=true;
                }
            }
        });


        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_login1);
                    jawab_login1.setText(message);
                    status[0] = false;
                }else {
                    jawab_login1.setText("");
                    status[0] = true;
                }
            }
        });
        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_login2);
                    jawab_login2.setText(message);
                    status[0] = false;
                }else {
                    jawab_login2.setText("");
                    status[0] = true;
                }
            }
        });
        login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_login3);
                    jawab_login3.setText(message);
                    status[0] = false;
                }else {
                    jawab_login3.setText("");
                    status[0] = true;
                }
            }
        });


        regis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi1);
                    jawab_regis1.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis1.setText("");
                    status[0] = true;
                }
            }
        });
        regis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi2);
                    jawab_regis2.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis2.setText("");
                    status[0] = true;
                }
            }
        });
        regis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi3);
                    jawab_regis3.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis3.setText("");
                    status[0] = true;
                }
            }
        });
        regis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi4);
                    jawab_regis4.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis4.setText("");
                    status[0] = true;
                }
            }
        });
        regis5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi5);
                    jawab_regis5.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis5.setText("");
                    status[0] = true;
                }
            }
        });
        regis6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi6);
                    jawab_regis6.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis6.setText("");
                    status[0] = true;
                }
            }
        });
        regis7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi7);
                    jawab_regis7.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis7.setText("");
                    status[0] = true;
                }
            }
        });
        regis8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi8);
                    jawab_regis8.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis8.setText("");
                    status[0] = true;
                }
            }
        });
        regis9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi9);
                    jawab_regis9.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis9.setText("");
                    status[0] = true;
                }
            }
        });
        regis10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi10);
                    jawab_regis10.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis10.setText("");
                    status[0] = true;
                }
            }
        });
        regis11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi11);
                    jawab_regis11.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis11.setText("");
                    status[0] = true;
                }
            }
        });
        regis12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi12);
                    jawab_regis12.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis12.setText("");
                    status[0] = true;
                }
            }
        });
        regis13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi13);
                    jawab_regis13.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis13.setText("");
                    status[0] = true;
                }
            }
        });
        regis14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi14);
                    jawab_regis14.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis14.setText("");
                    status[0] = true;
                }
            }
        });
        regis15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi15);
                    jawab_regis15.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis15.setText("");
                    status[0] = true;
                }
            }
        });
        regis16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi16);
                    jawab_regis16.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis16.setText("");
                    status[0] = true;
                }
            }
        });
        regis17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi17);
                    jawab_regis17.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis17.setText("");
                    status[0] = true;
                }
            }
        });
        regis18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi18);
                    jawab_regis18.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis18.setText("");
                    status[0] = true;
                }
            }
        });
        regis19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi19);
                    jawab_regis19.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis19.setText("");
                    status[0] = true;
                }
            }
        });
        regis20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi20);
                    jawab_regis20.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis20.setText("");
                    status[0] = true;
                }
            }
        });
        regis21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi21);
                    jawab_regis21.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis21.setText("");
                    status[0] = true;
                }
            }
        });
        regis22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status[0] == true) {
                    String message = getString(R.string.jawab_registrasi22);
                    jawab_regis22.setText(message);
                    status[0] = false;
                }else {
                    jawab_regis22.setText("");
                    status[0] = true;
                }
            }
        });
        hubugi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }

            private void sendMail() {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, "sultonj18@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Assalamualaikum wr wb");
                intent.putExtra(Intent.EXTRA_TEXT, "Rumah belajar : ");
                startActivity(Intent.createChooser(intent,"sulton"));
            }
        });



        return v;
    }
    


}