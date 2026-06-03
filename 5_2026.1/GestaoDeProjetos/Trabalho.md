# Relatório Técnico: Audio Game Espacial com Foco em Acessibilidade Visual
**Projeto Integrador I — 2026**

---

## 1. Termo de Abertura do Projeto (TAP)

### 1.1 Justificativa
A proposta é romper a barreira da "adaptação" para criar uma mecânica baseada primariamente em áudio, promovendo a inclusão digital através do entretenimento.

### 1.2 Objetivos e Metas
* **Geral:** Desenvolver um jogo de defesa espacial via comandos de voz e resposta sonora.
* **Específicos:**
    * Alcançar 100% de navegabilidade sem auxílio visual.
    * Obter validação positiva de membros da comunidade com deficiência visual.
    * Implementar um sistema de resposta por voz funcional.

### 1.3 Descrição do Projeto
Um audio game onde a interface gráfica é secundária à interface sonora. O jogador utiliza um sistema *Push-to-Talk* para executar comandos por voz. O jogo conta com um sistema de guia que contextualiza o ambiente, objetivos e ações disponíveis em tempo real, permitindo que a navegação e o combate ocorram exclusivamente através de estímulos auditivos.

### 1.4 Premissas
Promover um jogo de fácil acesso através de comandos de voz, reduzindo a curva de aprendizado para o usuário final.

### 1.5 Restrições
* Limitação de especialistas em engenharia de áudio e sonoplastia profissional na equipe.
* Dependência de bibliotecas de Reconhecimento de Voz que podem exigir conexão estável com a internet ou hardware específico.
* A precisão do reconhecimento de comandos pode ser afetada em locais com alta poluição sonora.

### 1.6 Principais Stakeholders
* Equipe de desenvolvimento (Raissa, Lucas e Douglas).
* Professores orientadores (Professor João Correia e Professor Jeterson).
* Senhorita Alexandra e potenciais usuários finais com deficiência visual.

### 1.7 Riscos Iniciais
* Baixa imersão devido à falta de trilhas sonoras profissionais.
* Falhas no reconhecimento de diferentes sotaques ou tons de voz.
* Atrasos na gravação e edição da dublagem.
* Feedback negativo sobre a dificuldade da mecânica puramente auditiva.

### 1.8 Marcos do Projeto
1.  Definição dos comandos de voz e árvore de decisão das cenas.
2.  Desenvolvimento da lógica de captação de áudio e troca de cenas no motor Phaser.
3.  Escrita dos roteiros de guia e implementação dos sistemas de voz.
4.  Desenvolvimento prático da Missão 1 e Missão 2.
5.  Substituição das vozes robotizadas por dublagem humana e trilha sonora original.
6.  Testes de usabilidade com o público-alvo.
7.  Refinamento final para a entrega do projeto.

### 1.9 Custos e Prazo Estimado
* **Prazo:** 3 meses.
* **Custos:** Baixo (utilização exclusiva de softwares Open Source e ferramentas gratuitas).

---

## 2. Escopo do Projeto

### 2.1 Necessidades
* Interface baseada inteiramente em entradas de áudio.
* Reconhecimento de voz funcional, responsivo e de baixa latência.
* Feedback sonoro claro para cada uma das ações executadas.
* Mecânicas de jogo simples e acessíveis.
* Validação prática com usuários reais com deficiência visual.

### 2.2 Áreas Envolvidas
* Gerência de Projetos
* Desenvolvimento de Software
* Engenharia de Áudio
* UX Acessível

### 2.3 Estrutura Analítica do Projeto (EAP/EDT)
* **2.3.1 Planejamento:** Definição de requisitos e definição de comandos.
* **2.3.2 Desenvolvimento:** Configuração do ambiente, sistema de voz, lógica do jogo e feedback sonoro.
* **2.3.3 Conteúdo:** Criação de roteiros, efeitos sonoros e gravação de vozes.
* **2.3.4 Missões:**
    * *Missão 01:* Ajudar no desenvolvimento de um equipamento para outros alienígenas que precisam de suporte para se locomover.
    * *Missão 02:* Explorar uma ruína com a Roseane para descobrir o que aconteceu com um povo alienígena ancestral.
