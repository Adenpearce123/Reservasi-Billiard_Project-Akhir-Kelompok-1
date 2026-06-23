/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billiard_asik;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class Koneksi {
    public static Connection getConnection() {

        try {

            Connection conn =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/db_billiard",
                            "root",
                            ""
                    );

            return conn;

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return null;
        }
    }
    
}
