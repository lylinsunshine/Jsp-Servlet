package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.LoaiBo;
import bo.SachBo;

/**
 * Servlet implementation class sachcontroller
 */
@WebServlet("/sachcontroller")
public class sachcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sachcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    SachBo sbo = new SachBo();
    LoaiBo lbo = new LoaiBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//Lay va tra du lieu ve client = unicode
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			request.setAttribute("dssach", sbo.getListSach());
			request.setAttribute("dsloai", lbo.getListLoai());
			
			RequestDispatcher rd = request.getRequestDispatcher("t1.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
