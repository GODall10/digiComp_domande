package org.example.digicomp_domande;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


    import java.sql.*;

    public class db_login {
        private final static String URL = "jdbc:mysql://api.lestingi.it:3306/database";
        private final static String USER = "alessio";
        private final static String PASSWORD = "UYTrfu56yljk!IYJU5";
        private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static String INSERT = "INSERT INTO tabella (domanda) VALUES (?)";
        private final static String DROP_TABLE = "DROP TABLE IF EXISTS tabella";
        private final static String CREATE_TABLE = """
            
                CREATE TABLE IF NOT EXISTS login (
            id MEDIUMINT NOT NULL AUTO_INCREMENT,
            username varchar(255),
            password varchar(255),
            PRIMARY KEY (id)
            );
            """;

        private static Connection conn;
        private static Statement stmt;
        private static PreparedStatement pstmt;


        public static void main(String[] args) {
            connect();
            chiudiTabella();
        }
        public static void connect(){
            try{
                if (conn == null || conn.isClosed()) {
                    Class.forName(DRIVER);
                    conn = DriverManager.getConnection(URL, USER, PASSWORD);
                    System.out.println("Connessione al DB aperta!");
                    stmt = conn.createStatement();
                    pstmt = conn.prepareStatement(INSERT);
                    creaTabella();
                }

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        private static void creaTabella() throws SQLException {
            stmt.executeUpdate(DROP_TABLE);
            stmt.executeUpdate(CREATE_TABLE);
        }
        public static void chiudiTabella(){
            try {
                if (pstmt != null) pstmt.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("Connessione chiusa.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    public static void aggiungiUtente(String username, String password) throws SQLException{
          String INSERT = "INSERT INTO login (username, password) VALUES (?, ?)";
          try(PreparedStatement pstmt = conn.prepareStatement(INSERT)){
              pstmt.setString(1, username);
              pstmt.setString(2, password);
              pstmt.executeUpdate();
          }catch (SQLException e){
              e.printStackTrace();
          }
    }
    public static int controllaUtente(String username, String password) throws SQLException{
            String SELECT = "SELECT * FROM login WHERE username = ? AND password = ?";
            try(PreparedStatement pstmt = conn.prepareStatement(SELECT)){
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                if(!rs.next()){

                    return 0;
                }else {
                    return 1;
                }
            }
    }
    public static int controllaPassword(String username) throws SQLException{
        String SELECT = "SELECT * FROM login WHERE username = ? ";
        try(PreparedStatement pstmt = conn.prepareStatement(SELECT)){
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if(!rs.next()){

                return 0;
            }else {
                return 1;
            }

        }
    }
    }



