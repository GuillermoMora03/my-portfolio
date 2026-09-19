package com.porfolio.my_portfolio_backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileStorageService {

    @Value("${file.upload.dir}")
    private String uploadDir;

    public String storeFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("El archivo esta vacío");
        }

        String originalFilename = file.getOriginalFilename(); // Almacena el nombre original del archivo.
        String extension = ""; // Es la extension del archivo
        if(originalFilename!=null) {
            int dotIndex = originalFilename.lastIndexOf('.'); // Extraemos el indice donde se encuentra el ultimo punto
            if (dotIndex > 0) { // Es una validación simple para verificar que el . no este al inicio
                extension = originalFilename.substring(dotIndex); // Aqui definimos la extension del archivo
            }
        }

        // Creamos el nombre del archivo, el UUID genera un indentificador unica
        String fileName = UUID.randomUUID().toString() + extension;

        // Creación de la ruta
        Path filePath = Paths.get(uploadDir, fileName).normalize(); // Path.get toma dos o mas partes y las une de manera inteligente para crear una ruta completa del archivo.
                                                                    // Normalize protege nuestra ruta para que sea respetada

        // Copia del archivo al destino
        Files.copy(file.getInputStream(), filePath); // Files.copy lee el contenido del archivo que esta en la memoria gracias al getInputStream
                                                     // Y lo escribe en la ruta que escribimos en el paso anterior

        // Retorno de la URL relativa
        return "/img/projects/" + fileName;
    }
}
