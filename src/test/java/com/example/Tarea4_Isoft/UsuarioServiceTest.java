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
        public void testValidateNombre_ValidNombre_ReturnsTrue() {
            boolean result = usuarioService.validarNombre("Cony");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidateNombre_InvalidNombre_ReturnsFalse() {
            boolean result = usuarioService.validarNombre("");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidateApellidoPaterno_ValidApellidoPaterno_ReturnsTrue() {
            boolean result = usuarioService.validarApellidoPaterno("Moya");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidateApellidoPaterno_InvalidApellidoPaterno_ReturnsFalse() {
            boolean result = usuarioService.validarApellidoPaterno("");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidateApellidoMaterno_ValidApellidoMaterno_ReturnsTrue() {
            boolean result = usuarioService.validarApellidoMaterno("Sarpi");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidateApellidoMaterno_InvalidApellidoMaterno_ReturnsFalse() {
            boolean result = usuarioService.validarApellidoMaterno("");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidateRut_ValidRut_ReturnsTrue() {
            boolean result = usuarioService.validarRut("19992648-9");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidateRut_InvalidRut_ReturnsFalse() {
            boolean result = usuarioService.validarRut("19992648");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidateNumeroTelefonico_ValidNumeroTelefonico_ReturnsTrue() {
            boolean result = usuarioService.validarNumeroTelefonico("123456789");
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidateNumeroTelefonico_InvalidNumeroTelefonico_ReturnsFalse() {
            boolean result = usuarioService.validarNumeroTelefonico("12345678");
            Assertions.assertFalse(result);
        }

        @Test
        public void testValidateEdad_ValidEdad_ReturnsTrue() {
            boolean result = usuarioService.validarEdad(25);
            Assertions.assertTrue(result);
        }

        @Test
        public void testValidateEdad_InvalidEdad_ReturnsFalse() {
            boolean result = usuarioService.validarEdad(9);
            Assertions.assertFalse(result);
        }
    }




