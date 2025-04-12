<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Formulário de tarefas</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="align">
        <form action="tasks" method="post">
            <h1>Nova Tarefa</h1>
            <label for="description">Descrição: </label>
            <br>
            <input type="text" id="description" name="description" required>
            <br>
            <label for="date">Data:</label>
            <br>
            <input class="data" type="date" id="date" name="date" required>
            <br> <br>
            <button type="submit">Adicionar</button>
            <br> <br>
            <a href="tasks">lista de tarefas</a>
        </form>
    </div>
</body>
</html>