/*
 * Copyright (c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso.ejb;

import java.math.BigDecimal;
import javax.ejb.*;

@Remote
public interface ExtensoBeanRemote {

    String extenso(BigDecimal valor);
}
