package com.lightyapps.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Prefs {

    // LAST MODIFIED BY  *** FAHEEM HUSSAIN

     static SharedPreferences preferences;
     static SharedPreferences.Editor editor;

/** Initialize EasyPrefs once in your First Activity or Application class */
 public static void init(Context c){

     if(preferences==null){
         preferences= PreferenceManager.getDefaultSharedPreferences(c);
         editor=preferences.edit();
     }


 }


    /** Adding  a String to EasyPrefs with a name and its value */
    public static void addString(String name,String value){

     editor.putString(name, value);
     editor.commit();

    }
    /** Adding  an integer to EasyPrefs with a name and its value */
    public static void addInt(String name,int value){
        editor.putInt(name, value);
        editor.commit();

    }
    /** Adding boolean to EasyPrefs with a name and its value */
    public static void addBool(String name,boolean value){
        editor.putBoolean(name, value);
        editor.commit();

    }

    /** Returns a String added by this name , returns blank string by default */
    public static String  getString(String name){

    return preferences.getString(name,"");


    }
    /** Returns an integer added by this name , returns -1 by default */
    public static int  getInt(String name){

        return preferences.getInt(name,-1);


    }

    /** Returns a boolean added by this name , returns false by default */
    public static boolean  getBool(String name){

        return preferences.getBoolean(name,false);


    }

}
