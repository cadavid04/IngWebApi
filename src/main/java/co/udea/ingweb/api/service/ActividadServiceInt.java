package co.udea.ingweb.api.service;

import co.udea.ingweb.api.model.Actividad;
import co.udea.ingweb.api.model.Grupo;

import java.util.List;

public interface ActividadServiceInt {
    public List<Grupo> getGrupos(int id, String estado);
    public List<Actividad> getActividades();
}
