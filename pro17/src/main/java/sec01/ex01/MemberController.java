/*
 * package sec01.ex01;
 * 
 * import java.io.IOException; import java.util.List;
 * 
 * import javax.servlet.RequestDispatcher; import javax.servlet.Servlet; import
 * javax.servlet.ServletConfig; import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import sec02.ex01.MemberDAO; import sec02.ex01.MemberVO;
 * 
 *//**
	 * Servlet implementation class MemberController
	 */
/*
 * @WebServlet("/mem.do") public class MemberController extends HttpServlet {
 * MemberDAO memberDAO;
 *//**
	 * @see Servlet#init(ServletConfig)
	 */
/*
 * public void init(ServletConfig config) throws ServletException { memberDAO =
 * new MemberDAO(); }
 * 
 *//**
	 * @see Servlet#destroy()
	 */
/*
 * public void destroy() { // TODO Auto-generated method stub }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { doHandle(request,response);
 * }
 * 
 *//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { doHandle(request,response);
		 * }
		 * 
		 * private void doHandle(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException,IOException{
		 * response.setContentType("text/html;charset=utf-8");
		 * request.setCharacterEncoding("utf-8"); List<MemberVO> membersList =
		 * memberDAO.listMembers(); request.setAttribute("membersList", membersList);
		 * RequestDispatcher dispatch =
		 * request.getRequestDispatcher("/listMembers.jsp"); dispatch.forward(request,
		 * response); }
		 * 
		 * }
		 */