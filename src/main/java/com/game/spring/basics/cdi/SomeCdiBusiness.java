package com.game.spring.basics.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDAO someCDIDAO;

    public SomeCdiDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCdiDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
