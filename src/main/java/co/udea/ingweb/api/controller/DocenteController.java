package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.service.DocenteServiceInt;


public class DocenteController {

    private DocenteServiceInt docenteService;

    public DocenteController(DocenteServiceInt docenteService) {
        this.docenteService = docenteService;
    }


}
