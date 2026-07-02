# 1.
Com base no comando `urpmq apache`, é possível obter informações sobre os pacotes disponíveis relacionados ao Apache, como o nome do pacote, versões disponíveis e dependências. Essas informações são importantes para verificar se o software está disponível para instalação e identificar a versão correta antes de instalá-lo.

# 2.
**Quantos pacotes serão necessários para instalar o Apache:**
Depende da distribuição e dos repositórios configurados, mas normalmente são instalados o pacote principal do Apache e suas dependências.

**A designação `.i586` significa:**
Indica que o pacote foi compilado para processadores compatíveis com a arquitetura Intel x86 de 32 bits (i586 ou superior).

**Qual o tamanho do espaço em disco necessário para a instalação:**
Varia conforme a versão e as dependências instaladas.

**Qual a versão do Apache instalada:**
Depende da versão disponível no repositório do sistema utilizado.

# 3.
**Que módulos foram instalados com sucesso:**
Foram instalados o servidor Apache (`httpd`) e todos os módulos e dependências necessários para seu funcionamento, conforme informado pelo gerenciador de pacotes.

**Os módulos e suas dependências foram instalados no Mandriva:**
Sim.

# 4.
**Qual foi a posição do arquivo apresentada pelo sistema:**
Normalmente o arquivo é encontrado em:

`/etc/httpd/conf/httpd.conf`

(Em outras distribuições pode estar em `/etc/apache2/apache2.conf` ou outro diretório semelhante.)

# 5.
**Qual foi a resposta apresentada pelo sistema:**
O sistema normalmente apresenta uma mensagem semelhante a:

`Starting httpd: [ OK ]`

ou

`Starting httpd... done.`

Isso indica que o serviço Apache foi iniciado corretamente.

# 6.
**Qual foi a resposta apresentada pelo sistema e o que isto significa:**
Ao acessar `http://localhost`, o navegador exibe a página padrão do Apache, normalmente com a mensagem **"It Works!"**.

Isso significa que o servidor Apache está instalado, configurado e funcionando corretamente, respondendo às requisições HTTP.

# 7.
**Qual foi a resposta apresentada pelo sistema e o que isto significa:**
Após editar o arquivo `index.html`, a página deve exibir a mensagem **"É nota A!"**.

Isso significa que o servidor está utilizando o novo arquivo HTML criado pelo usuário como página inicial. Caso continue aparecendo **"It Works!"**, provavelmente o navegador está exibindo a versão armazenada em cache.

# 8.
**Comando:** `urpmf`

**Descrição:**
Localiza arquivos pertencentes aos pacotes disponíveis nos repositórios do Mandriva.

# 9.
**Comando:** `service httpd start`

**Descrição:**
Inicia o serviço do servidor web Apache (`httpd`).

# 10.
**Comando:** `urpmq`

**Descrição:**
Pesquisa informações sobre pacotes disponíveis nos repositórios, como versões e nomes.

# 11.
**Comando:** `apt-get remove`

**Descrição:**
Remove um pacote instalado em sistemas baseados em Debian e suas configurações básicas.

# 12.
**Quais são as funcionalidades e características de um servidor Web?**

Um servidor Web é responsável por armazenar, processar e disponibilizar páginas e aplicações web por meio dos protocolos HTTP e HTTPS. Entre suas principais características estão o atendimento simultâneo de múltiplos clientes, hospedagem de sites, gerenciamento de conexões, suporte a páginas estáticas e dinâmicas, controle de acesso, registro de logs, segurança, alta confiabilidade, desempenho e possibilidade de expansão por meio de módulos e configurações personalizadas.