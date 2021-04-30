package co.edu.sena.Ej_Nomina.controller;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "NominaServlet", value = "/NominaServlet")
public class NominaServlet extends HttpServlet {
    private String message;
    int subtransporte,salud,pension,arl;
    //variables para mostrar AL FINAL
    int sueldo;
    double totalneto;
    double totaldescuentos;
    int totaldevengos;
    double resultadosalud,resultadopension,resultadoarl;
    double sueldomin;




    public void init(ServletConfig config) { message = "Hello World!";
        subtransporte = 106454;
        sueldomin =900000;

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        //recibir campos
        PrintWriter out = response.getWriter();
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String documento = request.getParameter("documento");
        String diastrabajados =request.getParameter("diastrabajados");
        int sueldo = Integer.parseInt(request.getParameter("sueldo"));

        //calculos:

            resultadosalud = sueldo * 0.04;
            resultadopension = sueldo * 0.04;
            resultadoarl = sueldo * 0.04;

            totaldescuentos =  resultadosalud + resultadopension + resultadoarl;
       if (sueldo<=sueldomin * 2){
           totalneto = sueldo + subtransporte;
       }else {
           out.println("No recibira subcidio de transporte");
           totalneto = sueldo;
       }

            totalneto = totalneto - totaldescuentos;


                







        // Hello

        out.println("<html><body>");
        out.println("<h3>BIENVENIDO SEÑOR"+"<br>" + nombres +"<br>"+apellidos+"<br>"+"Dias trabajados:"+diastrabajados+"<br>"+"Sueldo:"+sueldo+"<br>"+"Subcidio de transporte"+subtransporte+ "</h3>");
        out.println("<h3>SALUD:"+resultadosalud+"<br>"+"Pension:"+resultadosalud+"<br>"+"ARL:"+resultadoarl+"<br>"+"Descuentos"+totaldescuentos+"</h3>");
        out.println("<h1>TOTAL A PAGAR:"+Math.round(totalneto)+"</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}