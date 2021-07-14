package src.main.java.ConvertServlet; jetbrains://idea/navigate/reference?project=Final&path=src/main/java/ConvertServlet.java

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;
import java.util.*;

@WebServlet(name = "/ConvertServlet", value = "/ConvertServlet")

public class ConvertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("measurement");
        int n;
        float num1, num2;

        Properties newvalue = new Properties ();

        //Conversion from gallons to liters
        String galAsString = request.getParameter("gal");
        if (galAsString != null && galAsString.length() > 0) {
            num1 = (Float.parseFloat(galAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 3.785);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " liters" );
        }

        //Conversion from liters to gallons
        String LtrAsString = request.getParameter("Ltr");
        if (LtrAsString != null && LtrAsString.length() > 0) {
            num1 = (Float.parseFloat(LtrAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 3.785);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " gallons");
        }

        //Conversion from ounces to milliliters
        String ozAsString = request.getParameter("oz");
        if (ozAsString != null && ozAsString.length() > 0) {
            num1 = (Float.parseFloat(ozAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 29.57);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " milliliters");
        }

        //Conversion from milliliters to ounces
        String mLAsString = request.getParameter("mL");
        if (mLAsString != null && mLAsString.length() > 0) {
            num1 = (Float.parseFloat(mLAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 29.57);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " ounces");
        }

        //Conversion from tsp to milliliters
        String tspAsString = request.getParameter("tsp");
        if (tspAsString != null && tspAsString.length() > 0) {
            num1 = (Float.parseFloat(tspAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 4.93);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " milliliters");
        }

        //Conversion from tablespoon to milliliters
        String TbspAsString = request.getParameter("Tbsp");
        if (TbspAsString != null && TbspAsString.length() > 0) {
            num1 = (Float.parseFloat(TbspAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 14.79);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " milliliters");
        }

        //Conversion from milliliters to tablespoon
        String miLAsString = request.getParameter("miL");
        if (miLAsString != null && miLAsString.length() > 0) {
            num1 = (Float.parseFloat(miLAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 14.79);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " Tablespoons");
        }

        //Conversion from grams to ounces
        String gAsString = request.getParameter("g");
        if (gAsString != null && gAsString.length() > 0) {
            num1 = (Float.parseFloat(gAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 28.35);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " ounces");
        }

        //Conversion from ounces to grams
        String ozsAsString = request.getParameter("ozs");
        if (ozsAsString != null && ozsAsString.length() > 0) {
            num1 = (Float.parseFloat(ozsAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 28.35);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " grams");
        }

        //Conversion from grams to pounds
        if (grAsString != null && grAsString.length() > 0) {
            num1 = (Float.parseFloat(grAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = num1 / 454;
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " pounds");
        }

        //Conversion from pounds to grams
        if (lbAsString != null && lbAsString.length() > 0) {
            num1 = (Float.parseFloat(lbAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = num1 * 454;
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " grams");
        }

        //Conversion from pounds to kilograms
        if (lbsAsString != null && lbsAsString.length() > 0) {
            num1 = (Float.parseFloat(lbsAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 0.454);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " kilograms");
        }

        //Conversion from kilograms to pounds
        if (kgAsString != null && kgAsString.length() > 0) {
            num1 = (Float.parseFloat(kgAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 0.454);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put(String.valueOf(num2), " pounds");
        }
        PrintForm (response, newvalue);
        out.close();
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("This resource is not available directly");
    }
}
