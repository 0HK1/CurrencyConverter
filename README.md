
# 💱 CurrencyConverter

[![Java](https://img.shields.io/badge/Java-17+-red?logo=java)](https://www.java.com)  [![ExchangeRate API](https://img.shields.io/badge/API-ExchangeRate-orange)](https://www.exchangerate-api.com/) [![CoinGecko](https://img.shields.io/badge/API-CoinGecko-brightgreen)](https://www.coingecko.com/)

Conversor de moedas desenvolvido em Java, utilizando as APIs ExchangeRate e CoinGecko para obter taxas de câmbio atualizadas, tanto de moedas tradicionais quanto de criptomoedas.

Este projeto foi criado com o objetivo de atender a uma série de desafios propostos na trilha de estudos do programa ONE da Oracle
## 🚀 Tecnologias

- Java 17+
- Maven
- ExchangeRate API
- CoinGecko API

## ⚙️ Funcionalidades  

- **Menu Principal**  
  Exibe todas as opções disponíveis para o usuário via console.

- **Cotação Geral de Moedas em Dólar**  
  Mostra a cotação de diversas moedas em relação ao USD.

- **Conversão Monetária**  
  Permite converter valores entre moedas fiduciárias (ex.: BRL para USD).

- **Cotação Geral de Criptomoedas**  
  Exibe valores de criptos como Bitcoin, Ethereum, Tether, Binancecoin e Solana em Real.

- **Conversão de Cripto para Real**  
  Calcula o valor de uma quantidade de cripto para BRL.

- **Conversão de Real para Cripto**  
  Converte um valor em BRL para a quantidade equivalente de uma cripto.

- **Conversão Avulsa (por Código)**  
  Permite digitar manualmente o código de uma moeda ou cripto para conversão personalizada.
  
## 🛠️  Pré-requisitos  

- Java JDK 17 ou superior instalado  
- IDE de sua preferência (IntelliJ, Eclipse, VSCode, etc.)
- Maven instalado


## 📝  Instruções   

1. **Abrir Ambiente de Desenvolvimento**: Nesse caso, foi usado o eclipse.
   
2. **Abrir o Projeto**:
   - Abra o Eclipse e vá para **File** > **Open Projects from File System...**.
   - Clique em **Directory...** e selecione a pasta onde o seu projeto está localizado.
   - O Eclipse irá detectar automaticamente o projeto, e você verá o nome do projeto aparecer na lista.

3. **Atualizar o Projeto Maven**:
   - Clique com o botão direito no seu projeto dentro do **Project Explorer**.
   - Selecione **Maven** > **Update Project**.
   - Marque a opção **Force Update of Snapshots/Releases** e clique em **OK**.
   - Clique em **Finish** para concluir a importação do projeto.

4. **Verificar o `pom.xml`**:
   - Atualize o arquivo `pom.xml`, caso necessário, para a instalação adequada das dependências.

6. **Configurar Chave de API**:
	- Acesse `config.properties` dentro de `src/main/resources`.
	- Altere o campo `API.KEY` com a sua chave da ExchangeRate API.

5. **Localizar a Classe Principal**:
   - No **Project Explorer**, navegue até o pacote `main` onde está a classe `Main.java`.

6. **Rodar o Projeto**:
   - Clique com o botão direito sobre a classe principal (a que contém o método `main`).
   - Selecione **Run As** > **Java Application**.
   - O programa será iniciado e você verá a saída no console do Eclipse.

Pronto! Agora você tem o seu projeto rodando no Eclipse.
___