* **2.3.5 Testes e Finalização:** Testes com usuários e ajustes finais de balanceamento.

### 2.4 Requisitos
* **2.4.1 Funcionais:** Reconhecer comandos de voz, permitir navegação sem dependência de interface visual, emitir feedback auditivo em tempo real e possuir sistema de guia narrado por áudio.
* **2.4.2 Não Funcionais:** Baixa latência no processamento da voz, facilidade de uso, acessibilidade total para deficientes visuais e compatibilidade com navegadores web modernos.

### 2.5 Recursos
* **Equipe:** 3 integrantes (Raissa na gerência, Lucas e Douglas no desenvolvimento, acumulando internamente papéis de roteiro e testes).
* **Tecnologias:** Motor de jogo Phaser 3.8.1.
* **Ferramentas:** Softwares gratuitos de edição de áudio (Audacity) e organização (Google Docs, Trello e Milanote).

### 2.6 Custos (Resumo)
* Baixo custo geralizado.
* Uso predominante de ferramentas e softwares gratuitos.
* Possível investimento financeiro pontual em pacotes de áudio (opcional).

### 2.7 Limites do Escopo
* Restrito a até 2 missões jogáveis.
* Desenvolvimento com foco exclusivo para plataformas Desktop.
* Possível dependência de conexão à internet para o processamento de voz.
* Uso parcial de voz sintetizada (robotizada) caso o cronograma de dublagem atrase.

---

## 3. Cronograma e Planejamento Operacional

### 3.1 Gráfico de Gantt
*(Mapeamento visual das atividades distribuídas entre 01/04 e 04/07 contemplando Planejamento, Desenvolvimento, Testes e Ajustes Finais).*

### 3.2 Tabela 5W2H

| O quê? (What) | Por quê? (Why) | Onde? (Where) | Quando? (When) | Quem? (Who) | Como? (How) | Quanto? (How Much) |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| Planejamento do jogo e cronograma | Definir as regras, escopo e metas do jogo para evitar desperdício de tempo. | Google Docs e Trello | 01/04/2026 a 15/04/2026 | Douglas, Lucas e Raissa | Escrevendo as mecânicas e listando as tarefas do projeto. | R$ 0,00 |
| Programar a mecânica, sistema de voz e áudios | Construir a versão Alpha com as funções principais em execução. | Ambiente Phaser 3 | 15/04/2026 a 15/06/2026 | Douglas e Lucas | Codificando as funções lógicas e importando os *assets* de som. | R$ 0,00 |
| Realizar testes internos e rodar versão Beta fechada | Identificar bugs prematuros e problemas de desempenho. | Computadores de teste dedicados | 15/06/2026 a 30/06/2026 | Douglas, Lucas, Raissa e convidados | Executando o jogo repetidamente e coletando feedback de acessibilidade. | R$ 0,00 |
| Corrigir os bugs encontrados e polir a interface auditiva | Garantir estabilidade do software, ausência de falhas estruturais e prontidão para a banca. | Ambiente Phaser 3 | 15/06/2026 a 04/07/2026 | Douglas, Lucas e Raissa | Aplicando *patches* de refatoração de código e melhorias sonoras de navegação. | R$ 0,00 |

---

## 4. Documentação de Apoio
A documentação reúne os planos de apoio indispensáveis para a sustentação e organização do projeto, mapeando as incertezas técnicas e estabelecendo os canais oficiais para o fluxo de informações entre a equipe e os orientadores.

### 4.1 Gerenciamento de Riscos

