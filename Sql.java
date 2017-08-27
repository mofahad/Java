import java.sql.*;
class OracleCon{
public static void main(String args[])
{
try{
// step 1 load the driver class
Class.forName("oracld.jdbc.driver.OracleDriver");

// step2   create the connection object
Connection con = DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
// step3 create the statement object

Statement stmt = con.createStatement();
// Step4 execute query

ResultSet rs =  stmt.executeQuery("select*from emp");
//ResultSet  df  = stmt.executeQuery("Selecct the same thing that u have choosen");
while(rs.next())
System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
//System.out.println(rs.connection(20));
System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
// step5 closing connection//
      
con.close();
  }
ctach(Exception e){
 System.out.println(e);
// that is printing the Spacetrack  which contain the error regarding the database connectivity;;;; 
}
}
}
// That is only  changing the thing regarding the most important thing in the field of technology as per the demanding condition of the whole prospective thing in the field of the technology as we are not the concern regarding the whole database thsi is 

// this is connecting  the database with the java applucation as before connecting to the java database we have  to do following steps;
//that are   database connectivity
//:>  Load the class Driver
//:>  Create the connection object 
//:> Create the Statement object
//:> Exequte the Query
/*:> Close the connection

                                             */   