package com.example.Tarea4_Isoft.Service;
import java.util.regex.Pattern;
public class UsuarioService {

        public boolean validarNombre(String nombre) {
            return !nombre.isEmpty();
        }

        public boolean validarApellidoPaterno(String apellidoPaterno) {
            return !apellidoPaterno.isEmpty();
        }

        public boolean validarApellidoMaterno(String apellidoMaterno) {
            return !apellidoMaterno.isEmpty();
        }

        public boolean validarRut(String rut) {
            return rut.matches("^\\d{7,8}-\\d{1}$");
        }

        public boolean validarNumeroTelefonico(String numeroTelefonico) {
            return numeroTelefonico.matches("^\\d{9}$");
        }

        public boolean validarEdad(int edad) {
            return edad >= 10 && edad <= 99;
        }
    }


