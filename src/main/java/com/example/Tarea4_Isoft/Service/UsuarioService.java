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
            boolean validacion = false;
            try {
                rut =  rut.toUpperCase();
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

                char dv = rut.charAt(rut.length() - 1);

                int m = 0, s = 1;
                for (; rutAux != 0; rutAux /= 10) {
                    s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
                }
                if (dv == (char) (s != 0 ? s + 47 : 75)) {
                    validacion = true;
                }

            } catch (Exception ignored) {

            }
            return validacion;

        }


        public boolean validarNumeroTelefonico(String numeroTelefonico) {
            return numeroTelefonico.matches("^\\d{9}$");
        }

        public boolean validarEdad(int edad) {
            return edad >= 10 && edad <= 99;
        }
    }


