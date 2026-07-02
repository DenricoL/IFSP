# 1.
**Conclusão sobre a compactação com `gzip`:**

O arquivo foi compactado, reduzindo seu tamanho em bytes. O arquivo original foi substituído por outro com a extensão `.gz`, economizando espaço em disco sem perder as informações.

# 2.
**Conclusão após descompactar com `gunzip`:**

O arquivo voltou ao seu estado original, com o mesmo nome e conteúdo, mostrando que a descompactação restaura completamente o arquivo.

# 3.
**Conclusão sobre o `bzip2` em relação ao `gzip`:**

O `bzip2` normalmente oferece uma taxa de compressão maior que o `gzip`, gerando arquivos menores. Em contrapartida, costuma ser mais lento tanto para compactar quanto para descompactar.

# 4.
**Conclusão sobre a compactação com `tar`:**

O `tar` agrupa arquivos em um único arquivo. Quando utilizado junto com compressão (como `gzip`), também reduz o tamanho total dos arquivos armazenados.

# 5.
**Conclusão após compactar os três arquivos com `tar`:**

É possível reunir vários arquivos em um único arquivo compactado, facilitando o armazenamento, a organização e a transferência de dados.

# 6.
**Conclusão após extrair apenas `Starter3.pdf`:**

O comando `tar` permite extrair apenas o arquivo desejado sem a necessidade de descompactar todo o conteúdo do arquivo `.tar`.

# 7.
**Conclusão sobre o `zip` em relação aos comandos anteriores:**

O `zip` também permite compactar vários arquivos em um único arquivo, sendo amplamente utilizado por sua compatibilidade com diferentes sistemas operacionais, especialmente Windows e Linux.

# 8.
**Conclusão sobre o tamanho do arquivo `zip`:**

Sem parâmetros adicionais, o `zip` apresenta uma taxa de compressão semelhante ao `gzip`, embora normalmente seja inferior à obtida com o `bzip2`.

# 9.
**E.1. Qual(is) comando(s) permite(m) compactar vários arquivos em um único arquivo?**

Os comandos **`tar`** e **`zip`** permitem compactar vários arquivos em um único arquivo.

# 10.
**E.2. Qual o formato básico do comando `tar` para listar o conteúdo de um arquivo `.tar`?**

```bash
tar -tvf arquivo.tar
```

# 11.
**E.3. Qual dos compactadores apresentados permite maior taxa de compressão?**

O **`bzip2`** geralmente oferece a maior taxa de compressão entre os compactadores apresentados.

# 12.
**E.4. Podemos compactar um arquivo numa workstation e descompactá-lo posteriormente num PC? Explique.**

Sim. Desde que o computador possua um programa compatível com o formato de compactação utilizado (`.gz`, `.bz2`, `.tar`, `.zip`), o arquivo pode ser descompactado normalmente, independentemente do sistema operacional.

# 13.
**Conclusão**

A existência de diversas ferramentas de compactação no Linux e no Unix é importante porque cada uma possui características próprias de velocidade, taxa de compressão e compatibilidade. Isso permite ao usuário escolher a ferramenta mais adequada para cada situação, economizando espaço em disco, facilitando a transferência de arquivos e garantindo compatibilidade com diferentes sistemas e aplicações.