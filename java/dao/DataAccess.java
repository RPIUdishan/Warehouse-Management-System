package dao;
import db.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;

public class DataAccess {
	 public void addNew(Employee e){
	        try {
	            PreparedStatement ps = DBUtils.getPreparedStatement("insert into News values(?,?,?,?,?,?,?,?,?)");
	            ps.setString(1, e.getUname());
	            ps.setString(2, e.getName());
	            ps.setString(3, e.getNic());
	            ps.setString(4, e.getPhn());
	            ps.setString(5, e.getEmail());
	            ps.setString(6, e.getAddress());
	            ps.setString(7, e.getPwd());
	            ps.setString(8, e.getJob());
	            ps.setString(9, e.getImage());
	            ps.executeUpdate();
	            
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	    
	    public static List<Employee> getAll(){
	        List<Employee> ls = new LinkedList<>();
	        
	        try {
	            ResultSet rs = DBUtils.getPreparedStatement("select * from News").executeQuery();
	            while(rs.next()){
	                Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
	                ls.add(e);
	            }
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        
	        return ls;
	    }
	    
	    public static List<Employee> getNewById(int id){
	        List<Employee> ls = new LinkedList<>();
	        String sql = "select * from Employee where id = " +id;
	        try {
	            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
	            while(rs.next()){
	                Employee n = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
	                ls.add(n);
	            }
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        
	        return ls;
	    }
	    
	    public void edit(int id, String uname, String name, String nic, String phn, String email, String address, String pwd, String job, String image){
	        try {
	            String sql = "update Employee SET uname = ?, name = ?, nic = ?, phn = ?, email = ?, address = ?, pwd = ?, job = ?, image = ?" + " where id = ?";
	            PreparedStatement ps= DBUtils.getPreparedStatement(sql);
	            ps.setString(1, uname);
	            ps.setString(2, name);
	            ps.setString(3, nic);
	            ps.setString(4, phn);
	            ps.setString(4, email);
	            ps.setString(4, address);
	            ps.setString(4, pwd);
	            ps.setString(4, job);
	            ps.setString(5, image);
	            ps.setInt(6, id);
	            ps.executeUpdate();
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	    }
	    
	    public void delete(int id){
	        try {
	            String sql = "delete News where id = ?";
	            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
	            ps.setInt(1, id);
	            ps.executeUpdate();
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
}
