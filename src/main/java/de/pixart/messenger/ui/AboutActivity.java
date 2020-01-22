package de.pixart.messenger.ui;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

import de.pixart.messenger.R;
import de.pixart.messenger.utils.ThemeHelper;

public class AboutActivity extends XmppActivity {

    private TextView aboutmessage;

    @Override
    protected void refreshUiReal() {

    }

    @Override
    void onBackendConnected() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(ThemeHelper.find(this));
        setContentView(R.layout.activity_about);
        setSupportActionBar(findViewById(R.id.toolbar));
        configureActionBar(getSupportActionBar());

        aboutmessage = findViewById(R.id.aboutmessage);
        String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        aboutmessage.setText(getString(R.string.pref_about_message, year));
    }
}