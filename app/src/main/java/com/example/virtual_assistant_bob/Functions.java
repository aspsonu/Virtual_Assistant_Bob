package com.example.virtual_assistant_bob;

import android.util.Log;

import java.util.Calendar;

public class Functions {
    public static String wishMe(){
        String s = "";
        Calendar c = Calendar.getInstance();
        int time = c.get(Calendar.HOUR_OF_DAY);

        if (time >= 0 && time < 12){
            s = "Good Morning";
        }
        else if (time >= 12 && time < 17){
            s =  "Good Afternoon";
        }
        else if (time >= 17 && time < 21){
            s =  "Good Evening";
        }
        else if (time >= 21 && time < 22){
            s =  "Good Evening";
        }
        else if (time >= 22 && time < 24){
            s =  "Good evening, I think it's too late... take rest";
        }

        return s;
    }

    public static String fetchName(String msgs){
        String a = msgs;
        int len = a.length();
        String name = a.substring(8, len);
        Log.d("Name",name);

        return name;
    }
}
