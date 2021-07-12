import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.math.*;


@WebServlet(name = "/ConvertServlet", value = "/ConvertServlet")
public class ConvertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String galAsString = request.getParameter("gal");
        String LtrAsString = request.getParameter("Ltr");
        String ozAsString = request.getParameter("oz");
        String mLAsString = request.getParameter("mL");
        String tspAsString = request.getParameter("tsp");
        String TbspAsString = request.getParameter("Tbsp");
        String gAsString = request.getParameter("g");
        String lbAsString = request.getParameter("lb");
        String kgAsString = request.getParameter("kg");

        int n;
        float num1, num2;

        //Conversion from gallons to liters
        if (galAsString != null && galAsString.length() > 0) {
            num1 = (Float.valueOf(galAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 * 3.785);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("L", String.valueOf(num2));
        }

        //Conversion from liters to gallons
        if (LtrAsString != null && LtrAsString.length() > 0) {
            num1 = (Float.valueOf(LtrAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 / 3.785);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("gal", String.valueOf(num2));
        }

        //Conversion from ounces to milliliters
        if (ozAsString != null && ozAsString.length() > 0) {
            num1 = (Float.valueOf(ozAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 * 29.57);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("mL", String.valueOf(num2));
        }

        //Conversion from milliliters to ounces
        if (mLAsString != null && mLAsString.length() > 0) {
            num1 = (Float.valueOf(mLAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 / 29.57);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("oz", String.valueOf(num2));
        }

        //Conversion from tsp to milliliters
        if (tspAsString != null && tspAsString.length() > 0) {
            num1 = (Float.valueOf(tspAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 * 4.93);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("mL", String.valueOf(num2));
        }

        //Conversion from milliliters to tsp
        if (mLAsString != null && mLAsString.length() > 0) {
            num1 = (Float.valueOf(mLAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 / 4.93);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("tsp", String.valueOf(num2));
        }

        //Conversion from tablespoon to milliliters
        if (TbspAsString != null && TbspAsString.length() > 0) {
            num1 = (Float.valueOf(TbspAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 * 14.79);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("mL", String.valueOf(num2));
        }

        //Conversion from milliliters to tablespoon
        if (mLAsString != null && mLAsString.length() > 0) {
            num1 = (Float.valueOf(mLAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n/(float)100.0;
            num2 = (float) (num1 / 14.79);
            n = Math.round(num2 * (float) 100.0);
            num2 = n/(float)100.0;
            newvalue.put ("Tbsp", String.valueOf(num2));
        }

        //Conversion from grams to ounces
        if (gAsString != null && gAsString.length() > 0) {
            num1 = (Float.valueOf(gAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 28.35);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put("oz", String.valueOf(num2));
        }

        //Conversion from ounces to grams
        if (ozsString != null && ozAsString.length() > 0) {
            num1 = (Float.valueOf(ozAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 28.35);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put("oz", String.valueOf(num2));
        }

        //Conversion from grams to pounds
        if (gAsString != null && gAsString.length() > 0) {
            num1 = (Float.valueOf(gAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = num1 / 454;
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put("lb", String.valueOf(num2));
        }

        //Conversion from pounds to grams
        if (lbAsString != null && lbAsString.length() > 0) {
            num1 = (Float.valueOf(lbAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = num1 * 454;
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put("grams", String.valueOf(num2));
        }

        //Conversion from pounds to kilograms
        if (lbAsString != null && lbAsString.length() > 0) {
            num1 = (Float.valueOf(lbAsString).floatValue());
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 * 0.454);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put("kg", String.valueOf(num2));
        }

        //Conversion from kilograms to pounds
        if (kgAsString != null && kgAsString.length() > 0) {
            num1 = (Float.valueOf(kgAsString));
            n = Math.round(num1 * (float) 100.0);
            num1 = n / (float) 100.0;
            num2 = (float) (num1 / 28.35);
            n = Math.round(num2 * (float) 100.0);
            num2 = n / (float) 100.0;
            newvalue.put("lb", String.valueOf(num2));
        }


        try (PrintWriter writer = response.getWriter()) {
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>Kitchen Measurement Converter</title>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<h1>This is a simple java servlet.</h1>");

            ((PrintWriter) writer).println("</body>");
            writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("This resource is not available directly");
    }
}
