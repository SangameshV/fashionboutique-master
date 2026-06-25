


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package database;
import javax.sql.*;
import java.sql.*;
import javax.naming.*;
/**
 *
 * @author Adnan Aftab
 */
public class DataBaseManager {
    private Statement stmt=null;
    private ResultSet rs=null;
    private Connection con=null;
    private String query=null;
    private InitialContext in=null;
    DataSource ds=null;

    public DataBaseManager() {
    }

    public void getConnection()
    {
        try
        {
            in=new InitialContext();
            ds=(DataSource) in.lookup("java:comp/env/Account");
            con=ds.getConnection();
            stmt=con.createStatement();

        }
        catch(Exception e)
        {

        }

    }

    public void DisConnect()
    {
        try
        {
            if(con!=null){con.close();}
            if(stmt!=null){stmt.close();}
            if(rs!=null){rs.close();}
        }
        catch(Exception e)
        {

        }
    public boolean CUD(String query, Object... params)
    {
        try
        {
            getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            pstmt.executeUpdate();
            pstmt.close();
            DisConnect();
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
            
            return false;
        }

    }

    public boolean ChkValid(String query)
    {
        try
        {
        getConnection();
        rs=stmt.executeQuery(query);
        if(rs.next())
        return true;
        else return false;
        }
        catch(Exception e)
        {
            
            return false;

    public ResultSet ReadData(String query, Object... params) {
        try {
            getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            rs = pstmt.executeQuery();
            return rs;
        } catch (Exception e) {
            return rs;
        }
    }

}
