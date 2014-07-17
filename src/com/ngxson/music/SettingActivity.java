package com.ngxson.music;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		extracted();
	}

	private void extracted() {
		addPreferencesFromResource(R.xml.prefs);
	}
	
}
