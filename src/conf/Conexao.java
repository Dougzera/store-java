package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  private Connection conn;

  public Conexao() {
    try {
      Class.forName("com.mysql.jdbc.Driver");

      conn = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/db_loja", "root", "root");

      System.out.println("Conexao realizada com sucesso");
    } catch (ClassNotFoundException | SQLException e) {
      System.out.println("Falha na conexao");
      e.printStackTrace();
    } 
  }

  public Connection getConexao(){
    return conn;
  }
  
  public static void main(String[] args) {
    Conexao c = new Conexao();
  }
  
}//End Class
