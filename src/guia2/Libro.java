/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
    Autor, Número de páginas, y un constructor con todos los atributos pasados por
    parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
    datos al usuario y luego informar mediante otro método el número de ISBN, el título,
    el autor del libro y el numero de páginas.

    Autor: Elias Garciarena Guillén. Programación II - Java | TUDS ULP
 */
package guia2;

import java.util.Scanner;
import exceps.*;

public class Libro {

    private long isbnCap = 999999999999L;
    private long isbn;
    private String titulo = "";
    private String autor = "";
    private int nroPaginas = 0;

    public Libro() {
        try {
            setAtributos("", "", 0, 0, 's');
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
        System.out.println();
        printAtributos();
    }

    public Libro(String titulo, String autor, int nroPaginas, long isbn) {
        try {
            setAtributos(titulo, autor, nroPaginas, isbn, 'c');
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
        System.out.println();
        printAtributos();
    }

    private void setAtributos(String titulo, String autor, int nroPaginas, long isbn, char choice) throws CustomException {
        verificarParam(titulo, autor, nroPaginas, isbn, choice);
        setValores(titulo, autor, nroPaginas, isbn, choice);
    }

    private void verificarParam(String titulo, String autor, int nroPaginas, long isbn, char choice) throws CustomException {
        if (choice != 's') {
            if (choice == 'c') {
                if (titulo.equals("")) {
                    throw new CustomException("Parámetro TITULO (String) inválido.");
                }
                if (autor.equals("")) {
                    throw new CustomException("Parámetro AUTOR (String) inválido.");
                }
                if (isbn <= this.isbnCap) {
                    throw new CustomException("Parámetro ISBN (long) inválido.");
                }
                if (nroPaginas <= 0) {
                    throw new CustomException("Parámetro NROPAGINAS (int) inválido.");
                }
            } else {
                throw new CustomException();
            }
        }
    }

    private void setValores(String titulo, String autor, int nroPaginas, long isbn, char choice) throws CustomException {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        try {
            if (this.titulo.equals("")) {
                if (choice == 's') {
                    System.out.println("Ingrese el TITULO de la obra:");
                    this.titulo = in.next();
                } else {
                    this.titulo = titulo;
                }
                if (this.titulo.equals("")) {
                    throw new Exception();
                }
            }

            if (this.autor.equals("")) {
                if (choice == 's') {
                    System.out.println("Ingrese el AUTOR de la obra:");
                    this.autor = in.next();
                } else {
                    this.autor = autor;
                }
                if (this.autor.equals("")) {
                    throw new Exception();
                }
            }

            if (this.isbn <= this.isbnCap) {
                if (choice == 's') {
                    System.out.println("Ingrese nro. ISBN - 13:");
                    this.isbn = in.nextLong();
                } else {
                    this.isbn = isbn;
                }
                if (this.isbn <= this.isbnCap) {
                    throw new Exception();
                }
            }

            if (this.nroPaginas <= 0) {
                if (choice == 's') {
                    System.out.println("Ingrese CANTIDAD DE PÁGINAS de la obra:");
                    this.nroPaginas = in.nextInt();
                } else {
                    this.nroPaginas = nroPaginas;
                }
                if (this.nroPaginas <= 0) {
                    throw new Exception();
                }
            }

        } catch (Exception exc) {
            System.out.println("\nValor ingresado incorrecto!\n");
            setValores(titulo, autor, nroPaginas, isbn, choice);
        }
    }

    private String getTitulo() {
        return this.titulo;
    }

    private String getAutor() {
        return this.autor;
    }

    private int getNroPaginas() {
        return this.nroPaginas;
    }

    private long getISBN() {
        return this.isbn;
    }

    private void printAtributos() {
        System.out.println("RESULTADO:\n");
        System.out.println("Titulo: " + getTitulo() + "\n");
        System.out.println("Autor: " + getAutor() + "\n");
        System.out.println("Nro. de páginas: " + getNroPaginas() + "\n");
        System.out.println("ISBN - 13: " + getISBN() + "\n");
    }
}