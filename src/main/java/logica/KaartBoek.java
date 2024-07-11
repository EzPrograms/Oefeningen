/*
package logica;

import jdk.jshell.SourceCodeAnalysis;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.AccountNotFoundException;

public class KaartBoek {
    final int AANTAL = 52;
    Kaart [] kaarten;

    public KaartBoek() {


        kaarten = new Kaart[AANTAL];
        int count = 0;

        for (int i = 1; i <= AANTAL-1 ; i++){
           if (count >=13){ /* Dit is een teller en om de 13 kaarten reset deze dit dient om het nummer van 2 tot 9 aan een kaart te geven want i niet gebruikt worden hiervoor */
         /*     count = 1;
           } else {
               count++;
           }
            if (i<=9&&i!=1){
               kaarten[i] = new Kaart("H"+i);
               } else if (i<=13&&i>9||i==1){
                switch (i){
                    case 10:
                        kaarten[i] = new Kaart("HT");
                        break;
                    case 11:
                        kaarten[i] = new Kaart("HB");
                        break;
                    case 12:
                        kaarten[i] = new Kaart("HD");
                        break;
                    case 13:
                        kaarten[i] = new Kaart("HH");
                        break;
                    case 1:
                        kaarten[i] = new Kaart("HA");
                        break;
                }
            }
            if (i<=22&&i!=14&&i>13){

                kaarten[i] = new Kaart("K"+ count);
            } else if (i<=26&&i>22||i==14){
                switch (i){
                    case 23:
                        kaarten[i] = new Kaart("KT");
                        break;
                    case 24:
                        kaarten[i] = new Kaart("KB");
                        break;
                    case 25:
                        kaarten[i] = new Kaart("KD");
                        break;
                    case 26:
                        kaarten[i] = new Kaart("KH");
                        break;
                    case 14:
                        kaarten[i] = new Kaart("KA");
                        break;
                }
            }
            if (i<=35&&i!=27&&i>26){
                kaarten[i] = new Kaart("R"+count);
            } else if (i<=39&&i>35||i==27){
                switch (i){
                    case 36:
                        kaarten[i] = new Kaart("RT");
                        break;
                    case 37:
                        kaarten[i] = new Kaart("RB");
                        break;
                    case 38:
                        kaarten[i] = new Kaart("RD");
                        break;
                    case 39:
                        kaarten[i] = new Kaart("RH");
                        break;
                    case 27:
                        kaarten[i] = new Kaart("RA");
                        break;
                }
            }
            if (i<=48&&i!=40&&i>39){
                kaarten[i] = new Kaart("S"+count);
            } else if (i<=52&&i>48||i==40){
                switch (i){
                    case 49:
                        kaarten[i] = new Kaart("ST");
                        break;
                    case 50:
                        kaarten[i] = new Kaart("SB");
                        break;
                    case 51:
                        kaarten[i] = new Kaart("SD");
                        break;
                    case 52:
                        kaarten[i] = new Kaart("SH");
                        break;
                    case 40:
                        kaarten[i] = new Kaart("SA");
                        break;
                }
            }
        }
    }

    public KaartBoek(char @NotNull [] soorten){


        kaarten = new Kaart[AANTAL];

        for(int i = 0; i <= soorten.length-1; i++) {
            if (soorten[i] == 'H' || soorten[i] == 'K' || soorten[i] == 'R' || soorten[i] == 'S' ){
                for (int j = 1; j <= 13; j++) {
                    char soort = soorten[i];
                    char waarde = (char) j;
                    if (j >= 10 && j <= 13 || j == 1) {
                        switch (j) {
                            case 1:
                                kaarten[j] = new Kaart(soort, 'A');
                                break;
                            case 10:
                                kaarten[j] = new Kaart(soort, 'T');
                                break;
                            case 11:
                                kaarten[j] = new Kaart(soort, 'B');
                                break;
                            case 12:
                                kaarten[j] = new Kaart(soort, 'D');
                                break;
                            case 13:
                                kaarten[j] = new Kaart(soort, 'H');
                                break;
                        }
                    } else {
                        kaarten[j] = new Kaart(soort, waarde);
                    }
                }
            }
        }
    }
    public KaartBoek(String [] kaarten){

        String soort;
        String waarde;
        this.kaarten = new Kaart[AANTAL];


        for (int i = 0; i <= kaarten.length-1; i++){
            for(int j = 0; j <= kaarten[i].length() +1; i++){

                soort = kaarten[i].substring(0,1);
                waarde = kaarten[i].substring(1,2);

                if (soort.equals("H") || soort.equals("K") || soort.equals("R") || soort.equals("S")){
                 if (waarde.equals("2") || waarde.equals("3") || waarde.equals("4") || waarde.equals("5") || waarde.equals("6") || waarde.equals("7") ||  waarde.equals("8") || waarde.equals("9") || waarde.equals("T") || waarde.equals("B") || waarde.equals("D") || waarde.equals("H") || waarde.equals("A") ){
                     this.kaarten[i] = new Kaart(soort.charAt(0),waarde.charAt(0));
                 }else {
                     break;
                 }
                } else {
                    break;
                }
            }
        }
    }
}


*/