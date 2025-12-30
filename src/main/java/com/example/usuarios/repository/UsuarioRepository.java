package com.example.usuarios.repository;

import com.example.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //Aqui acontece a mágica ✨
    //
    //JpaRepository já traz:
    //
    //save()

   // 📌 O que faz:
    //Salva ou atualiza um objeto no banco.
    //
    //📌 Como funciona:
    //
    //Se não tem id → INSERT
    //
    //Se tem id → UPDATE
    //
    //📌 Exemplo mental:
    //
    //“Guarda o objeto no banco.”
    //
    //📌 Anotação:
    //
    //save() → insere ou atualiza registro


    //📋 findAll()
    //
    //📌 O que faz:
    //Busca todos os registros da tabela.
    //
    //📌 Retorno:
    //
    //List<Entidade>
    //
    //📌 Exemplo mental:
    //
    //“Traga tudo.”
    //
    //📌 Anotação:
    //
    //findAll() → lista todos os registros
    //


   //🔍 findById()
    //
    //📌 O que faz:
    //Busca um registro pelo ID.
    //
    //📌 Retorno:
    //
    //Optional<Entidade>
    //
    //📌 Por que Optional?
    //
    //Pode existir
    //
    //Pode não existir
    //
    //📌 Exemplo mental:
    //
    //“Procura pelo código.”
    //
    //📌 Anotação:
    //
    //findById(id) → busca pelo ID
    //

    //🗑️ deleteById()
    //
    //📌 O que faz:
    //Remove um registro pelo ID.
    //
    //📌 Exemplo mental:
    //
    //“Apaga pelo código.”
    //
    //📌 Anotação:
    //
    //deleteById(id) → remove registro

    //save() → salvar / atualizar
    //findAll() → listar tudo
    //findById() → buscar por id
    //deleteById() → deletar por id

}
