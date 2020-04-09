package co.udea.ingweb.api.service;

import co.udea.ingweb.api.repository.DocenteRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DocenteService implements DocenteServiceInt {

    private DocenteRepository docenteRepository;

    public DocenteService(DocenteRepository docenteRepository){
        this.docenteRepository = docenteRepository;
    }

    private final Logger log = LoggerFactory.getLogger(DocenteService.class);



}




