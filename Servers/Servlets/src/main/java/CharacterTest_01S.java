

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharacterTest_01S
 */
@WebServlet("/CharacterTest_01S")
public class CharacterTest_01S extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharacterTest_01S() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String animal = request.getParameter("animal");
		String[] check = request.getParameterValues("check");
		
		
		PrintWriter out = response.getWriter();
		
		out.println( name + "님의 성격 테스트 결과<br>");
		out.println(color + "을 좋아하는 당신은 " + animal + "그리고 " );
		for(int i=0; i<check.length ; i++) {
		
			if(i==check.length -1) {
				out.print(check[i] + "을");	
				break;
			}
			out.print(check[i] + "과");			
		}
		
		out.println	(" 좋아하는 성격입니다.");
		
	}

	

}
