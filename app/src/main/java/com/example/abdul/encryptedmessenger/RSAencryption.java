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
        //Need to convert this C++ code to useable Java code
        /*

        	//We need to generate 3 sets of RSA keys

        //p,q and, lamdaN must be kept secret

        //Generate two distinct prime numbers p and q
        long long int p = 0;
        long long int q = 0;
        long long int lambdaN = 0;

        PrimeGenerator(p,100,51);

        //Delete this line, this is for testing purposes
        //p = 7;

        cout << "p: " << p << endl << endl;

        PrimeGenerator(q,50,0);

        //Delete this line, this is for testing purposes
        //q = 3;


        cout << "q: " << q << endl << endl;

        //Compute n
        //n is used as the modulus for both the public and private keys. Its length, usually expressed in bits, is the key length.
        n = p * q;

        cout << "n: " << n << endl << endl;

        //Compute LCM(p-1,q-1)

        lambdaN = (p-1)*(q-1);

        cout << "Lowest common multiple of p-1 and q-1: " << lambdaN << endl<<endl;

        //e is used as the public key exponent
        //Choose an integer e such that 1 < e < lambdaN and gcd(e, lambdaN) = 1; i.e., e and lambdaN are coprime.
        ConvertToPrime(e,lambdaN,7);

        //Delete this line, this is for testing purposes
        //e = 5;

        cout << "e: " << e << endl << endl;

        //d is used as the private key exponent

        long long int x = 0;

        ExtendedEuclidean(lambdaN, e, x, d);

        cout << "d: " << d << endl << endl;
         */
        return 0;
    }
}
