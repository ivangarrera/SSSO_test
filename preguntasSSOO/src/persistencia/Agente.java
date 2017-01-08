package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dominio.Pregunta;

public class Agente {
    //instancia del agente
    protected static Agente mInstancia=null;
    //Conexion con la base de datos
    protected static Connection mBD;
    //Identificador ODBC de la base de datos
    private String url = "jdbc:mysql://localhost/preguntasdb";
    private String user_db = "ivan";
    private String password = "passwd";
    //Driven para conectar con bases de datos MySQL
    private static String driver="com.mysql.jdbc.Driver";

    //Constructor
    private Agente()throws Exception {
        conectar();

    }

    //Implementacion del patron singleton

    public static Agente getAgente() throws Exception{
        if (mInstancia==null){
            mInstancia=new Agente();
        }
        return mInstancia;
    }


    //Metodo para realizar la conexion a la base de datos
    private void conectar() throws Exception {
        Class.forName(driver);
        mBD=DriverManager.getConnection(url,user_db,password);
    }


    //Metodo para desconectar de la base de datos
    public void desconectar() throws Exception{
        mBD.close();
    }

    //Metodo para realizar una insercion en la base de datos
    public int insert(String SQL) throws SQLException, Exception{
        conectar();
        PreparedStatement stmt = mBD.prepareStatement(SQL);
        int res = stmt.executeUpdate();
        stmt.close();
        desconectar();
        return res;
    }

    //Metodo para realizar una eliminacion en la base de datos
    public int delete(String SQL) throws SQLException,Exception{
        PreparedStatement stmt = mBD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        desconectar();
        return res;
    }

    //Metodo para realizar una eliminacion en la base de datos
    public int update(String SQL) throws SQLException,Exception{
        conectar();
        PreparedStatement stmt = mBD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        desconectar();
        return res;
    }


    public Vector<Object> select(String SQL) throws SQLException,Exception{
        Vector <Object> vector = new Vector<>();
        ResultSet result;
        conectar();
        Statement stmt = mBD.createStatement(); // Sentencia una vez realizada la conexion con la base de datos
        result = stmt.executeQuery(SQL);
        try{
            while (result.next()){
                int id =     result.getInt("id");
                String question 	= result.getString("question");
                String resp1 	= result.getString("first_response");
                String resp2 = result.getString("second_response");
                String resp3 = result.getString("third_response");
                String resp4 = result.getString("fourth_rsponse");
                String resp5 = result.getString("fifth_response");

                vector.add(new Pregunta(question,resp1,resp2,resp3,resp4,resp5));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }

        stmt.close();
        desconectar();
        return vector;
    }

}