| Risco Identificado | Probabilidade | Impacto | Plano de Mitigação |
| :--- | :--- | :--- | :--- |
| **Falha sistêmica no reconhecimento de voz** | Alta | Alto | Realizar testes de frequência e adotar palavras de comando curtas, de fonética simples e bem distintas entre si. |
| **Poluição sonora externa prejudicando a captação** | Alta | Alto | Implementar um sistema de tolerância de sinônimos via código e emitir um feedback sonoro instruindo o usuário a repetir o comando caso o motor não entenda de primeira. |
| **Baixa imersão por falta de trilhas profissionais** | Média | Médio | Utilizar bibliotecas gratuitas com filtros digitais e recorrer a vozes sintetizadas limpas de forma temporária durante o desenvolvimento básico. |
| **Incompatibilidade com bibliotecas de áudio do navegador** | Média | Alto | Pesquisar exaustivamente a compatibilidade da Web Speech API nos navegadores alvo antes do fechamento da arquitetura lógica final. |
| **Concorrência de tempo com outras matérias acadêmicas** | Média | Médio | Realizar o congelamento precoce de escopo e dividir estritamente as tarefas lógicas semanais para evitar gargalos na entrega final. |

* **Estratégia de Controle:** A equipe realizará reuniões semanais de acompanhamento para reavaliar os riscos ativos e verificar o surgimento de novas ameaças técnicas.

### 4.2 Plano de Comunicação
* **Fluxo Interno:** Reuniões de alinhamento rápidas conduzidas via Discord duas vezes por semana. Atualização visual diária do status das atividades mapeadas por meio dos quadros de tarefas no Trello.
* **Fluxo de Repositório:** Armazenamento e versionamento do código do motor Phaser hospedados no GitHub, garantindo sincronia entre Douglas e Lucas.
* **Alinhamento Externo:** Envio periódico do progresso técnico aos professores orientadores e agendamento controlado das sessões de testes empíricos com os stakeholders convidados (como a Senhorita Alexandra e usuários com deficiência visual).

---

## 5. Execução e Mobilização
Nesta etapa, detalha-se a transição do planejamento para a prática, especificando como os recursos humanos foram organizados e quais ferramentas foram integradas para iniciar o desenvolvimento ativo do software.

### 5.1 Mobilização de Recursos e Ferramental
A fase consistiu na preparação de infraestrutura e na distribuição clara das responsabilidades da equipe para início imediato dos trabalhos, focando em ferramentas sem custos financeiros:

* **Distribuição de Papéis:**
    * **Raissa Miranda:** Gestão ágil do projeto, validação do andamento do cronograma frente aos marcos acadêmicos, comunicação com stakeholders e centralização do fluxo de trabalho nos painéis do Milanote e Trello.
    * **Douglas Enrico e Lucas Tadeu:** Configuração do ambiente de desenvolvimento integrado (IDE VS Code), programação da lógica dos scripts no Phaser 3.8.1, estruturação dos algoritmos de captação sonora por voz e tratamento primário de áudio.
* **Infraestrutura Operacional:**
    * Homologação das estações de trabalho dos desenvolvedores com as dependências do Phaser instaladas.
    * Implementação de softwares livres de edição sonora (Audacity) para a preparação, corte e equalização dos roteiros gravados e efeitos especiais.
    * Criação de repositório central de documentação e redação dos roteiros e árvores de decisão das cenas utilizando o Google Docs para edição colaborativa e simultânea.

---

## 6. Controles e Indicadores de Desempenho

### 6.1 Status de Andamento
O desenvolvimento do áudio-jogo "Defensores do Espaço" encontra-se em fase avançada de codificação e integração de mecânicas. Até o presente momento, a equipe atingiu a marca média de conclusão física planejada para o período. Registrou-se um pequeno desvio no cronograma original de entregas devido à alta concorrência de tempo com projetos e exames de outras matérias do semestre acadêmico.

### 6.2 Alterações de Rota (Gestão de Escopo)
Para mitigar os riscos de atraso e garantir a entrega de um produto funcional dentro do prazo est