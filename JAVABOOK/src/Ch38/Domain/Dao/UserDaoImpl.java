package Ch38.Domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch36.Domain.Dto.UserDto;

public class UserDaoImpl {
	//DB Attr
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String id="root";
	private String pw="1234";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	//싱글톤 패턴처리
	private static UserDaoImpl instance;
	private UserDaoImpl() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("UserDaoImpl DB Connection Success");
		
	};
	public static UserDaoImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance==null)
			instance = new UserDaoImpl();
		return instance;
	}
	
	//CRUD 
	public int insert(UserDto userDto) {
		return -1;
	}
	public int update(UserDto userDto) {
		return -1;
	}
	public int delete(UserDto userDto) {
		return -1;
	}
	//단건조회
	public UserDto select(UserDto userDto) {	
		return null;
	}
	//다건조회
	public List<UserDto> selectAll() {	
		return null;
	}	
	
}


