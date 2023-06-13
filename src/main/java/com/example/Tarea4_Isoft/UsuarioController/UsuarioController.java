package com.example.Tarea4_Isoft.UsuarioController;
import com.example.Tarea4_Isoft.Service.UsuarioService;
import com.example.Tarea4_Isoft.UsuarioModel.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService1) {
        this.usuarioService = usuarioService1;
    }

    @PostMapping("/usuario")
    public ResponseEntity<String> crearUsuario(@RequestBody UsuarioModel usuario) {
        boolean isValid = usuarioService.validarNombre(usuario.getNombre())
                && usuarioService.validarApellidoPaterno(usuario.getApellidoPaterno())
                && usuarioService.validarApellidoMaterno(usuario.getApellidoMaterno())
                && usuarioService.validarRut(usuario.getRut())
                && usuarioService.validarNumeroTelefonico(usuario.getNumeroTelefonico())
                && usuarioService.validarEdad(usuario.getEdad());

        if (isValid) {
            // Lógica adicional para crear el usuario en la base de datos, etc.
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Datos de usuario inválidos");
        }
    }
}