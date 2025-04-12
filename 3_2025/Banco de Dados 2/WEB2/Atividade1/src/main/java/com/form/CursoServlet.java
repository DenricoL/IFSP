package com.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/curso")
public class CursoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("name"); // pegando nome
        String email = request.getParameter("email"); // pegando emails
        String[] cursos = request.getParameterValues("cursos"); // pegando os cursos selecionados

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // página de resposta com os dados recebidos
        out.println("<html><head><title>Dados do Formulário</title></head><body>");
        out.println("<h2>Dados Recebidos:</h2>");
        out.println("<p><strong>Nome:</strong> " + nome + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");

        // Exibir cursos escolhidos
        out.println("<h3>Cursos Selecionados:</h3>");
        if (cursos != null && cursos.length > 0) {
            for (String curso : cursos) {
                out.println("<p>" + curso + "</p>");
            }
        } else {
            out.println("<p>Nenhum curso selecionado.</p>");
        }

        out.println("</body></html>");
    }
}
