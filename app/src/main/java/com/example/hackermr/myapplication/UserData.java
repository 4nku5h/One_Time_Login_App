package com.example.hackermr.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class UserData {

//---------------key

    String phoneNumber_Key="PhoneNumber";
    String user_Key="PhoneNumber";
    String default_data="Empty";

 //----------------------


    Context context =null;
    SharedPreferences shared_ref=null;

    public UserData(Context context){
         this.context=context;
         this.shared_ref=context.getSharedPreferences(user_Key,Context.MODE_PRIVATE);
    }
     void save_phone(String phone_number){
         SharedPreferences.Editor editor=shared_ref.edit();
         editor.putString(phoneNumber_Key,phone_number);

         // add password if you want  editor.putString("key",password);
         editor.commit();

     }

     String load_phone_number(){
        String phone_number=shared_ref.getString(phoneNumber_Key,default_data);

        //------------------load main activity if user already logged in otherwise it opens LOGIN Activity
        if(phone_number.equals(default_data)){
            Intent intent=new Intent(context,Login.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
        return phone_number;
     }
}
