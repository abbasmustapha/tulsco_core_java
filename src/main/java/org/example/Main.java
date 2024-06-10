package org.example;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/telusco";
        String uname = "root";
        String pass = "sysadm";
        String query = "select s.* from student s where s.studentId>0";
       // String query2 = "INSERT INTO student (studentId, studentName, studentEmail, studentBirthDate) " +
       //         "VALUES ('6', 'Six', 'sixieme@gmail.fr', '2006/06/16')";

        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();


      //  int count = st.executeUpdate(query2);
      //  System.out.println(count + "row/s affected");

        ResultSet sr = st.executeQuery(query);


        while (sr.next()){
            System.out.println(sr.getString(1) + " : " + sr.getString(2) + "   " + sr.getString(3));
        }

        // Prepared Statement
        int studentid = 7;
        String studentName="ElMostafa";
        String studentMail="faya@alkafi.ma";
        // Date studentBirthDate= Date.valueOf("2007/08/22");
        String query3 = "INSERT INTO student " +
                "(studentId, studentName, studentEmail) VALUES (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query3);
        ps.setInt(1,studentid);
        ps.setString(2,studentName);
        ps.setString(3,studentMail);
        // ps.setDate(4,studentBirthDate);

        int count2 = ps.executeUpdate();
        System.out.println(count2 + "row/s affected");


        st.close();
        con.close();

    }
}


/*

CREATE TABLE `telusco`.`student` (
        `studentId` INT NOT NULL,
        `studentName` VARCHAR(45) NULL,
  `studentEmail` VARCHAR(45) NULL,
  `studentBirthDate` DATE NULL,
PRIMARY KEY (`studentId`));

INSERT INTO `telusco`.`student` (`studentId`, `studentName`, `studentEmail`, `studentBirthDate`)
VALUES ('1', 'Premier', 'premier@gmail.com', '1990/01/02');
INSERT INTO `telusco`.`student` (`studentId`, `studentName`, `studentEmail`, `studentBirthDate`)
VALUES ('2', 'Second', 'second@aol.fr', '1992/11/09');
INSERT INTO `telusco`.`student` (`studentId`, `studentName`, `studentEmail`, `studentBirthDate`)
VALUES ('3', 'Troisieme', 'trois.ter@yahoo.fr', '1997/07/23');
*/


