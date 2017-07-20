
public class JdbcUtil {

	String driver;
	String url;
	String password,user;
	
	public void checkConnection(){
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);

	}

	public String setDriver(String driver) {
		this.driver = driver;
		return driver;
	}

	public String setUrl(String url) {
		this.url = url;
		return url;
	}

	public String setPassword(String password) {
		this.password = password;
		return password;
	}

	public String setUser(String user) {
		this.user = user;
		return user;
	}
	
	
}
