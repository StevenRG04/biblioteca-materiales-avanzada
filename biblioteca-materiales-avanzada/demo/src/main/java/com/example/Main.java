package com.example;


    public class Main {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();
    
            Libro libro1 = new Libro("Harry Potter", " J. K. Rowling", 1997, "10: 8478884459", 3665);
            Revista revista1 = new Revista("National Geographic", "Varios", 2022, 15, "agosto");
            Audiovisual audiovisual1 = new Audiovisual("Inception", "Christopher Nolan", 2010, "Blu-ray", 148);
    
            biblioteca.agregarMaterial(libro1);
            biblioteca.agregarMaterial(revista1);
            biblioteca.agregarMaterial(audiovisual1);
    
            biblioteca.mostrarCatalogo();
    
            Material materialBuscado = biblioteca.buscarMaterial("Cien años de soledad");
            if (materialBuscado != null) {
                System.out.println("Material encontrado:");
                materialBuscado.mostrarInformacion();
            } else {
                System.out.println("Material no encontrado.");
            }
    
            libro1.prestar();
            System.out.println("Después de prestar el libro:");
            libro1.mostrarInformacion();
    
            libro1.devolver();
            System.out.println("Después de devolver el libro:");
            libro1.mostrarInformacion();
        }
    }
    
