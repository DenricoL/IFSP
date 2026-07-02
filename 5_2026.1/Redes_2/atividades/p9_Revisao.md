# 1.
A área de **swap** é uma área do disco utilizada como memória virtual. Ela armazena temporariamente dados que não cabem mais na memória RAM, permitindo que o sistema continue funcionando mesmo quando a RAM está cheia. Também pode ser utilizada durante a hibernação do sistema.

# 2.
O item **Hardware** permite visualizar, configurar e gerenciar os dispositivos físicos do computador, como discos, placas de rede, impressoras, placas de vídeo e demais periféricos.

# 3.
É possível adicionar ou remover usuários no item **Sistema → Gerenciar usuários (Users)** do Centro de Controle do Mandriva.

# 4.
Um **Perfil (Profile)** é um conjunto de configurações que define permissões, preferências e opções específicas para um usuário ou grupo, facilitando a administração do sistema.

# 5.
Utilizar o formato Microsoft Excel (.xls) é importante para garantir compatibilidade com usuários que utilizam o Microsoft Office. Entretanto, o formato nativo do OpenOffice (ODF) é um padrão aberto, mais indicado para preservar a compatibilidade entre diferentes sistemas.

# 6.
Não totalmente. O OpenOffice consegue abrir e salvar arquivos do Microsoft Office, mas não há garantia de compatibilidade binária completa, pois os formatos possuem diferenças que podem causar alterações na formatação ou em recursos avançados.

# 7.
| Diretório | Função |
|-----------|--------|
| / | Diretório raiz do sistema. |
| /bin | Comandos essenciais do sistema. |
| /boot | Arquivos de inicialização do sistema. |
| /dev | Arquivos que representam dispositivos de hardware. |
| /etc | Arquivos de configuração do sistema. |
| /home | Diretórios pessoais dos usuários. |
| /lib | Bibliotecas compartilhadas utilizadas pelos programas. |
| /mnt | Pontos de montagem temporários de dispositivos. |
| /proc | Sistema de arquivos virtual com informações do kernel e processos. |
| /root | Diretório pessoal do usuário root. |
| /sbin | Comandos administrativos do sistema. |
| /tmp | Arquivos temporários. |
| /usr | Programas, bibliotecas e documentação dos usuários. |
| /var | Arquivos variáveis, como logs, filas e cache. |

# 8.
| Cor | Significado |
|------|-------------|
| Azul escuro | Diretórios. |
| Amarelo | Dispositivos especiais. |
| Verde | Arquivos executáveis. |
| Cyan | Links simbólicos. |
| Rosa | Arquivos de imagem ou gráficos (dependendo da configuração LS_COLORS). |
| Branco | Arquivos comuns. |
| Vermelho | Arquivos compactados ou arquivos com problemas de permissão (dependendo da configuração). |

# 9.
- **passwd:** cria ou altera a senha de um usuário.
- **useradd:** cria um novo usuário.
- **userdel:** remove um usuário do sistema.

# 10.
Alguns comandos semelhantes ao MS-DOS são:
- `cd` — altera o diretório atual.
- `dir` (DOS) / `ls` (Linux) — lista arquivos.
- `mkdir` — cria diretórios.
- `rmdir` — remove diretórios vazios.
- `copy` (DOS) / `cp` (Linux) — copia arquivos.
- `move` (DOS) / `mv` (Linux) — move ou renomeia arquivos.

# 11.
O **vi** é um editor de texto presente praticamente em todas as distribuições Linux e sistemas Unix. Ele funciona em modo texto e é utilizado principalmente para editar arquivos de configuração e scripts diretamente no terminal.

# 12.
O vi foi desenvolvido para editar arquivos de texto (ASCII). Embora seja possível abrir arquivos binários, ele não é adequado para editá-los, pois pode corromper seus dados.

# 13.
Três formas de acessar a documentação no Linux:
- `man` — manual completo dos comandos.
- `info` — documentação detalhada em formato navegável.
- `comando --help` — ajuda rápida sobre um comando específico.

# 14.
O Mandriva Starter Guide era disponibilizado em formatos como **HTML**, **PDF** e documentação online. Para consultas, o formato **HTML** costuma ser mais prático por permitir navegação por links e pesquisa rápida.

# 15.
O comando **mount** é importante porque permite montar dispositivos e sistemas de arquivos em um ponto da árvore de diretórios, tornando seu conteúdo acessível ao sistema.

# 16.
A instrução `umount /mnt/floppy` significa desmontar o sistema de arquivos que está montado no diretório `/mnt/floppy`. Após a desmontagem, o conteúdo do dispositivo deixa de estar acessível por esse ponto de montagem, permitindo sua remoção com segurança.

# 17.
Os principais sistemas de arquivos suportados pelo Linux são:
- ext2
- ext3
- ext4
- ReiserFS
- JFS
- XFS
- Btrfs

# 18.
Assim como no Windows, os sistemas de arquivos organizam e armazenam dados em discos. A principal diferença é que o Linux utiliza uma única árvore de diretórios e monta os dispositivos em pontos específicos, enquanto o Windows utiliza letras de unidade (C:, D:, etc.). Além disso, o Linux utiliza sistemas como ext4, XFS e Btrfs, enquanto o Windows utiliza FAT32, exFAT e NTFS.

# 19.
- **id:** mostra o UID, GID e grupos do usuário atual.
- **who:** mostra os usuários conectados no sistema.
- **tail /etc/passwd:** exibe as últimas linhas do arquivo de usuários.
- **userdel seunome:** remove o usuário especificado.

# 20.
Como usuário comum, é possível visualizar o conteúdo do arquivo `/etc/passwd`, que contém informações sobre os usuários cadastrados no sistema, como nome de usuário, UID, GID, diretório pessoal e shell padrão. Já o arquivo `/etc/shadow` não pode ser lido por um usuário comum, pois contém as senhas criptografadas e outras informações de autenticação, sendo seu acesso permitido apenas ao usuário root.

# 21.
Alguns comandos exigem acesso como **root** porque modificam configurações críticas do sistema, criam ou removem usuários, alteram permissões ou manipulam arquivos protegidos, garantindo a segurança do sistema.

# 22.
Se um comando retorna mensagem de "Permissão negada" ou informa que é necessário ser root, conclui-se que ele requer privilégios administrativos para sua execução.

# 23.
Três formas de compactação no Linux:
- **gzip:** compacta um único arquivo (.gz).
- **bzip2:** maior taxa de compressão (.bz2), porém mais lento.
- **zip:** compatível com Windows, compacta vários arquivos (.zip).

# 24.
O procedimento consiste em criar um arquivo `.tar` contendo vários arquivos ou diretórios e, opcionalmente, compactá-lo com gzip ou bzip2 para reduzir seu tamanho.

# 25.
Para listar o conteúdo de um arquivo tar utiliza-se:

```bash
tar -tf arquivo.tar
```

# 26.
A ferramenta compatível com **PKZIP/PKUNZIP** é o comando **zip/unzip**.

# 27.
O comando que permite reunir vários arquivos em um único arquivo é o **tar**. Opcionalmente, ele pode ser combinado com **gzip**, **bzip2** ou **xz** para compactação.