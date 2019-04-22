//package com.sample;
//
//import com.sample.model.MoleculeType;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet(
//        name = "selectmoleculeservlet",
//        urlPatterns = "/SelectMolecule"
//)
//public class SelectMoleculeServlet extends HttpServlet { // this is where we send the actual .txt file to the src folder (i think)
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String moleculeType = req.getParameter("Type");
//
//        MoleculeService moleculeService = new MoleculeService();
//        MoleculeType l = MoleculeType.valueOf(moleculeType);
//
//        List moleculeBrands = moleculeService.getAvailableBrands(l);
//
//        req.setAttribute("brands", moleculeBrands);
//        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
//        view.forward(req, resp);
//
//    }
//}