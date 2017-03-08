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

    //Need to convert this C++ code to useable Java code

    long KeyGeneration()
    {
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

    long PrimeGenerator(long  aPrime,long  upperBound, long  lowerBound)
    {
        /*
        bool prime = true;

	long long int randNum = 0;

        //Initialize the random seed
        srand(time(NULL));

        //Generate a random number between lowerBound and upperBound
        randNum = rand() % upperBound + lowerBound;


        //This block of code generates a prime number between 10000+randNum and 11000

        for (int i = 10000+randNum; i<11000; i++)
        {
            prime = true;
            for (int j = 2; j*j <= i; j++)
            {
                if (i % j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                aPrime = i;
                return;
            }

        }

        return;
        */
        return 0;
    }

    long ConvertToPrime(long  aPrime, long  upperBound, long  lowerBound)
    {
        /*
        bool prime = true;

        //This block of code generates a prime number between lowerbound and upperbound

        for (int i = lowerBound; i<upperBound; i++)
        {
            prime = true;
            for (int j = 2; j*j <= i; j++)
            {
                if (i % j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                aPrime = i;
                break;
            }

        }

        return;
        */
        return 0;
    }

    long LCM(long  p, long q,long lambdaN)
    {
        /*
	long long int m = 0;
	long long int n = 0;

        m = p;
        n = q;

        while (m != n)
        {
            if (m < n)
            {
                m = m + p;
            }
            else
            {
                n = n + q;
            }
        }

        lambdaN = m;

        return;
        */
        return 0;
    }



long ExtendedEuclidean(long lambdaN, long e, long  x, long  d)
{
	//We need to figure out what will d be, d = y
    /*
	long long int tempLambdaN = lambdaN;

	long long int q, lastX, lastY, temp0, temp1, temp2, temp3;

	if (e>lambdaN)
	{
		//we swap them
		temp0 = lambdaN; lambdaN = e; e = temp0;
	}

	x = 0;
	d = 1;
	lastX = 1;
	lastY = 0;

	while (e != 0)
	{
		q = lambdaN / e;
		temp1 = lambdaN%e;
		lambdaN = e;
		e = temp1;

		temp2 = x;
		x = lastX - q*x;
		lastX = temp2;

		temp3 = d;
		d = lastY - q*d;
		lastY = temp3;
	}


    x = lastX;
    d = lastY;

	if (d < 0)
    {
        d = tempLambdaN + d;
    }


	return;
    */

    return 0;
}


}
