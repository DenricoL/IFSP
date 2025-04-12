<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Login</title>
</head>
<body>

    <div class="align">
    <form action="login" method="post">

            <h1 style="text-align: center;">Login</h1>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="email@exemplo.com" required><br><br>

            <label for="senha">Senha:</label>
            <input type="password" id="senha" name="senha" placeholder="*********" required><br><br>

            <button class="enviar" type="submit">Entrar</button>
        </form>
    </div>
</body>
</html>