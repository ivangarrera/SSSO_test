package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lenovo on 28/12/16.
 */
public class gestorPreguntas {
    private static ArrayList<Pregunta> preguntas = new ArrayList<>();
    public static void main (String[]args) {
        gestorPreguntas gp = new gestorPreguntas();
        //gp.leerArchivo();
        //gp.insertarPreguntas();
    }
    public void leerArchivo(){
        String path = "/home/lenovo/Escritorio/ppp.txt";
        String pregunta, resp1,resp2,resp3,resp4,resp5;
        File file = new File(path);
        Scanner sc=null;
        try {
            sc = new Scanner(file);
        }catch (FileNotFoundException ex){
            System.out.println("No existe el archivo.");
        }
        while (sc.hasNext()){
            pregunta = sc.nextLine();
            resp1 = sc.nextLine();
            resp2 = sc.nextLine();
            resp3 = sc.nextLine();
            resp4 = sc.nextLine();
            resp5 = sc.nextLine();
            sc.nextLine();
            preguntas.add(new Pregunta(pregunta,resp1,resp2,resp3,resp4,resp5));
        }
    }

    public boolean mostrarPregunta(String question, String resp1, String resp2, String resp3,
                                String resp4, String resp5){
        boolean ok=false;
        try {
            if (Pregunta.read(question, resp1, resp2, resp3, resp4, resp5) != null)
                ok = true;

        }catch (Exception ex){
            System.out.println("Excepcion");
        }
        return ok;
    }
    public boolean mp(){
        boolean ok=false;
        try {
            if (Pregunta.read2(1) != null)
                ok = true;

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return ok;
    }

    public void insertarPreguntas(){
        for (Pregunta p : preguntas){
            String question = p.getTitulo();
            String resp1 = p.getResp1();
            String resp2 = p.getResp2();
            String resp3 = p.getResp3();
            String resp4 = p.getResp4();
            String resp5 = p.getResp5();
            Pregunta pregunta = new Pregunta();
            try {
                pregunta.insert(question, resp1, resp2, resp3, resp4, resp5);
            }catch (Exception ex){
                System.out.println("Error al insertar.");
            }
        }
    }


}
