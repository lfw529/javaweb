package com.lfw.fruit.servlets;

import com.lfw.fruit.dao.FruitDAO;
import com.lfw.fruit.dao.impl.FruitDAOImpl;
import com.lfw.fruit.pojo.Fruit;
import com.lfw.myssm.myspringmvc.ViewBaseServlet;
import com.lfw.myssm.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit.do")
public class EditServlet extends ViewBaseServlet {

    private FruitDAO fruitDAO = new FruitDAOImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String fidStr = request.getParameter("fid");
        if (StringUtil.isNotEmpty(fidStr)) {
            int fid = Integer.parseInt(fidStr);
            Fruit fruit = fruitDAO.getFruitByFid(fid);
            request.setAttribute("fruit", fruit);
            super.processTemplate("edit", request, response);
        }
    }
}
