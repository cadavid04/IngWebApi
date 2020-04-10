package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.Ajuste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AjusteRepository  extends JpaRepository<Ajuste, String>{

}

