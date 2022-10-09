package br.com.alura.spring.data.specification;

import br.com.alura.spring.data.orm.Funcionario;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;


public class SpecificationFuncionario {

    public static Specification<Funcionario> nome(String nome){
        return (root,criteriaQuery,criteriaBilder) -> criteriaBilder.like(root.get("nome"),"%"+ nome + "%");
    }

    public static Specification<Funcionario> cpf(String cpf){
        return (root,criteriaQuery,criteriaBilder) -> criteriaBilder.equal(root.get("cpf"),cpf);
    }

    public static Specification<Funcionario> salario(Double salario){
        return (root,criteriaQuery,criteriaBilder) -> criteriaBilder.greaterThan(root.get("salario"),salario);
    }

    public static Specification<Funcionario> dataContratacao(LocalDate data){
        return (root,criteriaQuery,criteriaBilder) -> criteriaBilder.greaterThan(root.get("dataContratacao"),data);

    }

}
