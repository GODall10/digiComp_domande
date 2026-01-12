package org.example.digicomp_domande;

import java.sql.*;

public class db_certificazione {
    private final static String URL =
            "jdbc:mysql://api.lestingi.it:3306/database";
    private final static String USER = "alessio";
    private final static String PASSWORD = "UYTrfu56yljk!IYJU5";
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String INSERT = "INSERT INTO tabella (domanda) VALUES (?)";
    private final static String DROP_TABLE = "DROP TABLE IF EXISTS tabella";
    private final static String CREATE_TABLE = """
            
                CREATE TABLE IF NOT EXISTS risultati (
            id MEDIUMINT NOT NULL AUTO_INCREMENT,
            username varchar(255),
            Area1 varchar(255),
            Area2 varchar(255),
            Area3 varchar(255),
            Area4 varchar(255),
            Area5 varchar(255),
            Generale varchar(255),
            PRIMARY KEY (id)
            );
            """;

    private static Connection conn;
    private static Statement stmt;
    private static PreparedStatement pstmt;
    public static void main(String[] args) throws SQLException {

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
    public static void insertRisultati(String username, String Area1,String Area2,String Area3,String Area4,String Area5,String Generale) throws SQLException{
        String INSERT = "INSERT INTO risultati (username,Area1,Area2,Area3,Area4,Area5,Generale) VALUES (?,?,?,?,?,?,?)";
        try(PreparedStatement pstmt = conn.prepareStatement(INSERT)){
            pstmt.setString(1, username);
            pstmt.setString(2,Area1);
            pstmt.setString(3,Area2);
            pstmt.setString(4,Area3);
            pstmt.setString(5,Area4);
            pstmt.setString(6,Area5);
            pstmt.setString(7,Generale);
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
