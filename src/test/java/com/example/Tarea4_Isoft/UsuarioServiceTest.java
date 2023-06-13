package com.example.Tarea4_Isoft;

import com.example.Tarea4_Isoft.Service.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class UsuarioServiceTest {

        private UsuarioService usuarioService;

        @BeforeEach
        public void setUp() {
            usuarioService = new UsuarioService();
        }

        @Test
        public void testValidarNombre_ReturnsTrue() {
            boolean result = usuarioService.validarNombre("Cony");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidarNombre_ReturnsFalse() {
            boolean result = usuarioService.validarNombre("");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidarApellidoPaterno_ReturnsTrue() {
            boolean result = usuarioService.validarApellidoPaterno("Moya");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidarApellidoPaterno_ReturnsFalse() {
            boolean result = usuarioService.validarApellidoPaterno("");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidarApellidoMaterno_ReturnsTrue() {
            boolean result = usuarioService.validarApellidoMaterno("Sarpi");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidarApellidoMaterno_ReturnsFalse() {
            boolean result = usuarioService.validarApellidoMaterno("");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidarRut_ReturnsTrue() {
            String rut = "20.643.527-5";
            Assertions.assertTrue(usuarioService.validarRut(rut));

        }

        @Test
        public void testValidarNumeroTelefonico_ReturnsTrue() {
            boolean result = usuarioService.validarNumeroTelefonico("123456789");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidarNumeroTelefonico_ReturnsFalse() {
            boolean result = usuarioService.validarNumeroTelefonico("12345678");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidarEdad_ReturnsTrue() {
            boolean result = usuarioService.validarEdad(25);
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidarEdad_ReturnsFalse() {
            boolean result = usuarioService.validarEdad(9);
            Assertions.assertFalse(result);
        }
    }




