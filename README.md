# 🍽️Controle de Cortesias - Restaurante

Sistema desenvolvido em Java para controle de cortesias em restaurantes, permitindo registrar, acompanhar e atualizar o status de itens concedidos a clientes.

## 📌 Sobre o projeto

No dia a dia do meu trabalho em restaurante, é comum conceder cortesias quando ocorre algum problema com pedidos.
Normalmente esse controle é feito de forma informal pelo WhatsApp ou telefone, o que pode gerar perda de informações.

Este sistema foi criado para resolver esse problema, oferecendo um controle simples e organizado via console.

## 🚀 Funcionalidades
- ✅ Cadastrar nova cortesia  
- 🔍 Buscar cortesia por telefone  
- 🔄 Atualizar status (Resgatado / Pendente)  
- 📋 Listar todas as cortesias  
- ❌ Encerrar programa  

## 🛠️ Tecnologias utilizadas
- ☕ Java  
- 📦 Programação Orientada a Objetos (POO)  
- 📚 Listas (ArrayList)  
- 🔎 Streams e filtros  

## 🧠 Conceitos aplicados
- Encapsulamento  
- Separação de responsabilidades (Service / Entities / Program)  
- Manipulação de listas  
- Lógica de negócio  
- Entrada de dados com Scanner  

## 📂 Estrutura do projeto

src/  
├── Entities/  
│ └── Cliente.java  
├── Service/  
│ └── ClienteService.java  
└── Program/  
└── Cortesias.java  

## ▶️ Como executar
Clone o repositório:  
git clone https://github.com/EdilsonMartinss/controle-cortesias-restaurante.git  
Acesse a pasta do projeto:  
cd controle-cortesias-restaurante  
Compile e execute:  
javac Program/Cortesias.java  
java Program.Cortesias  

## 📸 Exemplo de uso

--MENU CORTESIAS--  
1- adicionar cortesia  
2- atualizar status cortesia  
3 - Status cortesia  
4- lista cortesias  
5- encerrar programa  

## 💡 Melhorias futuras
- 💾 Persistência de dados (arquivo ou banco)  
- 🖥️ Interface gráfica  
- 🔎 Busca por nome  
- 📊 Relatórios de cortesias  
- 🌐 API REST  

## 👨‍💻 Autor

Desenvolvido por Edilson Martins  
GitHub: https://github.com/EdilsonMartinss  

## 📌 Observação

Este projeto foi desenvolvido como parte dos meus estudos em Java com o conteudo aprendido ate o momento e lógica de programação.
