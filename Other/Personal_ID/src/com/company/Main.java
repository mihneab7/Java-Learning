package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
    	int n=2061225;
    	String sexul;
    	String lunaNasterii="nimic";
    	String s18="18",s19="19",s20="20";
		int ziua=n%100;
    	int luna=(n/100)%100;
    	switch (luna) {
			case 1: lunaNasterii="ianuarie";
			break;
			case 2: lunaNasterii="februarie";
			break;
			case 3: lunaNasterii="martie";
			break;
			case 4: lunaNasterii="aprilie";
			break;
			case 5: lunaNasterii="mai";
			break;
			case 6: lunaNasterii="iunie";
			break;
			case 7: lunaNasterii="iulie";
			break;
			case 8: lunaNasterii="august";
			break;
			case 9: lunaNasterii="septembrie";
			break;
			case 10: lunaNasterii="octombrie";
			break;
			case 11: lunaNasterii="noiembrie";
			break;
			case 12: lunaNasterii="decembrie";
			break;
		}
    	int anul=(n/10000)%100; //aici stocam anul nasterii din CNP ca int
    	String an=String.valueOf(anul); //conversia in string a anului nasterii din CNP
		String anNastere="nimic"; //variabila folosita pentru a afisa complet anul nasterii
		if (anul<10) {
			String an2=String.valueOf(anul);
			an2="0"+an2;
			an=an2;
		}
    	int primaCifra=n/1000000;
    	if (primaCifra%2==1) {
    	    sexul="baiat nascut pe ";
        }
    	else {
    	    sexul="fata nascuta pe ";
        }
    	if (primaCifra==1||primaCifra==2) {
    	    anNastere=""+s19+an;
        }
    	else if (primaCifra==3||primaCifra==4) {
    	    anNastere=""+s18+an;
        }
    	else if (primaCifra==5||primaCifra==6) {
    	    anNastere=""+s20+an;
        }
    	else if (primaCifra==7||primaCifra==8) {
    	    sexul="(strainatate) "+sexul;
    	    anNastere=""+an+" (nu se stie secolul)";
        }
    	System.out.println(sexul+ziua+" "+lunaNasterii+" "+anNastere);
		}
    }
