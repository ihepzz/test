/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jpa.controller.DataJpaController;
import jpa.controller.SystemJpaController;
import jpa.controller.TeamJpaController;
import jpa.entities.Data;
import jpa.entities.Team;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ListAllServlet", urlPatterns = {"/ListAllServlet"})
public class ListAllServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        String p = req.getParameter("page");
        String parentName = req.getParameter("parent");
        String childName = req.getParameter("child");
        List<Data> dataList = null;

        //String name = "增强器";
        System.out.println("nameis :" + parentName);
        System.out.println("pis:" + p);

        if (parentName.equals("系统")) {
            DataJpaController dataJpaController = new DataJpaController();
            dataList = dataJpaController.findDataBySystem(childName);

        }
        if (parentName.equals("组别")) {
            DataJpaController dataJpaController = new DataJpaController();
            dataList = dataJpaController.findDataByTeam(childName);

        }

        int totalUsers = dataList.size();
        System.out.println("dataList:" + dataList);
        session.setAttribute("dataList", dataList);

        int page;
        try {
            //当前页数
            page = Integer.valueOf(p);
        } catch (NumberFormatException e) {
            page = 1;
        }
        //用户总数

        //每页用户数
        int usersPerPage = 9;
        //总页数
        int totalPages = totalUsers % usersPerPage == 0 ? totalUsers / usersPerPage : totalUsers / usersPerPage + 1;
        //本页起始用户序号
        int beginIndex = (page - 1) * usersPerPage;
        //本页末尾用户序号的下一个
        int endIndex = beginIndex + usersPerPage;
        if (endIndex > totalUsers) {
            endIndex = totalUsers;
        }

        System.out.println("aaaaaaa");
        req.setAttribute("totalUsers", totalUsers);
        req.setAttribute("usersPerPage", usersPerPage);
        req.setAttribute("totalPages", totalPages);
        req.setAttribute("beginIndex", beginIndex);
        req.setAttribute("endIndex", endIndex);
        req.setAttribute("page", page);
        req.setAttribute("users", dataList);

        req.getRequestDispatcher("newjsp2.jsp").forward(req, resp);

    }
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    public void init() throws ServletException {

    }

}
