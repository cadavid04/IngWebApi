package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.UsuarioDTO;
import co.udea.ingweb.api.model.Empleado;
import co.udea.ingweb.api.model.Perfil;
import co.udea.ingweb.api.model.Usuario;
import co.udea.ingweb.api.repository.EmpleadoRepository;
import co.udea.ingweb.api.repository.PerfilRepository;
import co.udea.ingweb.api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UsuarioServiceInt{

    UsuarioRepository usuarioRepository;
    EmpleadoRepository empleadoRepository;
    PerfilRepository perfilRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, EmpleadoRepository empleadoRepository, PerfilRepository perfilRepository) {
        this.usuarioRepository = usuarioRepository;
        this.empleadoRepository = empleadoRepository;
        this.perfilRepository = perfilRepository;
    }

    @Override
    public void crearUsuario(UsuarioDTO usuarioDTO){
        Empleado empleado = empleadoRepository.findByNombreEquals(usuarioDTO.getNombreEmpleado());
        Perfil perfil = perfilRepository.findByNombreEquals(usuarioDTO.getNombrePerfil());
        Usuario usuario = new Usuario();
        usuario.setEmpleado(empleado);
        usuario.setPass(usuarioDTO.getPass());
        usuario.setUsuario(usuarioDTO.getUsuario());
        usuario.setPerfil(perfil);




        usuarioRepository.save(usuario);
    }
}
