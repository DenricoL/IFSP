<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Lista das tarefas atuais</title>
</head>
<body>
	<h1>Lista de tarefas</h1>
        <c:forEach var="task" items="${tasks}">
                ${tasks.id}
                <br>
                ${tasks.description}
                <br>
                ${tasks.date}
                <br> <br>
        </c:forEach>
    <a href="index.jsp">Criar nova tarefa</a>
</body>
</html>