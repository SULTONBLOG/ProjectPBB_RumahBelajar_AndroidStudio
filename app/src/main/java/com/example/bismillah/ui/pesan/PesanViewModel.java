package com.example.bismillah.ui.pesan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PesanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PesanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hesty");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
