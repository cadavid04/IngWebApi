package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {

    public Perfil findByNombreEquals(String nombre);

}
