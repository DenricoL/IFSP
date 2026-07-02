# 1.
| Parâmetro | Valor (padrão) | Significado |
|-----------|----------------|-------------|
| ServerRoot | `/etc/apache2` | Diretório principal onde ficam os arquivos de configuração do Apache. |
| MaxClients | `150` (ou equivalente à versão utilizada) | Define o número máximo de clientes que podem ser atendidos simultaneamente pelo servidor. |
| User | `www-data` | Usuário do sistema sob o qual os processos do Apache são executados. |
| Group | `www-data` | Grupo do sistema utilizado pelos processos do Apache. |
| ServerAdmin | `webmaster@localhost` | Endereço de e-mail do administrador do servidor. |
| DocumentRoot | `/var/www` | Diretório padrão onde ficam armazenadas as páginas do site. |

# 2.
**Comando para instalar o suporte a PHP no Apache:**

```bash
apt-get install php5 libapache2-mod-php5
```

Esse comando instala o interpretador PHP e o módulo responsável por integrar o PHP ao servidor Apache.

# 3.
**Comando para reiniciar o Apache:**

```bash
/etc/init.d/apache2 restart
```

O comando reinicia o serviço Apache para que as novas configurações e módulos instalados sejam carregados.

# 4.
**Arquivo de teste em PHP (`teste.php`):**

```php
<?php
echo "Hello, World!";
?>
```

Esse arquivo serve para verificar se o módulo PHP foi instalado e configurado corretamente no Apache.

# 5.
**Como testar o funcionamento do PHP:**

Acesse no navegador:

```
http://<ip_da_sua_maquina>/teste.php
```

Se a configuração estiver correta, será exibida a mensagem:

```
Hello, World!
```

# 6.
**Configuração do Virtual Host para o domínio `meudominio1.ifsp.edu.br`:**

```apache
<VirtualHost meudominio1.ifsp.edu.br>
    ServerAdmin webmaster@meudominio1.ifsp.edu.br
    DocumentRoot /var/www/meudominio1
    ServerName meudominio1.ifsp.edu.br
    ErrorLog /var/log/apache2/meudominio1-error.log
    CustomLog /var/log/apache2/meudominio1-access.log combined
</VirtualHost>
```

# 7.
**Configuração do Virtual Host para o domínio `meudominio2.ifsp.edu.br`:**

```apache
<VirtualHost meudominio2.ifsp.edu.br>
    ServerAdmin webmaster@meudominio2.ifsp.edu.br
    DocumentRoot /var/www/meudominio2
    ServerName meudominio2.ifsp.edu.br
    ErrorLog /var/log/apache2/meudominio2-error.log
    CustomLog /var/log/apache2/meudominio2-access.log combined
</VirtualHost>
```

# 8.
**Entradas que devem ser adicionadas ao arquivo `/etc/hosts`:**

```text
IP-da-sua-maquina    meudominio1.ifsp.edu.br    meudominio1
IP-da-sua-maquina    meudominio2.ifsp.edu.br    meudominio2
```

# 9.
**Criar páginas diferentes para cada domínio:**

Crie um arquivo `index.html` em cada diretório:

- `/var/www/meudominio1/index.html`
- `/var/www/meudominio2/index.html`

Cada arquivo pode conter uma mensagem diferente para identificar o domínio acessado.

# 10.
**Reiniciar o Apache após criar os Virtual Hosts:**

```bash
/etc/init.d/apache2 restart
```

# 11.
**Como testar os dois sites:**

Acesse no navegador:

```
http://meudominio1.ifsp.edu.br
```

e

```
http://meudominio2.ifsp.edu.br
```

Cada endereço deverá exibir a página criada em seu respectivo diretório.

# 12.
**Configuração para habilitar o diretório `public_html` dos usuários:**

```apache
<IfModule mod_userdir.c>
    UserDir disable root
    UserDir public_html
</IfModule>
```

Essa configuração permite que cada usuário publique páginas web em sua pasta `~/public_html`.

# 13.
**Descomentar o diretório `public_html`:**

```apache
<Directory /home/*/public_html>
    ...
</Directory>
```

Essa alteração libera o acesso às páginas existentes nas pastas `public_html` dos usuários.

# 14.
**Adicionar suporte a CGI nas pastas `public_html`:**

```apache
<Directory /home/*/public_html/cgi-bin/>
    Options ExecCGI
    SetHandler cgi-script
</Directory>
```

Essa configuração permite a execução de scripts CGI dentro do diretório `cgi-bin` localizado na pasta `public_html` de cada usuário.