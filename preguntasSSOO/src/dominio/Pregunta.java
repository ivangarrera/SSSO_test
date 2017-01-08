package dominio;

import java.util.Vector;

import persistencia.Agente;

/**
 * Created by lenovo on 28/12/16.
 */
public class Pregunta {
    private String titulo, resp1, resp2, resp3, resp4, resp5;

    public Pregunta(){}

    public Pregunta(String titulo, String resp1, String resp2, String resp3, String resp4, String resp5) {
        this.titulo = titulo;
        this.resp1 = resp1;
        this.resp2 = resp2;
        this.resp3 = resp3;
        this.resp4 = resp4;
        this.resp5 = resp5;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResp1() {
        return resp1;
    }

    public void setResp1(String resp1) {
        this.resp1 = resp1;
    }

    public String getResp2() {
        return resp2;
    }

    public void setResp2(String resp2) {
        this.resp2 = resp2;
    }

    public String getResp3() {
        return resp3;
    }

    public void setResp3(String resp3) {
        this.resp3 = resp3;
    }

    public String getResp4() {
        return resp4;
    }

    public void setResp4(String resp4) {
        this.resp4 = resp4;
    }

    public String getResp5() {
        return resp5;
    }

    public void setResp5(String resp5) {
        this.resp5 = resp5;
    }

    public static Pregunta read (String question, String resp1, String resp2, String resp3,
                                 String resp4, String resp5) throws Exception{
        Pregunta pregunta = null;
        String SQL_query = "SELECT question, first_response, second_response, third_response, " +
                "fourth_rsponse, fifth_response FROM preguntas where"
                + " question = '"+question+"' AND first_response = '"+resp1+"' AND second_response = '"+resp2+
                "' AND third_response = '"+resp3+"' AND fourth_rsponse = '"+resp4+
                "' AND fifth_response = '"+resp5+"';";

        Agente a = Agente.getAgente();
        Vector <Object> res = a.select(SQL_query);

        if (res.size()==1){
            pregunta = (Pregunta) res.get(0);
        }

        return pregunta;
    }

    public int insert (String question, String resp1, String resp2, String resp3,
                               String resp4, String resp5) throws  Exception{
        this.titulo = question;
        this.resp1 = resp1;
        this.resp2 = resp2;
        this.resp3 = resp3;
        this.resp4 = resp4;
        this.resp5 = resp5;
        String SQL_query = "INSERT INTO preguntas (question, first_response, second_response," +
                " third_response, fourth_rsponse, fifth_response) VALUES ('"
                +this.titulo+"','"+this.resp1+"','"+this.resp2+"','"+
                this.resp3+"','"+this.resp4+"','"+this.resp5+"');";

        Agente a = Agente.getAgente();
        return a.insert(SQL_query);
    }

    public static Pregunta read2 (int id) throws Exception{
        Pregunta p = null;
        String SQL_query = "SELECT * FROM preguntas where"
                + " id = '"+id+"';";
        Agente a = Agente.getAgente();
        Vector <Object> res = a.select(SQL_query);
        if (res.size()==1){
            p = (Pregunta) res.get(0);
        }
        return p;
    }

}
