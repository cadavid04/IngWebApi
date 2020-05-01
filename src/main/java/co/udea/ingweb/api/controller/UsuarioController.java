package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.AjusteDTO;
import co.udea.ingweb.api.DTO.UsuarioDTO;
import co.udea.ingweb.api.service.UsuarioService;
import co.udea.ingweb.api.service.UsuarioServiceInt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    UsuarioServiceInt usuarioService;

    public UsuarioController(UsuarioServiceInt usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping()
    public void acrearUsuario(@RequestBody UsuarioDTO usuarioDTO){

        usuarioService.crearUsuario(usuarioDTO);
    }

}
