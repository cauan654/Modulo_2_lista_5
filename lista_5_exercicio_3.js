const pessoas = [
    {
    nome: "João",
    idade: 25,
    ehAdmin: true,
    email: "joao@gmail.com"
    },
    {
    nome: "Maria",
    idade: 30,
    ehAdmin: false,
    email: "maria@hotmail.com"
    },
    {
    nome: "Pedro",
    idade: 20,
    ehAdmin: true,
    email: "pedro@yahoo.com"
    },
    {
    nome: "Lucas",
    idade: 28,
    ehAdmin: false,
    email: "lucas@gmail.com"
    },
    {
    nome: "Ana",
    idade: 35,
    ehAdmin: false,
    email: "ana@gmail.com"
    }
    ];
    
    for(let i = 0; i < pessoas.length; i++) {
    const pessoa = pessoas[i];
    if(pessoa.ehAdmin) {
    console.log("Olá " + pessoa.nome + "! Bem-vindo(a), você é admin do sistema. Enviamos um email para " + pessoa.email + " para você criar uma senha.");
    } else {
    console.log("Olá " + pessoa.nome + "! Bem-vindo(a), você não é admin do sistema. Enviamos um email para " + pessoa.email + " para você criar uma senha.");
    }
    }   