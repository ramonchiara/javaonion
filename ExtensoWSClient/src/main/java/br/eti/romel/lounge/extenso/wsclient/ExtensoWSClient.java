/**
 * Copyright (c) 2013 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 *
 * Cliente (linha de comando) do ExtensoWS (prova de conceito).
 */
package br.eti.romel.lounge.extenso.wsclient;

import br.eti.romel.lounge.extenso.ws.*;
import javax.xml.ws.*;

/**
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
public class ExtensoWSClient {

    public static void main(String[] args) {
        ExtensoWS extensoWS = new ExtensoWS_Service().getExtensoWSPort();

        System.out.printf("Extenso: [%s]\n", extensoWS.extenso("99"));
    }
}
