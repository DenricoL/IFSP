# 1.
Após formatar o disquete com o sistema de arquivos **ext2**, ele poderá ser utilizado normalmente em sistemas **Linux**. O Microsoft Windows não possui suporte nativo ao sistema de arquivos ext2, sendo necessário instalar drivers ou softwares específicos para acessá-lo.

# 2.
O arquivo `nsswitch.conf` não aparece no diretório `/mnt/floppy` porque o disquete foi desmontado com o comando `umount`. Quando um dispositivo é desmontado, o ponto de montagem deixa de exibir o conteúdo do dispositivo e volta a mostrar apenas o conteúdo do diretório local `/mnt/floppy`, que normalmente está vazio.

# 3.
/dev/sda5: representa uma partição de um disco rígido ou SSD. O diretório `/dev` contém os arquivos que representam os dispositivos do sistema, e `sda5` identifica a quinta partição do primeiro disco detectado.

# 4.
ext3: é o tipo de sistema de arquivos utilizado na partição. O ext3 (Third Extended File System) possui suporte a journaling, oferecendo maior segurança e recuperação em caso de falhas.

# 5.
proc: refere-se ao sistema de arquivos virtual `/proc`, utilizado pelo kernel para disponibilizar informações sobre processos, hardware e o funcionamento do sistema operacional.

# 6.
Um **file system** (sistema de arquivos) é a estrutura utilizada pelo sistema operacional para organizar, armazenar, localizar e gerenciar arquivos e diretórios em um dispositivo de armazenamento. Ele define como os dados são gravados, acessados e protegidos, garantindo seu correto funcionamento.

# 7.
No comando:

`mount /dev/fd0 /mnt/floppy`

- `/dev/fd0`: representa o dispositivo físico, neste caso o drive de disquete.
- `/mnt/floppy`: representa o ponto de montagem (diretório) onde o conteúdo do disquete ficará acessível.

# 8.
Nos sistemas Linux, os sistemas de arquivos são integrados em uma única árvore de diretórios, sendo necessário montar cada dispositivo em um ponto de montagem para acessá-lo. Já no Microsoft Windows, cada unidade recebe uma letra (como C:, D: ou E:) e pode ser acessada diretamente. Além disso, o Linux utiliza sistemas de arquivos como ext2, ext3 e ext4, enquanto o Windows utiliza principalmente FAT32, exFAT e NTFS.