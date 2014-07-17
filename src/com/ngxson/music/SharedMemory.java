package com.ngxson.music;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
* This class is used to store preferences and acts as shared memory
* between the activity and the service
* @author Hathibelagal
*/
public class SharedMemory {
	SharedPreferences prefs;
	
	SharedMemory(Context ctx){
		prefs=ctx.getSharedPreferences("Music", Context.MODE_PRIVATE);
	}
	
	void setAlpha(int value){
		prefs.edit().putInt("alpha", value).commit();
	}
	
	int get(){
		return prefs.getInt("blue", 0x00);
	}
	
}
