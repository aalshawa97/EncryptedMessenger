package com.example.abdul.encryptedmessenger;

import android.app.Activity;
import android.util.Log;

/**
 * Created by abdul on 3/8/2017.
 */

public class RSAencryption extends Activity
{
    long Encrypt(long plainText,long n,  long e)
    {
        long encryptedPlainText = 1;

        for (long i = 0; i < e; i ++)
        {
            encryptedPlainText = ((encryptedPlainText * plainText) % n);
        }


        return encryptedPlainText;


    }

    long KeyGeneration()
    {
        return 0;
    }
}
