package com.example.ramap;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Joe's Desktop on 12/10/2014.
 */
public class PrefsActivity {
        public static final String KEY_PREFS_SMS_BODY = "mypref";
        private static final String APP_SHARED_PREFS = PrefsActivity.class.getSimpleName(); //  Name of the file -.xml
        private SharedPreferences _sharedPrefs;
        private SharedPreferences.Editor _prefsEditor;

        public PrefsActivity(Context context) {
            this._sharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
            this._prefsEditor = _sharedPrefs.edit();
        }

        public String get() {
            return _sharedPrefs.getString(KEY_PREFS_SMS_BODY, "");
        }

        public void save(String text) {
            _prefsEditor.putString(KEY_PREFS_SMS_BODY, text);
            _prefsEditor.commit();
        }
}
