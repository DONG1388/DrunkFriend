package com.austindiviness.drunkfriend;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {

		@Override
		protected void onCreate(Bundle bundle) {
			super.onCreate(bundle);
			addPreferencesFromResource(R.layout.settings);
		}
}
