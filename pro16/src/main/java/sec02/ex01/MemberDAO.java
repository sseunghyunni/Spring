package sec02.ex01;

import java.sql.ResultSet;

public class MemberDAO {
 public boolean overlappedID(String id) {
	 boolean result=false;
	 try {
		 con=dataFactory.getConnection();
		 String query="select decode(count(*),1,'true','false')as result from t_member";
		 query+="where id=?";
		 System.out.println("prepareStatement:"+query);
		 pstmt=con.prepareStatement(query);
		 pstmt.setString(1,id);
		 ResultSet rs= pstmt.executeQuery();
		 rs.next();
		 result=Boolean.parseBoolean(rs.getString("result"));
		 pstmt.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 return result;
 }
}
