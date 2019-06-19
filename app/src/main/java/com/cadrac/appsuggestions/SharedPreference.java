package com.cadrac.appsuggestions;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreference {

    public static void savefirst(Context c, String first)
    {
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(c);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("first",first);
        editor.commit();
    }

    public static String getfirst(Context c){
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(c);
        return sharedPreferences.getString("first","");
    }


}


