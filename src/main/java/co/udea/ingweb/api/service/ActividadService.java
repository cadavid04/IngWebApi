package co.udea.ingweb.api.service;

import co.udea.ingweb.api.model.Actividad;
import co.udea.ingweb.api.model.Grupo;
import co.udea.ingweb.api.repository.ActividadRepository;
import co.udea.ingweb.api.repository.GrupoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadService implements ActividadServiceInt {

    public ActividadService(GrupoRepository grupoRepository, ActividadRepository actividadRepository) {
        this.grupoRepository = grupoRepository;
        this.actividadRepository = actividadRepository;
    }

    private GrupoRepository grupoRepository;
    private ActividadRepository actividadRepository;

    private final Logger log = LoggerFactory.getLogger(ActividadService.class);

    @Override
    public List<Grupo> getGrupos(int id, String estado){
        return grupoRepository.findAllByIdDocenteAndEstadoEquals(id, estado);
    }

    @Override
    public List<Actividad> getActividades(){
        return actividadRepository.findAll();
    }


}
