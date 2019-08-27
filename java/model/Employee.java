package model;

public class Employee {
	    private int id;
	    private String uname;
	    private String name;
	    private String nic;
	    private String phn;
	    private String email;
	    private String address;
	    private String pwd;
	    private String job;
	    private String image;
	    
	    //6 line

	    public Employee(int id, String uname, String name, String nic, String phn, String email, String address, String pwd, String job, String image) {
	        this.id = id;
	        this.uname = uname;
	        this.name = name;
	        this.nic = nic;
	        this.phn = phn;
	        this.email = email;
	        this.address = address;
	        this.pwd = pwd;
	        this.job = job;
	        this.image = image;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getUname() {
	        return uname;
	    }

	    public void setUname(String uname) {
	        this.uname = uname;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getNic() {
	        return nic;
	    }

	    public void setNic(String nic) {
	        this.nic = nic;
	    }

	    public String getPhn() {
	        return phn;
	    }

	    public void setPhn(String phn) {
	        this.phn = phn;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	    
	    public String getPwd() {
	        return pwd;
	    }

	    public void setPwd(String pwd) {
	        this.pwd = pwd;
	    }
	    
	    public String getJob() {
	        return job;
	    }

	    public void setJob(String job) {
	        this.job = job;
	    }

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }
	    
	    
}
