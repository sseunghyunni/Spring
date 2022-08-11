package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public MemberDAO() {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List listMembers() {
			List list= new ArrayList();
			//리스트 만들었다
			try{
				con=dataFactory.getConnection();
				String query ="select * from t_member order by joinDate desc";//검색
				System.out.println("prepareStatement:"+query);
				pstmt=con.prepareStatement(query);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					String id=rs.getString("id");
					String pwd=rs.getString("pwd");
					String name=rs.getString("name");
					String email=rs.getString("email");
					Date joinDate =rs.getDate("joinDate");
					MemberBean vo= new MemberBean();
					//행수만큼 memberbean객체생김 
					vo.setId(id);
					vo.setPwd(pwd);
					vo.setName(name);
					vo.setEmail(email);
					vo.setJoinDate(joinDate);
					list.add(vo);
					//행수만큼 인덱스 생김  인덱스마다 각각행 주소 있음 
			}
				rs.close();
				pstmt.close();
				con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
			return list;
			//리스트주소 반환
	}

	public void addMember(MemberBean memberBean) {
			try {
				Connection con =dataFactory.getConnection();
				String id=memberBean.getId();
				String pwd=memberBean.getPwd();
				String name=memberBean.getName();
				String email=memberBean.getEmail();
				String query="insert into t_member";
				query+="(id,pwd,name,email)";
				query+="values(?,?,?,?)";
				System.out.println("prepareStatement:"+query);
				pstmt=con.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
				pstmt.executeUpdate();
				pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
